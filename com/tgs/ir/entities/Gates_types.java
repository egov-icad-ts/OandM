package com.tgs.ir.entities;

public class Gates_types {
@Column(name="gate_id")
 
 private Integer  gateId;

@Column(name="gate_types")
 
 private String  gateTypes;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Gates_types(int gate_id, Object gate_types, boolean delete_flag) {
        this.gate_id = gate_id;
        this.gate_types = gate_types;
        this.delete_flag = delete_flag;
    }
}
