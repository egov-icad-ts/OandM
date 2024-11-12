package com.tgs.ir.entities;

public class Forest_expenditure {
@Column(name="fe_id")
 
 private Integer  feId;

@Column(name="area_involved")
 
 private Double  areaInvolved;

@Column(name="amt_deposited_aforestation")
 
 private Double  amtDepositedAforestation;

@Column(name="status")
 
 private String  status;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="updated_by")
 
 private String  updatedBy;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="updated_time")
 
 private timestamp without time zone  updatedTime;

@Column(name="pkg_id")
 
 private Integer  pkgId;

@Column(name="updated_year")
 
 private Integer  updatedYear;

@Column(name="updated_month")
 
 private Integer  updatedMonth;


    public Forest_expenditure(int fe_id, double area_involved, double amt_deposited_aforestation, Object status, int project_id, Object updated_by, boolean is_latest, Object updated_time, int pkg_id, int updated_year, int updated_month) {
        this.fe_id = fe_id;
        this.area_involved = area_involved;
        this.amt_deposited_aforestation = amt_deposited_aforestation;
        this.status = status;
        this.project_id = project_id;
        this.updated_by = updated_by;
        this.is_latest = is_latest;
        this.updated_time = updated_time;
        this.pkg_id = pkg_id;
        this.updated_year = updated_year;
        this.updated_month = updated_month;
    }
}
