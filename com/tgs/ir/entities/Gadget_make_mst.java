package com.tgs.ir.entities;

public class Gadget_make_mst {
@Column(name="gadjet_id")
 
 private Integer  gadjetId;

@Column(name="gadjet_make")
 
 private String  gadjetMake;

@Column(name="gadjet_category")
 
 private Integer  gadjetCategory;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Gadget_make_mst(int gadjet_id, Object gadjet_make, int gadjet_category, boolean delete_flag) {
        this.gadjet_id = gadjet_id;
        this.gadjet_make = gadjet_make;
        this.gadjet_category = gadjet_category;
        this.delete_flag = delete_flag;
    }
}
