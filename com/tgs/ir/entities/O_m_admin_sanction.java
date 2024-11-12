package com.tgs.ir.entities;

public class O_m_admin_sanction {
@Column(name="admin_id")
 
 private Integer  adminId;

@Column(name="work_id")
 
 private Integer  workId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="sub_division_id")
 
 private Integer  subDivisionId;

@Column(name="work_name")
 
 private String  workName;

@Column(name="hoa_id")
 
 private Integer  hoaId;

@Column(name="approved_by_id")
 
 private Integer  approvedById;

@Column(name="approved_by_name")
 
 private String  approvedByName;

@Column(name="reference_number")
 
 private String  referenceNumber;

@Column(name="reference_date")
 
 private date  referenceDate;

@Column(name="admin_approved_amount")
 
 private Double  adminApprovedAmount;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="updated_by")
 
 private String  updatedBy;

@Column(name="updated_on")
 
 private timestamp with time zone  updatedOn;

@Column(name="work_type_id")
 
 private Integer  workTypeId;

@Column(name="lift_id")
 
 private Integer  liftId;

@Column(name="tank_id")
 
 private Integer  tankId;

@Column(name="small_lift_id")
 
 private Integer  smallLiftId;

@Column(name="res_id")
 
 private Integer  resId;

@Column(name="tank_code")
 
 private String  tankCode;

@Column(name="tank_name")
 
 private String  tankName;

@Column(name="financial_year")
 
 private Integer  financialYear;

@Column(name="is_assigned")
 
 private boolean  isAssigned;

@Column(name="aa_file_url")
 
 private String  aaFileUrl;

@Column(name="deleted_by")
 
 private String  deletedBy;

@Column(name="deleted_on")
 
 private timestamp with time zone  deletedOn;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="mandal_id")
 
 private Integer  mandalId;

@Column(name="village_id")
 
 private Integer  villageId;

@Column(name="modified_on")
 
 private timestamp with time zone  modifiedOn;

@Column(name="modified_remarks")
 
 private String  modifiedRemarks;

@Column(name="proj_sub_type_id")
 
 private Integer  projSubTypeId;


    public O_m_admin_sanction(int admin_id, int work_id, int project_id, int unit_id, int circle_id, int division_id, int sub_division_id, Object work_name, int hoa_id, int approved_by_id, Object approved_by_name, Object reference_number, Object reference_date, double admin_approved_amount, boolean is_latest, boolean delete_flag, Object updated_by, Object updated_on, int work_type_id, int lift_id, int tank_id, int small_lift_id, int res_id, Object tank_code, Object tank_name, int financial_year, boolean is_assigned, Object aa_file_url, Object deleted_by, Object deleted_on, int district_id, int mandal_id, int village_id, Object modified_on, Object modified_remarks, int proj_sub_type_id) {
        this.admin_id = admin_id;
        this.work_id = work_id;
        this.project_id = project_id;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
        this.work_name = work_name;
        this.hoa_id = hoa_id;
        this.approved_by_id = approved_by_id;
        this.approved_by_name = approved_by_name;
        this.reference_number = reference_number;
        this.reference_date = reference_date;
        this.admin_approved_amount = admin_approved_amount;
        this.is_latest = is_latest;
        this.delete_flag = delete_flag;
        this.updated_by = updated_by;
        this.updated_on = updated_on;
        this.work_type_id = work_type_id;
        this.lift_id = lift_id;
        this.tank_id = tank_id;
        this.small_lift_id = small_lift_id;
        this.res_id = res_id;
        this.tank_code = tank_code;
        this.tank_name = tank_name;
        this.financial_year = financial_year;
        this.is_assigned = is_assigned;
        this.aa_file_url = aa_file_url;
        this.deleted_by = deleted_by;
        this.deleted_on = deleted_on;
        this.district_id = district_id;
        this.mandal_id = mandal_id;
        this.village_id = village_id;
        this.modified_on = modified_on;
        this.modified_remarks = modified_remarks;
        this.proj_sub_type_id = proj_sub_type_id;
    }
}
