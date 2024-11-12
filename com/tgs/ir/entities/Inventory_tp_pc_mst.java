package com.tgs.ir.entities;

public class Inventory_tp_pc_mst {
@Column(name="tp_pc_id")
 
 private Integer  tpPcId;

@Column(name="tp_pc_description")
 
 private String  tpPcDescription;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Inventory_tp_pc_mst(int tp_pc_id, Object tp_pc_description, boolean delete_flag) {
        this.tp_pc_id = tp_pc_id;
        this.tp_pc_description = tp_pc_description;
        this.delete_flag = delete_flag;
    }
}
