package com.tgs.ir.entities;

public class Component_work_progress {
@Column(name="work_prog_id")
 
 private Integer  workProgId;

@Column(name="work_qty_id")
 
 private Integer  workQtyId;

@Column(name="completed_qty")
 
 private Integer  completedQty;

@Column(name="completed_qty_amnt")
 
 private Double  completedQtyAmnt;

@Column(name="no_of_designs")
 
 private Integer  noOfDesigns;

@Column(name="progress_month")
 
 private Integer  progressMonth;

@Column(name="progress_year")
 
 private Integer  progressYear;

@Column(name="package_id")
 
 private Integer  packageId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="comp_start_dt")
 
 private time without time zone  compStartDt;

@Column(name="comp_end_dt")
 
 private time without time zone  compEndDt;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="designation")
 
 private Double  designation;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="userid")
 
 private Double  userid;

@Column(name="postid")
 
 private Double  postid;


    public Component_work_progress(int work_prog_id, int work_qty_id, int completed_qty, double completed_qty_amnt, int no_of_designs, int progress_month, int progress_year, int package_id, int project_id, Object comp_start_dt, Object comp_end_dt, boolean delete_flag, double designation, boolean is_latest, double userid, double postid) {
        this.work_prog_id = work_prog_id;
        this.work_qty_id = work_qty_id;
        this.completed_qty = completed_qty;
        this.completed_qty_amnt = completed_qty_amnt;
        this.no_of_designs = no_of_designs;
        this.progress_month = progress_month;
        this.progress_year = progress_year;
        this.package_id = package_id;
        this.project_id = project_id;
        this.comp_start_dt = comp_start_dt;
        this.comp_end_dt = comp_end_dt;
        this.delete_flag = delete_flag;
        this.designation = designation;
        this.is_latest = is_latest;
        this.userid = userid;
        this.postid = postid;
    }
}
