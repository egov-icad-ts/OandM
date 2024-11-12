package com.tgs.ir.entities;

public class Pump_motor_make_mst {
@Column(name="pump_motor_make_id")
 
 private Integer  pumpMotorMakeId;

@Column(name="pump_motor_make_name")
 
 private String  pumpMotorMakeName;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="pump_motor")
 
 private String  pumpMotor;


    public Pump_motor_make_mst(int pump_motor_make_id, Object pump_motor_make_name, boolean delete_flag, Object pump_motor) {
        this.pump_motor_make_id = pump_motor_make_id;
        this.pump_motor_make_name = pump_motor_make_name;
        this.delete_flag = delete_flag;
        this.pump_motor = pump_motor;
    }
}
