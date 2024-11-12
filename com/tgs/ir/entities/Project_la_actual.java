package com.tgs.ir.entities;

public class Project_la_actual {
@Column(name="project_act_id")
 
 private Integer  projectActId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="la_acres")
 
 private Double  laAcres;


    public Project_la_actual(int project_act_id, int project_id, double la_acres) {
        this.project_act_id = project_act_id;
        this.project_id = project_id;
        this.la_acres = la_acres;
    }
}
