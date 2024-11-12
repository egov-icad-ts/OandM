package com.tgs.ir.entities;

public class Inventory_vehicle_model_mst {
@Column(name="veh_model_id")
 
 private Integer  vehModelId;

@Column(name="veh_model_description")
 
 private String  vehModelDescription;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="vehicle_category_id")
 
 private Integer  vehicleCategoryId;


    public Inventory_vehicle_model_mst(int veh_model_id, Object veh_model_description, boolean delete_flag, int vehicle_category_id) {
        this.veh_model_id = veh_model_id;
        this.veh_model_description = veh_model_description;
        this.delete_flag = delete_flag;
        this.vehicle_category_id = vehicle_category_id;
    }
}
