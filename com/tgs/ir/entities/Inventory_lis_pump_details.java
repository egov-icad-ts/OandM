package com.tgs.ir.entities;

public class Inventory_lis_pump_details {
@Column(name="pump_id")
 
 private Integer  pumpId;

@Column(name="lis_id")
 
 private Integer  lisId;

@Column(name="ayacut")
 
 private Double  ayacut;

@Column(name="no_of_pumps")
 
 private Integer  noOfPumps;

@Column(name="discharge")
 
 private Double  discharge;

@Column(name="total_lifting_head")
 
 private Double  totalLiftingHead;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="sub_division_id")
 
 private Integer  subDivisionId;

@Column(name="created_by")
 
 private String  createdBy;

@Column(name="post_id")
 
 private String  postId;

@Column(name="created_time")
 
 private timestamp without time zone  createdTime;

@Column(name="approved_by")
 
 private String  approvedBy;

@Column(name="approved_time")
 
 private timestamp without time zone  approvedTime;

@Column(name="deleted_by")
 
 private String  deletedBy;

@Column(name="deleted_time")
 
 private timestamp without time zone  deletedTime;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="pump_capacity")
 
 private Double  pumpCapacity;


    public Inventory_lis_pump_details(int pump_id, int lis_id, double ayacut, int no_of_pumps, double discharge, double total_lifting_head, int project_id, int unit_id, int circle_id, int division_id, int sub_division_id, Object created_by, Object post_id, Object created_time, Object approved_by, Object approved_time, Object deleted_by, Object deleted_time, boolean delete_flag, boolean is_latest, double pump_capacity) {
        this.pump_id = pump_id;
        this.lis_id = lis_id;
        this.ayacut = ayacut;
        this.no_of_pumps = no_of_pumps;
        this.discharge = discharge;
        this.total_lifting_head = total_lifting_head;
        this.project_id = project_id;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
        this.created_by = created_by;
        this.post_id = post_id;
        this.created_time = created_time;
        this.approved_by = approved_by;
        this.approved_time = approved_time;
        this.deleted_by = deleted_by;
        this.deleted_time = deleted_time;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.pump_capacity = pump_capacity;
    }
}
