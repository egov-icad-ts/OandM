package com.tgs.ir.entities;

public class Legal_case_listing_data {
@Column(name="id")
 
 private Integer  id;

@Column(name="legal_type_id")
 
 private Integer  legalTypeId;

@Column(name="case_number")
 
 private Integer  caseNumber;

@Column(name="case_year")
 
 private Integer  caseYear;

@Column(name="court_number")
 
 private Integer  courtNumber;

@Column(name="slno")
 
 private Integer  slno;

@Column(name="listing_date")
 
 private String  listingDate;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="created_by")
 
 private String  createdBy;

@Column(name="created_time")
 
 private timestamp without time zone  createdTime;

@Column(name="updated_by")
 
 private String  updatedBy;

@Column(name="updated_time")
 
 private timestamp without time zone  updatedTime;

@Column(name="remarks")
 
 private String  remarks;


    public Legal_case_listing_data(int id, int legal_type_id, int case_number, int case_year, int court_number, int slno, Object listing_date, boolean is_latest, boolean delete_flag, Object created_by, Object created_time, Object updated_by, Object updated_time, Object remarks) {
        this.id = id;
        this.legal_type_id = legal_type_id;
        this.case_number = case_number;
        this.case_year = case_year;
        this.court_number = court_number;
        this.slno = slno;
        this.listing_date = listing_date;
        this.is_latest = is_latest;
        this.delete_flag = delete_flag;
        this.created_by = created_by;
        this.created_time = created_time;
        this.updated_by = updated_by;
        this.updated_time = updated_time;
        this.remarks = remarks;
    }
}
