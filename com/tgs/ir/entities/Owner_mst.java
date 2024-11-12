package com.tgs.ir.entities;

public class Owner_mst {
@Column(name="owner_id")
 
 private Integer  ownerId;

@Column(name="owner_name")
 
 private String  ownerName;

@Column(name="father_name")
 
 private String  fatherName;

@Column(name="bank_name")
 
 private String  bankName;

@Column(name="bank_ifsc")
 
 private String  bankIfsc;

@Column(name="bank_account_number")
 
 private bigint  bankAccountNumber;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="created_date")
 
 private timestamp without time zone  createdDate;

@Column(name="owner_aadhar_no")
 
 private String  ownerAadharNo;

@Column(name="edit_flag")
 
 private boolean  editFlag;

@Column(name="village_id")
 
 private Integer  villageId;

@Column(name="mandal_id")
 
 private Integer  mandalId;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="created_by_user")
 
 private Integer  createdByUser;

@Column(name="owner_parent_id")
 
 private Integer  ownerParentId;

@Column(name="owner_age")
 
 private Integer  ownerAge;

@Column(name="relation")
 
 private String  relation;

@Column(name="dee_req_acq_temp_id")
 
 private Integer  deeReqAcqTempId;

@Column(name="beneficiary_id")
 
 private String  beneficiaryId;

@Column(name="branch")
 
 private String  branch;

@Column(name="state_code")
 
 private String  stateCode;

@Column(name="district_code")
 
 private String  districtCode;

@Column(name="mandal_code")
 
 private String  mandalCode;

@Column(name="village_code")
 
 private String  villageCode;

@Column(name="ddo_code")
 
 private String  ddoCode;

@Column(name="fin_year")
 
 private String  finYear;

@Column(name="pao_code")
 
 private String  paoCode;

@Column(name="relation_code")
 
 private String  relationCode;


    public Owner_mst(int owner_id, Object owner_name, Object father_name, Object bank_name, Object bank_ifsc, long bank_account_number, boolean delete_flag, Object created_date, Object owner_aadhar_no, boolean edit_flag, int village_id, int mandal_id, int district_id, int created_by_user, int owner_parent_id, int owner_age, Object relation, int dee_req_acq_temp_id, Object beneficiary_id, Object branch, Object state_code, Object district_code, Object mandal_code, Object village_code, Object ddo_code, Object fin_year, Object pao_code, Object relation_code) {
        this.owner_id = owner_id;
        this.owner_name = owner_name;
        this.father_name = father_name;
        this.bank_name = bank_name;
        this.bank_ifsc = bank_ifsc;
        this.bank_account_number = bank_account_number;
        this.delete_flag = delete_flag;
        this.created_date = created_date;
        this.owner_aadhar_no = owner_aadhar_no;
        this.edit_flag = edit_flag;
        this.village_id = village_id;
        this.mandal_id = mandal_id;
        this.district_id = district_id;
        this.created_by_user = created_by_user;
        this.owner_parent_id = owner_parent_id;
        this.owner_age = owner_age;
        this.relation = relation;
        this.dee_req_acq_temp_id = dee_req_acq_temp_id;
        this.beneficiary_id = beneficiary_id;
        this.branch = branch;
        this.state_code = state_code;
        this.district_code = district_code;
        this.mandal_code = mandal_code;
        this.village_code = village_code;
        this.ddo_code = ddo_code;
        this.fin_year = fin_year;
        this.pao_code = pao_code;
        this.relation_code = relation_code;
    }
}
