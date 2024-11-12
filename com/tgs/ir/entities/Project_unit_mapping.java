package com.tgs.ir.entities;

public class Project_unit_mapping {
@Column(name="prj_unit_id")
 
 private Integer  prjUnitId;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;


    public Project_unit_mapping(int prj_unit_id, int unit_id, int project_id, boolean delete_flag, boolean is_latest) {
        this.prj_unit_id = prj_unit_id;
        this.unit_id = unit_id;
        this.project_id = project_id;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
    }
}
