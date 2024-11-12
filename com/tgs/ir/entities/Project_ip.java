package com.tgs.ir.entities;

public class Project_ip {
@Column(name="project_ip_id")
 
 private Integer  projectIpId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="ip_year")
 
 private Integer  ipYear;

@Column(name="ip_month")
 
 private Integer  ipMonth;

@Column(name="ip_acres")
 
 private Double  ipAcres;

@Column(name="ip_acres_stabilized")
 
 private Double  ipAcresStabilized;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="mandal_id")
 
 private Integer  mandalId;

@Column(name="is_latest")
 
 private String  isLatest;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Project_ip(int project_ip_id, int project_id, int ip_year, int ip_month, double ip_acres, double ip_acres_stabilized, int district_id, int mandal_id, Object is_latest, boolean delete_flag) {
        this.project_ip_id = project_ip_id;
        this.project_id = project_id;
        this.ip_year = ip_year;
        this.ip_month = ip_month;
        this.ip_acres = ip_acres;
        this.ip_acres_stabilized = ip_acres_stabilized;
        this.district_id = district_id;
        this.mandal_id = mandal_id;
        this.is_latest = is_latest;
        this.delete_flag = delete_flag;
    }
}
