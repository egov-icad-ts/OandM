package com.tgs.ir.entities;

public class Package_ip {
@Column(name="package_ip_id")
 
 private Integer  packageIpId;

@Column(name="package_id")
 
 private Integer  packageId;

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

@Column(name="is_latest")
 
 private String  isLatest;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Package_ip(int package_ip_id, int package_id, int project_id, int ip_year, int ip_month, double ip_acres, double ip_acres_stabilized, Object is_latest, int district_id, boolean delete_flag) {
        this.package_ip_id = package_ip_id;
        this.package_id = package_id;
        this.project_id = project_id;
        this.ip_year = ip_year;
        this.ip_month = ip_month;
        this.ip_acres = ip_acres;
        this.ip_acres_stabilized = ip_acres_stabilized;
        this.is_latest = is_latest;
        this.district_id = district_id;
        this.delete_flag = delete_flag;
    }
}
