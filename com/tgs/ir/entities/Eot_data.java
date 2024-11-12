package com.tgs.ir.entities;

public class Eot_data {
@Column(name="eot_id")
 
 private Integer  eotId;

@Column(name="ag_id")
 
 private Integer  agId;

@Column(name="eot_number")
 
 private Integer  eotNumber;

@Column(name="eot_with")
 
 private Integer  eotWith;

@Column(name="from_date")
 
 private timestamp without time zone  fromDate;

@Column(name="to_date")
 
 private timestamp without time zone  toDate;

@Column(name="reasons_eot")
 
 private String  reasonsEot;

@Column(name="work_completion_date")
 
 private timestamp without time zone  workCompletionDate;

@Column(name="defect_liability_date")
 
 private timestamp without time zone  defectLiabilityDate;

@Column(name="onm_completion_date")
 
 private timestamp without time zone  onmCompletionDate;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="created_by")
 
 private String  createdBy;

@Column(name="created_time")
 
 private timestamp without time zone  createdTime;

@Column(name="post_id")
 
 private bigint  postId;

@Column(name="deleted_by")
 
 private String  deletedBy;

@Column(name="deleted_time")
 
 private timestamp without time zone  deletedTime;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="sub_division_id")
 
 private Integer  subDivisionId;


    public Eot_data(int eot_id, int ag_id, int eot_number, int eot_with, Object from_date, Object to_date, Object reasons_eot, Object work_completion_date, Object defect_liability_date, Object onm_completion_date, boolean delete_flag, boolean is_latest, Object created_by, Object created_time, long post_id, Object deleted_by, Object deleted_time, int unit_id, int circle_id, int division_id, int sub_division_id) {
        this.eot_id = eot_id;
        this.ag_id = ag_id;
        this.eot_number = eot_number;
        this.eot_with = eot_with;
        this.from_date = from_date;
        this.to_date = to_date;
        this.reasons_eot = reasons_eot;
        this.work_completion_date = work_completion_date;
        this.defect_liability_date = defect_liability_date;
        this.onm_completion_date = onm_completion_date;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.created_by = created_by;
        this.created_time = created_time;
        this.post_id = post_id;
        this.deleted_by = deleted_by;
        this.deleted_time = deleted_time;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
    }
}
