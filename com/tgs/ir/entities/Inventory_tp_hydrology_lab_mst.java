package com.tgs.ir.entities;

public class Inventory_tp_hydrology_lab_mst {
@Column(name="tp_hydrology_id")
 
 private Integer  tpHydrologyId;

@Column(name="tp_hydrology_description")
 
 private String  tpHydrologyDescription;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Inventory_tp_hydrology_lab_mst(int tp_hydrology_id, Object tp_hydrology_description, boolean delete_flag) {
        this.tp_hydrology_id = tp_hydrology_id;
        this.tp_hydrology_description = tp_hydrology_description;
        this.delete_flag = delete_flag;
    }
}
