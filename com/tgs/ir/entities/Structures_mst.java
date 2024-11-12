package com.tgs.ir.entities;

public class Structures_mst {
@Column(name="struct_id")
 
 private Integer  structId;

@Column(name="struct_name")
 
 private String  structName;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="comp_category_id")
 
 private Integer  compCategoryId;


    public Structures_mst(int struct_id, Object struct_name, boolean delete_flag, int comp_category_id) {
        this.struct_id = struct_id;
        this.struct_name = struct_name;
        this.delete_flag = delete_flag;
        this.comp_category_id = comp_category_id;
    }
}
