package com.tgs.ir.entities;

public class O_m_agreements {
@Column(name="agreement_id")
 
 private Integer  agreementId;

@Column(name="work_id")
 
 private Integer  workId;

@Column(name="type_id")
 
 private Integer  typeId;

@Column(name="tender_percentage")
 
 private Double  tenderPercentage;

@Column(name="agreement_number")
 
 private String  agreementNumber;

@Column(name="agreement_date")
 
 private date  agreementDate;

@Column(name="agreement_amount")
 
 private Double  agreementAmount;

@Column(name="agency_id")
 
 private Integer  agencyId;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="agency_name")
 
 private String  agencyName;

@Column(name="updated_on")
 
 private timestamp with time zone  updatedOn;

@Column(name="updated_by")
 
 private String  updatedBy;

@Column(name="tech_id")
 
 private Integer  techId;

@Column(name="tender_date")
 
 private date  tenderDate;


    public O_m_agreements(int agreement_id, int work_id, int type_id, double tender_percentage, Object agreement_number, Object agreement_date, double agreement_amount, int agency_id, boolean is_latest, boolean delete_flag, Object agency_name, Object updated_on, Object updated_by, int tech_id, Object tender_date) {
        this.agreement_id = agreement_id;
        this.work_id = work_id;
        this.type_id = type_id;
        this.tender_percentage = tender_percentage;
        this.agreement_number = agreement_number;
        this.agreement_date = agreement_date;
        this.agreement_amount = agreement_amount;
        this.agency_id = agency_id;
        this.is_latest = is_latest;
        this.delete_flag = delete_flag;
        this.agency_name = agency_name;
        this.updated_on = updated_on;
        this.updated_by = updated_by;
        this.tech_id = tech_id;
        this.tender_date = tender_date;
    }
}
