package com.tgs.ir.entities;

public class Inventory_dam_basic_data {
@Column(name="dam_id")
 
 private Integer  damId;

@Column(name="type_of_spillway")
 
 private String  typeOfSpillway;

@Column(name="over_flow_section_length")
 
 private Double  overFlowSectionLength;

@Column(name="nonover_flow_section_length")
 
 private Double  nonoverFlowSectionLength;

@Column(name="dam_length")
 
 private Double  damLength;

@Column(name="max_dam_height_above_deepest_foundation")
 
 private Double  maxDamHeightAboveDeepestFoundation;

@Column(name="dam_top_width")
 
 private Double  damTopWidth;

@Column(name="dam_top_level")
 
 private Double  damTopLevel;

@Column(name="overall_width_roadway_top")
 
 private Double  overallWidthRoadwayTop;

@Column(name="deepest_foudation_level")
 
 private Double  deepestFoudationLevel;

@Column(name="max_basewidth_dam")
 
 private Double  maxBasewidthDam;

@Column(name="average_river_bedlvl")
 
 private Double  averageRiverBedlvl;

@Column(name="spillway_crest_level")
 
 private Double  spillwayCrestLevel;

@Column(name="top_level_crestgates")
 
 private Double  topLevelCrestgates;

@Column(name="invert_level_flipbucket")
 
 private Double  invertLevelFlipbucket;

@Column(name="stilling_basin")
 
 private Integer  stillingBasin;

@Column(name="clear_width_bridge")
 
 private Double  clearWidthBridge;

@Column(name="energy_dissipator_block")
 
 private String  energyDissipatorBlock;

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

@Column(name="edit_flag")
 
 private boolean  editFlag;

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


    public Inventory_dam_basic_data(int dam_id, Object type_of_spillway, double over_flow_section_length, double nonover_flow_section_length, double dam_length, double max_dam_height_above_deepest_foundation, double dam_top_width, double dam_top_level, double overall_width_roadway_top, double deepest_foudation_level, double max_basewidth_dam, double average_river_bedlvl, double spillway_crest_level, double top_level_crestgates, double invert_level_flipbucket, int stilling_basin, double clear_width_bridge, Object energy_dissipator_block, boolean delete_flag, boolean is_latest, Object created_by_username, Object post_id, Object created_timestamp, boolean edit_flag, Object updated_timestamp, int project_id, int old_unit_id, int old_circle_id, int old_division_id, int old_sub_division_id, int status_id, int reservoir_id, Object approved_username, Object deleted_by, Object deleted_time, int unit_id, int circle_id, int division_id, int sub_division_id) {
        this.dam_id = dam_id;
        this.type_of_spillway = type_of_spillway;
        this.over_flow_section_length = over_flow_section_length;
        this.nonover_flow_section_length = nonover_flow_section_length;
        this.dam_length = dam_length;
        this.max_dam_height_above_deepest_foundation = max_dam_height_above_deepest_foundation;
        this.dam_top_width = dam_top_width;
        this.dam_top_level = dam_top_level;
        this.overall_width_roadway_top = overall_width_roadway_top;
        this.deepest_foudation_level = deepest_foudation_level;
        this.max_basewidth_dam = max_basewidth_dam;
        this.average_river_bedlvl = average_river_bedlvl;
        this.spillway_crest_level = spillway_crest_level;
        this.top_level_crestgates = top_level_crestgates;
        this.invert_level_flipbucket = invert_level_flipbucket;
        this.stilling_basin = stilling_basin;
        this.clear_width_bridge = clear_width_bridge;
        this.energy_dissipator_block = energy_dissipator_block;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.created_by_username = created_by_username;
        this.post_id = post_id;
        this.created_timestamp = created_timestamp;
        this.edit_flag = edit_flag;
        this.updated_timestamp = updated_timestamp;
        this.project_id = project_id;
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
