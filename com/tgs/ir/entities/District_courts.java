package com.tgs.ir.entities;

public class District_courts {
@Column(name="court_id")
 
 private Integer  courtId;

@Column(name="dcode")
 
 private Integer  dcode;

@Column(name="court_name")
 
 private String  courtName;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public District_courts(int court_id, int dcode, Object court_name, boolean delete_flag) {
        this.court_id = court_id;
        this.dcode = dcode;
        this.court_name = court_name;
        this.delete_flag = delete_flag;
    }
}
