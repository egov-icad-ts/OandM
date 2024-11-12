package com.tgs.ir.entities;

public class Lokngt_case_entry {
@Column(name="lkngt_id")
 
 private Integer  lkngtId;

@Column(name="name_of_court")
 
 private String  nameOfCourt;

@Column(name="bench_type")
 
 private String  benchType;

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

@Column(name="draf_submitted_date")
 
 private String  drafSubmittedDate;

@Column(name="date_counter_affidavit")
 
 private String  dateCounterAffidavit;

@Column(name="date_direction")
 
 private String  dateDirection;

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

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;


    public Lokngt_case_entry(int lkngt_id, Object name_of_court, Object bench_type, int case_number, int case_year, int case_category, Object petitioner_name, Object respondant_name, Object petitioner_advocate, Object respondant_advocate, Object dept_respondants, Object case_prayer, Object date_filing, Object date_listing, Object draf_submitted_date, Object date_counter_affidavit, Object date_direction, int case_present_stage, Object name_concerned_person, long mobile_number, long contact_number, int case_priority, int district_id, Object added_by, Object added_time, boolean is_latest, boolean delete_flag, int unit_id, int circle_id, int division_id) {
        this.lkngt_id = lkngt_id;
        this.name_of_court = name_of_court;
        this.bench_type = bench_type;
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
        this.draf_submitted_date = draf_submitted_date;
        this.date_counter_affidavit = date_counter_affidavit;
        this.date_direction = date_direction;
        this.case_present_stage = case_present_stage;
        this.name_concerned_person = name_concerned_person;
        this.mobile_number = mobile_number;
        this.contact_number = contact_number;
        this.case_priority = case_priority;
        this.district_id = district_id;
        this.added_by = added_by;
        this.added_time = added_time;
        this.is_latest = is_latest;
        this.delete_flag = delete_flag;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
    }
}
