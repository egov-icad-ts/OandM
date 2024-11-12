package com.tgs.ir.entities;

public class Gate_operation_system {
@Column(name="gate_operate_id")
 
 private Integer  gateOperateId;

@Column(name="gate_system")
 
 private String  gateSystem;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Gate_operation_system(int gate_operate_id, Object gate_system, boolean delete_flag) {
        this.gate_operate_id = gate_operate_id;
        this.gate_system = gate_system;
        this.delete_flag = delete_flag;
    }
}
