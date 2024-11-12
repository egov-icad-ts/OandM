package com.tgs.ir.entities;

public class Idc_power_station_lis_o {
@Column(name="lisid")
 
 private Integer  lisid;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="transformer_rating")
 
 private String  transformerRating;

@Column(name="transformer_type_of_cooling")
 
 private String  transformerTypeOfCooling;

@Column(name="switches_rating")
 
 private String  switchesRating;

@Column(name="switches_no_of_panels")
 
 private Double  switchesNoOfPanels;

@Column(name="switches_control_system")
 
 private String  switchesControlSystem;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="created_by_username")
 
 private String  createdByUsername;

@Column(name="post_id")
 
 private String  postId;

@Column(name="created_timestamp")
 
 private timestamp without time zone  createdTimestamp;

@Column(name="updated_timestamp")
 
 private timestamp without time zone  updatedTimestamp;

@Column(name="edit_flag")
 
 private boolean  editFlag;

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

@Column(name="plis_id")
 
 private Integer  plisId;

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


    public Idc_power_station_lis_o(int lisid, int project_id, Object transformer_rating, Object transformer_type_of_cooling, Object switches_rating, double switches_no_of_panels, Object switches_control_system, boolean delete_flag, boolean is_latest, Object created_by_username, Object post_id, Object created_timestamp, Object updated_timestamp, boolean edit_flag, int old_unit_id, int old_circle_id, int old_division_id, int old_sub_division_id, int status_id, int lift_id, Object approved_by_username, Object approved_timestamp, Object approved_post_id, int plis_id, Object deleted_by, Object deleted_time, int unit_id, int circle_id, int division_id, int sub_division_id) {
        this.lisid = lisid;
        this.project_id = project_id;
        this.transformer_rating = transformer_rating;
        this.transformer_type_of_cooling = transformer_type_of_cooling;
        this.switches_rating = switches_rating;
        this.switches_no_of_panels = switches_no_of_panels;
        this.switches_control_system = switches_control_system;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.created_by_username = created_by_username;
        this.post_id = post_id;
        this.created_timestamp = created_timestamp;
        this.updated_timestamp = updated_timestamp;
        this.edit_flag = edit_flag;
        this.old_unit_id = old_unit_id;
        this.old_circle_id = old_circle_id;
        this.old_division_id = old_division_id;
        this.old_sub_division_id = old_sub_division_id;
        this.status_id = status_id;
        this.lift_id = lift_id;
        this.approved_by_username = approved_by_username;
        this.approved_timestamp = approved_timestamp;
        this.approved_post_id = approved_post_id;
        this.plis_id = plis_id;
        this.deleted_by = deleted_by;
        this.deleted_time = deleted_time;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
    }
}
