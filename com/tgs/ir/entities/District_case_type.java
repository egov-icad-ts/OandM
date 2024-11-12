package com.tgs.ir.entities;

public class District_case_type {
@Column(name="district_case_type_id")
 
 private Integer  districtCaseTypeId;

@Column(name="district_case_type")
 
 private String  districtCaseType;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public District_case_type(int district_case_type_id, Object district_case_type, boolean delete_flag) {
        this.district_case_type_id = district_case_type_id;
        this.district_case_type = district_case_type;
        this.delete_flag = delete_flag;
    }
}
