package com.tgs.ir.entities;

public class Respondant_advocate_entry {
@Column(name="slno")
 
 private Integer  slno;

@Column(name="legal_case_id")
 
 private Integer  legalCaseId;

@Column(name="advocate_id")
 
 private Integer  advocateId;

@Column(name="added_by")
 
 private String  addedBy;

@Column(name="added_time")
 
 private timestamp without time zone  addedTime;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Respondant_advocate_entry(int slno, int legal_case_id, int advocate_id, Object added_by, Object added_time, boolean is_latest, boolean delete_flag) {
        this.slno = slno;
        this.legal_case_id = legal_case_id;
        this.advocate_id = advocate_id;
        this.added_by = added_by;
        this.added_time = added_time;
        this.is_latest = is_latest;
        this.delete_flag = delete_flag;
    }
}
