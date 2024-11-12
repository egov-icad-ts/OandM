package com.tgs.ir.entities;

public class Pump_motor_type_mst {
@Column(name="pump_motor_type_id")
 
 private Integer  pumpMotorTypeId;

@Column(name="pump_motor_type_name")
 
 private String  pumpMotorTypeName;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="pump_motor")
 
 private String  pumpMotor;


    public Pump_motor_type_mst(int pump_motor_type_id, Object pump_motor_type_name, boolean delete_flag, Object pump_motor) {
        this.pump_motor_type_id = pump_motor_type_id;
        this.pump_motor_type_name = pump_motor_type_name;
        this.delete_flag = delete_flag;
        this.pump_motor = pump_motor;
    }
}
