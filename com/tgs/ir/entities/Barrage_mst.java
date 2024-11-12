package com.tgs.ir.entities;

public class Barrage_mst {
@Column(name="barrage_id")
 
 private Integer  barrageId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="barrage_name")
 
 private String  barrageName;

@Column(name="barrage_component")
 
 private Integer  barrageComponent;

@Column(name="barrage_parent")
 
 private Integer  barrageParent;

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


    public Barrage_mst(int barrage_id, int project_id, Object barrage_name, int barrage_component, int barrage_parent, boolean delete_flag, boolean edit_flag, boolean is_latest, int unit_id, long created_by_post, Object submited_date, double length) {
        this.barrage_id = barrage_id;
        this.project_id = project_id;
        this.barrage_name = barrage_name;
        this.barrage_component = barrage_component;
        this.barrage_parent = barrage_parent;
        this.delete_flag = delete_flag;
        this.edit_flag = edit_flag;
        this.is_latest = is_latest;
        this.unit_id = unit_id;
        this.created_by_post = created_by_post;
        this.submited_date = submited_date;
        this.length = length;
    }
}
