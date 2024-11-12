package com.tgs.ir.entities;

public class Sub_division_mst_old {
@Column(name="sub_division_id")
 
 private Integer  subDivisionId;

@Column(name="sub_division_name")
 
 private String  subDivisionName;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="circle_id")
 
 private Integer  circleId;


    public Sub_division_mst_old(int sub_division_id, Object sub_division_name, int division_id, boolean delete_flag, int circle_id) {
        this.sub_division_id = sub_division_id;
        this.sub_division_name = sub_division_name;
        this.division_id = division_id;
        this.delete_flag = delete_flag;
        this.circle_id = circle_id;
    }
}
