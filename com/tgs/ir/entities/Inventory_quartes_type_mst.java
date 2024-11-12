package com.tgs.ir.entities;

public class Inventory_quartes_type_mst {
@Column(name="type_id")
 
 private Integer  typeId;

@Column(name="type_name")
 
 private String  typeName;


    public Inventory_quartes_type_mst(int type_id, Object type_name) {
        this.type_id = type_id;
        this.type_name = type_name;
    }
}
