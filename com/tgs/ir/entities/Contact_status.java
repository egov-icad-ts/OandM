package com.tgs.ir.entities;

public class Contact_status {
@Column(name="status_id")
 
 private Integer  statusId;

@Column(name="status")
 
 private String  status;


    public Contact_status(int status_id, Object status) {
        this.status_id = status_id;
        this.status = status;
    }
}
