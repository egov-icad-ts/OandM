package com.tgs.ir.entities;

public class Dee_enter_reqisition_works {
@Column(name="dee_req_id")
 
 private Integer  deeReqId;

@Column(name="ee_re_assign_id")
 
 private Integer  eeReAssignId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="package_id")
 
 private Integer  packageId;

@Column(name="pas_id")
 
 private Integer  pasId;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="mandal_id")
 
 private Integer  mandalId;

@Column(name="village_id")
 
 private Integer  villageId;

@Column(name="from_km")
 
 private Double  fromKm;

@Column(name="to_km")
 
 private Double  toKm;

@Column(name="survey_number")
 
 private String  surveyNumber;

@Column(name="req_acres")
 
 private Integer  reqAcres;

@Column(name="req_guntas")
 
 private Double  reqGuntas;

@Column(name="north_boundary")
 
 private String  northBoundary;

@Column(name="south_boundary")
 
 private String  southBoundary;

@Column(name="east_boundary")
 
 private String  eastBoundary;

@Column(name="west_boundary")
 
 private String  westBoundary;

@Column(name="govt_patta")
 
 private Integer  govtPatta;

@Column(name="crop_type")
 
 private Integer  cropType;

@Column(name="stage")
 
 private Integer  stage;

@Column(name="excel_filepath")
 
 private String  excelFilepath;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="created_by_userid")
 
 private String  createdByUserid;

@Column(name="created_by_postid")
 
 private String  createdByPostid;

@Column(name="submited_date")
 
 private timestamp without time zone  submitedDate;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="sub_division_id")
 
 private Integer  subDivisionId;

@Column(name="deleted_by")
 
 private String  deletedBy;

@Column(name="deleted_time")
 
 private timestamp with time zone  deletedTime;

@Column(name="lao_id")
 
 private Integer  laoId;

@Column(name="is_latest")
 
 private boolean  isLatest;


    public Dee_enter_reqisition_works(int dee_req_id, int ee_re_assign_id, int project_id, int package_id, int pas_id, int district_id, int mandal_id, int village_id, double from_km, double to_km, Object survey_number, int req_acres, double req_guntas, Object north_boundary, Object south_boundary, Object east_boundary, Object west_boundary, int govt_patta, int crop_type, int stage, Object excel_filepath, Object remarks, Object created_by_userid, Object created_by_postid, Object submited_date, boolean delete_flag, int unit_id, int circle_id, int division_id, int sub_division_id, Object deleted_by, Object deleted_time, int lao_id, boolean is_latest) {
        this.dee_req_id = dee_req_id;
        this.ee_re_assign_id = ee_re_assign_id;
        this.project_id = project_id;
        this.package_id = package_id;
        this.pas_id = pas_id;
        this.district_id = district_id;
        this.mandal_id = mandal_id;
        this.village_id = village_id;
        this.from_km = from_km;
        this.to_km = to_km;
        this.survey_number = survey_number;
        this.req_acres = req_acres;
        this.req_guntas = req_guntas;
        this.north_boundary = north_boundary;
        this.south_boundary = south_boundary;
        this.east_boundary = east_boundary;
        this.west_boundary = west_boundary;
        this.govt_patta = govt_patta;
        this.crop_type = crop_type;
        this.stage = stage;
        this.excel_filepath = excel_filepath;
        this.remarks = remarks;
        this.created_by_userid = created_by_userid;
        this.created_by_postid = created_by_postid;
        this.submited_date = submited_date;
        this.delete_flag = delete_flag;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
        this.deleted_by = deleted_by;
        this.deleted_time = deleted_time;
        this.lao_id = lao_id;
        this.is_latest = is_latest;
    }
}
