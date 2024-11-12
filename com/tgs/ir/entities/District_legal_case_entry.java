package com.tgs.ir.entities;

public class District_legal_case_entry {
@Column(name="district_legal_id")
 
 private Integer  districtLegalId;

@Column(name="court_id")
 
 private Integer  courtId;

@Column(name="case_type")
 
 private Integer  caseType;

@Column(name="case_number")
 
 private Integer  caseNumber;

@Column(name="case_year")
 
 private Integer  caseYear;

@Column(name="case_category")
 
 private Integer  caseCategory;

@Column(name="petitioner_name")
 
 private String  petitionerName;

@Column(name="respondant_name")
 
 private String  respondantName;

@Column(name="petitioner_advocate")
 
 private String  petitionerAdvocate;

@Column(name="respondant_advocate")
 
 private String  respondantAdvocate;

@Column(name="dept_respondants")
 
 private String  deptRespondants;

@Column(name="case_prayer")
 
 private String  casePrayer;

@Column(name="date_filing")
 
 private String  dateFiling;

@Column(name="date_listing")
 
 private String  dateListing;

@Column(name="date_counter_affidavit")
 
 private String  dateCounterAffidavit;

@Column(name="date_direction")
 
 private String  dateDirection;

@Column(name="date_stay_petition")
 
 private String  dateStayPetition;

@Column(name="petition_type")
 
 private Integer  petitionType;

@Column(name="stay_petition_type")
 
 private Integer  stayPetitionType;

@Column(name="case_present_stage")
 
 private Integer  casePresentStage;

@Column(name="name_concerned_person")
 
 private String  nameConcernedPerson;

@Column(name="mobile_number")
 
 private bigint  mobileNumber;

@Column(name="contact_number")
 
 private bigint  contactNumber;

@Column(name="old_unit_id")
 
 private Integer  oldUnitId;

@Column(name="old_circle_id")
 
 private Integer  oldCircleId;

@Column(name="old_division_id")
 
 private Integer  oldDivisionId;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="added_by")
 
 private String  addedBy;

@Column(name="added_time")
 
 private timestamp without time zone  addedTime;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="old_unit_name")
 
 private String  oldUnitName;

@Column(name="old_circle_name")
 
 private String  oldCircleName;

@Column(name="old_division_name")
 
 private String  oldDivisionName;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="unit_name")
 
 private String  unitName;

@Column(name="circle_name")
 
 private String  circleName;

@Column(name="division_name")
 
 private String  divisionName;

@Column(name="decretal_amount")
 
 private Double  decretalAmount;

@Column(name="decretal_dep_status")
 
 private Integer  decretalDepStatus;

@Column(name="decretal_date")
 
 private String  decretalDate;

@Column(name="linked_op_ep_no")
 
 private String  linkedOpEpNo;

@Column(name="linked_op_ep_date")
 
 private String  linkedOpEpDate;

@Column(name="linked_as_no")
 
 private String  linkedAsNo;

@Column(name="linked_as_date")
 
 private String  linkedAsDate;

@Column(name="date_disposal")
 
 private String  dateDisposal;

@Column(name="award_no_date")
 
 private String  awardNoDate;

@Column(name="award_amount")
 
 private Double  awardAmount;

@Column(name="la_district")
 
 private Integer  laDistrict;

@Column(name="lao_id")
 
 private Integer  laoId;

@Column(name="la_act_type_id")
 
 private Integer  laActTypeId;


    public District_legal_case_entry(int district_legal_id, int court_id, int case_type, int case_number, int case_year, int case_category, Object petitioner_name, Object respondant_name, Object petitioner_advocate, Object respondant_advocate, Object dept_respondants, Object case_prayer, Object date_filing, Object date_listing, Object date_counter_affidavit, Object date_direction, Object date_stay_petition, int petition_type, int stay_petition_type, int case_present_stage, Object name_concerned_person, long mobile_number, long contact_number, int old_unit_id, int old_circle_id, int old_division_id, int district_id, Object added_by, Object added_time, boolean is_latest, boolean delete_flag, Object old_unit_name, Object old_circle_name, Object old_division_name, Object remarks, int unit_id, int circle_id, int division_id, Object unit_name, Object circle_name, Object division_name, double decretal_amount, int decretal_dep_status, Object decretal_date, Object linked_op_ep_no, Object linked_op_ep_date, Object linked_as_no, Object linked_as_date, Object date_disposal, Object award_no_date, double award_amount, int la_district, int lao_id, int la_act_type_id) {
        this.district_legal_id = district_legal_id;
        this.court_id = court_id;
        this.case_type = case_type;
        this.case_number = case_number;
        this.case_year = case_year;
        this.case_category = case_category;
        this.petitioner_name = petitioner_name;
        this.respondant_name = respondant_name;
        this.petitioner_advocate = petitioner_advocate;
        this.respondant_advocate = respondant_advocate;
        this.dept_respondants = dept_respondants;
        this.case_prayer = case_prayer;
        this.date_filing = date_filing;
        this.date_listing = date_listing;
        this.date_counter_affidavit = date_counter_affidavit;
        this.date_direction = date_direction;
        this.date_stay_petition = date_stay_petition;
        this.petition_type = petition_type;
        this.stay_petition_type = stay_petition_type;
        this.case_present_stage = case_present_stage;
        this.name_concerned_person = name_concerned_person;
        this.mobile_number = mobile_number;
        this.contact_number = contact_number;
        this.old_unit_id = old_unit_id;
        this.old_circle_id = old_circle_id;
        this.old_division_id = old_division_id;
        this.district_id = district_id;
        this.added_by = added_by;
        this.added_time = added_time;
        this.is_latest = is_latest;
        this.delete_flag = delete_flag;
        this.old_unit_name = old_unit_name;
        this.old_circle_name = old_circle_name;
        this.old_division_name = old_division_name;
        this.remarks = remarks;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.unit_name = unit_name;
        this.circle_name = circle_name;
        this.division_name = division_name;
        this.decretal_amount = decretal_amount;
        this.decretal_dep_status = decretal_dep_status;
        this.decretal_date = decretal_date;
        this.linked_op_ep_no = linked_op_ep_no;
        this.linked_op_ep_date = linked_op_ep_date;
        this.linked_as_no = linked_as_no;
        this.linked_as_date = linked_as_date;
        this.date_disposal = date_disposal;
        this.award_no_date = award_no_date;
        this.award_amount = award_amount;
        this.la_district = la_district;
        this.lao_id = lao_id;
        this.la_act_type_id = la_act_type_id;
    }
}
