package com.tgs.ir.entities;

public class Circle_mst_old {
@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="circle_name")
 
 private String  circleName;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Circle_mst_old(int circle_id, Object circle_name, int unit_id, boolean delete_flag) {
        this.circle_id = circle_id;
        this.circle_name = circle_name;
        this.unit_id = unit_id;
        this.delete_flag = delete_flag;
    }
}
