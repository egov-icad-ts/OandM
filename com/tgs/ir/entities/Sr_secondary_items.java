package com.tgs.ir.entities;

public class Sr_secondary_items {
@Column(name="item_secondary_id")
 
 private Integer  itemSecondaryId;

@Column(name="item_name")
 
 private String  itemName;

@Column(name="item_description")
 
 private String  itemDescription;

@Column(name="item_primary_id")
 
 private Integer  itemPrimaryId;

@Column(name="deleteflag")
 
 private boolean  deleteflag;

@Column(name="unitid")
 
 private Integer  unitid;


    public Sr_secondary_items(int item_secondary_id, Object item_name, Object item_description, int item_primary_id, boolean deleteflag, int unitid) {
        this.item_secondary_id = item_secondary_id;
        this.item_name = item_name;
        this.item_description = item_description;
        this.item_primary_id = item_primary_id;
        this.deleteflag = deleteflag;
        this.unitid = unitid;
    }
}
