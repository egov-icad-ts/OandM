package com.tgs.ir.entities;

public class District_mst {
@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="district_name")
 
 private String  districtName;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="dist_code")
 
 private String  distCode;

@Column(name="mk_dcode")
 
 private Integer  mkDcode;


    public District_mst(int district_id, Object district_name, boolean delete_flag, Object dist_code, int mk_dcode) {
        this.district_id = district_id;
        this.district_name = district_name;
        this.delete_flag = delete_flag;
        this.dist_code = dist_code;
        this.mk_dcode = mk_dcode;
    }
}
