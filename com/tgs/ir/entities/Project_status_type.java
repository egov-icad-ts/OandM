package com.tgs.ir.entities;

public class Project_status_type {
@Column(name="project_status_id")
 
 private Integer  projectStatusId;

@Column(name="project_status")
 
 private String  projectStatus;


    public Project_status_type(int project_status_id, Object project_status) {
        this.project_status_id = project_status_id;
        this.project_status = project_status;
    }
}
