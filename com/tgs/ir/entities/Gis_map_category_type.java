package com.tgs.ir.entities;

public class Gis_map_category_type {
@Column(name="slno")
 
 private Integer  slno;

@Column(name="category_id")
 
 private Integer  categoryId;

@Column(name="type_id")
 
 private Integer  typeId;


    public Gis_map_category_type(int slno, int category_id, int type_id) {
        this.slno = slno;
        this.category_id = category_id;
        this.type_id = type_id;
    }
}
