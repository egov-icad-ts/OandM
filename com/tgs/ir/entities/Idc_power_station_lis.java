package com.tgs.ir.entities;

public class Idc_power_station_lis {
@Column(name="lisid")
 
 private Integer  lisid;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="method_of_connection")
 
 private String  methodOfConnection;

@Column(name="emulation_system")
 
 private String  emulationSystem;

@Column(name="uat_rating")
 
 private String  uatRating;

@Column(name="uat_type_of_cooling")
 
 private String  uatTypeOfCooling;

@Column(name="substation_rating")
 
 private String  substationRating;

@Column(name="substation_voltage")
 
 private String  substationVoltage;

@Column(name="substaion_buscurrent")
 
 private String  substaionBuscurrent;

@Column(name="substation_ct")
 
 private String  substationCt;

@Column(name="substation_pt")
 
 private String  substationPt;

@Column(name="substation_break")
 
 private String  substationBreak;

@Column(name="substation_isolates")
 
 private String  substationIsolates;

@Column(name="dc_batteries")
 
 private String  dcBatteries;

@Column(name="dc_rating")
 
 private String  dcRating;

@Column(name="dc_type")
 
 private String  dcType;

@Column(name="dc_batterychages")
 
 private String  dcBatterychages;

@Column(name="dcdb")
 
 private String  dcdb;

@Column(name="ups_rating")
 
 private String  upsRating;

@Column(name="ups_backup_time")
 
 private String  upsBackupTime;

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


    public Idc_power_station_lis(int lisid, int project_id, Object method_of_connection, Object emulation_system, Object uat_rating, Object uat_type_of_cooling, Object substation_rating, Object substation_voltage, Object substaion_buscurrent, Object substation_ct, Object substation_pt, Object substation_break, Object substation_isolates, Object dc_batteries, Object dc_rating, Object dc_type, Object dc_batterychages, Object dcdb, Object ups_rating, Object ups_backup_time, boolean delete_flag, boolean is_latest, Object created_by_username, Object post_id, Object created_timestamp, Object updated_timestamp, boolean edit_flag, int old_unit_id, int old_circle_id, int old_division_id, int old_sub_division_id, int status_id, int lift_id, Object approved_by_username, Object approved_timestamp, Object approved_post_id, Object deleted_by, Object deleted_time, int unit_id, int circle_id, int division_id, int sub_division_id) {
        this.lisid = lisid;
        this.project_id = project_id;
        this.method_of_connection = method_of_connection;
        this.emulation_system = emulation_system;
        this.uat_rating = uat_rating;
        this.uat_type_of_cooling = uat_type_of_cooling;
        this.substation_rating = substation_rating;
        this.substation_voltage = substation_voltage;
        this.substaion_buscurrent = substaion_buscurrent;
        this.substation_ct = substation_ct;
        this.substation_pt = substation_pt;
        this.substation_break = substation_break;
        this.substation_isolates = substation_isolates;
        this.dc_batteries = dc_batteries;
        this.dc_rating = dc_rating;
        this.dc_type = dc_type;
        this.dc_batterychages = dc_batterychages;
        this.dcdb = dcdb;
        this.ups_rating = ups_rating;
        this.ups_backup_time = ups_backup_time;
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
        this.deleted_by = deleted_by;
        this.deleted_time = deleted_time;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
    }
}
