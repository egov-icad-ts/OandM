package com.tgs.ir.entities;

public class Division_mst_old {
@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="division_name")
 
 private String  divisionName;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Division_mst_old(int division_id, Object division_name, int circle_id, boolean delete_flag) {
        this.division_id = division_id;
        this.division_name = division_name;
        this.circle_id = circle_id;
        this.delete_flag = delete_flag;
    }
}
