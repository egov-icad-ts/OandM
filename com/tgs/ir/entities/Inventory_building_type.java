package com.tgs.ir.entities;

public class Inventory_building_type {
@Column(name="build_type_id")
 
 private Integer  buildTypeId;

@Column(name="building_type")
 
 private String  buildingType;


    public Inventory_building_type(int build_type_id, Object building_type) {
        this.build_type_id = build_type_id;
        this.building_type = building_type;
    }
}
