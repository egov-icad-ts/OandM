package com.tgs.ir.entities;

public class Project_jalayagnam_mst {
@Column(name="pj_id")
 
 private Integer  pjId;

@Column(name="description")
 
 private String  description;


    public Project_jalayagnam_mst(int pj_id, Object description) {
        this.pj_id = pj_id;
        this.description = description;
    }
}
