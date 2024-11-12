package com.tgs.ir.entities;

public class Inventory_buildings_data {
@Column(name="building_id")
 
 private Integer  buildingId;

@Column(name="building_name")
 
 private String  buildingName;

@Column(name="building_type")
 
 private Integer  buildingType;

@Column(name="plinth_area")
 
 private Double  plinthArea;

@Column(name="plot_area")
 
 private Double  plotArea;

@Column(name="year_of_construction")
 
 private Integer  yearOfConstruction;

@Column(name="book_value")
 
 private Double  bookValue;

@Column(name="condition_of_building")
 
 private String  conditionOfBuilding;

@Column(name="alloted_to")
 
 private String  allotedTo;

@Column(name="order_no")
 
 private String  orderNo;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="created_userid")
 
 private String  createdUserid;

@Column(name="created_timestamp")
 
 private timestamp without time zone  createdTimestamp;

@Column(name="edit_flag")
 
 private boolean  editFlag;

@Column(name="updated_timestamp")
 
 private timestamp without time zone  updatedTimestamp;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="old_division_id")
 
 private Integer  oldDivisionId;

@Column(name="post_id")
 
 private String  postId;

@Column(name="no_of_buildings")
 
 private Integer  noOfBuildings;

@Column(name="old_unit_id")
 
 private Integer  oldUnitId;

@Column(name="old_circle_id")
 
 private Integer  oldCircleId;

@Column(name="old_sub_division_id")
 
 private Integer  oldSubDivisionId;

@Column(name="build_type_id")
 
 private Integer  buildTypeId;

@Column(name="no_of_floors")
 
 private Integer  noOfFloors;

@Column(name="status_id")
 
 private Integer  statusId;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="mandal_id")
 
 private Integer  mandalId;

@Column(name="village_id")
 
 private Integer  villageId;

@Column(name="file_path")
 
 private String  filePath;

@Column(name="reference_appr_id")
 
 private Integer  referenceApprId;

@Column(name="deleted_by")
 
 private String  deletedBy;

@Column(name="deleted_time")
 
 private timestamp with time zone  deletedTime;

@Column(name="house_no")
 
 private String  houseNo;

@Column(name="lat_d")
 
 private Integer  latD;

@Column(name="lat_m")
 
 private Integer  latM;

@Column(name="lat_s")
 
 private Double  latS;

@Column(name="lon_d")
 
 private Integer  lonD;

@Column(name="lon_m")
 
 private Integer  lonM;

@Column(name="lon_s")
 
 private Double  lonS;

@Column(name="survey_number")
 
 private String  surveyNumber;

@Column(name="extent_acres")
 
 private Double  extentAcres;

@Column(name="extent_guntas")
 
 private Double  extentGuntas;

@Column(name="town_survey_number")
 
 private String  townSurveyNumber;

@Column(name="occupant_status")
 
 private String  occupantStatus;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="sub_division_id")
 
 private Integer  subDivisionId;

@Column(name="no_of_rooms")
 
 private Integer  noOfRooms;

@Column(name="build_maintenance")
 
 private Integer  buildMaintenance;

@Column(name="reason")
 
 private String  reason;


    public Inventory_buildings_data(int building_id, Object building_name, int building_type, double plinth_area, double plot_area, int year_of_construction, double book_value, Object condition_of_building, Object alloted_to, Object order_no, Object remarks, boolean delete_flag, boolean is_latest, Object created_userid, Object created_timestamp, boolean edit_flag, Object updated_timestamp, int project_id, int old_division_id, Object post_id, int no_of_buildings, int old_unit_id, int old_circle_id, int old_sub_division_id, int build_type_id, int no_of_floors, int status_id, int district_id, int mandal_id, int village_id, Object file_path, int reference_appr_id, Object deleted_by, Object deleted_time, Object house_no, int lat_d, int lat_m, double lat_s, int lon_d, int lon_m, double lon_s, Object survey_number, double extent_acres, double extent_guntas, Object town_survey_number, Object occupant_status, int unit_id, int circle_id, int division_id, int sub_division_id, int no_of_rooms, int build_maintenance, Object reason) {
        this.building_id = building_id;
        this.building_name = building_name;
        this.building_type = building_type;
        this.plinth_area = plinth_area;
        this.plot_area = plot_area;
        this.year_of_construction = year_of_construction;
        this.book_value = book_value;
        this.condition_of_building = condition_of_building;
        this.alloted_to = alloted_to;
        this.order_no = order_no;
        this.remarks = remarks;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.created_userid = created_userid;
        this.created_timestamp = created_timestamp;
        this.edit_flag = edit_flag;
        this.updated_timestamp = updated_timestamp;
        this.project_id = project_id;
        this.old_division_id = old_division_id;
        this.post_id = post_id;
        this.no_of_buildings = no_of_buildings;
        this.old_unit_id = old_unit_id;
        this.old_circle_id = old_circle_id;
        this.old_sub_division_id = old_sub_division_id;
        this.build_type_id = build_type_id;
        this.no_of_floors = no_of_floors;
        this.status_id = status_id;
        this.district_id = district_id;
        this.mandal_id = mandal_id;
        this.village_id = village_id;
        this.file_path = file_path;
        this.reference_appr_id = reference_appr_id;
        this.deleted_by = deleted_by;
        this.deleted_time = deleted_time;
        this.house_no = house_no;
        this.lat_d = lat_d;
        this.lat_m = lat_m;
        this.lat_s = lat_s;
        this.lon_d = lon_d;
        this.lon_m = lon_m;
        this.lon_s = lon_s;
        this.survey_number = survey_number;
        this.extent_acres = extent_acres;
        this.extent_guntas = extent_guntas;
        this.town_survey_number = town_survey_number;
        this.occupant_status = occupant_status;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
        this.no_of_rooms = no_of_rooms;
        this.build_maintenance = build_maintenance;
        this.reason = reason;
    }
}
