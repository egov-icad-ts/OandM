package com.tgs.ir.entities;

public class Unit_type_master {
@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="unit_name")
 
 private String  unitName;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Unit_type_master(int unit_id, Object unit_name, boolean delete_flag) {
        this.unit_id = unit_id;
        this.unit_name = unit_name;
        this.delete_flag = delete_flag;
    }
}
