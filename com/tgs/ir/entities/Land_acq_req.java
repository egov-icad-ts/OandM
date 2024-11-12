package com.tgs.ir.entities;

public class Land_acq_req {
@Column(name="land_acq_req_id")
 
 private Integer  landAcqReqId;

@Column(name="land_acq_id")
 
 private Integer  landAcqId;

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

@Column(name="la_acq_component_id")
 
 private Integer  laAcqComponentId;

@Column(name="la_acq_req")
 
 private Double  laAcqReq;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="submited_by")
 
 private Integer  submitedBy;

@Column(name="land_acq_sub_comp_id")
 
 private Integer  landAcqSubCompId;

@Column(name="land_acq_survey_no")
 
 private String  landAcqSurveyNo;

@Column(name="land_acq_sdc")
 
 private String  landAcqSdc;


    public Land_acq_req(int land_acq_req_id, int land_acq_id, int project_id, int package_id, int district_id, int mandal_id, int village_id, int la_acq_component_id, double la_acq_req, boolean delete_flag, int submited_by, int land_acq_sub_comp_id, Object land_acq_survey_no, Object land_acq_sdc) {
        this.land_acq_req_id = land_acq_req_id;
        this.land_acq_id = land_acq_id;
        this.project_id = project_id;
        this.package_id = package_id;
        this.district_id = district_id;
        this.mandal_id = mandal_id;
        this.village_id = village_id;
        this.la_acq_component_id = la_acq_component_id;
        this.la_acq_req = la_acq_req;
        this.delete_flag = delete_flag;
        this.submited_by = submited_by;
        this.land_acq_sub_comp_id = land_acq_sub_comp_id;
        this.land_acq_survey_no = land_acq_survey_no;
        this.land_acq_sdc = land_acq_sdc;
    }
}
