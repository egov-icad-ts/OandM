package com.tgs.ir.entities;

public class Land_acq_components {
@Column(name="land_acq_comp_id")
 
 private Integer  landAcqCompId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="package_id")
 
 private Integer  packageId;

@Column(name="component_id")
 
 private Integer  componentId;

@Column(name="component_name")
 
 private String  componentName;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="submited_by")
 
 private Integer  submitedBy;

@Column(name="submited_time")
 
 private timestamp without time zone  submitedTime;


    public Land_acq_components(int land_acq_comp_id, int project_id, int package_id, int component_id, Object component_name, boolean delete_flag, int submited_by, Object submited_time) {
        this.land_acq_comp_id = land_acq_comp_id;
        this.project_id = project_id;
        this.package_id = package_id;
        this.component_id = component_id;
        this.component_name = component_name;
        this.delete_flag = delete_flag;
        this.submited_by = submited_by;
        this.submited_time = submited_time;
    }
}
