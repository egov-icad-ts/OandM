package com.tgs.ir.entities;

public class Inventory_dam_gate_data {
@Column(name="dam_id")
 
 private Integer  damId;

@Column(name="gate_top_level")
 
 private Double  gateTopLevel;

@Column(name="gate_bottom_level")
 
 private Double  gateBottomLevel;

@Column(name="no_of_crest_gate")
 
 private Integer  noOfCrestGate;

@Column(name="type_of_crest_gate")
 
 private String  typeOfCrestGate;

@Column(name="size_of_crest_gate")
 
 private String  sizeOfCrestGate;

@Column(name="crest_max_discharge")
 
 private Double  crestMaxDischarge;

@Column(name="no_of_chute_sluice")
 
 private Integer  noOfChuteSluice;

@Column(name="no_of_sluice_vents")
 
 private Integer  noOfSluiceVents;

@Column(name="sluice_vent_size")
 
 private String  sluiceVentSize;

@Column(name="sluice_max_discharge")
 
 private Double  sluiceMaxDischarge;

@Column(name="right_canal_no_of_vents")
 
 private Integer  rightCanalNoOfVents;

@Column(name="right_canal_vent_size")
 
 private String  rightCanalVentSize;

@Column(name="right_canal_max_discharge")
 
 private Double  rightCanalMaxDischarge;

@Column(name="left_canal_no_of_vents")
 
 private Integer  leftCanalNoOfVents;

@Column(name="left_canal_vent_size")
 
 private String  leftCanalVentSize;

@Column(name="left_canal_max_discharge")
 
 private Double  leftCanalMaxDischarge;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="created_by_username")
 
 private String  createdByUsername;

@Column(name="created_timestamp")
 
 private timestamp without time zone  createdTimestamp;

@Column(name="post_id")
 
 private String  postId;

@Column(name="edit_flag")
 
 private boolean  editFlag;

@Column(name="updated_timestamp")
 
 private timestamp without time zone  updatedTimestamp;

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

@Column(name="reservoir_id")
 
 private Integer  reservoirId;

@Column(name="approved_username")
 
 private String  approvedUsername;

@Column(name="deleted_by")
 
 private String  deletedBy;

@Column(name="deleted_time")
 
 private timestamp without time zone  deletedTime;

@Column(name="gate_operation_mode")
 
 private String  gateOperationMode;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="sub_division_id")
 
 private Integer  subDivisionId;

@Column(name="river_scour_sluice_no_of_vents")
 
 private Integer  riverScourSluiceNoOfVents;

@Column(name="river_scour_sluice_vents_size")
 
 private String  riverScourSluiceVentsSize;

@Column(name="river_scour_sluice_discharge")
 
 private Double  riverScourSluiceDischarge;


    public Inventory_dam_gate_data(int dam_id, double gate_top_level, double gate_bottom_level, int no_of_crest_gate, Object type_of_crest_gate, Object size_of_crest_gate, double crest_max_discharge, int no_of_chute_sluice, int no_of_sluice_vents, Object sluice_vent_size, double sluice_max_discharge, int right_canal_no_of_vents, Object right_canal_vent_size, double right_canal_max_discharge, int left_canal_no_of_vents, Object left_canal_vent_size, double left_canal_max_discharge, int project_id, boolean delete_flag, boolean is_latest, Object created_by_username, Object created_timestamp, Object post_id, boolean edit_flag, Object updated_timestamp, int old_unit_id, int old_circle_id, int old_division_id, int old_sub_division_id, int status_id, int reservoir_id, Object approved_username, Object deleted_by, Object deleted_time, Object gate_operation_mode, int unit_id, int circle_id, int division_id, int sub_division_id, int river_scour_sluice_no_of_vents, Object river_scour_sluice_vents_size, double river_scour_sluice_discharge) {
        this.dam_id = dam_id;
        this.gate_top_level = gate_top_level;
        this.gate_bottom_level = gate_bottom_level;
        this.no_of_crest_gate = no_of_crest_gate;
        this.type_of_crest_gate = type_of_crest_gate;
        this.size_of_crest_gate = size_of_crest_gate;
        this.crest_max_discharge = crest_max_discharge;
        this.no_of_chute_sluice = no_of_chute_sluice;
        this.no_of_sluice_vents = no_of_sluice_vents;
        this.sluice_vent_size = sluice_vent_size;
        this.sluice_max_discharge = sluice_max_discharge;
        this.right_canal_no_of_vents = right_canal_no_of_vents;
        this.right_canal_vent_size = right_canal_vent_size;
        this.right_canal_max_discharge = right_canal_max_discharge;
        this.left_canal_no_of_vents = left_canal_no_of_vents;
        this.left_canal_vent_size = left_canal_vent_size;
        this.left_canal_max_discharge = left_canal_max_discharge;
        this.project_id = project_id;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.created_by_username = created_by_username;
        this.created_timestamp = created_timestamp;
        this.post_id = post_id;
        this.edit_flag = edit_flag;
        this.updated_timestamp = updated_timestamp;
        this.old_unit_id = old_unit_id;
        this.old_circle_id = old_circle_id;
        this.old_division_id = old_division_id;
        this.old_sub_division_id = old_sub_division_id;
        this.status_id = status_id;
        this.reservoir_id = reservoir_id;
        this.approved_username = approved_username;
        this.deleted_by = deleted_by;
        this.deleted_time = deleted_time;
        this.gate_operation_mode = gate_operation_mode;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
        this.river_scour_sluice_no_of_vents = river_scour_sluice_no_of_vents;
        this.river_scour_sluice_vents_size = river_scour_sluice_vents_size;
        this.river_scour_sluice_discharge = river_scour_sluice_discharge;
    }
}
