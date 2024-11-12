package com.tgs.ir.entities;

public class Inv_status_mst {
@Column(name="status_id")
 
 private Integer  statusId;

@Column(name="status")
 
 private String  status;


    public Inv_status_mst(int status_id, Object status) {
        this.status_id = status_id;
        this.status = status;
    }
}
