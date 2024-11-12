package com.tgs.ir.entities;

public class Receipts_expenditure_la_proforma1 {
@Column(name="la_exp_re_id")
 
 private Integer  laExpReId;

@Column(name="pd_account_number")
 
 private bigint  pdAccountNumber;

@Column(name="amount_credited_pd_account")
 
 private Double  amountCreditedPdAccount;

@Column(name="sb_ca_no")
 
 private bigint  sbCaNo;

@Column(name="amount_credited_sb_ca_account")
 
 private Double  amountCreditedSbCaAccount;

@Column(name="expenditure_collector_proceeding_no")
 
 private String  expenditureCollectorProceedingNo;

@Column(name="expenditure_collector_proceeding_no_path")
 
 private String  expenditureCollectorProceedingNoPath;

@Column(name="no_of_benificiaries_coverd")
 
 private Integer  noOfBenificiariesCoverd;

@Column(name="amount_paid_beneficiaries")
 
 private Double  amountPaidBeneficiaries;

@Column(name="sdc_lao_rd_other_collector_name")
 
 private String  sdcLaoRdOtherCollectorName;

@Column(name="amount_transferd_to_sdc_lao_rd_othercollector")
 
 private Double  amountTransferdToSdcLaoRdOthercollector;

@Column(name="cheque_number_and_date")
 
 private String  chequeNumberAndDate;

@Column(name="total_drawn")
 
 private Double  totalDrawn;

@Column(name="balanace_available_at_collector_fy")
 
 private Double  balanaceAvailableAtCollectorFy;

@Column(name="lapsed_by_govt")
 
 private Double  lapsedByGovt;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="year")
 
 private Integer  year;

@Column(name="created_by_user_id")
 
 private Integer  createdByUserId;

@Column(name="created_by_user_name")
 
 private String  createdByUserName;

@Column(name="created_time")
 
 private timestamp without time zone  createdTime;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="interest_credited_sb_ca")
 
 private Double  interestCreditedSbCa;

@Column(name="total_amount_credited")
 
 private Double  totalAmountCredited;


    public Receipts_expenditure_la_proforma1(int la_exp_re_id, long pd_account_number, double amount_credited_pd_account, long sb_ca_no, double amount_credited_sb_ca_account, Object expenditure_collector_proceeding_no, Object expenditure_collector_proceeding_no_path, int no_of_benificiaries_coverd, double amount_paid_beneficiaries, Object sdc_lao_rd_other_collector_name, double amount_transferd_to_sdc_lao_rd_othercollector, Object cheque_number_and_date, double total_drawn, double balanace_available_at_collector_fy, double lapsed_by_govt, int project_id, int district_id, int year, int created_by_user_id, Object created_by_user_name, Object created_time, boolean delete_flag, boolean is_latest, double interest_credited_sb_ca, double total_amount_credited) {
        this.la_exp_re_id = la_exp_re_id;
        this.pd_account_number = pd_account_number;
        this.amount_credited_pd_account = amount_credited_pd_account;
        this.sb_ca_no = sb_ca_no;
        this.amount_credited_sb_ca_account = amount_credited_sb_ca_account;
        this.expenditure_collector_proceeding_no = expenditure_collector_proceeding_no;
        this.expenditure_collector_proceeding_no_path = expenditure_collector_proceeding_no_path;
        this.no_of_benificiaries_coverd = no_of_benificiaries_coverd;
        this.amount_paid_beneficiaries = amount_paid_beneficiaries;
        this.sdc_lao_rd_other_collector_name = sdc_lao_rd_other_collector_name;
        this.amount_transferd_to_sdc_lao_rd_othercollector = amount_transferd_to_sdc_lao_rd_othercollector;
        this.cheque_number_and_date = cheque_number_and_date;
        this.total_drawn = total_drawn;
        this.balanace_available_at_collector_fy = balanace_available_at_collector_fy;
        this.lapsed_by_govt = lapsed_by_govt;
        this.project_id = project_id;
        this.district_id = district_id;
        this.year = year;
        this.created_by_user_id = created_by_user_id;
        this.created_by_user_name = created_by_user_name;
        this.created_time = created_time;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.interest_credited_sb_ca = interest_credited_sb_ca;
        this.total_amount_credited = total_amount_credited;
    }
}
