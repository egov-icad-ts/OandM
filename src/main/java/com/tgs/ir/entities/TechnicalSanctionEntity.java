package com.tgs.ir.entities;


import java.util.Date;
import java.util.List;



import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.ParamDef;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "o_m_technical_sanction")
//@FilterDef(name = "activeFilter", parameters = @ParamDef(name = "is_latest", type = Boolean.class))
//@Filter(name = "activeFilter", condition = "is_active = " +true)
public class TechnicalSanctionEntity {
	
	
@Id  


@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "technical_sanction_seq")
@SequenceGenerator(name = "technical_sanction_seq", sequenceName = "o_m_technical_sanction_ts_id_seq", allocationSize = 1)
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

@Column(name="work_id")
private Integer workId ;
	

//	  @ManyToOne
//	  @JoinColumn(name = "work_id", referencedColumnName = "work_id")
//	  private AdminSanctionsEntity adminSanction;
	 
	 
		@OneToMany
		private List<AgreementsEntity> agreements;
	



}
