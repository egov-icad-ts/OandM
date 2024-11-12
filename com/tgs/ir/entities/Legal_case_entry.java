package com.tgs.ir.entities;

public class Legal_case_entry {
@Column(name="slno")
 
 private Integer  slno;

@Column(name="name_of_court")
 
 private String  nameOfCourt;

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

@Column(name="petition_status")
 
 private Integer  petitionStatus;

@Column(name="case_present_stage")
 
 private Integer  casePresentStage;

@Column(name="name_concerned_person")
 
 private String  nameConcernedPerson;

@Column(name="mobile_number")
 
 private bigint  mobileNumber;

@Column(name="contact_number")
 
 private bigint  contactNumber;

@Column(name="case_priority")
 
 private Integer  casePriority;

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

@Column(name="usr_type_id")
 
 private Integer  usrTypeId;

@Column(name="usr_filing_number")
 
 private String  usrFilingNumber;

@Column(name="stay_petition_id")
 
 private Integer  stayPetitionId;

@Column(name="date_stay_petition")
 
 private String  dateStayPetition;

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

@Column(name="is_updated")
 
 private String  isUpdated;

@Column(name="draft_submitted_date")
 
 private String  draftSubmittedDate;

@Column(name="date_appearance")
 
 private String  dateAppearance;

@Column(name="dept_officers")
 
 private String  deptOfficers;

@Column(name="ia_filling_no")
 
 private String  iaFillingNo;

@Column(name="decretal_amount")
 
 private Double  decretalAmount;

@Column(name="counter_affidavit_not_req")
 
 private String  counterAffidavitNotReq;

@Column(name="lao_id")
 
 private Integer  laoId;

@Column(name="case_category_old")
 
 private Integer  caseCategoryOld;

@Column(name="wp_filepath")
 
 private String  wpFilepath;

@Column(name="counter_filepath")
 
 private String  counterFilepath;

@Column(name="adjourment_remarks")
 
 private String  adjourmentRemarks;

@Column(name="case_group_id")
 
 private Integer  caseGroupId;


    public Legal_case_entry(int slno, Object name_of_court, int case_type, int case_number, int case_year, int case_category, Object petitioner_name, Object respondant_name, Object petitioner_advocate, Object dept_respondants, Object case_prayer, Object date_filing, Object date_listing, Object date_counter_affidavit, Object date_direction, int petition_status, int case_present_stage, Object name_concerned_person, long mobile_number, long contact_number, int case_priority, int old_unit_id, int old_circle_id, int old_division_id, int district_id, Object added_by, Object added_time, boolean is_latest, boolean delete_flag, Object old_unit_name, Object old_circle_name, Object old_division_name, Object remarks, int usr_type_id, Object usr_filing_number, int stay_petition_id, Object date_stay_petition, int unit_id, int circle_id, int division_id, Object unit_name, Object circle_name, Object division_name, Object is_updated, Object draft_submitted_date, Object date_appearance, Object dept_officers, Object ia_filling_no, double decretal_amount, Object counter_affidavit_not_req, int lao_id, int case_category_old, Object wp_filepath, Object counter_filepath, Object adjourment_remarks, int case_group_id) {
        this.slno = slno;
        this.name_of_court = name_of_court;
        this.case_type = case_type;
        this.case_number = case_number;
        this.case_year = case_year;
        this.case_category = case_category;
        this.petitioner_name = petitioner_name;
        this.respondant_name = respondant_name;
        this.petitioner_advocate = petitioner_advocate;
        this.dept_respondants = dept_respondants;
        this.case_prayer = case_prayer;
        this.date_filing = date_filing;
        this.date_listing = date_listing;
        this.date_counter_affidavit = date_counter_affidavit;
        this.date_direction = date_direction;
        this.petition_status = petition_status;
        this.case_present_stage = case_present_stage;
        this.name_concerned_person = name_concerned_person;
        this.mobile_number = mobile_number;
        this.contact_number = contact_number;
        this.case_priority = case_priority;
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
        this.usr_type_id = usr_type_id;
        this.usr_filing_number = usr_filing_number;
        this.stay_petition_id = stay_petition_id;
        this.date_stay_petition = date_stay_petition;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.unit_name = unit_name;
        this.circle_name = circle_name;
        this.division_name = division_name;
        this.is_updated = is_updated;
        this.draft_submitted_date = draft_submitted_date;
        this.date_appearance = date_appearance;
        this.dept_officers = dept_officers;
        this.ia_filling_no = ia_filling_no;
        this.decretal_amount = decretal_amount;
        this.counter_affidavit_not_req = counter_affidavit_not_req;
        this.lao_id = lao_id;
        this.case_category_old = case_category_old;
        this.wp_filepath = wp_filepath;
        this.counter_filepath = counter_filepath;
        this.adjourment_remarks = adjourment_remarks;
        this.case_group_id = case_group_id;
    }
}
