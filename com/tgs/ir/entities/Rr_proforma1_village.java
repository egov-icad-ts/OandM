package com.tgs.ir.entities;

public class Rr_proforma1_village {
@Column(name="rr_proforma1_village_id")
 
 private Integer  rrProforma1VillageId;

@Column(name="infra_basic_id")
 
 private Integer  infraBasicId;

@Column(name="mandal_id")
 
 private Integer  mandalId;

@Column(name="village_id")
 
 private Integer  villageId;

@Column(name="number_pdf")
 
 private Integer  numberPdf;

@Column(name="created_by_username")
 
 private String  createdByUsername;

@Column(name="created_by_userid")
 
 private Integer  createdByUserid;

@Column(name="created_date")
 
 private timestamp without time zone  createdDate;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;


    public Rr_proforma1_village(int rr_proforma1_village_id, int infra_basic_id, int mandal_id, int village_id, int number_pdf, Object created_by_username, int created_by_userid, Object created_date, boolean delete_flag, boolean is_latest) {
        this.rr_proforma1_village_id = rr_proforma1_village_id;
        this.infra_basic_id = infra_basic_id;
        this.mandal_id = mandal_id;
        this.village_id = village_id;
        this.number_pdf = number_pdf;
        this.created_by_username = created_by_username;
        this.created_by_userid = created_by_userid;
        this.created_date = created_date;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
    }
}
