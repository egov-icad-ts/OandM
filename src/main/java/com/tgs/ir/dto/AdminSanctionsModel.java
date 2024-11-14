package com.tgs.ir.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.tgs.ir.entities.TechnicalSanctionEntity;
import com.tgs.ir.entities.WorkApprovedAuthorityMst;

import lombok.Data;



public class AdminSanctionsModel {
	
	private Integer adminId;

	  private Integer workId ;
	

	  private Integer projectId ;
	

	private Integer unitId ;
	

	private Integer circleId ;
	
	

	private Integer divisionId ;
	
	

	private Integer subDivisionId ;
	
	

	private String workName ;
	
	
	private Integer hoaId ;
	

	private Integer approvedById ;
	

	private String approvedByName ;
	


	private String referenceNumber ;
	


	private String referenceDate ;


	  private BigDecimal adminSanctionAmt ;
	

	  private Boolean isLatest;
	  
	

	  private Boolean delete_flag;
	

	private String updatedby ;
	
	

	private Integer liftId ;

	private Integer tankId ;
	

	private Integer smallLiftId ;
	

	private Integer resId ;
	

	private Integer districtId ;
	

	private Integer mandalId ;
	

	private Integer villageId ;
	
	

	private Integer financialYear ;
	
	
	
	private String tank_code ;
	
	

	private String tank_name ;
	
	

	private String aaFileUrl ;
	 
	  

	private Boolean isAssigned ;
	  

	private Integer projSubTypeId ;
	
private Integer techId;
public Integer getAdminId() {
	return adminId;
}

public void setAdminId(Integer adminId) {
	this.adminId = adminId;
}

public Integer getWorkId() {
	return workId;
}

public void setWorkId(Integer workId) {
	this.workId = workId;
}

public Integer getProjectId() {
	return projectId;
}

public void setProjectId(Integer projectId) {
	this.projectId = projectId;
}

public Integer getUnitId() {
	return unitId;
}

public void setUnitId(Integer unitId) {
	this.unitId = unitId;
}

public Integer getCircleId() {
	return circleId;
}

public void setCircleId(Integer circleId) {
	this.circleId = circleId;
}

public Integer getDivisionId() {
	return divisionId;
}

public void setDivisionId(Integer divisionId) {
	this.divisionId = divisionId;
}

public Integer getSubDivisionId() {
	return subDivisionId;
}

public void setSubDivisionId(Integer subDivisionId) {
	this.subDivisionId = subDivisionId;
}

public String getWorkName() {
	return workName;
}

public void setWorkName(String workName) {
	this.workName = workName;
}

public Integer getHoaId() {
	return hoaId;
}

public void setHoaId(Integer hoaId) {
	this.hoaId = hoaId;
}

public Integer getApprovedById() {
	return approvedById;
}

public void setApprovedById(Integer approvedById) {
	this.approvedById = approvedById;
}

public String getApprovedByName() {
	return approvedByName;
}

public void setApprovedByName(String approvedByName) {
	this.approvedByName = approvedByName;
}

public String getReferenceNumber() {
	return referenceNumber;
}

public void setReferenceNumber(String referenceNumber) {
	this.referenceNumber = referenceNumber;
}

public String getReferenceDate() {
	return referenceDate;
}

public void setReferenceDate(String referenceDate) {
	this.referenceDate = referenceDate;
}

public BigDecimal getAdminSanctionAmt() {
	return adminSanctionAmt;
}

public void setAdminSanctionAmt(BigDecimal adminSanctionAmt) {
	this.adminSanctionAmt = adminSanctionAmt;
}

public Boolean getIsLatest() {
	return isLatest;
}

public void setIsLatest(Boolean isLatest) {
	this.isLatest = isLatest;
}

public Boolean getDelete_flag() {
	return delete_flag;
}

public void setDelete_flag(Boolean delete_flag) {
	this.delete_flag = delete_flag;
}

public String getUpdatedby() {
	return updatedby;
}

public void setUpdatedby(String updatedby) {
	this.updatedby = updatedby;
}

public Integer getLiftId() {
	return liftId;
}

public void setLiftId(Integer liftId) {
	this.liftId = liftId;
}

public Integer getTankId() {
	return tankId;
}

public void setTankId(Integer tankId) {
	this.tankId = tankId;
}

public Integer getSmallLiftId() {
	return smallLiftId;
}

public void setSmallLiftId(Integer smallLiftId) {
	this.smallLiftId = smallLiftId;
}

public Integer getResId() {
	return resId;
}

public void setResId(Integer resId) {
	this.resId = resId;
}

public Integer getDistrictId() {
	return districtId;
}

public void setDistrictId(Integer districtId) {
	this.districtId = districtId;
}

public Integer getMandalId() {
	return mandalId;
}

public void setMandalId(Integer mandalId) {
	this.mandalId = mandalId;
}

public Integer getVillageId() {
	return villageId;
}

public void setVillageId(Integer villageId) {
	this.villageId = villageId;
}

public Integer getFinancialYear() {
	return financialYear;
}

public void setFinancialYear(Integer financialYear) {
	this.financialYear = financialYear;
}

public String getTank_code() {
	return tank_code;
}

public void setTank_code(String tank_code) {
	this.tank_code = tank_code;
}

public String getTank_name() {
	return tank_name;
}

public void setTank_name(String tank_name) {
	this.tank_name = tank_name;
}

public String getAaFileUrl() {
	return aaFileUrl;
}

public void setAaFileUrl(String aaFileUrl) {
	this.aaFileUrl = aaFileUrl;
}

public Boolean getIsAssigned() {
	return isAssigned;
}

public void setIsAssigned(Boolean isAssigned) {
	this.isAssigned = isAssigned;
}

public Integer getProjSubTypeId() {
	return projSubTypeId;
}

public void setProjSubTypeId(Integer projSubTypeId) {
	this.projSubTypeId = projSubTypeId;
}

public Integer getTechId() {
	return techId;
}

public void setTechId(Integer techId) {
	this.techId = techId;
}

public String getTsNumber() {
	return tsNumber;
}

public void setTsNumber(String tsNumber) {
	this.tsNumber = tsNumber;
}

public Double getTsApprovedAmount() {
	return tsApprovedAmount;
}

public void setTsApprovedAmount(Double tsApprovedAmount) {
	this.tsApprovedAmount = tsApprovedAmount;
}

public List<TechnicalSanctionsModel> getTechlist() {
	return techlist;
}

public void setTechlist(List<TechnicalSanctionsModel> techlist) {
	this.techlist = techlist;
}

private String  tsNumber;
private Double  tsApprovedAmount;
	
private List<TechnicalSanctionsModel> techlist=new ArrayList<TechnicalSanctionsModel>();

}
