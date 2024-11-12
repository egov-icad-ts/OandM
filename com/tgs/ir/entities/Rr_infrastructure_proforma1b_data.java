package com.tgs.ir.entities;

public class Rr_infrastructure_proforma1b_data {
@Column(name="rr_infra_proforma_id")
 
 private Integer  rrInfraProformaId;

@Column(name="rr_infra_id")
 
 private Integer  rrInfraId;

@Column(name="component_name")
 
 private String  componentName;

@Column(name="sanction_amount")
 
 private Double  sanctionAmount;

@Column(name="reference_no")
 
 private String  referenceNo;

@Column(name="sanction_date")
 
 private timestamp without time zone  sanctionDate;

@Column(name="executive_agency")
 
 private String  executiveAgency;

@Column(name="physical_status")
 
 private String  physicalStatus;

@Column(name="target_date")
 
 private timestamp without time zone  targetDate;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="created_by_user")
 
 private String  createdByUser;

@Column(name="user_id")
 
 private Integer  userId;

@Column(name="created_date")
 
 private timestamp without time zone  createdDate;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="expenditure_incurred")
 
 private String  expenditureIncurred;


    public Rr_infrastructure_proforma1b_data(int rr_infra_proforma_id, int rr_infra_id, Object component_name, double sanction_amount, Object reference_no, Object sanction_date, Object executive_agency, Object physical_status, Object target_date, Object remarks, Object created_by_user, int user_id, Object created_date, boolean delete_flag, boolean is_latest, Object expenditure_incurred) {
        this.rr_infra_proforma_id = rr_infra_proforma_id;
        this.rr_infra_id = rr_infra_id;
        this.component_name = component_name;
        this.sanction_amount = sanction_amount;
        this.reference_no = reference_no;
        this.sanction_date = sanction_date;
        this.executive_agency = executive_agency;
        this.physical_status = physical_status;
        this.target_date = target_date;
        this.remarks = remarks;
        this.created_by_user = created_by_user;
        this.user_id = user_id;
        this.created_date = created_date;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.expenditure_incurred = expenditure_incurred;
    }
}
