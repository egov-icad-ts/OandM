package com.tgs.ir.entities;

public class Lao_view {
@Column(name="lao_view_id")
 
 private Integer  laoViewId;

@Column(name="dee_enter_req_id")
 
 private Integer  deeEnterReqId;

@Column(name="ee_la_file_id")
 
 private Integer  eeLaFileId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="package_id")
 
 private Integer  packageId;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="mandal_id")
 
 private Integer  mandalId;

@Column(name="village_id")
 
 private Integer  villageId;

@Column(name="survey_id")
 
 private Integer  surveyId;

@Column(name="requirement_acres")
 
 private Double  requirementAcres;

@Column(name="requirement_guntas")
 
 private Double  requirementGuntas;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="created_by_userid")
 
 private Integer  createdByUserid;

@Column(name="submited_date")
 
 private timestamp without time zone  submitedDate;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="north_boundary")
 
 private String  northBoundary;

@Column(name="south_boundary")
 
 private String  southBoundary;

@Column(name="east_boundary")
 
 private String  eastBoundary;

@Column(name="west_boundary")
 
 private String  westBoundary;

@Column(name="lao_file_id")
 
 private Integer  laoFileId;

@Column(name="status_id")
 
 private Integer  statusId;

@Column(name="govt_patta")
 
 private Integer  govtPatta;

@Column(name="dee_req_acq_temp_id")
 
 private Integer  deeReqAcqTempId;


    public Lao_view(int lao_view_id, int dee_enter_req_id, int ee_la_file_id, int project_id, int package_id, int district_id, int mandal_id, int village_id, int survey_id, double requirement_acres, double requirement_guntas, Object remarks, int created_by_userid, Object submited_date, boolean delete_flag, boolean is_latest, Object north_boundary, Object south_boundary, Object east_boundary, Object west_boundary, int lao_file_id, int status_id, int govt_patta, int dee_req_acq_temp_id) {
        this.lao_view_id = lao_view_id;
        this.dee_enter_req_id = dee_enter_req_id;
        this.ee_la_file_id = ee_la_file_id;
        this.project_id = project_id;
        this.package_id = package_id;
        this.district_id = district_id;
        this.mandal_id = mandal_id;
        this.village_id = village_id;
        this.survey_id = survey_id;
        this.requirement_acres = requirement_acres;
        this.requirement_guntas = requirement_guntas;
        this.remarks = remarks;
        this.created_by_userid = created_by_userid;
        this.submited_date = submited_date;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.north_boundary = north_boundary;
        this.south_boundary = south_boundary;
        this.east_boundary = east_boundary;
        this.west_boundary = west_boundary;
        this.lao_file_id = lao_file_id;
        this.status_id = status_id;
        this.govt_patta = govt_patta;
        this.dee_req_acq_temp_id = dee_req_acq_temp_id;
    }
}
