package com.tgs.ir.entities;

public class Rr_item_type_mapping {
@Column(name="item_type_id")
 
 private Integer  itemTypeId;

@Column(name="type_id")
 
 private Integer  typeId;

@Column(name="item_id")
 
 private Integer  itemId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Rr_item_type_mapping(int item_type_id, int type_id, int item_id, boolean delete_flag) {
        this.item_type_id = item_type_id;
        this.type_id = type_id;
        this.item_id = item_id;
        this.delete_flag = delete_flag;
    }
}
