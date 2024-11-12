package com.tgs.ir.entities;

public class Package_water_util {
@Column(name="pkg_water_util_id")
 
 private Integer  pkgWaterUtilId;

@Column(name="package_id")
 
 private Integer  packageId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="month")
 
 private Integer  month;

@Column(name="year")
 
 private Integer  year;

@Column(name="util_year")
 
 private String  utilYear;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="mandal_id")
 
 private Integer  mandalId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Package_water_util(int pkg_water_util_id, int package_id, int project_id, int month, int year, Object util_year, int district_id, int mandal_id, boolean delete_flag) {
        this.pkg_water_util_id = pkg_water_util_id;
        this.package_id = package_id;
        this.project_id = project_id;
        this.month = month;
        this.year = year;
        this.util_year = util_year;
        this.district_id = district_id;
        this.mandal_id = mandal_id;
        this.delete_flag = delete_flag;
    }
}
