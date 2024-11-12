package com.tgs.ir.entities;

public class Rr_construction_secondary_items {
@Column(name="rr_secondary_item_id")
 
 private Integer  rrSecondaryItemId;

@Column(name="rr_primary_item_id")
 
 private Integer  rrPrimaryItemId;

@Column(name="rr_secondary_item_code")
 
 private String  rrSecondaryItemCode;

@Column(name="rr_secondary_item_desc")
 
 private String  rrSecondaryItemDesc;

@Column(name="rr_secondary_item_custom_desc")
 
 private String  rrSecondaryItemCustomDesc;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Rr_construction_secondary_items(int rr_secondary_item_id, int rr_primary_item_id, Object rr_secondary_item_code, Object rr_secondary_item_desc, Object rr_secondary_item_custom_desc, boolean delete_flag) {
        this.rr_secondary_item_id = rr_secondary_item_id;
        this.rr_primary_item_id = rr_primary_item_id;
        this.rr_secondary_item_code = rr_secondary_item_code;
        this.rr_secondary_item_desc = rr_secondary_item_desc;
        this.rr_secondary_item_custom_desc = rr_secondary_item_custom_desc;
        this.delete_flag = delete_flag;
    }
}
