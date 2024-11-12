package com.tgs.ir.entities;

public class Project_reservoir_maping {
@Column(name="reservoir_slno")
 
 private Integer  reservoirSlno;

@Column(name="project_id")
 
 private Integer  projectId;


    public Project_reservoir_maping(int reservoir_slno, int project_id) {
        this.reservoir_slno = reservoir_slno;
        this.project_id = project_id;
    }
}
