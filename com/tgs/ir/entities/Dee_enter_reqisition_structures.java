package com.tgs.ir.entities;

public class Dee_enter_reqisition_structures {
@Column(name="dee_structures_id")
 
 private Integer  deeStructuresId;

@Column(name="dee_enter_req_id")
 
 private Integer  deeEnterReqId;

@Column(name="structure_id")
 
 private Integer  structureId;

@Column(name="structue_number")
 
 private Integer  structueNumber;

@Column(name="tree_type")
 
 private String  treeType;

@Column(name="acres")
 
 private Double  acres;

@Column(name="guntas")
 
 private Double  guntas;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="created_by_user")
 
 private String  createdByUser;

@Column(name="created_postid")
 
 private Integer  createdPostid;

@Column(name="submited_date")
 
 private timestamp without time zone  submitedDate;


    public Dee_enter_reqisition_structures(int dee_structures_id, int dee_enter_req_id, int structure_id, int structue_number, Object tree_type, double acres, double guntas, boolean is_latest, boolean delete_flag, Object created_by_user, int created_postid, Object submited_date) {
        this.dee_structures_id = dee_structures_id;
        this.dee_enter_req_id = dee_enter_req_id;
        this.structure_id = structure_id;
        this.structue_number = structue_number;
        this.tree_type = tree_type;
        this.acres = acres;
        this.guntas = guntas;
        this.is_latest = is_latest;
        this.delete_flag = delete_flag;
        this.created_by_user = created_by_user;
        this.created_postid = created_postid;
        this.submited_date = submited_date;
    }
}
