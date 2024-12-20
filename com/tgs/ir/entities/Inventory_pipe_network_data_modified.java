package com.tgs.ir.entities;

public class Inventory_pipe_network_data_modified {
@Column(name="pipe_id")
 
 private Integer  pipeId;

@Column(name="line_type")
 
 private Integer  lineType;

@Column(name="network_type")
 
 private String  networkType;

@Column(name="network_name")
 
 private String  networkName;

@Column(name="main")
 
 private String  main;

@Column(name="parent_id")
 
 private Integer  parentId;

@Column(name="material")
 
 private Integer  material;

@Column(name="from_length")
 
 private Double  fromLength;

@Column(name="to_length")
 
 private Double  toLength;

@Column(name="starting_location")
 
 private String  startingLocation;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="mandal_id")
 
 private Integer  mandalId;

@Column(name="village_id")
 
 private Integer  villageId;

@Column(name="or_su")
 
 private String  orSu;

@Column(name="required_discharge")
 
 private Double  requiredDischarge;

@Column(name="designed_discharge")
 
 private Double  designedDischarge;

@Column(name="pipe_dia")
 
 private Double  pipeDia;

@Column(name="pressure")
 
 private Double  pressure;

@Column(name="no_of_outlets")
 
 private Double  noOfOutlets;

@Column(name="zone_identity")
 
 private String  zoneIdentity;

@Column(name="zone_name")
 
 private String  zoneName;

@Column(name="pump_house_type")
 
 private String  pumpHouseType;

@Column(name="pump_house_location")
 
 private String  pumpHouseLocation;

@Column(name="motor_type")
 
 private String  motorType;

@Column(name="motor_rating")
 
 private Double  motorRating;

@Column(name="pipe_lvl_start")
 
 private Double  pipeLvlStart;

@Column(name="pipe_lvl_end")
 
 private Double  pipeLvlEnd;

@Column(name="discharge_start")
 
 private Double  dischargeStart;

@Column(name="discharge_end")
 
 private Double  dischargeEnd;

@Column(name="valve_type")
 
 private String  valveType;

@Column(name="control_location")
 
 private String  controlLocation;

@Column(name="structure_type")
 
 private String  structureType;

@Column(name="structure_location")
 
 private String  structureLocation;

@Column(name="localized_ayacut")
 
 private Double  localizedAyacut;

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


    public Inventory_pipe_network_data_modified(int pipe_id, int line_type, Object network_type, Object network_name, Object main, int parent_id, int material, double from_length, double to_length, Object starting_location, int district_id, int mandal_id, int village_id, Object or_su, double required_discharge, double designed_discharge, double pipe_dia, double pressure, double no_of_outlets, Object zone_identity, Object zone_name, Object pump_house_type, Object pump_house_location, Object motor_type, double motor_rating, double pipe_lvl_start, double pipe_lvl_end, double discharge_start, double discharge_end, Object valve_type, Object control_location, Object structure_type, Object structure_location, double localized_ayacut, boolean delete_flag, boolean is_latest, Object created_by_username, Object post_id, Object created_timestamp, int project_id, int old_unit_id, int old_circle_id, int old_division_id, int old_sub_division_id, int status_id, Object deleted_by, Object deleted_time, int unit_id, int circle_id, int division_id, int sub_division_id) {
        this.pipe_id = pipe_id;
        this.line_type = line_type;
        this.network_type = network_type;
        this.network_name = network_name;
        this.main = main;
        this.parent_id = parent_id;
        this.material = material;
        this.from_length = from_length;
        this.to_length = to_length;
        this.starting_location = starting_location;
        this.district_id = district_id;
        this.mandal_id = mandal_id;
        this.village_id = village_id;
        this.or_su = or_su;
        this.required_discharge = required_discharge;
        this.designed_discharge = designed_discharge;
        this.pipe_dia = pipe_dia;
        this.pressure = pressure;
        this.no_of_outlets = no_of_outlets;
        this.zone_identity = zone_identity;
        this.zone_name = zone_name;
        this.pump_house_type = pump_house_type;
        this.pump_house_location = pump_house_location;
        this.motor_type = motor_type;
        this.motor_rating = motor_rating;
        this.pipe_lvl_start = pipe_lvl_start;
        this.pipe_lvl_end = pipe_lvl_end;
        this.discharge_start = discharge_start;
        this.discharge_end = discharge_end;
        this.valve_type = valve_type;
        this.control_location = control_location;
        this.structure_type = structure_type;
        this.structure_location = structure_location;
        this.localized_ayacut = localized_ayacut;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.created_by_username = created_by_username;
        this.post_id = post_id;
        this.created_timestamp = created_timestamp;
        this.project_id = project_id;
        this.old_unit_id = old_unit_id;
        this.old_circle_id = old_circle_id;
        this.old_division_id = old_division_id;
        this.old_sub_division_id = old_sub_division_id;
        this.status_id = status_id;
        this.deleted_by = deleted_by;
        this.deleted_time = deleted_time;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
    }
}
