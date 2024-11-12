package com.tgs.ir.entities;

public class Dee_enter_encroachment_details {
@Column(name="dee_encroachment_id")
 
 private Integer  deeEncroachmentId;

@Column(name="dee_req_acq_temp_id")
 
 private Integer  deeReqAcqTempId;

@Column(name="ee_assign_comp_id")
 
 private Integer  eeAssignCompId;

@Column(name="comp_canal_res_lift_id")
 
 private Integer  compCanalResLiftId;

@Column(name="comp_type_id")
 
 private Integer  compTypeId;

@Column(name="survey_number")
 
 private String  surveyNumber;

@Column(name="total_extent")
 
 private String  totalExtent;

@Column(name="acquired_acres")
 
 private Double  acquiredAcres;

@Column(name="acquired_guntas")
 
 private Double  acquiredGuntas;

@Column(name="occupant_name")
 
 private String  occupantName;

@Column(name="occupant_father_name")
 
 private String  occupantFatherName;

@Column(name="occupant_caste")
 
 private String  occupantCaste;

@Column(name="occupant_extent")
 
 private String  occupantExtent;

@Column(name="native_of_use")
 
 private String  nativeOfUse;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="sub_division_id")
 
 private Integer  subDivisionId;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="created_by_userid")
 
 private String  createdByUserid;

@Column(name="created_designation")
 
 private Integer  createdDesignation;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="status_id")
 
 private Integer  statusId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="deleted_by")
 
 private String  deletedBy;

@Column(name="deleted_time")
 
 private timestamp without time zone  deletedTime;

@Column(name="created_by_postid")
 
 private String  createdByPostid;


    public Dee_enter_encroachment_details(int dee_encroachment_id, int dee_req_acq_temp_id, int ee_assign_comp_id, int comp_canal_res_lift_id, int comp_type_id, Object survey_number, Object total_extent, double acquired_acres, double acquired_guntas, Object occupant_name, Object occupant_father_name, Object occupant_caste, Object occupant_extent, Object native_of_use, int unit_id, int circle_id, int division_id, int sub_division_id, Object remarks, Object created_by_userid, int created_designation, boolean is_latest, int status_id, boolean delete_flag, Object deleted_by, Object deleted_time, Object created_by_postid) {
        this.dee_encroachment_id = dee_encroachment_id;
        this.dee_req_acq_temp_id = dee_req_acq_temp_id;
        this.ee_assign_comp_id = ee_assign_comp_id;
        this.comp_canal_res_lift_id = comp_canal_res_lift_id;
        this.comp_type_id = comp_type_id;
        this.survey_number = survey_number;
        this.total_extent = total_extent;
        this.acquired_acres = acquired_acres;
        this.acquired_guntas = acquired_guntas;
        this.occupant_name = occupant_name;
        this.occupant_father_name = occupant_father_name;
        this.occupant_caste = occupant_caste;
        this.occupant_extent = occupant_extent;
        this.native_of_use = native_of_use;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
        this.remarks = remarks;
        this.created_by_userid = created_by_userid;
        this.created_designation = created_designation;
        this.is_latest = is_latest;
        this.status_id = status_id;
        this.delete_flag = delete_flag;
        this.deleted_by = deleted_by;
        this.deleted_time = deleted_time;
        this.created_by_postid = created_by_postid;
    }
}
