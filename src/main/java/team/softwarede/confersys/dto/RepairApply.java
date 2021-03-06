package team.softwarede.confersys.dto;

import java.util.Date;

public class RepairApply {

	private Integer repairEquipmentId;
	
	private String repairType;
	
	private String repairDetail;
	
	private Date date;

	public Integer getRepairEquipmentId() {
		return repairEquipmentId;
	}

	public void setRepairEquipmentId(Integer repairEquipmentId) {
		this.repairEquipmentId = repairEquipmentId;
	}

	public String getRepairType() {
		return repairType;
	}

	public void setRepairType(String repairType) {
		this.repairType = repairType;
	}

	public String getRepairDetail() {
		return repairDetail;
	}

	public void setRepairDetail(String repairDetail) {
		this.repairDetail = repairDetail;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
