package com.tgs.ir.entities;

public class Hydro_mechanical_lis {
@Column(name="hydro_id")
 
 private Integer  hydroId;

@Column(name="pump_id")
 
 private Integer  pumpId;

@Column(name="suction_head")
 
 private String  suctionHead;

@Column(name="delivery_head")
 
 private String  deliveryHead;

@Column(name="total_lifting_head")
 
 private String  totalLiftingHead;

@Column(name="pump_impeller")
 
 private String  pumpImpeller;

@Column(name="shaft")
 
 private String  shaft;

@Column(name="pump_rating")
 
 private String  pumpRating;

@Column(name="guide_vanes")
 
 private String  guideVanes;

@Column(name="guide_vane_operating_ring")
 
 private String  guideVaneOperatingRing;

@Column(name="guide_vane_servo_motor")
 
 private String  guideVaneServoMotor;

@Column(name="casing_stay_column")
 
 private String  casingStayColumn;

@Column(name="liner_or_facing_plates")
 
 private String  linerOrFacingPlates;

@Column(name="guide_bearing")
 
 private String  guideBearing;

@Column(name="shaft_seal")
 
 private String  shaftSeal;

@Column(name="stay_ring")
 
 private String  stayRing;

@Column(name="spiral_casing")
 
 private String  spiralCasing;

@Column(name="outlet_pipe")
 
 private String  outletPipe;

@Column(name="pit_liner")
 
 private String  pitLiner;

@Column(name="draft_tube_liner")
 
 private String  draftTubeLiner;

@Column(name="pump_platform")
 
 private String  pumpPlatform;

@Column(name="walkway_and_railing")
 
 private String  walkwayAndRailing;

@Column(name="pump_make")
 
 private String  pumpMake;

@Column(name="pump_model_no")
 
 private String  pumpModelNo;

@Column(name="pump_year_of_manufacture")
 
 private Integer  pumpYearOfManufacture;

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

@Column(name="hopd_year_of_manufacture")
 
 private Integer  hopdYearOfManufacture;

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

@Column(name="eopd_year_of_manufacture")
 
 private Integer  eopdYearOfManufacture;

@Column(name="joint_type")
 
 private String  jointType;

@Column(name="joint_size")
 
 private String  jointSize;

@Column(name="joint_material")
 
 private String  jointMaterial;

@Column(name="joint_thickness")
 
 private String  jointThickness;

@Column(name="joint_compression_ratio")
 
 private String  jointCompressionRatio;

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


    public Hydro_mechanical_lis(int hydro_id, int pump_id, Object suction_head, Object delivery_head, Object total_lifting_head, Object pump_impeller, Object shaft, Object pump_rating, Object guide_vanes, Object guide_vane_operating_ring, Object guide_vane_servo_motor, Object casing_stay_column, Object liner_or_facing_plates, Object guide_bearing, Object shaft_seal, Object stay_ring, Object spiral_casing, Object outlet_pipe, Object pit_liner, Object draft_tube_liner, Object pump_platform, Object walkway_and_railing, Object pump_make, Object pump_model_no, int pump_year_of_manufacture, Object hopd_type, Object hopd_size, Object hopd_pressure, Object hopd_design_discharge, Object hopd_make, Object hopd_model_no, int hopd_year_of_manufacture, Object eopd_type, Object eopd_size, Object eopd_pressure, Object eopd_design_discharge, Object eopd_make, Object eopd_model_no, int eopd_year_of_manufacture, Object joint_type, Object joint_size, Object joint_material, Object joint_thickness, Object joint_compression_ratio, boolean delete_flag, boolean is_latest, Object created_timestamp, Object created_by_username, boolean edit_flag, Object updated_timestamp, Object post_id, int old_unit_id, int old_circle_id, int old_division_id, int old_sub_division_id, int status_id, int lift_id, int project_id, Object approved_by_username, Object approved_timestamp, Object approved_post_id, Object deleted_by, Object deleted_time, int unit_id, int circle_id, int division_id, int sub_division_id) {
        this.hydro_id = hydro_id;
        this.pump_id = pump_id;
        this.suction_head = suction_head;
        this.delivery_head = delivery_head;
        this.total_lifting_head = total_lifting_head;
        this.pump_impeller = pump_impeller;
        this.shaft = shaft;
        this.pump_rating = pump_rating;
        this.guide_vanes = guide_vanes;
        this.guide_vane_operating_ring = guide_vane_operating_ring;
        this.guide_vane_servo_motor = guide_vane_servo_motor;
        this.casing_stay_column = casing_stay_column;
        this.liner_or_facing_plates = liner_or_facing_plates;
        this.guide_bearing = guide_bearing;
        this.shaft_seal = shaft_seal;
        this.stay_ring = stay_ring;
        this.spiral_casing = spiral_casing;
        this.outlet_pipe = outlet_pipe;
        this.pit_liner = pit_liner;
        this.draft_tube_liner = draft_tube_liner;
        this.pump_platform = pump_platform;
        this.walkway_and_railing = walkway_and_railing;
        this.pump_make = pump_make;
        this.pump_model_no = pump_model_no;
        this.pump_year_of_manufacture = pump_year_of_manufacture;
        this.hopd_type = hopd_type;
        this.hopd_size = hopd_size;
        this.hopd_pressure = hopd_pressure;
        this.hopd_design_discharge = hopd_design_discharge;
        this.hopd_make = hopd_make;
        this.hopd_model_no = hopd_model_no;
        this.hopd_year_of_manufacture = hopd_year_of_manufacture;
        this.eopd_type = eopd_type;
        this.eopd_size = eopd_size;
        this.eopd_pressure = eopd_pressure;
        this.eopd_design_discharge = eopd_design_discharge;
        this.eopd_make = eopd_make;
        this.eopd_model_no = eopd_model_no;
        this.eopd_year_of_manufacture = eopd_year_of_manufacture;
        this.joint_type = joint_type;
        this.joint_size = joint_size;
        this.joint_material = joint_material;
        this.joint_thickness = joint_thickness;
        this.joint_compression_ratio = joint_compression_ratio;
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
        this.deleted_by = deleted_by;
        this.deleted_time = deleted_time;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
    }
}
