package com.tgs.ir.entities;

public class Idc_motor_inventory_mst {
@Column(name="motor_inv_id")
 
 private Integer  motorInvId;

@Column(name="motor_type_id")
 
 private Integer  motorTypeId;

@Column(name="no_of_motors")
 
 private Integer  noOfMotors;

@Column(name="no_of_phases")
 
 private Integer  noOfPhases;

@Column(name="stator_type")
 
 private String  statorType;

@Column(name="stator_rating")
 
 private String  statorRating;

@Column(name="stator_coolling_type")
 
 private String  statorCoollingType;

@Column(name="stator_make")
 
 private String  statorMake;

@Column(name="stator_model_no")
 
 private String  statorModelNo;

@Column(name="stator_year_of_mfg")
 
 private Integer  statorYearOfMfg;

@Column(name="rotor_no_of_poles")
 
 private Integer  rotorNoOfPoles;

@Column(name="rotor_rating")
 
 private String  rotorRating;

@Column(name="rotor_rpm")
 
 private String  rotorRpm;

@Column(name="rotor_winding")
 
 private String  rotorWinding;

@Column(name="rotor_make")
 
 private String  rotorMake;

@Column(name="rotor_model_no")
 
 private String  rotorModelNo;

@Column(name="rotor_year_of_mfg")
 
 private Integer  rotorYearOfMfg;

@Column(name="shaft_type")
 
 private String  shaftType;

@Column(name="shaft_size")
 
 private String  shaftSize;

@Column(name="shaft_material")
 
 private String  shaftMaterial;

@Column(name="auxilary_shaft_size")
 
 private String  auxilaryShaftSize;

@Column(name="auxilary_shaft_material")
 
 private String  auxilaryShaftMaterial;

@Column(name="auxilary_shaft_slip_rings")
 
 private String  auxilaryShaftSlipRings;

@Column(name="type_of_bearing")
 
 private String  typeOfBearing;

@Column(name="bearing_type")
 
 private String  bearingType;

@Column(name="bearing_oils")
 
 private String  bearingOils;

@Column(name="hs_lubrication_system")
 
 private String  hsLubricationSystem;

@Column(name="breaks_jacks")
 
 private String  breaksJacks;

@Column(name="break_dust_collector")
 
 private String  breakDustCollector;

@Column(name="bearing_make_id")
 
 private Integer  bearingMakeId;

@Column(name="bearing_make")
 
 private String  bearingMake;

@Column(name="bearing_model_no")
 
 private String  bearingModelNo;

@Column(name="bearing_year_of_mfg")
 
 private Integer  bearingYearOfMfg;

@Column(name="updated_by_user")
 
 private String  updatedByUser;

@Column(name="created_time")
 
 private timestamp without time zone  createdTime;

@Column(name="updated_time")
 
 private timestamp without time zone  updatedTime;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

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

@Column(name="post_id")
 
 private String  postId;

@Column(name="lift_id")
 
 private Integer  liftId;

@Column(name="approved_by_user")
 
 private String  approvedByUser;

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


    public Idc_motor_inventory_mst(int motor_inv_id, int motor_type_id, int no_of_motors, int no_of_phases, Object stator_type, Object stator_rating, Object stator_coolling_type, Object stator_make, Object stator_model_no, int stator_year_of_mfg, int rotor_no_of_poles, Object rotor_rating, Object rotor_rpm, Object rotor_winding, Object rotor_make, Object rotor_model_no, int rotor_year_of_mfg, Object shaft_type, Object shaft_size, Object shaft_material, Object auxilary_shaft_size, Object auxilary_shaft_material, Object auxilary_shaft_slip_rings, Object type_of_bearing, Object bearing_type, Object bearing_oils, Object hs_lubrication_system, Object breaks_jacks, Object break_dust_collector, int bearing_make_id, Object bearing_make, Object bearing_model_no, int bearing_year_of_mfg, Object updated_by_user, Object created_time, Object updated_time, boolean delete_flag, boolean is_latest, int project_id, int old_unit_id, int old_circle_id, int old_division_id, int old_sub_division_id, int status_id, Object post_id, int lift_id, Object approved_by_user, Object approved_timestamp, Object approved_post_id, Object deleted_by, Object deleted_time, int unit_id, int circle_id, int division_id, int sub_division_id) {
        this.motor_inv_id = motor_inv_id;
        this.motor_type_id = motor_type_id;
        this.no_of_motors = no_of_motors;
        this.no_of_phases = no_of_phases;
        this.stator_type = stator_type;
        this.stator_rating = stator_rating;
        this.stator_coolling_type = stator_coolling_type;
        this.stator_make = stator_make;
        this.stator_model_no = stator_model_no;
        this.stator_year_of_mfg = stator_year_of_mfg;
        this.rotor_no_of_poles = rotor_no_of_poles;
        this.rotor_rating = rotor_rating;
        this.rotor_rpm = rotor_rpm;
        this.rotor_winding = rotor_winding;
        this.rotor_make = rotor_make;
        this.rotor_model_no = rotor_model_no;
        this.rotor_year_of_mfg = rotor_year_of_mfg;
        this.shaft_type = shaft_type;
        this.shaft_size = shaft_size;
        this.shaft_material = shaft_material;
        this.auxilary_shaft_size = auxilary_shaft_size;
        this.auxilary_shaft_material = auxilary_shaft_material;
        this.auxilary_shaft_slip_rings = auxilary_shaft_slip_rings;
        this.type_of_bearing = type_of_bearing;
        this.bearing_type = bearing_type;
        this.bearing_oils = bearing_oils;
        this.hs_lubrication_system = hs_lubrication_system;
        this.breaks_jacks = breaks_jacks;
        this.break_dust_collector = break_dust_collector;
        this.bearing_make_id = bearing_make_id;
        this.bearing_make = bearing_make;
        this.bearing_model_no = bearing_model_no;
        this.bearing_year_of_mfg = bearing_year_of_mfg;
        this.updated_by_user = updated_by_user;
        this.created_time = created_time;
        this.updated_time = updated_time;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.project_id = project_id;
        this.old_unit_id = old_unit_id;
        this.old_circle_id = old_circle_id;
        this.old_division_id = old_division_id;
        this.old_sub_division_id = old_sub_division_id;
        this.status_id = status_id;
        this.post_id = post_id;
        this.lift_id = lift_id;
        this.approved_by_user = approved_by_user;
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
