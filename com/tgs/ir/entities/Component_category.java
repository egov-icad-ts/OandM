package com.tgs.ir.entities;

public class Component_category {
@Column(name="comp_category_id")
 
 private Integer  compCategoryId;

@Column(name="comp_category_name")
 
 private String  compCategoryName;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="parent_id")
 
 private Integer  parentId;


    public Component_category(int comp_category_id, Object comp_category_name, boolean delete_flag, int parent_id) {
        this.comp_category_id = comp_category_id;
        this.comp_category_name = comp_category_name;
        this.delete_flag = delete_flag;
        this.parent_id = parent_id;
    }
}
