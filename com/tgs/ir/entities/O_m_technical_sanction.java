package com.tgs.ir.entities;

public class O_m_technical_sanction {
@Column(name="ts_id")
 
 private Integer  tsId;

@Column(name="work_id")
 
 private Integer  workId;

@Column(name="ts_number")
 
 private String  tsNumber;

@Column(name="ts_approved_amount")
 
 private Double  tsApprovedAmount;

@Column(name="ts_approved_date")
 
 private date  tsApprovedDate;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="updated_by")
 
 private String  updatedBy;

@Column(name="updated_on")
 
 private timestamp with time zone  updatedOn;

@Column(name="ts_file_url")
 
 private String  tsFileUrl;

@Column(name="ts_est_file_url")
 
 private String  tsEstFileUrl;

@Column(name="ts_type")
 
 private Integer  tsType;


    public O_m_technical_sanction(int ts_id, int work_id, Object ts_number, double ts_approved_amount, Object ts_approved_date, boolean is_latest, boolean delete_flag, Object updated_by, Object updated_on, Object ts_file_url, Object ts_est_file_url, int ts_type) {
        this.ts_id = ts_id;
        this.work_id = work_id;
        this.ts_number = ts_number;
        this.ts_approved_amount = ts_approved_amount;
        this.ts_approved_date = ts_approved_date;
        this.is_latest = is_latest;
        this.delete_flag = delete_flag;
        this.updated_by = updated_by;
        this.updated_on = updated_on;
        this.ts_file_url = ts_file_url;
        this.ts_est_file_url = ts_est_file_url;
        this.ts_type = ts_type;
    }
}
