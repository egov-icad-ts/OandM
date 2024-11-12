package com.tgs.ir.entities;

public class Bill_category {
@Column(name="bill_cat_id")
 
 private Integer  billCatId;

@Column(name="bill_cat_name")
 
 private String  billCatName;


    public Bill_category(int bill_cat_id, Object bill_cat_name) {
        this.bill_cat_id = bill_cat_id;
        this.bill_cat_name = bill_cat_name;
    }
}
