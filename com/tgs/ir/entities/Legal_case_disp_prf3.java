package com.tgs.ir.entities;

public class Legal_case_disp_prf3 {
@Column(name="prf_id")
 
 private Integer  prfId;

@Column(name="case_type")
 
 private Integer  caseType;

@Column(name="case_number")
 
 private Integer  caseNumber;

@Column(name="case_year")
 
 private Integer  caseYear;

@Column(name="disposed_date")
 
 private String  disposedDate;

@Column(name="outcome_of_judgement")
 
 private String  outcomeOfJudgement;

@Column(name="infavour_against")
 
 private String  infavourAgainst;

@Column(name="govt_action_taken")
 
 private String  govtActionTaken;

@Column(name="preferredappeal_stage")
 
 private String  preferredappealStage;

@Column(name="reason_for_notpreffered")
 
 private String  reasonForNotpreffered;

@Column(name="decretal_amount")
 
 private Double  decretalAmount;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="updated_by")
 
 private String  updatedBy;

@Column(name="created_time")
 
 private timestamp without time zone  createdTime;

@Column(name="updated_on")
 
 private timestamp without time zone  updatedOn;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;


    public Legal_case_disp_prf3(int prf_id, int case_type, int case_number, int case_year, Object disposed_date, Object outcome_of_judgement, Object infavour_against, Object govt_action_taken, Object preferredappeal_stage, Object reason_for_notpreffered, double decretal_amount, boolean is_latest, boolean delete_flag, Object updated_by, Object created_time, Object updated_on, int unit_id, int circle_id, int division_id) {
        this.prf_id = prf_id;
        this.case_type = case_type;
        this.case_number = case_number;
        this.case_year = case_year;
        this.disposed_date = disposed_date;
        this.outcome_of_judgement = outcome_of_judgement;
        this.infavour_against = infavour_against;
        this.govt_action_taken = govt_action_taken;
        this.preferredappeal_stage = preferredappeal_stage;
        this.reason_for_notpreffered = reason_for_notpreffered;
        this.decretal_amount = decretal_amount;
        this.is_latest = is_latest;
        this.delete_flag = delete_flag;
        this.updated_by = updated_by;
        this.created_time = created_time;
        this.updated_on = updated_on;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
    }
}
