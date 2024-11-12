package com.tgs.ir.entities;

public class Agency_mst {
@Column(name="agency_id")
 
 private Integer  agencyId;

@Column(name="agency_name")
 
 private String  agencyName;

@Column(name="agency_addr")
 
 private String  agencyAddr;

@Column(name="agency_mobile")
 
 private bigint  agencyMobile;

@Column(name="agency_pan_no")
 
 private String  agencyPanNo;

@Column(name="agency_landline")
 
 private String  agencyLandline;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Agency_mst(int agency_id, Object agency_name, Object agency_addr, long agency_mobile, Object agency_pan_no, Object agency_landline, boolean delete_flag) {
        this.agency_id = agency_id;
        this.agency_name = agency_name;
        this.agency_addr = agency_addr;
        this.agency_mobile = agency_mobile;
        this.agency_pan_no = agency_pan_no;
        this.agency_landline = agency_landline;
        this.delete_flag = delete_flag;
    }
}
