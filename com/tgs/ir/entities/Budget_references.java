package com.tgs.ir.entities;

public class Budget_references {
@Column(name="referenceid")
 
 private Integer  referenceid;

@Column(name="status")
 
 private Double  status;

@Column(name="unit_id")
 
 private Double  unitId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="created_date")
 
 private timestamp without time zone  createdDate;

@Column(name="is_latest")
 
 private boolean  isLatest;


    public Budget_references(int referenceid, double status, double unit_id, boolean delete_flag, Object created_date, boolean is_latest) {
        this.referenceid = referenceid;
        this.status = status;
        this.unit_id = unit_id;
        this.delete_flag = delete_flag;
        this.created_date = created_date;
        this.is_latest = is_latest;
    }
}
