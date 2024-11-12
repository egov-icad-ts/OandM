package com.tgs.ir.entities;

public class Rr_master {
@Column(name="rr_id")
 
 private Integer  rrId;

@Column(name="rr_centre_name")
 
 private String  rrCentreName;

@Column(name="created_user_name")
 
 private String  createdUserName;

@Column(name="created_user_id")
 
 private Integer  createdUserId;

@Column(name="created_date")
 
 private timestamp without time zone  createdDate;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;


    public Rr_master(int rr_id, Object rr_centre_name, Object created_user_name, int created_user_id, Object created_date, boolean delete_flag, boolean is_latest) {
        this.rr_id = rr_id;
        this.rr_centre_name = rr_centre_name;
        this.created_user_name = created_user_name;
        this.created_user_id = created_user_id;
        this.created_date = created_date;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
    }
}
