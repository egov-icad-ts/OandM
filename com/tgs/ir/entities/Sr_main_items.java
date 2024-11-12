package com.tgs.ir.entities;

public class Sr_main_items {
@Column(name="item_id")
 
 private Integer  itemId;

@Column(name="item_name")
 
 private String  itemName;

@Column(name="item_description")
 
 private String  itemDescription;

@Column(name="deleteflag")
 
 private boolean  deleteflag;


    public Sr_main_items(int item_id, Object item_name, Object item_description, boolean deleteflag) {
        this.item_id = item_id;
        this.item_name = item_name;
        this.item_description = item_description;
        this.deleteflag = deleteflag;
    }
}
