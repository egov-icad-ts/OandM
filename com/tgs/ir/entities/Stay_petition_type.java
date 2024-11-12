package com.tgs.ir.entities;

public class Stay_petition_type {
@Column(name="stay_petition_id")
 
 private Integer  stayPetitionId;

@Column(name="stay_petition_type")
 
 private String  stayPetitionType;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Stay_petition_type(int stay_petition_id, Object stay_petition_type, boolean delete_flag) {
        this.stay_petition_id = stay_petition_id;
        this.stay_petition_type = stay_petition_type;
        this.delete_flag = delete_flag;
    }
}
