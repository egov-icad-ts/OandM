package com.tgs.ir.entities;

public class Inventory_tp_furniture_mst {
@Column(name="tpf_id")
 
 private Integer  tpfId;

@Column(name="tpf_description")
 
 private String  tpfDescription;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Inventory_tp_furniture_mst(int tpf_id, Object tpf_description, boolean delete_flag) {
        this.tpf_id = tpf_id;
        this.tpf_description = tpf_description;
        this.delete_flag = delete_flag;
    }
}
