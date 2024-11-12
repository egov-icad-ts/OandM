package com.tgs.ir.entities;

public class O_m_bills_status_mst {
@Column(name="status_id")
 
 private Integer  statusId;

@Column(name="status_name")
 
 private String  statusName;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public O_m_bills_status_mst(int status_id, Object status_name, boolean delete_flag) {
        this.status_id = status_id;
        this.status_name = status_name;
        this.delete_flag = delete_flag;
    }
}
