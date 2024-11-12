package com.tgs.ir.entities;

public class Sr_primary_items {
@Column(name="item_primary_id")
 
 private Integer  itemPrimaryId;

@Column(name="item_name")
 
 private String  itemName;

@Column(name="item_description")
 
 private String  itemDescription;

@Column(name="item_id")
 
 private Integer  itemId;

@Column(name="deleteflag")
 
 private boolean  deleteflag;


    public Sr_primary_items(int item_primary_id, Object item_name, Object item_description, int item_id, boolean deleteflag) {
        this.item_primary_id = item_primary_id;
        this.item_name = item_name;
        this.item_description = item_description;
        this.item_id = item_id;
        this.deleteflag = deleteflag;
    }
}
