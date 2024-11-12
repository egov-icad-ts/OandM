package com.tgs.ir.entities;

public class Building_type_mst {
@Column(name="build_tp_id")
 
 private Integer  buildTpId;

@Column(name="category_id")
 
 private Integer  categoryId;

@Column(name="type")
 
 private String  type;


    public Building_type_mst(int build_tp_id, int category_id, Object type) {
        this.build_tp_id = build_tp_id;
        this.category_id = category_id;
        this.type = type;
    }
}
