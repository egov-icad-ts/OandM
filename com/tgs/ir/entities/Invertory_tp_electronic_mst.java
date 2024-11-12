package com.tgs.ir.entities;

public class Invertory_tp_electronic_mst {
@Column(name="tp_ele_id")
 
 private Integer  tpEleId;

@Column(name="tp_electronic_description")
 
 private String  tpElectronicDescription;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Invertory_tp_electronic_mst(int tp_ele_id, Object tp_electronic_description, boolean delete_flag) {
        this.tp_ele_id = tp_ele_id;
        this.tp_electronic_description = tp_electronic_description;
        this.delete_flag = delete_flag;
    }
}
