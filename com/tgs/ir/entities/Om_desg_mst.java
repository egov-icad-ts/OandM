package com.tgs.ir.entities;

public class Om_desg_mst {
@Column(name="des_id")
 
 private Integer  desId;

@Column(name="description")
 
 private String  description;

@Column(name="category")
 
 private String  category;


    public Om_desg_mst(int des_id, Object description, Object category) {
        this.des_id = des_id;
        this.description = description;
        this.category = category;
    }
}
