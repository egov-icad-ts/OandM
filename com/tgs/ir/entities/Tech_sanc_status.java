package com.tgs.ir.entities;

public class Tech_sanc_status {
@Column(name="tech_sanc_status_id")
 
 private Integer  techSancStatusId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="package_id")
 
 private Integer  packageId;

@Column(name="work_comp_id")
 
 private Integer  workCompId;

@Column(name="status_id")
 
 private Integer  statusId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="submitted_by")
 
 private Integer  submittedBy;

@Column(name="submited_time")
 
 private timestamp without time zone  submitedTime;

@Column(name="tech_amount")
 
 private Double  techAmount;

@Column(name="postid")
 
 private Integer  postid;


    public Tech_sanc_status(int tech_sanc_status_id, int project_id, int package_id, int work_comp_id, int status_id, boolean delete_flag, boolean is_latest, int submitted_by, Object submited_time, double tech_amount, int postid) {
        this.tech_sanc_status_id = tech_sanc_status_id;
        this.project_id = project_id;
        this.package_id = package_id;
        this.work_comp_id = work_comp_id;
        this.status_id = status_id;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.submitted_by = submitted_by;
        this.submited_time = submited_time;
        this.tech_amount = tech_amount;
        this.postid = postid;
    }
}
