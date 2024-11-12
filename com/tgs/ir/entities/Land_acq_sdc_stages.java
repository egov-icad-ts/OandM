package com.tgs.ir.entities;

public class Land_acq_sdc_stages {
@Column(name="land_acq_sdc_stage_id")
 
 private Integer  landAcqSdcStageId;

@Column(name="land_acq_sdc_id")
 
 private Double  landAcqSdcId;

@Column(name="land_acq_req_id")
 
 private Double  landAcqReqId;

@Column(name="land_acq_id")
 
 private Double  landAcqId;

@Column(name="project_id")
 
 private Double  projectId;

@Column(name="package_id")
 
 private Double  packageId;

@Column(name="district_id")
 
 private Double  districtId;

@Column(name="negotiations_held")
 
 private Double  negotiationsHeld;

@Column(name="form_1and_2")
 
 private Double  form1and2;

@Column(name="dllpc")
 
 private Double  dllpc;

@Column(name="registration_completed")
 
 private Double  registrationCompleted;

@Column(name="rate_per_acres")
 
 private Double  ratePerAcres;

@Column(name="amount_in_lakhs")
 
 private Double  amountInLakhs;

@Column(name="reamrks")
 
 private String  reamrks;

@Column(name="issues")
 
 private String  issues;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="user_id")
 
 private String  userId;

@Column(name="entry_date")
 
 private timestamp without time zone  entryDate;

@Column(name="edit_flag")
 
 private boolean  editFlag;

@Column(name="user_id_edit")
 
 private String  userIdEdit;

@Column(name="entry_edit_date")
 
 private timestamp without time zone  entryEditDate;

@Column(name="ip_address")
 
 private String  ipAddress;

@Column(name="land_acq_sdr_id")
 
 private Double  landAcqSdrId;

@Column(name="paper_publication")
 
 private String  paperPublication;

@Column(name="dvcno")
 
 private String  dvcno;

@Column(name="datecompleted")
 
 private String  datecompleted;

@Column(name="paper_public_date")
 
 private String  paperPublicDate;


    public Land_acq_sdc_stages(int land_acq_sdc_stage_id, double land_acq_sdc_id, double land_acq_req_id, double land_acq_id, double project_id, double package_id, double district_id, double negotiations_held, double form_1and_2, double dllpc, double registration_completed, double rate_per_acres, double amount_in_lakhs, Object reamrks, Object issues, boolean delete_flag, Object user_id, Object entry_date, boolean edit_flag, Object user_id_edit, Object entry_edit_date, Object ip_address, double land_acq_sdr_id, Object paper_publication, Object dvcno, Object datecompleted, Object paper_public_date) {
        this.land_acq_sdc_stage_id = land_acq_sdc_stage_id;
        this.land_acq_sdc_id = land_acq_sdc_id;
        this.land_acq_req_id = land_acq_req_id;
        this.land_acq_id = land_acq_id;
        this.project_id = project_id;
        this.package_id = package_id;
        this.district_id = district_id;
        this.negotiations_held = negotiations_held;
        this.form_1and_2 = form_1and_2;
        this.dllpc = dllpc;
        this.registration_completed = registration_completed;
        this.rate_per_acres = rate_per_acres;
        this.amount_in_lakhs = amount_in_lakhs;
        this.reamrks = reamrks;
        this.issues = issues;
        this.delete_flag = delete_flag;
        this.user_id = user_id;
        this.entry_date = entry_date;
        this.edit_flag = edit_flag;
        this.user_id_edit = user_id_edit;
        this.entry_edit_date = entry_edit_date;
        this.ip_address = ip_address;
        this.land_acq_sdr_id = land_acq_sdr_id;
        this.paper_publication = paper_publication;
        this.dvcno = dvcno;
        this.datecompleted = datecompleted;
        this.paper_public_date = paper_public_date;
    }
}
