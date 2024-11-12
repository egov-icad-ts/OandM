package com.tgs.ir.entities;

public class Legal_case_prf1_sc {
@Column(name="prf_id")
 
 private Integer  prfId;

@Column(name="case_type")
 
 private String  caseType;

@Column(name="case_number")
 
 private Integer  caseNumber;

@Column(name="case_year")
 
 private Integer  caseYear;

@Column(name="gist")
 
 private String  gist;

@Column(name="case_entrusted")
 
 private String  caseEntrusted;

@Column(name="stage_of_case")
 
 private String  stageOfCase;

@Column(name="pending_action")
 
 private String  pendingAction;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="updated_by")
 
 private String  updatedBy;

@Column(name="created_time")
 
 private timestamp without time zone  createdTime;

@Column(name="updated_time")
 
 private timestamp without time zone  updatedTime;


    public Legal_case_prf1_sc(int prf_id, Object case_type, int case_number, int case_year, Object gist, Object case_entrusted, Object stage_of_case, Object pending_action, Object remarks, int unit_id, int circle_id, int division_id, boolean is_latest, boolean delete_flag, Object updated_by, Object created_time, Object updated_time) {
        this.prf_id = prf_id;
        this.case_type = case_type;
        this.case_number = case_number;
        this.case_year = case_year;
        this.gist = gist;
        this.case_entrusted = case_entrusted;
        this.stage_of_case = stage_of_case;
        this.pending_action = pending_action;
        this.remarks = remarks;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.is_latest = is_latest;
        this.delete_flag = delete_flag;
        this.updated_by = updated_by;
        this.created_time = created_time;
        this.updated_time = updated_time;
    }
}
