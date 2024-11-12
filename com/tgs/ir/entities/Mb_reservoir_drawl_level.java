package com.tgs.ir.entities;

public class Mb_reservoir_drawl_level {
@Column(name="drawl_id")
 
 private Integer  drawlId;

@Column(name="reservoir_id")
 
 private Integer  reservoirId;

@Column(name="drawl_dt")
 
 private timestamp without time zone  drawlDt;

@Column(name="present_water_level")
 
 private Double  presentWaterLevel;

@Column(name="present_water_capacity")
 
 private Double  presentWaterCapacity;

@Column(name="live_capacity")
 
 private Double  liveCapacity;

@Column(name="todays_drawls")
 
 private Double  todaysDrawls;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="created_by")
 
 private String  createdBy;

@Column(name="created_time")
 
 private timestamp without time zone  createdTime;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="sub_division_id")
 
 private Integer  subDivisionId;

@Column(name="deleted_by")
 
 private String  deletedBy;

@Column(name="deleted_time")
 
 private timestamp without time zone  deletedTime;


    public Mb_reservoir_drawl_level(int drawl_id, int reservoir_id, Object drawl_dt, double present_water_level, double present_water_capacity, double live_capacity, double todays_drawls, Object remarks, boolean delete_flag, boolean is_latest, Object created_by, Object created_time, int unit_id, int circle_id, int division_id, int sub_division_id, Object deleted_by, Object deleted_time) {
        this.drawl_id = drawl_id;
        this.reservoir_id = reservoir_id;
        this.drawl_dt = drawl_dt;
        this.present_water_level = present_water_level;
        this.present_water_capacity = present_water_capacity;
        this.live_capacity = live_capacity;
        this.todays_drawls = todays_drawls;
        this.remarks = remarks;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.created_by = created_by;
        this.created_time = created_time;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
        this.deleted_by = deleted_by;
        this.deleted_time = deleted_time;
    }
}
