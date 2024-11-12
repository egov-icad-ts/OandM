package com.tgs.ir.entities;

public class Components_mst {
@Column(name="comp_id")
 
 private Integer  compId;

@Column(name="comp_name")
 
 private String  compName;

@Column(name="parent_id")
 
 private Integer  parentId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="has_child")
 
 private boolean  hasChild;

@Column(name="no_of_col_type")
 
 private Double  noOfColType;

@Column(name="component_type")
 
 private Integer  componentType;

@Column(name="show_db")
 
 private boolean  showDb;


    public Components_mst(int comp_id, Object comp_name, int parent_id, boolean delete_flag, boolean has_child, double no_of_col_type, int component_type, boolean show_db) {
        this.comp_id = comp_id;
        this.comp_name = comp_name;
        this.parent_id = parent_id;
        this.delete_flag = delete_flag;
        this.has_child = has_child;
        this.no_of_col_type = no_of_col_type;
        this.component_type = component_type;
        this.show_db = show_db;
    }
}
