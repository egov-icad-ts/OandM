package com.tgs.ir.entities;

public class Project_type {
@Column(name="project_type_id")
 
 private Integer  projectTypeId;

@Column(name="project_type")
 
 private String  projectType;


    public Project_type(int project_type_id, Object project_type) {
        this.project_type_id = project_type_id;
        this.project_type = project_type;
    }
}
