package com.tgs.ir.entities;

public class Inventory_tp_concretelab_mst {
@Column(name="tp_concretelab_id")
 
 private Integer  tpConcretelabId;

@Column(name="tp_concretelab_description")
 
 private String  tpConcretelabDescription;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Inventory_tp_concretelab_mst(int tp_concretelab_id, Object tp_concretelab_description, boolean delete_flag) {
        this.tp_concretelab_id = tp_concretelab_id;
        this.tp_concretelab_description = tp_concretelab_description;
        this.delete_flag = delete_flag;
    }
}
