package com.tgs.ir.entities;

public class Petition_status {
@Column(name="petition_status_id")
 
 private Integer  petitionStatusId;

@Column(name="petition_status")
 
 private String  petitionStatus;


    public Petition_status(int petition_status_id, Object petition_status) {
        this.petition_status_id = petition_status_id;
        this.petition_status = petition_status;
    }
}
