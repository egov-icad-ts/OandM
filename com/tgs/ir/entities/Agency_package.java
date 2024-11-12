package com.tgs.ir.entities;

public class Agency_package {
@Column(name="agency_pkg_id")
 
 private Integer  agencyPkgId;

@Column(name="pkg_id")
 
 private Integer  pkgId;

@Column(name="agency_id")
 
 private Integer  agencyId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="start_dt")
 
 private timestamp without time zone  startDt;

@Column(name="end_dt")
 
 private timestamp without time zone  endDt;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Agency_package(int agency_pkg_id, int pkg_id, int agency_id, int project_id, Object start_dt, Object end_dt, boolean delete_flag) {
        this.agency_pkg_id = agency_pkg_id;
        this.pkg_id = pkg_id;
        this.agency_id = agency_id;
        this.project_id = project_id;
        this.start_dt = start_dt;
        this.end_dt = end_dt;
        this.delete_flag = delete_flag;
    }
}
