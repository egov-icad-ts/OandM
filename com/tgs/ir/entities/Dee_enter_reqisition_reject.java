package com.tgs.ir.entities;

public class Dee_enter_reqisition_reject {
@Column(name="reject_dee_req_id")
 
 private Integer  rejectDeeReqId;

@Column(name="dee_enter_req_id")
 
 private Integer  deeEnterReqId;

@Column(name="ee_assign_comp_id")
 
 private Integer  eeAssignCompId;

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

@Column(name="from_km")
 
 private Double  fromKm;

@Column(name="to_km")
 
 private Double  toKm;

@Column(name="survey_id")
 
 private Integer  surveyId;

@Column(name="requirement_acres")
 
 private Double  requirementAcres;

@Column(name="requirement_guntas")
 
 private Double  requirementGuntas;

@Column(name="north_boundary")
 
 private String  northBoundary;

@Column(name="south_boundary")
 
 private String  southBoundary;

@Column(name="east_boundary")
 
 private String  eastBoundary;

@Column(name="west_boundary")
 
 private String  westBoundary;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="created_by_userid")
 
 private String  createdByUserid;

@Column(name="created_by_postid")
 
 private Integer  createdByPostid;

@Column(name="created_designation")
 
 private Integer  createdDesignation;

@Column(name="submited_date")
 
 private timestamp without time zone  submitedDate;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="se_assign_package_comp_id")
 
 private Integer  seAssignPackageCompId;

@Column(name="comp_canal_res_lift_id")
 
 private Integer  compCanalResLiftId;

@Column(name="comp_type_id")
 
 private Integer  compTypeId;

@Column(name="no_of_structures")
 
 private Integer  noOfStructures;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="sub_division_id")
 
 private Integer  subDivisionId;


    public Dee_enter_reqisition_reject(int reject_dee_req_id, int dee_enter_req_id, int ee_assign_comp_id, int project_id, int package_id, int district_id, int mandal_id, int village_id, double from_km, double to_km, int survey_id, double requirement_acres, double requirement_guntas, Object north_boundary, Object south_boundary, Object east_boundary, Object west_boundary, Object remarks, Object created_by_userid, int created_by_postid, int created_designation, Object submited_date, boolean delete_flag, int se_assign_package_comp_id, int comp_canal_res_lift_id, int comp_type_id, int no_of_structures, int unit_id, int circle_id, int division_id, int sub_division_id) {
        this.reject_dee_req_id = reject_dee_req_id;
        this.dee_enter_req_id = dee_enter_req_id;
        this.ee_assign_comp_id = ee_assign_comp_id;
        this.project_id = project_id;
        this.package_id = package_id;
        this.district_id = district_id;
        this.mandal_id = mandal_id;
        this.village_id = village_id;
        this.from_km = from_km;
        this.to_km = to_km;
        this.survey_id = survey_id;
        this.requirement_acres = requirement_acres;
        this.requirement_guntas = requirement_guntas;
        this.north_boundary = north_boundary;
        this.south_boundary = south_boundary;
        this.east_boundary = east_boundary;
        this.west_boundary = west_boundary;
        this.remarks = remarks;
        this.created_by_userid = created_by_userid;
        this.created_by_postid = created_by_postid;
        this.created_designation = created_designation;
        this.submited_date = submited_date;
        this.delete_flag = delete_flag;
        this.se_assign_package_comp_id = se_assign_package_comp_id;
        this.comp_canal_res_lift_id = comp_canal_res_lift_id;
        this.comp_type_id = comp_type_id;
        this.no_of_structures = no_of_structures;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
    }
}
