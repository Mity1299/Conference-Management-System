/**
* 
* @author Mity1299
*/
package team.softwarede.confersys.bizImpl;

import static org.junit.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import team.softwarede.confersys.Application;
import team.softwarede.confersys.biz.UserBiz;
import team.softwarede.confersys.dto.UserInfo;

/**
 * @author Mity1299
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class UserBizImplTest {
    
    @Autowired
    UserBiz userBiz;

    /**
     * 测试登录功能:
     * 输入：用户编号、用户身份编号、密码与数据库一致的情况
     * 输出：登录成功
     */
    @Ignore
    public void testLoginSucuss() {
        String msg = userBiz.login("00000009", 4, "123");
        assertEquals("ok", msg);
    }
    
    /**
     * 测试登录功能:
     * 输入：用户编号、密码与数据库一致，但用户身份编号不一致的情况
     * 输出：登录失败，输出错误信息
     */
    @Ignore
    public void testLoginErrorByIdeId() {
        String msg = userBiz.login("1", 2, "123456");
        assertEquals("输入用户编号不存在", msg);    
    }
    
    /**
     * 测试登录功能:
     * 输入：用户编号、用户身份编号与数据库一致，但用户密码不一致的情况
     * 输出：登录失败，输出错误信息
     */
    @Ignore
    public void testLoginErrorByPasswd() {
        String msg = userBiz.login("1", 1, "123");
        assertEquals("密码错误", msg);   
        
    }
    
    @Test
    public void TestshowUserInfo() {
    	String userId = "00000009";
    	UserInfo userInfo = userBiz.showUserInfo(userId);
		Logger logger = Logger.getLogger(getClass());
		logger.info(userInfo.getUserId());
		logger.info(userInfo.getTelephone());
		logger.info(userInfo.getName());

    }
    

}
