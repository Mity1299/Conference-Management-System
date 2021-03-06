/**
* 
* @author Mity1299
*/
package team.softwarede.confersys.bizImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import team.softwarede.confersys.biz.UserBiz;
import team.softwarede.confersys.dto.UserInfo;
import team.softwarede.confersys.dto.UserLogin;
import team.softwarede.confersys.dtomapper.UserLoginMapper;
import team.softwarede.confersys.entity.Identity;
import team.softwarede.confersys.entity.Login;
import team.softwarede.confersys.entity.User;
import team.softwarede.confersys.enums.EnumIdentity;
import team.softwarede.confersys.mapper.IdentityMapper;
import team.softwarede.confersys.mapper.LoginMapper;
import team.softwarede.confersys.mapper.UserMapper;

/**
 * @author Mity1299
 *
 */
@Service("userBiz")
public class UserBizImpl implements UserBiz {

    @Autowired
    UserLoginMapper userLoginMapper;
    @Autowired
    LoginMapper loginMapper;
    @Autowired
    UserMapper userMapper;
    @Autowired
    IdentityMapper identityMapper;
    
    @Transactional
    @Override
    public String login(String userId, Integer identityId, String passwd) {
        // TODO Auto-generated method stub
        String msg = null;
        
        //查找是否有该用户
        UserLogin userLogin = userLoginMapper.selectByPrimaryKey(userId, identityId);
        if(userLogin==null) {
            msg="输入用户编号不存在";
        }else {
            //对比密码是否正确
            if(passwd.equals(userLogin.getPassword())) {
                Login login = new Login();
                login.setLoginTime(new Date());
                login.setUserId(userId);
                loginMapper.insertSelective(login);
                msg="ok";
                
            }else {
                msg="密码错误";
            }
        }
        return msg;
    }


    @Override
    public List<EnumIdentity> showLoginPage() {
        // TODO Auto-generated method stub
        
        List<EnumIdentity> identities = new ArrayList<EnumIdentity>();
        for (EnumIdentity eidentity : EnumIdentity.values()) {
            identities.add(eidentity);
        }
        
        return identities;
    }
    
    @Override
    public UserInfo showUserInfo(String userId) {
    	User userInfo = userMapper.selectByPrimaryKey(userId);
    	UserInfo showUserInfo = new UserInfo();
    	showUserInfo.setUserId(userInfo.getUserId());
    	showUserInfo.setTelephone(userInfo.getTelephone());
    	showUserInfo.setSex(userInfo.getSex());
    	showUserInfo.setName(userInfo.getName());
    	
    	Identity identity = identityMapper.selectByPrimaryKey(userInfo.getIdentityId());
    	
    	showUserInfo.setIdentity(identity.getIdentity());
    	showUserInfo.setEmail(userInfo.getEmail());
    	return showUserInfo;
    }

}
