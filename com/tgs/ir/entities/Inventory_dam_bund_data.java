package com.tgs.ir.entities;

public class Inventory_dam_bund_data {
@Column(name="dam_id")
 
 private Integer  damId;

@Column(name="no_of_diversion_tunnel")
 
 private Integer  noOfDiversionTunnel;

@Column(name="tunnel_diameter")
 
 private Double  tunnelDiameter;

@Column(name="regulator_infall")
 
 private Double  regulatorInfall;

@Column(name="regulator_outfall")
 
 private Double  regulatorOutfall;

@Column(name="no_of_vents")
 
 private Integer  noOfVents;

@Column(name="vent_size")
 
 private String  ventSize;

@Column(name="max_discharge")
 
 private Double  maxDischarge;

@Column(name="earthdam_type")
 
 private String  earthdamType;

@Column(name="left_earthdam_length")
 
 private Double  leftEarthdamLength;

@Column(name="left_earthdam_maxht")
 
 private Double  leftEarthdamMaxht;

@Column(name="left_earthdam_topwidth")
 
 private Double  leftEarthdamTopwidth;

@Column(name="left_earthdam_toplvl")
 
 private Double  leftEarthdamToplvl;

@Column(name="left_earthdam_up_slope")
 
 private String  leftEarthdamUpSlope;

@Column(name="left_earthdam_down_slope")
 
 private String  leftEarthdamDownSlope;

@Column(name="right_earthdam_length")
 
 private Double  rightEarthdamLength;

@Column(name="right_earthdam_maxht")
 
 private Double  rightEarthdamMaxht;

@Column(name="right_earthdam_topwidth")
 
 private Double  rightEarthdamTopwidth;

@Column(name="right_earthdam_toplvl")
 
 private Double  rightEarthdamToplvl;

@Column(name="right_earthdam_up_slope")
 
 private String  rightEarthdamUpSlope;

@Column(name="right_earthdam_down_slope")
 
 private String  rightEarthdamDownSlope;

@Column(name="total_length")
 
 private Double  totalLength;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="created_by_username")
 
 private String  createdByUsername;

@Column(name="post_id")
 
 private String  postId;

@Column(name="project_id")
 
 private String  projectId;

@Column(name="created_timestamp")
 
 private timestamp without time zone  createdTimestamp;

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

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="sub_division_id")
 
 private Integer  subDivisionId;


    public Inventory_dam_bund_data(int dam_id, int no_of_diversion_tunnel, double tunnel_diameter, double regulator_infall, double regulator_outfall, int no_of_vents, Object vent_size, double max_discharge, Object earthdam_type, double left_earthdam_length, double left_earthdam_maxht, double left_earthdam_topwidth, double left_earthdam_toplvl, Object left_earthdam_up_slope, Object left_earthdam_down_slope, double right_earthdam_length, double right_earthdam_maxht, double right_earthdam_topwidth, double right_earthdam_toplvl, Object right_earthdam_up_slope, Object right_earthdam_down_slope, double total_length, boolean delete_flag, boolean is_latest, Object created_by_username, Object post_id, Object project_id, Object created_timestamp, boolean edit_flag, Object updated_timestamp, int old_unit_id, int old_circle_id, int old_division_id, int old_sub_division_id, int status_id, int reservoir_id, Object approved_username, Object deleted_by, Object deleted_time, int unit_id, int circle_id, int division_id, int sub_division_id) {
        this.dam_id = dam_id;
        this.no_of_diversion_tunnel = no_of_diversion_tunnel;
        this.tunnel_diameter = tunnel_diameter;
        this.regulator_infall = regulator_infall;
        this.regulator_outfall = regulator_outfall;
        this.no_of_vents = no_of_vents;
        this.vent_size = vent_size;
        this.max_discharge = max_discharge;
        this.earthdam_type = earthdam_type;
        this.left_earthdam_length = left_earthdam_length;
        this.left_earthdam_maxht = left_earthdam_maxht;
        this.left_earthdam_topwidth = left_earthdam_topwidth;
        this.left_earthdam_toplvl = left_earthdam_toplvl;
        this.left_earthdam_up_slope = left_earthdam_up_slope;
        this.left_earthdam_down_slope = left_earthdam_down_slope;
        this.right_earthdam_length = right_earthdam_length;
        this.right_earthdam_maxht = right_earthdam_maxht;
        this.right_earthdam_topwidth = right_earthdam_topwidth;
        this.right_earthdam_toplvl = right_earthdam_toplvl;
        this.right_earthdam_up_slope = right_earthdam_up_slope;
        this.right_earthdam_down_slope = right_earthdam_down_slope;
        this.total_length = total_length;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.created_by_username = created_by_username;
        this.post_id = post_id;
        this.project_id = project_id;
        this.created_timestamp = created_timestamp;
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
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
    }
}
