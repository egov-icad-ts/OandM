package com.tgs.ir.entities;

import java.util.Date;

import jakarta.persistence.Column;

public class O_m_agreements {
@Column(name="agreement_id")
 
 private Integer  agreementId;

@Column(name="work_id")
 
 private Integer  workId;

@Column(name="type_id")
 
 private Integer  typeId;

@Column(name="tender_percentage")
 
 private Double  tenderPercentage;

@Column(name="agreement_number")
 
 private String  agreementNumber;

@Column(name="agreement_date")
 
 private Date  agreementDate;

@Column(name="agreement_amount")
 
 private Double  agreementAmount;

@Column(name="agency_id")
 
 private Integer  agencyId;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="agency_name")
 
 private String  agencyName;


@Column(name="updated_by")
 
 private String  updatedBy;

@Column(name="tech_id")
 
 private Integer  techId;

@Column(name="tender_date")
 
 private Date  tenderDate;



}
