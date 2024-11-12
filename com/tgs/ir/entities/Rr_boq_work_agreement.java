package com.tgs.ir.entities;

public class Rr_boq_work_agreement {
@Column(name="rr_work_agmt_id")
 
 private Integer  rrWorkAgmtId;

@Column(name="agreement_number")
 
 private String  agreementNumber;

@Column(name="agreement_value")
 
 private Double  agreementValue;

@Column(name="agreement_date")
 
 private timestamp without time zone  agreementDate;

@Column(name="agreement_percentage")
 
 private Double  agreementPercentage;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="submited_by")
 
 private String  submitedBy;

@Column(name="submited_date")
 
 private timestamp without time zone  submitedDate;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="rr_boq_total_id")
 
 private Integer  rrBoqTotalId;


    public Rr_boq_work_agreement(int rr_work_agmt_id, Object agreement_number, double agreement_value, Object agreement_date, double agreement_percentage, boolean delete_flag, Object submited_by, Object submited_date, boolean is_latest, int rr_boq_total_id) {
        this.rr_work_agmt_id = rr_work_agmt_id;
        this.agreement_number = agreement_number;
        this.agreement_value = agreement_value;
        this.agreement_date = agreement_date;
        this.agreement_percentage = agreement_percentage;
        this.delete_flag = delete_flag;
        this.submited_by = submited_by;
        this.submited_date = submited_date;
        this.is_latest = is_latest;
        this.rr_boq_total_id = rr_boq_total_id;
    }
}
