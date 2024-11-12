package com.tgs.ir.entities;

public class Land_acquired_lao_wise_proforma3 {
@Column(name="land_procurement_id")
 
 private Integer  landProcurementId;

@Column(name="la_acquired_id")
 
 private Integer  laAcquiredId;

@Column(name="amount_on_authorisation_pao")
 
 private Double  amountOnAuthorisationPao;

@Column(name="amount_by_direct_credit_to_land_looser")
 
 private Double  amountByDirectCreditToLandLooser;

@Column(name="amount_by_land_procurement_committee")
 
 private Double  amountByLandProcurementCommittee;

@Column(name="amount_rfctlarr_act")
 
 private Double  amountRfctlarrAct;

@Column(name="amount_from_charges_category")
 
 private Double  amountFromChargesCategory;

@Column(name="amount_from_contigency_fund")
 
 private Double  amountFromContigencyFund;

@Column(name="order_issuing_authority")
 
 private String  orderIssuingAuthority;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="created_by_username")
 
 private String  createdByUsername;

@Column(name="created_by_userid")
 
 private Integer  createdByUserid;

@Column(name="created_date")
 
 private timestamp without time zone  createdDate;


    public Land_acquired_lao_wise_proforma3(int land_procurement_id, int la_acquired_id, double amount_on_authorisation_pao, double amount_by_direct_credit_to_land_looser, double amount_by_land_procurement_committee, double amount_rfctlarr_act, double amount_from_charges_category, double amount_from_contigency_fund, Object order_issuing_authority, Object remarks, boolean delete_flag, boolean is_latest, Object created_by_username, int created_by_userid, Object created_date) {
        this.land_procurement_id = land_procurement_id;
        this.la_acquired_id = la_acquired_id;
        this.amount_on_authorisation_pao = amount_on_authorisation_pao;
        this.amount_by_direct_credit_to_land_looser = amount_by_direct_credit_to_land_looser;
        this.amount_by_land_procurement_committee = amount_by_land_procurement_committee;
        this.amount_rfctlarr_act = amount_rfctlarr_act;
        this.amount_from_charges_category = amount_from_charges_category;
        this.amount_from_contigency_fund = amount_from_contigency_fund;
        this.order_issuing_authority = order_issuing_authority;
        this.remarks = remarks;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.created_by_username = created_by_username;
        this.created_by_userid = created_by_userid;
        this.created_date = created_date;
    }
}
