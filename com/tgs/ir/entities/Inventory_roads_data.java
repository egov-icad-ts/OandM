package com.tgs.ir.entities;

public class Inventory_roads_data {
@Column(name="road_id")
 
 private Integer  roadId;

@Column(name="road_name")
 
 private String  roadName;

@Column(name="road_length")
 
 private Double  roadLength;

@Column(name="road_type")
 
 private String  roadType;

@Column(name="no_of_lanes")
 
 private Integer  noOfLanes;

@Column(name="no_of_bridges")
 
 private Integer  noOfBridges;

@Column(name="no_of_culverts")
 
 private Integer  noOfCulverts;

@Column(name="no_of_causuways")
 
 private Integer  noOfCausuways;

@Column(name="others_structure")
 
 private Integer  othersStructure;

@Column(name="total_structures")
 
 private Integer  totalStructures;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="status_id")
 
 private Integer  statusId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="old_division_id")
 
 private Integer  oldDivisionId;

@Column(name="post_id")
 
 private String  postId;

@Column(name="old_unit_id")
 
 private Integer  oldUnitId;

@Column(name="old_circle_id")
 
 private Integer  oldCircleId;

@Column(name="old_sub_division_id")
 
 private Integer  oldSubDivisionId;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="mandal_id")
 
 private Integer  mandalId;

@Column(name="village_id")
 
 private Integer  villageId;

@Column(name="created_userid")
 
 private String  createdUserid;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="created_timestamp")
 
 private timestamp without time zone  createdTimestamp;

@Column(name="edit_flag")
 
 private boolean  editFlag;

@Column(name="updated_timestamp")
 
 private timestamp without time zone  updatedTimestamp;

@Column(name="reference_appr_id")
 
 private Integer  referenceApprId;

@Column(name="deleted_by")
 
 private String  deletedBy;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="sub_division_id")
 
 private Integer  subDivisionId;

@Column(name="deleted_timestamp")
 
 private timestamp without time zone  deletedTimestamp;

@Column(name="updated_by")
 
 private String  updatedBy;


    public Inventory_roads_data(int road_id, Object road_name, double road_length, Object road_type, int no_of_lanes, int no_of_bridges, int no_of_culverts, int no_of_causuways, int others_structure, int total_structures, Object remarks, int status_id, int project_id, int old_division_id, Object post_id, int old_unit_id, int old_circle_id, int old_sub_division_id, int district_id, int mandal_id, int village_id, Object created_userid, boolean delete_flag, boolean is_latest, Object created_timestamp, boolean edit_flag, Object updated_timestamp, int reference_appr_id, Object deleted_by, int unit_id, int circle_id, int division_id, int sub_division_id, Object deleted_timestamp, Object updated_by) {
        this.road_id = road_id;
        this.road_name = road_name;
        this.road_length = road_length;
        this.road_type = road_type;
        this.no_of_lanes = no_of_lanes;
        this.no_of_bridges = no_of_bridges;
        this.no_of_culverts = no_of_culverts;
        this.no_of_causuways = no_of_causuways;
        this.others_structure = others_structure;
        this.total_structures = total_structures;
        this.remarks = remarks;
        this.status_id = status_id;
        this.project_id = project_id;
        this.old_division_id = old_division_id;
        this.post_id = post_id;
        this.old_unit_id = old_unit_id;
        this.old_circle_id = old_circle_id;
        this.old_sub_division_id = old_sub_division_id;
        this.district_id = district_id;
        this.mandal_id = mandal_id;
        this.village_id = village_id;
        this.created_userid = created_userid;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.created_timestamp = created_timestamp;
        this.edit_flag = edit_flag;
        this.updated_timestamp = updated_timestamp;
        this.reference_appr_id = reference_appr_id;
        this.deleted_by = deleted_by;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
        this.deleted_timestamp = deleted_timestamp;
        this.updated_by = updated_by;
    }
}
