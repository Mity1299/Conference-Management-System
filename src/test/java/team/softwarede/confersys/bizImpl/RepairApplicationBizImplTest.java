package team.softwarede.confersys.bizImpl;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import team.softwarede.confersys.Application;
import team.softwarede.confersys.biz.RepairApplicationBiz;
import team.softwarede.confersys.dto.RepairApply;
import team.softwarede.confersys.enums.EnumRepairType;
/**
 * 
 * @author SunRonglin
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class RepairApplicationBizImplTest {

	@Autowired
	RepairApplicationBiz repairApplicationBiz;
	
	@Ignore
	public void test() {
		RepairApply repairApply = new RepairApply();
		repairApply.setRepairDetail("can't use");
		repairApply.setRepairEquipmentId(1);
		repairApply.setRepairType(EnumRepairType.REPAIRMENT.getDescription());
		repairApplicationBiz.repairApplication("41624544", repairApply);
	}
	
	@Test
	public void testShowAllRepairType() {
	    List<String> typeListValid = Arrays.asList("维修","补充");
	    
	    List<String> typeListTest = repairApplicationBiz.showAllRepairType();

	    assertEquals(typeListValid, typeListTest);
	    
	}

}
