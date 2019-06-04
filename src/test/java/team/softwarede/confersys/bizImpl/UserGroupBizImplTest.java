/**
* 
* @author Mity1299
*/
package team.softwarede.confersys.bizImpl;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import team.softwarede.confersys.Application;
import team.softwarede.confersys.biz.UserGroupBiz;
import team.softwarede.confersys.dto.UserGroupCreate;

/**
 * @author Mity1299
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class UserGroupBizImplTest {

    @Autowired
    UserGroupBiz userGroupBiz;
    
    @Test
    public void test() {

        UserGroupCreate uGroupCreate = new UserGroupCreate();
        
        uGroupCreate.setCreatorId("10000007");
        uGroupCreate.setUserGroupName("阴阳师组");
        List<String> userIdList = new ArrayList<String>();
        userIdList.add("10000008");
        userIdList.add("10000009");
        uGroupCreate.setUserIdList(userIdList);
        
        userGroupBiz.createUGroup(uGroupCreate);
    }

}
