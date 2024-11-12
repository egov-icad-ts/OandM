package com.tgs.ir.entities;

public class Gis_map_type {
@Column(name="type_id")
 
 private Integer  typeId;

@Column(name="type_name")
 
 private String  typeName;

@Column(name="type_short_code")
 
 private String  typeShortCode;


    public Gis_map_type(int type_id, Object type_name, Object type_short_code) {
        this.type_id = type_id;
        this.type_name = type_name;
        this.type_short_code = type_short_code;
    }
}
