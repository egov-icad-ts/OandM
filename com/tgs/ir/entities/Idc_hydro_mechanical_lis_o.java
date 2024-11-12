package com.tgs.ir.entities;

public class Idc_hydro_mechanical_lis_o {
@Column(name="hydro_id")
 
 private Integer  hydroId;

@Column(name="pump_id")
 
 private Integer  pumpId;

@Column(name="pump_rating")
 
 private String  pumpRating;

@Column(name="hopd_type")
 
 private String  hopdType;

@Column(name="hopd_size")
 
 private String  hopdSize;

@Column(name="hopd_pressure")
 
 private String  hopdPressure;

@Column(name="hopd_design_discharge")
 
 private String  hopdDesignDischarge;

@Column(name="hopd_make")
 
 private String  hopdMake;

@Column(name="hopd_model_no")
 
 private String  hopdModelNo;

@Column(name="eopd_type")
 
 private String  eopdType;

@Column(name="eopd_size")
 
 private String  eopdSize;

@Column(name="eopd_pressure")
 
 private String  eopdPressure;

@Column(name="eopd_design_discharge")
 
 private String  eopdDesignDischarge;

@Column(name="eopd_make")
 
 private String  eopdMake;

@Column(name="eopd_model_no")
 
 private String  eopdModelNo;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="created_timestamp")
 
 private timestamp without time zone  createdTimestamp;

@Column(name="created_by_username")
 
 private String  createdByUsername;

@Column(name="edit_flag")
 
 private boolean  editFlag;

@Column(name="updated_timestamp")
 
 private timestamp without time zone  updatedTimestamp;

@Column(name="post_id")
 
 private String  postId;

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

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="approved_by_username")
 
 private String  approvedByUsername;

@Column(name="approved_timestamp")
 
 private timestamp without time zone  approvedTimestamp;

@Column(name="approved_post_id")
 
 private String  approvedPostId;

@Column(name="bhydro_id")
 
 private Integer  bhydroId;

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


    public Idc_hydro_mechanical_lis_o(int hydro_id, int pump_id, Object pump_rating, Object hopd_type, Object hopd_size, Object hopd_pressure, Object hopd_design_discharge, Object hopd_make, Object hopd_model_no, Object eopd_type, Object eopd_size, Object eopd_pressure, Object eopd_design_discharge, Object eopd_make, Object eopd_model_no, boolean delete_flag, boolean is_latest, Object created_timestamp, Object created_by_username, boolean edit_flag, Object updated_timestamp, Object post_id, int old_unit_id, int old_circle_id, int old_division_id, int old_sub_division_id, int status_id, int lift_id, int project_id, Object approved_by_username, Object approved_timestamp, Object approved_post_id, int bhydro_id, Object deleted_by, Object deleted_time, int unit_id, int circle_id, int division_id, int sub_division_id) {
        this.hydro_id = hydro_id;
        this.pump_id = pump_id;
        this.pump_rating = pump_rating;
        this.hopd_type = hopd_type;
        this.hopd_size = hopd_size;
        this.hopd_pressure = hopd_pressure;
        this.hopd_design_discharge = hopd_design_discharge;
        this.hopd_make = hopd_make;
        this.hopd_model_no = hopd_model_no;
        this.eopd_type = eopd_type;
        this.eopd_size = eopd_size;
        this.eopd_pressure = eopd_pressure;
        this.eopd_design_discharge = eopd_design_discharge;
        this.eopd_make = eopd_make;
        this.eopd_model_no = eopd_model_no;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.created_timestamp = created_timestamp;
        this.created_by_username = created_by_username;
        this.edit_flag = edit_flag;
        this.updated_timestamp = updated_timestamp;
        this.post_id = post_id;
        this.old_unit_id = old_unit_id;
        this.old_circle_id = old_circle_id;
        this.old_division_id = old_division_id;
        this.old_sub_division_id = old_sub_division_id;
        this.status_id = status_id;
        this.lift_id = lift_id;
        this.project_id = project_id;
        this.approved_by_username = approved_by_username;
        this.approved_timestamp = approved_timestamp;
        this.approved_post_id = approved_post_id;
        this.bhydro_id = bhydro_id;
        this.deleted_by = deleted_by;
        this.deleted_time = deleted_time;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
    }
}
