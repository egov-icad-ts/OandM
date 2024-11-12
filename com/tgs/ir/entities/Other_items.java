package com.tgs.ir.entities;

public class Other_items {
@Column(name="other_items_id")
 
 private Integer  otherItemsId;

@Column(name="other_items")
 
 private String  otherItems;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Other_items(int other_items_id, Object other_items, boolean delete_flag) {
        this.other_items_id = other_items_id;
        this.other_items = other_items;
        this.delete_flag = delete_flag;
    }
}
