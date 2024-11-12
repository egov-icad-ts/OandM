package com.tgs.ir.entities;

public class Receipts_expenditure_la_proforma2 {
@Column(name="la_exp_id")
 
 private Integer  laExpId;

@Column(name="sb_ca_no")
 
 private bigint  sbCaNo;

@Column(name="amount_credited_sb_ca_account")
 
 private Double  amountCreditedSbCaAccount;

@Column(name="proceeding_no")
 
 private String  proceedingNo;

@Column(name="proceeding_path")
 
 private String  proceedingPath;

@Column(name="no_of_benificiaries_coverd")
 
 private Integer  noOfBenificiariesCoverd;

@Column(name="amount_paid_beneficiaries")
 
 private Double  amountPaidBeneficiaries;

@Column(name="amount_received_from_name")
 
 private String  amountReceivedFromName;

@Column(name="balanace")
 
 private Double  balanace;

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


    public Receipts_expenditure_la_proforma2(int la_exp_id, long sb_ca_no, double amount_credited_sb_ca_account, Object proceeding_no, Object proceeding_path, int no_of_benificiaries_coverd, double amount_paid_beneficiaries, Object amount_received_from_name, double balanace, int project_id, int district_id, int year, int created_by_user_id, Object created_by_user_name, Object created_time, boolean delete_flag, boolean is_latest, double interest_credited_sb_ca, double total_amount_credited) {
        this.la_exp_id = la_exp_id;
        this.sb_ca_no = sb_ca_no;
        this.amount_credited_sb_ca_account = amount_credited_sb_ca_account;
        this.proceeding_no = proceeding_no;
        this.proceeding_path = proceeding_path;
        this.no_of_benificiaries_coverd = no_of_benificiaries_coverd;
        this.amount_paid_beneficiaries = amount_paid_beneficiaries;
        this.amount_received_from_name = amount_received_from_name;
        this.balanace = balanace;
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
