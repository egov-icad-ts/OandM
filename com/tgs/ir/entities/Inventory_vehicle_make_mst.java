package com.tgs.ir.entities;

public class Inventory_vehicle_make_mst {
@Column(name="veh_make_id")
 
 private Integer  vehMakeId;

@Column(name="veh_make_description")
 
 private String  vehMakeDescription;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Inventory_vehicle_make_mst(int veh_make_id, Object veh_make_description, boolean delete_flag) {
        this.veh_make_id = veh_make_id;
        this.veh_make_description = veh_make_description;
        this.delete_flag = delete_flag;
    }
}
