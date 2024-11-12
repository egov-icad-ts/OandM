package com.tgs.ir.entities;

public class Project_reservoir_helper {
@Column(name="h_id")
 
 private Integer  hId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="reservoir_id")
 
 private Integer  reservoirId;

@Column(name="type_id")
 
 private Integer  typeId;

@Column(name="helper_count")
 
 private Integer  helperCount;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="created_by")
 
 private String  createdBy;

@Column(name="created_time")
 
 private timestamp without time zone  createdTime;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="updated_time")
 
 private timestamp without time zone  updatedTime;

@Column(name="deleted_time")
 
 private timestamp without time zone  deletedTime;


    public Project_reservoir_helper(int h_id, int project_id, int reservoir_id, int type_id, int helper_count, Object remarks, int unit_id, int circle_id, int division_id, Object created_by, Object created_time, boolean delete_flag, boolean is_latest, Object updated_time, Object deleted_time) {
        this.h_id = h_id;
        this.project_id = project_id;
        this.reservoir_id = reservoir_id;
        this.type_id = type_id;
        this.helper_count = helper_count;
        this.remarks = remarks;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.created_by = created_by;
        this.created_time = created_time;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.updated_time = updated_time;
        this.deleted_time = deleted_time;
    }
}
