package com.tgs.ir.entities;

public class La_project_district_mapping {
@Column(name="prj_dist_id")
 
 private Integer  prjDistId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;


    public La_project_district_mapping(int prj_dist_id, int project_id, int district_id, boolean delete_flag, boolean is_latest) {
        this.prj_dist_id = prj_dist_id;
        this.project_id = project_id;
        this.district_id = district_id;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
    }
}
