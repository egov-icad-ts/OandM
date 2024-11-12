package com.tgs.ir.entities;

public class Component_type {
@Column(name="comp_type_id")
 
 private Integer  compTypeId;

@Column(name="comp_type_name")
 
 private String  compTypeName;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Component_type(int comp_type_id, Object comp_type_name, boolean delete_flag) {
        this.comp_type_id = comp_type_id;
        this.comp_type_name = comp_type_name;
        this.delete_flag = delete_flag;
    }
}
