package com.tgs.ir.entities;

public class Reservoir_mst {
@Column(name="reservoir_id")
 
 private Integer  reservoirId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="reservoir_name")
 
 private String  reservoirName;

@Column(name="reservoir_comp")
 
 private Integer  reservoirComp;

@Column(name="reservoir_parent")
 
 private Integer  reservoirParent;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="created_by_post")
 
 private bigint  createdByPost;

@Column(name="created_by_user")
 
 private String  createdByUser;

@Column(name="submited_time")
 
 private timestamp without time zone  submitedTime;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="edit_flag")
 
 private boolean  editFlag;

@Column(name="length")
 
 private Double  length;


    public Reservoir_mst(int reservoir_id, int project_id, Object reservoir_name, int reservoir_comp, int reservoir_parent, int unit_id, long created_by_post, Object created_by_user, Object submited_time, boolean is_latest, boolean delete_flag, boolean edit_flag, double length) {
        this.reservoir_id = reservoir_id;
        this.project_id = project_id;
        this.reservoir_name = reservoir_name;
        this.reservoir_comp = reservoir_comp;
        this.reservoir_parent = reservoir_parent;
        this.unit_id = unit_id;
        this.created_by_post = created_by_post;
        this.created_by_user = created_by_user;
        this.submited_time = submited_time;
        this.is_latest = is_latest;
        this.delete_flag = delete_flag;
        this.edit_flag = edit_flag;
        this.length = length;
    }
}
