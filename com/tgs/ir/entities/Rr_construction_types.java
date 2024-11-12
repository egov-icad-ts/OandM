package com.tgs.ir.entities;

public class Rr_construction_types {
@Column(name="rr_type_id")
 
 private Integer  rrTypeId;

@Column(name="rr_type_name")
 
 private String  rrTypeName;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Rr_construction_types(int rr_type_id, Object rr_type_name, boolean delete_flag) {
        this.rr_type_id = rr_type_id;
        this.rr_type_name = rr_type_name;
        this.delete_flag = delete_flag;
    }
}
