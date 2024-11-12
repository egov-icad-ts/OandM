package com.tgs.ir.entities;

public class Package_details {
@Column(name="package_id")
 
 private Integer  packageId;

@Column(name="package_name")
 
 private String  packageName;

@Column(name="pkg_alias_name")
 
 private String  pkgAliasName;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="agreement_amnt")
 
 private Double  agreementAmnt;

@Column(name="agreement_dt")
 
 private date  agreementDt;

@Column(name="location")
 
 private String  location;

@Column(name="description")
 
 private String  description;

@Column(name="contemplated_acres")
 
 private Double  contemplatedAcres;

@Column(name="from_chainage")
 
 private Double  fromChainage;

@Column(name="to_chainage")
 
 private Double  toChainage;

@Column(name="jointventure")
 
 private String  jointventure;

@Column(name="contract_period_months")
 
 private Integer  contractPeriodMonths;

@Column(name="contract_period_years")
 
 private Integer  contractPeriodYears;

@Column(name="date_of_completion")
 
 private date  dateOfCompletion;

@Column(name="no_of_extensions")
 
 private Integer  noOfExtensions;

@Column(name="extended_dt")
 
 private date  extendedDt;

@Column(name="ddo_code")
 
 private Double  ddoCode;

@Column(name="agreement_no")
 
 private String  agreementNo;

@Column(name="premium_type")
 
 private Double  premiumType;

@Column(name="premium_percent")
 
 private Double  premiumPercent;

@Column(name="hoa")
 
 private String  hoa;

@Column(name="retn_part_bill")
 
 private Double  retnPartBill;

@Column(name="retn_final_bill")
 
 private Double  retnFinalBill;

@Column(name="emd_bid_security")
 
 private Double  emdBidSecurity;


    public Package_details(int package_id, Object package_name, Object pkg_alias_name, int project_id, boolean delete_flag, double agreement_amnt, Object agreement_dt, Object location, Object description, double contemplated_acres, double from_chainage, double to_chainage, Object jointventure, int contract_period_months, int contract_period_years, Object date_of_completion, int no_of_extensions, Object extended_dt, double ddo_code, Object agreement_no, double premium_type, double premium_percent, Object hoa, double retn_part_bill, double retn_final_bill, double emd_bid_security) {
        this.package_id = package_id;
        this.package_name = package_name;
        this.pkg_alias_name = pkg_alias_name;
        this.project_id = project_id;
        this.delete_flag = delete_flag;
        this.agreement_amnt = agreement_amnt;
        this.agreement_dt = agreement_dt;
        this.location = location;
        this.description = description;
        this.contemplated_acres = contemplated_acres;
        this.from_chainage = from_chainage;
        this.to_chainage = to_chainage;
        this.jointventure = jointventure;
        this.contract_period_months = contract_period_months;
        this.contract_period_years = contract_period_years;
        this.date_of_completion = date_of_completion;
        this.no_of_extensions = no_of_extensions;
        this.extended_dt = extended_dt;
        this.ddo_code = ddo_code;
        this.agreement_no = agreement_no;
        this.premium_type = premium_type;
        this.premium_percent = premium_percent;
        this.hoa = hoa;
        this.retn_part_bill = retn_part_bill;
        this.retn_final_bill = retn_final_bill;
        this.emd_bid_security = emd_bid_security;
    }
}
