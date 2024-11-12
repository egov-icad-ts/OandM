package com.tgs.ir.entities;

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


    public O_m_work_approved_authority_mst(Object authority_name, int authority_id, boolean delete_flag, Object authority_name_alias, Object authority_type, double adminsanc_limit_fin_year, double adminsanc_limit_per_work) {
        this.authority_name = authority_name;
        this.authority_id = authority_id;
        this.delete_flag = delete_flag;
        this.authority_name_alias = authority_name_alias;
        this.authority_type = authority_type;
        this.adminsanc_limit_fin_year = adminsanc_limit_fin_year;
        this.adminsanc_limit_per_work = adminsanc_limit_per_work;
    }
}
