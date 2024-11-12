package com.tgs.ir.dto;

import java.util.Date;

import lombok.Data;


@Data
public class TechnicalSanctionsModel {
	

	 
	 private Integer  tsId;
	 private String  tsNumber;
	 private Double  tsApprovedAmount;
	 private Date  tsApprovedDate;
	 private boolean  isLatest;
	 private boolean  deleteFlag;
	 private String  updatedBy;
	 private String  tsFileUrl;
 private String  tsEstFileUrl;
	 private Integer  tsType;


}
