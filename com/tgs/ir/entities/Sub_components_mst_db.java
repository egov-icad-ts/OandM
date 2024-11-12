package com.tgs.ir.entities;

public class Sub_components_mst_db {
@Column(name="sub_component_id")
 
 private Integer  subComponentId;

@Column(name="sub_component_name")
 
 private String  subComponentName;

@Column(name="comp_type_id")
 
 private Integer  compTypeId;

@Column(name="units")
 
 private String  units;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Sub_components_mst_db(int sub_component_id, Object sub_component_name, int comp_type_id, Object units, boolean delete_flag) {
        this.sub_component_id = sub_component_id;
        this.sub_component_name = sub_component_name;
        this.comp_type_id = comp_type_id;
        this.units = units;
        this.delete_flag = delete_flag;
    }
}
