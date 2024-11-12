package com.tgs.ir.entities;

import jakarta.persistence.Column;

public class O_m_work_approved_authority_mst {
@Column(name="authority_name")
 
 private String  authorityName;

@Column(name="authority_id")
 
 private Integer  authorityId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="authority_name_alias")
 
 private String  authorityNameAlias;

@Column(name="authority_type")
 
 private String  authorityType;

@Column(name="adminsanc_limit_fin_year")
 
 private Double  adminsancLimitFinYear;

@Column(name="adminsanc_limit_per_work")
 
 private Double  adminsancLimitPerWork;


}
