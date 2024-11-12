package com.tgs.ir.entities;

public class Inventory_tp_hydrauliclab_mst {
@Column(name="tp_hydrolab_id")
 
 private Integer  tpHydrolabId;

@Column(name="tp_hydrolab_description")
 
 private String  tpHydrolabDescription;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Inventory_tp_hydrauliclab_mst(int tp_hydrolab_id, Object tp_hydrolab_description, boolean delete_flag) {
        this.tp_hydrolab_id = tp_hydrolab_id;
        this.tp_hydrolab_description = tp_hydrolab_description;
        this.delete_flag = delete_flag;
    }
}
