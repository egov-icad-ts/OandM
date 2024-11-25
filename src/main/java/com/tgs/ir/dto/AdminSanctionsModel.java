package com.tgs.ir.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Data
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
	
	
	
	private String tankCode ;
	
	

	private String tankName ;
	
	

	private String aaFileUrl ;
	 
	  

	private Boolean isAssigned ;
	  

	private Integer projSubTypeId ;
	
private Integer techId;

private String  tsNumber;
private Double  tsApprovedAmount;
	
private List<TechnicalSanctionsModel> techlist=new ArrayList<TechnicalSanctionsModel>();

private String sancFileType;
private String estFileType;



}
