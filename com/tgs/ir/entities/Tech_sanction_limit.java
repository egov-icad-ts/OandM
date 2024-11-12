package com.tgs.ir.entities;

public class Tech_sanction_limit {
@Column(name="tech_sanc_limit_id")
 
 private Integer  techSancLimitId;

@Column(name="tech_sanc_designation")
 
 private String  techSancDesignation;

@Column(name="tech_sanc_roleid")
 
 private String  techSancRoleid;

@Column(name="tech_sanc_cashlimit")
 
 private String  techSancCashlimit;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Tech_sanction_limit(int tech_sanc_limit_id, Object tech_sanc_designation, Object tech_sanc_roleid, Object tech_sanc_cashlimit, boolean delete_flag) {
        this.tech_sanc_limit_id = tech_sanc_limit_id;
        this.tech_sanc_designation = tech_sanc_designation;
        this.tech_sanc_roleid = tech_sanc_roleid;
        this.tech_sanc_cashlimit = tech_sanc_cashlimit;
        this.delete_flag = delete_flag;
    }
}
