package com.tgs.ir.entities;

public class Project_status_details {
@Column(name="proj_status_detail_id")
 
 private Integer  projStatusDetailId;

@Column(name="prj_type")
 
 private Double  prjType;

@Column(name="prj_status")
 
 private Double  prjStatus;

@Column(name="prj_start_date")
 
 private date  prjStartDate;

@Column(name="prj_end_date")
 
 private date  prjEndDate;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="project_id")
 
 private Integer  projectId;


    public Project_status_details(int proj_status_detail_id, double prj_type, double prj_status, Object prj_start_date, Object prj_end_date, boolean delete_flag, int project_id) {
        this.proj_status_detail_id = proj_status_detail_id;
        this.prj_type = prj_type;
        this.prj_status = prj_status;
        this.prj_start_date = prj_start_date;
        this.prj_end_date = prj_end_date;
        this.delete_flag = delete_flag;
        this.project_id = project_id;
    }
}
