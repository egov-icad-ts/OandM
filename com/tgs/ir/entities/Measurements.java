package com.tgs.ir.entities;

public class Measurements {
@Column(name="measure_id")
 
 private Integer  measureId;

@Column(name="measure_name")
 
 private String  measureName;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Measurements(int measure_id, Object measure_name, boolean delete_flag) {
        this.measure_id = measure_id;
        this.measure_name = measure_name;
        this.delete_flag = delete_flag;
    }
}
