package com.tgs.ir.entities;

import java.util.Date;

import jakarta.persistence.Column;

public class O_m_work_bills {
@Column(name="bill_id")
 
 private Integer  billId;

@Column(name="work_id")
 
 private Integer  workId;

@Column(name="work_done_amount")
 
 private Double  workDoneAmount;

@Column(name="status_id")
 
 private Integer  statusId;

@Column(name="cum_work_done_amount")
 
 private Double  cumWorkDoneAmount;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="updated_by")
 
 private String  updatedBy;


@Column(name="bill_no")
 
 private Double  billNo;

@Column(name="bill_type")
 
 private String  billType;

@Column(name="agreement_id")
 
 private Integer  agreementId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="loc_file_url")
 
 private String  locFileUrl;

@Column(name="loc_updated_on")
 
 private Date  locUpdatedOn;

@Column(name="loc_released_amt")
 
 private Double  locReleasedAmt;



}
