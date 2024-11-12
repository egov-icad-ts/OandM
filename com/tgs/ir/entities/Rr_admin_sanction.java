package com.tgs.ir.entities;

public class Rr_admin_sanction {
@Column(name="rr_admin_id")
 
 private Integer  rrAdminId;

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

@Column(name="name_of_work")
 
 private String  nameOfWork;

@Column(name="rr_admin_sanction_amount")
 
 private Double  rrAdminSanctionAmount;

@Column(name="created_by")
 
 private String  createdBy;

@Column(name="submited_date")
 
 private timestamp without time zone  submitedDate;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="rr_center_name")
 
 private String  rrCenterName;


    public Rr_admin_sanction(int rr_admin_id, int project_id, int package_id, int district_id, int mandal_id, int village_id, Object name_of_work, double rr_admin_sanction_amount, Object created_by, Object submited_date, boolean delete_flag, boolean is_latest, Object rr_center_name) {
        this.rr_admin_id = rr_admin_id;
        this.project_id = project_id;
        this.package_id = package_id;
        this.district_id = district_id;
        this.mandal_id = mandal_id;
        this.village_id = village_id;
        this.name_of_work = name_of_work;
        this.rr_admin_sanction_amount = rr_admin_sanction_amount;
        this.created_by = created_by;
        this.submited_date = submited_date;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.rr_center_name = rr_center_name;
    }
}
