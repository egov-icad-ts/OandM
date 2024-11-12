package com.tgs.ir.entities;

public class Land_acq_completed {
@Column(name="land_acq_compl_id")
 
 private Integer  landAcqComplId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="package_id")
 
 private Integer  packageId;

@Column(name="land_acq_req_id")
 
 private Integer  landAcqReqId;

@Column(name="owner_name")
 
 private String  ownerName;

@Column(name="govt_patta")
 
 private String  govtPatta;

@Column(name="registerd_survey_number")
 
 private String  registerdSurveyNumber;

@Column(name="amount_paid")
 
 private Double  amountPaid;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="registred_document")
 
 private String  registredDocument;

@Column(name="owner_extent_acres")
 
 private Double  ownerExtentAcres;

@Column(name="govt_patta_id")
 
 private Integer  govtPattaId;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="mandal_id")
 
 private Integer  mandalId;

@Column(name="village_id")
 
 private Integer  villageId;

@Column(name="land_acq_survey_no")
 
 private String  landAcqSurveyNo;


    public Land_acq_completed(int land_acq_compl_id, int project_id, int package_id, int land_acq_req_id, Object owner_name, Object govt_patta, Object registerd_survey_number, double amount_paid, boolean delete_flag, Object registred_document, double owner_extent_acres, int govt_patta_id, int district_id, int mandal_id, int village_id, Object land_acq_survey_no) {
        this.land_acq_compl_id = land_acq_compl_id;
        this.project_id = project_id;
        this.package_id = package_id;
        this.land_acq_req_id = land_acq_req_id;
        this.owner_name = owner_name;
        this.govt_patta = govt_patta;
        this.registerd_survey_number = registerd_survey_number;
        this.amount_paid = amount_paid;
        this.delete_flag = delete_flag;
        this.registred_document = registred_document;
        this.owner_extent_acres = owner_extent_acres;
        this.govt_patta_id = govt_patta_id;
        this.district_id = district_id;
        this.mandal_id = mandal_id;
        this.village_id = village_id;
        this.land_acq_survey_no = land_acq_survey_no;
    }
}
