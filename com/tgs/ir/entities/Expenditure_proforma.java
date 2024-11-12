package com.tgs.ir.entities;

public class Expenditure_proforma {
@Column(name="exp_id")
 
 private Integer  expId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="package_id")
 
 private Integer  packageId;

@Column(name="agreement_value")
 
 private Double  agreementValue;

@Column(name="exp_upto_mar")
 
 private Double  expUptoMar;

@Column(name="exp_upto_lastmonth")
 
 private Double  expUptoLastmonth;

@Column(name="exp_present_month")
 
 private Double  expPresentMonth;

@Column(name="total_present_year")
 
 private Double  totalPresentYear;

@Column(name="exp_total_cum_tilldate")
 
 private Double  expTotalCumTilldate;

@Column(name="amount_required")
 
 private Double  amountRequired;

@Column(name="balance_amount")
 
 private Double  balanceAmount;

@Column(name="mob_adv_paid")
 
 private Double  mobAdvPaid;

@Column(name="mob_adv_principle")
 
 private Double  mobAdvPrinciple;

@Column(name="mob_adv_interest")
 
 private Double  mobAdvInterest;

@Column(name="pe_upto_last_month")
 
 private Double  peUptoLastMonth;

@Column(name="pe_present_month")
 
 private Double  pePresentMonth;

@Column(name="pe_total_cum")
 
 private Double  peTotalCum;

@Column(name="pending_bill")
 
 private Double  pendingBill;

@Column(name="updated_year")
 
 private Integer  updatedYear;

@Column(name="updated_by")
 
 private String  updatedBy;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="admin_sanc_amt")
 
 private Double  adminSancAmt;

@Column(name="updated_timestamp")
 
 private timestamp without time zone  updatedTimestamp;

@Column(name="updated_month")
 
 private Integer  updatedMonth;


    public Expenditure_proforma(int exp_id, int project_id, int package_id, double agreement_value, double exp_upto_mar, double exp_upto_lastmonth, double exp_present_month, double total_present_year, double exp_total_cum_tilldate, double amount_required, double balance_amount, double mob_adv_paid, double mob_adv_principle, double mob_adv_interest, double pe_upto_last_month, double pe_present_month, double pe_total_cum, double pending_bill, int updated_year, Object updated_by, boolean is_latest, double admin_sanc_amt, Object updated_timestamp, int updated_month) {
        this.exp_id = exp_id;
        this.project_id = project_id;
        this.package_id = package_id;
        this.agreement_value = agreement_value;
        this.exp_upto_mar = exp_upto_mar;
        this.exp_upto_lastmonth = exp_upto_lastmonth;
        this.exp_present_month = exp_present_month;
        this.total_present_year = total_present_year;
        this.exp_total_cum_tilldate = exp_total_cum_tilldate;
        this.amount_required = amount_required;
        this.balance_amount = balance_amount;
        this.mob_adv_paid = mob_adv_paid;
        this.mob_adv_principle = mob_adv_principle;
        this.mob_adv_interest = mob_adv_interest;
        this.pe_upto_last_month = pe_upto_last_month;
        this.pe_present_month = pe_present_month;
        this.pe_total_cum = pe_total_cum;
        this.pending_bill = pending_bill;
        this.updated_year = updated_year;
        this.updated_by = updated_by;
        this.is_latest = is_latest;
        this.admin_sanc_amt = admin_sanc_amt;
        this.updated_timestamp = updated_timestamp;
        this.updated_month = updated_month;
    }
}
