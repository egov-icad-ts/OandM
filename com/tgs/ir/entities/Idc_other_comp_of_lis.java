package com.tgs.ir.entities;

public class Idc_other_comp_of_lis {
@Column(name="lis_id")
 
 private Integer  lisId;

@Column(name="airtank_capacity")
 
 private String  airtankCapacity;

@Column(name="max_air_pressure")
 
 private String  maxAirPressure;

@Column(name="air_quality")
 
 private String  airQuality;

@Column(name="sfc_rating")
 
 private String  sfcRating;

@Column(name="sfc_type")
 
 private String  sfcType;

@Column(name="type_of_start")
 
 private String  typeOfStart;

@Column(name="fcma_rating")
 
 private String  fcmaRating;

@Column(name="fcma_type")
 
 private String  fcmaType;

@Column(name="dg_rating")
 
 private String  dgRating;

@Column(name="meter_rating")
 
 private String  meterRating;

@Column(name="meter_type")
 
 private String  meterType;

@Column(name="crane_rating")
 
 private String  craneRating;

@Column(name="crane_type")
 
 private String  craneType;

@Column(name="crane_travel_speed")
 
 private String  craneTravelSpeed;

@Column(name="no_of_hooks")
 
 private Double  noOfHooks;

@Column(name="created_by_username")
 
 private String  createdByUsername;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="edit_flag")
 
 private boolean  editFlag;

@Column(name="post_id")
 
 private String  postId;

@Column(name="created_timestamp")
 
 private timestamp without time zone  createdTimestamp;

@Column(name="updated_timestamp")
 
 private timestamp without time zone  updatedTimestamp;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="old_unit_id")
 
 private Integer  oldUnitId;

@Column(name="old_circle_id")
 
 private Integer  oldCircleId;

@Column(name="old_division_id")
 
 private Integer  oldDivisionId;

@Column(name="old_sub_division_id")
 
 private Integer  oldSubDivisionId;

@Column(name="status_id")
 
 private Integer  statusId;

@Column(name="lift_id")
 
 private Integer  liftId;

@Column(name="approved_by_username")
 
 private String  approvedByUsername;

@Column(name="approved_timestamp")
 
 private timestamp without time zone  approvedTimestamp;

@Column(name="approved_post_id")
 
 private String  approvedPostId;

@Column(name="deleted_by")
 
 private String  deletedBy;

@Column(name="deleted_time")
 
 private timestamp without time zone  deletedTime;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="sub_division_id")
 
 private Integer  subDivisionId;


    public Idc_other_comp_of_lis(int lis_id, Object airtank_capacity, Object max_air_pressure, Object air_quality, Object sfc_rating, Object sfc_type, Object type_of_start, Object fcma_rating, Object fcma_type, Object dg_rating, Object meter_rating, Object meter_type, Object crane_rating, Object crane_type, Object crane_travel_speed, double no_of_hooks, Object created_by_username, boolean delete_flag, boolean is_latest, boolean edit_flag, Object post_id, Object created_timestamp, Object updated_timestamp, int project_id, int old_unit_id, int old_circle_id, int old_division_id, int old_sub_division_id, int status_id, int lift_id, Object approved_by_username, Object approved_timestamp, Object approved_post_id, Object deleted_by, Object deleted_time, int unit_id, int circle_id, int division_id, int sub_division_id) {
        this.lis_id = lis_id;
        this.airtank_capacity = airtank_capacity;
        this.max_air_pressure = max_air_pressure;
        this.air_quality = air_quality;
        this.sfc_rating = sfc_rating;
        this.sfc_type = sfc_type;
        this.type_of_start = type_of_start;
        this.fcma_rating = fcma_rating;
        this.fcma_type = fcma_type;
        this.dg_rating = dg_rating;
        this.meter_rating = meter_rating;
        this.meter_type = meter_type;
        this.crane_rating = crane_rating;
        this.crane_type = crane_type;
        this.crane_travel_speed = crane_travel_speed;
        this.no_of_hooks = no_of_hooks;
        this.created_by_username = created_by_username;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.edit_flag = edit_flag;
        this.post_id = post_id;
        this.created_timestamp = created_timestamp;
        this.updated_timestamp = updated_timestamp;
        this.project_id = project_id;
        this.old_unit_id = old_unit_id;
        this.old_circle_id = old_circle_id;
        this.old_division_id = old_division_id;
        this.old_sub_division_id = old_sub_division_id;
        this.status_id = status_id;
        this.lift_id = lift_id;
        this.approved_by_username = approved_by_username;
        this.approved_timestamp = approved_timestamp;
        this.approved_post_id = approved_post_id;
        this.deleted_by = deleted_by;
        this.deleted_time = deleted_time;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
    }
}
