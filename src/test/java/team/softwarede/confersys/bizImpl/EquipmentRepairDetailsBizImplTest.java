package team.softwarede.confersys.bizImpl;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import team.softwarede.confersys.Application;
import team.softwarede.confersys.biz.MeetingRoomBiz;
import team.softwarede.confersys.dto.EquipmentRepairDetails;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class EquipmentRepairDetailsBizImplTest {

	@Autowired
	MeetingRoomBiz meetingRoomBiz;
	@Test
	public void test() {
		int repairId = 1;
		EquipmentRepairDetails repairDetails = meetingRoomBiz.repairDetails(repairId);
		Logger logger = Logger.getLogger(getClass());
		logger.info(repairDetails.getRepairDetail());
	}

}
