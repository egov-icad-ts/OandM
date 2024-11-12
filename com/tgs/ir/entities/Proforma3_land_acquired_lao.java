package com.tgs.ir.entities;

public class Proforma3_land_acquired_lao {
@Column(name="land_prof_id")
 
 private Integer  landProfId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="mandal_id")
 
 private Integer  mandalId;

@Column(name="village_id")
 
 private Integer  villageId;

@Column(name="land_looser_name")
 
 private String  landLooserName;

@Column(name="survey_number")
 
 private String  surveyNumber;

@Column(name="extent_land")
 
 private Double  extentLand;

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

@Column(name="structure_amount")
 
 private Double  structureAmount;

@Column(name="order_numer")
 
 private String  orderNumer;

@Column(name="order_date")
 
 private String  orderDate;

@Column(name="order_issuing_authority")
 
 private String  orderIssuingAuthority;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="extent_structure")
 
 private Double  extentStructure;

@Column(name="telangana_act_2016")
 
 private Double  telanganaAct2016;

@Column(name="structure_amount_by_land_procurement_committee")
 
 private Double  structureAmountByLandProcurementCommittee;

@Column(name="structure_amount_by_go120")
 
 private Double  structureAmountByGo120;

@Column(name="amount_by_go120")
 
 private Double  amountByGo120;


    public Proforma3_land_acquired_lao(int land_prof_id, int project_id, int district_id, int mandal_id, int village_id, Object land_looser_name, Object survey_number, double extent_land, double amount_on_authorisation_pao, double amount_by_direct_credit_to_land_looser, double amount_by_land_procurement_committee, double amount_rfctlarr_act, double amount_from_charges_category, double amount_from_contigency_fund, double structure_amount, Object order_numer, Object order_date, Object order_issuing_authority, Object remarks, double extent_structure, double telangana_act_2016, double structure_amount_by_land_procurement_committee, double structure_amount_by_go120, double amount_by_go120) {
        this.land_prof_id = land_prof_id;
        this.project_id = project_id;
        this.district_id = district_id;
        this.mandal_id = mandal_id;
        this.village_id = village_id;
        this.land_looser_name = land_looser_name;
        this.survey_number = survey_number;
        this.extent_land = extent_land;
        this.amount_on_authorisation_pao = amount_on_authorisation_pao;
        this.amount_by_direct_credit_to_land_looser = amount_by_direct_credit_to_land_looser;
        this.amount_by_land_procurement_committee = amount_by_land_procurement_committee;
        this.amount_rfctlarr_act = amount_rfctlarr_act;
        this.amount_from_charges_category = amount_from_charges_category;
        this.amount_from_contigency_fund = amount_from_contigency_fund;
        this.structure_amount = structure_amount;
        this.order_numer = order_numer;
        this.order_date = order_date;
        this.order_issuing_authority = order_issuing_authority;
        this.remarks = remarks;
        this.extent_structure = extent_structure;
        this.telangana_act_2016 = telangana_act_2016;
        this.structure_amount_by_land_procurement_committee = structure_amount_by_land_procurement_committee;
        this.structure_amount_by_go120 = structure_amount_by_go120;
        this.amount_by_go120 = amount_by_go120;
    }
}
