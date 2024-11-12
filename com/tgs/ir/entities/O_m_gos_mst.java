package com.tgs.ir.entities;

public class O_m_gos_mst {
@Column(name="go_id")
 
 private Integer  goId;

@Column(name="go_number")
 
 private String  goNumber;

@Column(name="go_desc")
 
 private String  goDesc;

@Column(name="go_url")
 
 private String  goUrl;

@Column(name="posted_time")
 
 private timestamp with time zone  postedTime;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="go_date")
 
 private date  goDate;

@Column(name="upload_type")
 
 private String  uploadType;

@Column(name="go_amount")
 
 private Integer  goAmount;

@Column(name="financial_year")
 
 private Integer  financialYear;


    public O_m_gos_mst(int go_id, Object go_number, Object go_desc, Object go_url, Object posted_time, boolean delete_flag, Object go_date, Object upload_type, int go_amount, int financial_year) {
        this.go_id = go_id;
        this.go_number = go_number;
        this.go_desc = go_desc;
        this.go_url = go_url;
        this.posted_time = posted_time;
        this.delete_flag = delete_flag;
        this.go_date = go_date;
        this.upload_type = upload_type;
        this.go_amount = go_amount;
        this.financial_year = financial_year;
    }
}
