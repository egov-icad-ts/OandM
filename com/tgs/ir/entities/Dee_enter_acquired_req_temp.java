package com.tgs.ir.entities;

public class Dee_enter_acquired_req_temp {
@Column(name="dee_req_acq_temp_id")
 
 private Integer  deeReqAcqTempId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="package_id")
 
 private Integer  packageId;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="mandal_id")
 
 private Integer  mandalId;

@Column(name="village_id")
 
 private Integer  villageId;

@Column(name="ee_assign_comp_id")
 
 private Integer  eeAssignCompId;

@Column(name="se_assign_package_comp_id")
 
 private Integer  seAssignPackageCompId;

@Column(name="comp_canal_res_lift_id")
 
 private Integer  compCanalResLiftId;

@Column(name="comp_type_id")
 
 private Integer  compTypeId;

@Column(name="survey_id")
 
 private Integer  surveyId;

@Column(name="from_km")
 
 private Double  fromKm;

@Column(name="to_km")
 
 private Double  toKm;

@Column(name="acquired_acres")
 
 private Double  acquiredAcres;

@Column(name="acquired_guntas")
 
 private Double  acquiredGuntas;

@Column(name="north_boundary")
 
 private String  northBoundary;

@Column(name="south_boundary")
 
 private String  southBoundary;

@Column(name="east_boundary")
 
 private String  eastBoundary;

@Column(name="west_boundary")
 
 private String  westBoundary;

@Column(name="no_of_structures")
 
 private Integer  noOfStructures;

@Column(name="govt_patta")
 
 private Integer  govtPatta;

@Column(name="crop_type")
 
 private Integer  cropType;

@Column(name="owner_name")
 
 private String  ownerName;

@Column(name="owner_aadhar_no")
 
 private Double  ownerAadharNo;

@Column(name="owner_bank_accnt_number")
 
 private Double  ownerBankAccntNumber;

@Column(name="la_proceeding_no")
 
 private String  laProceedingNo;

@Column(name="la_proceeding_date")
 
 private timestamp without time zone  laProceedingDate;

@Column(name="ee_postid")
 
 private String  eePostid;

@Column(name="ee_la_file_id")
 
 private Integer  eeLaFileId;

@Column(name="old_unit_id")
 
 private Integer  oldUnitId;

@Column(name="old_circle_id")
 
 private Integer  oldCircleId;

@Column(name="old_division_id")
 
 private Integer  oldDivisionId;

@Column(name="old_sub_division_id")
 
 private Integer  oldSubDivisionId;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="land_amount")
 
 private Double  landAmount;

@Column(name="structure_amount")
 
 private Double  structureAmount;

@Column(name="total_amount")
 
 private Double  totalAmount;

@Column(name="created_by_userid")
 
 private String  createdByUserid;

@Column(name="created_by_username")
 
 private String  createdByUsername;

@Column(name="created_by_postid")
 
 private Integer  createdByPostid;

@Column(name="created_designation")
 
 private Integer  createdDesignation;

@Column(name="submited_date")
 
 private timestamp without time zone  submitedDate;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="excel_filepath")
 
 private String  excelFilepath;

@Column(name="status_id")
 
 private Integer  statusId;

@Column(name="survey_number")
 
 private String  surveyNumber;

@Column(name="la_dd_no")
 
 private String  laDdNo;

@Column(name="la_dd_date")
 
 private timestamp without time zone  laDdDate;

@Column(name="lao_id")
 
 private Integer  laoId;

@Column(name="tree_amount")
 
 private Double  treeAmount;

@Column(name="income_tax")
 
 private Double  incomeTax;

@Column(name="net_amount")
 
 private Double  netAmount;

@Column(name="dd_date")
 
 private String  ddDate;

@Column(name="mutation_status")
 
 private Integer  mutationStatus;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="deleted_by")
 
 private String  deletedBy;

@Column(name="deleted_time")
 
 private timestamp without time zone  deletedTime;

@Column(name="tech_unit_id")
 
 private Integer  techUnitId;

@Column(name="tech_circle_id")
 
 private Integer  techCircleId;

@Column(name="tech_division_id")
 
 private Integer  techDivisionId;

@Column(name="tech_sub_division_id")
 
 private Integer  techSubDivisionId;

@Column(name="pahani_path")
 
 private String  pahaniPath;

@Column(name="pahani_upload_time")
 
 private timestamp without time zone  pahaniUploadTime;

@Column(name="pahani_uploaded_by")
 
 private String  pahaniUploadedBy;

@Column(name="pahani_uploaded_post_id")
 
 private String  pahaniUploadedPostId;

@Column(name="award_path")
 
 private String  awardPath;

@Column(name="award_upload_time")
 
 private timestamp without time zone  awardUploadTime;

@Column(name="award_uploaded_by")
 
 private String  awardUploadedBy;

@Column(name="award_upload_post_id")
 
 private String  awardUploadPostId;

@Column(name="payment_status")
 
 private String  paymentStatus;

@Column(name="survey_status")
 
 private String  surveyStatus;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="sub_division_id")
 
 private Integer  subDivisionId;

@Column(name="is_updated")
 
 private String  isUpdated;

@Column(name="ee_re_assign_id")
 
 private Integer  eeReAssignId;

@Column(name="reason_for_deletion")
 
 private String  reasonForDeletion;

@Column(name="updated_by")
 
 private String  updatedBy;

@Column(name="edited_acres")
 
 private Integer  editedAcres;

@Column(name="edited_guntas")
 
 private Double  editedGuntas;


    public Dee_enter_acquired_req_temp(int dee_req_acq_temp_id, int project_id, int package_id, int district_id, int mandal_id, int village_id, int ee_assign_comp_id, int se_assign_package_comp_id, int comp_canal_res_lift_id, int comp_type_id, int survey_id, double from_km, double to_km, double acquired_acres, double acquired_guntas, Object north_boundary, Object south_boundary, Object east_boundary, Object west_boundary, int no_of_structures, int govt_patta, int crop_type, Object owner_name, double owner_aadhar_no, double owner_bank_accnt_number, Object la_proceeding_no, Object la_proceeding_date, Object ee_postid, int ee_la_file_id, int old_unit_id, int old_circle_id, int old_division_id, int old_sub_division_id, Object remarks, double land_amount, double structure_amount, double total_amount, Object created_by_userid, Object created_by_username, int created_by_postid, int created_designation, Object submited_date, boolean is_latest, Object excel_filepath, int status_id, Object survey_number, Object la_dd_no, Object la_dd_date, int lao_id, double tree_amount, double income_tax, double net_amount, Object dd_date, int mutation_status, boolean delete_flag, Object deleted_by, Object deleted_time, int tech_unit_id, int tech_circle_id, int tech_division_id, int tech_sub_division_id, Object pahani_path, Object pahani_upload_time, Object pahani_uploaded_by, Object pahani_uploaded_post_id, Object award_path, Object award_upload_time, Object award_uploaded_by, Object award_upload_post_id, Object payment_status, Object survey_status, int unit_id, int circle_id, int division_id, int sub_division_id, Object is_updated, int ee_re_assign_id, Object reason_for_deletion, Object updated_by, int edited_acres, double edited_guntas) {
        this.dee_req_acq_temp_id = dee_req_acq_temp_id;
        this.project_id = project_id;
        this.package_id = package_id;
        this.district_id = district_id;
        this.mandal_id = mandal_id;
        this.village_id = village_id;
        this.ee_assign_comp_id = ee_assign_comp_id;
        this.se_assign_package_comp_id = se_assign_package_comp_id;
        this.comp_canal_res_lift_id = comp_canal_res_lift_id;
        this.comp_type_id = comp_type_id;
        this.survey_id = survey_id;
        this.from_km = from_km;
        this.to_km = to_km;
        this.acquired_acres = acquired_acres;
        this.acquired_guntas = acquired_guntas;
        this.north_boundary = north_boundary;
        this.south_boundary = south_boundary;
        this.east_boundary = east_boundary;
        this.west_boundary = west_boundary;
        this.no_of_structures = no_of_structures;
        this.govt_patta = govt_patta;
        this.crop_type = crop_type;
        this.owner_name = owner_name;
        this.owner_aadhar_no = owner_aadhar_no;
        this.owner_bank_accnt_number = owner_bank_accnt_number;
        this.la_proceeding_no = la_proceeding_no;
        this.la_proceeding_date = la_proceeding_date;
        this.ee_postid = ee_postid;
        this.ee_la_file_id = ee_la_file_id;
        this.old_unit_id = old_unit_id;
        this.old_circle_id = old_circle_id;
        this.old_division_id = old_division_id;
        this.old_sub_division_id = old_sub_division_id;
        this.remarks = remarks;
        this.land_amount = land_amount;
        this.structure_amount = structure_amount;
        this.total_amount = total_amount;
        this.created_by_userid = created_by_userid;
        this.created_by_username = created_by_username;
        this.created_by_postid = created_by_postid;
        this.created_designation = created_designation;
        this.submited_date = submited_date;
        this.is_latest = is_latest;
        this.excel_filepath = excel_filepath;
        this.status_id = status_id;
        this.survey_number = survey_number;
        this.la_dd_no = la_dd_no;
        this.la_dd_date = la_dd_date;
        this.lao_id = lao_id;
        this.tree_amount = tree_amount;
        this.income_tax = income_tax;
        this.net_amount = net_amount;
        this.dd_date = dd_date;
        this.mutation_status = mutation_status;
        this.delete_flag = delete_flag;
        this.deleted_by = deleted_by;
        this.deleted_time = deleted_time;
        this.tech_unit_id = tech_unit_id;
        this.tech_circle_id = tech_circle_id;
        this.tech_division_id = tech_division_id;
        this.tech_sub_division_id = tech_sub_division_id;
        this.pahani_path = pahani_path;
        this.pahani_upload_time = pahani_upload_time;
        this.pahani_uploaded_by = pahani_uploaded_by;
        this.pahani_uploaded_post_id = pahani_uploaded_post_id;
        this.award_path = award_path;
        this.award_upload_time = award_upload_time;
        this.award_uploaded_by = award_uploaded_by;
        this.award_upload_post_id = award_upload_post_id;
        this.payment_status = payment_status;
        this.survey_status = survey_status;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
        this.is_updated = is_updated;
        this.ee_re_assign_id = ee_re_assign_id;
        this.reason_for_deletion = reason_for_deletion;
        this.updated_by = updated_by;
        this.edited_acres = edited_acres;
        this.edited_guntas = edited_guntas;
    }
}
