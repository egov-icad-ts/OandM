package com.tgs.ir.entities;

public class Rr_construction_items {
@Column(name="rr_item_id")
 
 private Integer  rrItemId;

@Column(name="rr_item_name")
 
 private String  rrItemName;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Rr_construction_items(int rr_item_id, Object rr_item_name, boolean delete_flag) {
        this.rr_item_id = rr_item_id;
        this.rr_item_name = rr_item_name;
        this.delete_flag = delete_flag;
    }
}
