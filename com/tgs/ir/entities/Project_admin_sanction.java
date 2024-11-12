package com.tgs.ir.entities;

public class Project_admin_sanction {
@Column(name="project_as_id")
 
 private Integer  projectAsId;

@Column(name="admin_sanction_amount")
 
 private Double  adminSanctionAmount;

@Column(name="go_number")
 
 private String  goNumber;

@Column(name="go_date")
 
 private date  goDate;

@Column(name="go_file_path")
 
 private String  goFilePath;

@Column(name="no_of_packages")
 
 private Double  noOfPackages;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="created_by")
 
 private String  createdBy;

@Column(name="created")
 
 private time without time zone  created;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="la_sanction_amount")
 
 private Double  laSanctionAmount;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="created_time")
 
 private timestamp without time zone  createdTime;

@Column(name="revision_for_project_as_id")
 
 private Integer  revisionForProjectAsId;


    public Project_admin_sanction(int project_as_id, double admin_sanction_amount, Object go_number, Object go_date, Object go_file_path, double no_of_packages, boolean delete_flag, Object created_by, Object created, int project_id, boolean is_latest, double la_sanction_amount, Object remarks, Object created_time, int revision_for_project_as_id) {
        this.project_as_id = project_as_id;
        this.admin_sanction_amount = admin_sanction_amount;
        this.go_number = go_number;
        this.go_date = go_date;
        this.go_file_path = go_file_path;
        this.no_of_packages = no_of_packages;
        this.delete_flag = delete_flag;
        this.created_by = created_by;
        this.created = created;
        this.project_id = project_id;
        this.is_latest = is_latest;
        this.la_sanction_amount = la_sanction_amount;
        this.remarks = remarks;
        this.created_time = created_time;
        this.revision_for_project_as_id = revision_for_project_as_id;
    }
}
