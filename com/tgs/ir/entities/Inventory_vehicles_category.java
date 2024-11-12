package com.tgs.ir.entities;

public class Inventory_vehicles_category {
@Column(name="vehicle_category_id")
 
 private Integer  vehicleCategoryId;

@Column(name="vehicle_category")
 
 private String  vehicleCategory;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Inventory_vehicles_category(int vehicle_category_id, Object vehicle_category, boolean delete_flag) {
        this.vehicle_category_id = vehicle_category_id;
        this.vehicle_category = vehicle_category;
        this.delete_flag = delete_flag;
    }
}
