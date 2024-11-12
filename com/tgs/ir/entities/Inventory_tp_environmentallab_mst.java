package com.tgs.ir.entities;

public class Inventory_tp_environmentallab_mst {
@Column(name="tp_envilab_id")
 
 private Integer  tpEnvilabId;

@Column(name="tp_environmentallab_description")
 
 private String  tpEnvironmentallabDescription;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Inventory_tp_environmentallab_mst(int tp_envilab_id, Object tp_environmentallab_description, boolean delete_flag) {
        this.tp_envilab_id = tp_envilab_id;
        this.tp_environmentallab_description = tp_environmentallab_description;
        this.delete_flag = delete_flag;
    }
}
