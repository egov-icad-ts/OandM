package com.tgs.ir.entities;

public class Type_mst {
@Column(name="type_id")
 
 private Integer  typeId;

@Column(name="type")
 
 private String  type;


    public Type_mst(int type_id, Object type) {
        this.type_id = type_id;
        this.type = type;
    }
}
