package com.tgs.ir.entities;

public class La_proceeding_no {
@Column(name="la_proceeding_id")
 
 private Integer  laProceedingId;

@Column(name="la_proceeding_no")
 
 private String  laProceedingNo;

@Column(name="la_proceeding_date")
 
 private timestamp without time zone  laProceedingDate;

@Column(name="proceeding_amount")
 
 private Double  proceedingAmount;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="created_by_username")
 
 private String  createdByUsername;

@Column(name="created_by_userid")
 
 private Integer  createdByUserid;

@Column(name="created_date")
 
 private timestamp without time zone  createdDate;

@Column(name="proceeding_type")
 
 private String  proceedingType;

@Column(name="proceeding_doc_path")
 
 private String  proceedingDocPath;


    public La_proceeding_no(int la_proceeding_id, Object la_proceeding_no, Object la_proceeding_date, double proceeding_amount, boolean delete_flag, boolean is_latest, Object created_by_username, int created_by_userid, Object created_date, Object proceeding_type, Object proceeding_doc_path) {
        this.la_proceeding_id = la_proceeding_id;
        this.la_proceeding_no = la_proceeding_no;
        this.la_proceeding_date = la_proceeding_date;
        this.proceeding_amount = proceeding_amount;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.created_by_username = created_by_username;
        this.created_by_userid = created_by_userid;
        this.created_date = created_date;
        this.proceeding_type = proceeding_type;
        this.proceeding_doc_path = proceeding_doc_path;
    }
}
