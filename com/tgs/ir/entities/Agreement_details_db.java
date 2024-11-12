package com.tgs.ir.entities;

public class Agreement_details_db {
@Column(name="agreement_id")
 
 private Integer  agreementId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="package_id")
 
 private Integer  packageId;

@Column(name="agency_id")
 
 private Integer  agencyId;

@Column(name="agreement_number")
 
 private String  agreementNumber;

@Column(name="agreement_date")
 
 private date  agreementDate;

@Column(name="pan_number")
 
 private String  panNumber;

@Column(name="agreement_amount")
 
 private Double  agreementAmount;

@Column(name="tender_premium")
 
 private real  tenderPremium;

@Column(name="estimate_type")
 
 private Integer  estimateType;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="updated_by")
 
 private String  updatedBy;

@Column(name="is_rejected")
 
 private boolean  isRejected;

@Column(name="updated_on")
 
 private timestamp without time zone  updatedOn;


    public Agreement_details_db(int agreement_id, int project_id, int package_id, int agency_id, Object agreement_number, Object agreement_date, Object pan_number, double agreement_amount, Object tender_premium, int estimate_type, boolean is_latest, boolean delete_flag, Object updated_by, boolean is_rejected, Object updated_on) {
        this.agreement_id = agreement_id;
        this.project_id = project_id;
        this.package_id = package_id;
        this.agency_id = agency_id;
        this.agreement_number = agreement_number;
        this.agreement_date = agreement_date;
        this.pan_number = pan_number;
        this.agreement_amount = agreement_amount;
        this.tender_premium = tender_premium;
        this.estimate_type = estimate_type;
        this.is_latest = is_latest;
        this.delete_flag = delete_flag;
        this.updated_by = updated_by;
        this.is_rejected = is_rejected;
        this.updated_on = updated_on;
    }
}
