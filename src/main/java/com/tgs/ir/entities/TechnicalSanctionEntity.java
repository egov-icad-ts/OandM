package com.tgs.ir.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "o_m_technical_sanction")
public class TechnicalSanctionEntity {
	
	
@Id
@Column(name="ts_id")
 
 private Integer  tsId;



@Column(name="ts_number")
 
 private String  tsNumber;

@Column(name="ts_approved_amount")
 
 private Double  tsApprovedAmount;

@Column(name="ts_approved_date")
 
 private Date  tsApprovedDate;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="updated_by")
 
 private String  updatedBy;



@Column(name="ts_file_url")
 
 private String  tsFileUrl;

@Column(name="ts_est_file_url")
 
 private String  tsEstFileUrl;

@Column(name="ts_type")
 
 private Integer  tsType;
	
	  @ManyToOne
	  @JoinColumn(name = "work_id", referencedColumnName = "work_id", nullable =
	  false) private AdminSanctionsEntity adminSanction;
	 
	 
	
	



}
