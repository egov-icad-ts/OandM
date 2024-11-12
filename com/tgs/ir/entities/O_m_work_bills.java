package com.tgs.ir.entities;

public class O_m_work_bills {
@Column(name="bill_id")
 
 private Integer  billId;

@Column(name="work_id")
 
 private Integer  workId;

@Column(name="work_done_amount")
 
 private Double  workDoneAmount;

@Column(name="status_id")
 
 private Integer  statusId;

@Column(name="cum_work_done_amount")
 
 private Double  cumWorkDoneAmount;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="updated_by")
 
 private String  updatedBy;

@Column(name="updated_on")
 
 private timestamp with time zone  updatedOn;

@Column(name="bill_no")
 
 private Double  billNo;

@Column(name="bill_type")
 
 private String  billType;

@Column(name="agreement_id")
 
 private Integer  agreementId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="loc_file_url")
 
 private String  locFileUrl;

@Column(name="loc_updated_on")
 
 private timestamp with time zone  locUpdatedOn;

@Column(name="loc_released_amt")
 
 private Double  locReleasedAmt;


    public O_m_work_bills(int bill_id, int work_id, double work_done_amount, int status_id, double cum_work_done_amount, boolean is_latest, Object updated_by, Object updated_on, double bill_no, Object bill_type, int agreement_id, boolean delete_flag, Object loc_file_url, Object loc_updated_on, double loc_released_amt) {
        this.bill_id = bill_id;
        this.work_id = work_id;
        this.work_done_amount = work_done_amount;
        this.status_id = status_id;
        this.cum_work_done_amount = cum_work_done_amount;
        this.is_latest = is_latest;
        this.updated_by = updated_by;
        this.updated_on = updated_on;
        this.bill_no = bill_no;
        this.bill_type = bill_type;
        this.agreement_id = agreement_id;
        this.delete_flag = delete_flag;
        this.loc_file_url = loc_file_url;
        this.loc_updated_on = loc_updated_on;
        this.loc_released_amt = loc_released_amt;
    }
}
