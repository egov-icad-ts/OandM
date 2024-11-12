package com.tgs.ir.entities;

public class Lao_projects {
@Column(name="lao_project_id")
 
 private Integer  laoProjectId;

@Column(name="lao_project_name")
 
 private String  laoProjectName;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Lao_projects(int lao_project_id, Object lao_project_name, boolean delete_flag) {
        this.lao_project_id = lao_project_id;
        this.lao_project_name = lao_project_name;
        this.delete_flag = delete_flag;
    }
}
