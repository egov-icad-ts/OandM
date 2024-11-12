package com.tgs.ir.entities;

public class Lift_mst {
@Column(name="lift_id")
 
 private Integer  liftId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="lift_name")
 
 private String  liftName;

@Column(name="lift_component")
 
 private Integer  liftComponent;

@Column(name="lift_parent")
 
 private Integer  liftParent;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="edit_flag")
 
 private boolean  editFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="created_by_post")
 
 private bigint  createdByPost;

@Column(name="submited_date")
 
 private timestamp without time zone  submitedDate;

@Column(name="length")
 
 private Double  length;


    public Lift_mst(int lift_id, int project_id, Object lift_name, int lift_component, int lift_parent, boolean delete_flag, boolean edit_flag, boolean is_latest, int unit_id, long created_by_post, Object submited_date, double length) {
        this.lift_id = lift_id;
        this.project_id = project_id;
        this.lift_name = lift_name;
        this.lift_component = lift_component;
        this.lift_parent = lift_parent;
        this.delete_flag = delete_flag;
        this.edit_flag = edit_flag;
        this.is_latest = is_latest;
        this.unit_id = unit_id;
        this.created_by_post = created_by_post;
        this.submited_date = submited_date;
        this.length = length;
    }
}
