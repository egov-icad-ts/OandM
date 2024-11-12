package com.tgs.ir.entities;

public class Surveynumber_mst {
@Column(name="survey_id")
 
 private Integer  surveyId;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="mandal_id")
 
 private Integer  mandalId;

@Column(name="village_id")
 
 private Integer  villageId;

@Column(name="survey_number")
 
 private String  surveyNumber;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="edit_flag")
 
 private boolean  editFlag;

@Column(name="submited_date")
 
 private timestamp without time zone  submitedDate;

@Column(name="updated_time")
 
 private timestamp without time zone  updatedTime;

@Column(name="dee_req_acq_temp_id")
 
 private Integer  deeReqAcqTempId;


    public Surveynumber_mst(int survey_id, int district_id, int mandal_id, int village_id, Object survey_number, boolean delete_flag, boolean is_latest, boolean edit_flag, Object submited_date, Object updated_time, int dee_req_acq_temp_id) {
        this.survey_id = survey_id;
        this.district_id = district_id;
        this.mandal_id = mandal_id;
        this.village_id = village_id;
        this.survey_number = survey_number;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.edit_flag = edit_flag;
        this.submited_date = submited_date;
        this.updated_time = updated_time;
        this.dee_req_acq_temp_id = dee_req_acq_temp_id;
    }
}
