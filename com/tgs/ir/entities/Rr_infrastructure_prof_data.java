package com.tgs.ir.entities;

public class Rr_infrastructure_prof_data {
@Column(name="rr_infra_id")
 
 private Integer  rrInfraId;

@Column(name="infra_id")
 
 private Integer  infraId;

@Column(name="no_of_works_sanctioned")
 
 private Integer  noOfWorksSanctioned;

@Column(name="sanction_amount")
 
 private Double  sanctionAmount;

@Column(name="reference_no")
 
 private String  referenceNo;

@Column(name="expenditure_inccured")
 
 private Double  expenditureInccured;

@Column(name="completed_works")
 
 private Integer  completedWorks;

@Column(name="inprogress_works")
 
 private Integer  inprogressWorks;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="infra_basic_id")
 
 private Integer  infraBasicId;

@Column(name="created_by_user")
 
 private String  createdByUser;

@Column(name="user_id")
 
 private Integer  userId;

@Column(name="created_date")
 
 private timestamp without time zone  createdDate;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;


    public Rr_infrastructure_prof_data(int rr_infra_id, int infra_id, int no_of_works_sanctioned, double sanction_amount, Object reference_no, double expenditure_inccured, int completed_works, int inprogress_works, Object remarks, int infra_basic_id, Object created_by_user, int user_id, Object created_date, boolean delete_flag, boolean is_latest) {
        this.rr_infra_id = rr_infra_id;
        this.infra_id = infra_id;
        this.no_of_works_sanctioned = no_of_works_sanctioned;
        this.sanction_amount = sanction_amount;
        this.reference_no = reference_no;
        this.expenditure_inccured = expenditure_inccured;
        this.completed_works = completed_works;
        this.inprogress_works = inprogress_works;
        this.remarks = remarks;
        this.infra_basic_id = infra_basic_id;
        this.created_by_user = created_by_user;
        this.user_id = user_id;
        this.created_date = created_date;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
    }
}
