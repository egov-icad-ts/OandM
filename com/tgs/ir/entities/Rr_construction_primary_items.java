package com.tgs.ir.entities;

public class Rr_construction_primary_items {
@Column(name="rr_primary_item_id")
 
 private Integer  rrPrimaryItemId;

@Column(name="rr_primary_item_code")
 
 private String  rrPrimaryItemCode;

@Column(name="rr_primary_description")
 
 private String  rrPrimaryDescription;

@Column(name="rr_type_id")
 
 private Integer  rrTypeId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Rr_construction_primary_items(int rr_primary_item_id, Object rr_primary_item_code, Object rr_primary_description, int rr_type_id, boolean delete_flag) {
        this.rr_primary_item_id = rr_primary_item_id;
        this.rr_primary_item_code = rr_primary_item_code;
        this.rr_primary_description = rr_primary_description;
        this.rr_type_id = rr_type_id;
        this.delete_flag = delete_flag;
    }
}
