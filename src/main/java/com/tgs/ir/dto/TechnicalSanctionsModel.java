package com.tgs.ir.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;


@Data
public class TechnicalSanctionsModel {
	

	 
	 private Integer  tsId;
	 private String  tsNumber;
	 private Double  tsApprovedAmount;
	 private Date  tsApprovedDate;
	 private boolean  isLatest;
	 private boolean  deleteFlag;
	 
	 private String tsDate;

	 private String  tsEstFileUrl;
	 private String  tsFileUrl;
	 
		private MultipartFile techSancUrl;
		private MultipartFile techEstimateUrl;

private String sancFileType;
private String estFileType;

private List<TechnicalSanctionsModel> techList=new ArrayList<>();

}
