package com.tgs.ir.entities;

public class New_unit_distirct_mapping {
@Column(name="un_dist_id")
 
 private Integer  unDistId;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="created_by")
 
 private String  createdBy;

@Column(name="created_time")
 
 private timestamp without time zone  createdTime;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public New_unit_distirct_mapping(int un_dist_id, int unit_id, int district_id, Object created_by, Object created_time, boolean delete_flag) {
        this.un_dist_id = un_dist_id;
        this.unit_id = unit_id;
        this.district_id = district_id;
        this.created_by = created_by;
        this.created_time = created_time;
        this.delete_flag = delete_flag;
    }
}
