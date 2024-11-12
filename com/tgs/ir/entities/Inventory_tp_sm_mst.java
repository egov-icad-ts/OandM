package com.tgs.ir.entities;

public class Inventory_tp_sm_mst {
@Column(name="tp_sm_id")
 
 private Integer  tpSmId;

@Column(name="tp_soillab_description")
 
 private String  tpSoillabDescription;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Inventory_tp_sm_mst(int tp_sm_id, Object tp_soillab_description, boolean delete_flag) {
        this.tp_sm_id = tp_sm_id;
        this.tp_soillab_description = tp_soillab_description;
        this.delete_flag = delete_flag;
    }
}
