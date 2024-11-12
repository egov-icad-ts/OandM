package com.tgs.ir.entities;

public class Inv_reservoir_basic_data {
@Column(name="res_id")
 
 private Integer  resId;

@Column(name="res_name")
 
 private String  resName;

@Column(name="res_latitude")
 
 private String  resLatitude;

@Column(name="res_longitude")
 
 private String  resLongitude;

@Column(name="res_status_id")
 
 private Integer  resStatusId;

@Column(name="river_basin")
 
 private Integer  riverBasin;

@Column(name="sub_basin")
 
 private String  subBasin;

@Column(name="year_of_construction_from")
 
 private Integer  yearOfConstructionFrom;

@Column(name="year_of_construction_to")
 
 private Integer  yearOfConstructionTo;

@Column(name="year_of_impounding")
 
 private Integer  yearOfImpounding;

@Column(name="catchment_area")
 
 private String  catchmentArea;

@Column(name="water_spread_area")
 
 private Double  waterSpreadArea;

@Column(name="deepestfoundation_level")
 
 private Double  deepestfoundationLevel;

@Column(name="type_of_dam")
 
 private String  typeOfDam;

@Column(name="frl_level")
 
 private Double  frlLevel;

@Column(name="gross_storage_at_frl")
 
 private Double  grossStorageAtFrl;

@Column(name="mwl_level")
 
 private Double  mwlLevel;

@Column(name="mddl_level")
 
 private Double  mddlLevel;

@Column(name="live_storage_above_mddl")
 
 private Double  liveStorageAboveMddl;

@Column(name="dead_storage_below_mddl")
 
 private Double  deadStorageBelowMddl;

@Column(name="max_flood_discharge")
 
 private Double  maxFloodDischarge;

@Column(name="land_acquistion")
 
 private Double  landAcquistion;

@Column(name="irrigationpotential_created_wet")
 
 private Double  irrigationpotentialCreatedWet;

@Column(name="irrigationpotential_created_dry")
 
 private Double  irrigationpotentialCreatedDry;

@Column(name="irigationpotential_contemplated")
 
 private Double  irigationpotentialContemplated;

@Column(name="major_crops")
 
 private String  majorCrops;

@Column(name="allocation_of_water")
 
 private String  allocationOfWater;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="post_id")
 
 private String  postId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="edit_flag")
 
 private boolean  editFlag;

@Column(name="created_user_name")
 
 private String  createdUserName;

@Column(name="create_date")
 
 private timestamp without time zone  createDate;

@Column(name="update_user_name")
 
 private String  updateUserName;

@Column(name="update_date")
 
 private timestamp without time zone  updateDate;

@Column(name="status_id")
 
 private Integer  statusId;

@Column(name="old_unit_id")
 
 private Integer  oldUnitId;

@Column(name="old_circle_id")
 
 private Integer  oldCircleId;

@Column(name="old_division_id")
 
 private Integer  oldDivisionId;

@Column(name="old_sub_division_id")
 
 private Integer  oldSubDivisionId;

@Column(name="file_path")
 
 private String  filePath;

@Column(name="res_latitude_d")
 
 private Double  resLatitudeD;

@Column(name="res_latitude_m")
 
 private Double  resLatitudeM;

@Column(name="res_latitude_s")
 
 private Double  resLatitudeS;

@Column(name="res_longitude_d")
 
 private Double  resLongitudeD;

@Column(name="res_longitude_m")
 
 private Double  resLongitudeM;

@Column(name="res_longitude_s")
 
 private Double  resLongitudeS;

@Column(name="free_catchment")
 
 private Double  freeCatchment;

@Column(name="intercepted")
 
 private Double  intercepted;

@Column(name="agriculture")
 
 private Double  agriculture;

@Column(name="drinking")
 
 private Double  drinking;

@Column(name="industrial")
 
 private Double  industrial;

@Column(name="other_benifits")
 
 private Double  otherBenifits;

@Column(name="evaporation")
 
 private Double  evaporation;

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

@Column(name="is_reassigned")
 
 private String  isReassigned;

@Column(name="reser_comp_id")
 
 private Integer  reserCompId;

@Column(name="dead_storage_otlevel_area")
 
 private Double  deadStorageOtlevelArea;

@Column(name="dead_storage_otlevel_level")
 
 private Double  deadStorageOtlevelLevel;

@Column(name="dead_storage_otlevel_capacity")
 
 private Double  deadStorageOtlevelCapacity;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="mandal_id")
 
 private Integer  mandalId;

@Column(name="village_id")
 
 private Integer  villageId;

@Column(name="dead_storage")
 
 private Double  deadStorage;

@Column(name="flood_cushion")
 
 private Double  floodCushion;

@Column(name="land_required")
 
 private Double  landRequired;


    public Inv_reservoir_basic_data(int res_id, Object res_name, Object res_latitude, Object res_longitude, int res_status_id, int river_basin, Object sub_basin, int year_of_construction_from, int year_of_construction_to, int year_of_impounding, Object catchment_area, double water_spread_area, double deepestfoundation_level, Object type_of_dam, double frl_level, double gross_storage_at_frl, double mwl_level, double mddl_level, double live_storage_above_mddl, double dead_storage_below_mddl, double max_flood_discharge, double land_acquistion, double irrigationpotential_created_wet, double irrigationpotential_created_dry, double irigationpotential_contemplated, Object major_crops, Object allocation_of_water, int project_id, Object post_id, boolean delete_flag, boolean is_latest, boolean edit_flag, Object created_user_name, Object create_date, Object update_user_name, Object update_date, int status_id, int old_unit_id, int old_circle_id, int old_division_id, int old_sub_division_id, Object file_path, double res_latitude_d, double res_latitude_m, double res_latitude_s, double res_longitude_d, double res_longitude_m, double res_longitude_s, double free_catchment, double intercepted, double agriculture, double drinking, double industrial, double other_benifits, double evaporation, Object approved_username, Object deleted_by, Object deleted_time, int unit_id, int circle_id, int division_id, int sub_division_id, Object is_reassigned, int reser_comp_id, double dead_storage_otlevel_area, double dead_storage_otlevel_level, double dead_storage_otlevel_capacity, int district_id, int mandal_id, int village_id, double dead_storage, double flood_cushion, double land_required) {
        this.res_id = res_id;
        this.res_name = res_name;
        this.res_latitude = res_latitude;
        this.res_longitude = res_longitude;
        this.res_status_id = res_status_id;
        this.river_basin = river_basin;
        this.sub_basin = sub_basin;
        this.year_of_construction_from = year_of_construction_from;
        this.year_of_construction_to = year_of_construction_to;
        this.year_of_impounding = year_of_impounding;
        this.catchment_area = catchment_area;
        this.water_spread_area = water_spread_area;
        this.deepestfoundation_level = deepestfoundation_level;
        this.type_of_dam = type_of_dam;
        this.frl_level = frl_level;
        this.gross_storage_at_frl = gross_storage_at_frl;
        this.mwl_level = mwl_level;
        this.mddl_level = mddl_level;
        this.live_storage_above_mddl = live_storage_above_mddl;
        this.dead_storage_below_mddl = dead_storage_below_mddl;
        this.max_flood_discharge = max_flood_discharge;
        this.land_acquistion = land_acquistion;
        this.irrigationpotential_created_wet = irrigationpotential_created_wet;
        this.irrigationpotential_created_dry = irrigationpotential_created_dry;
        this.irigationpotential_contemplated = irigationpotential_contemplated;
        this.major_crops = major_crops;
        this.allocation_of_water = allocation_of_water;
        this.project_id = project_id;
        this.post_id = post_id;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.edit_flag = edit_flag;
        this.created_user_name = created_user_name;
        this.create_date = create_date;
        this.update_user_name = update_user_name;
        this.update_date = update_date;
        this.status_id = status_id;
        this.old_unit_id = old_unit_id;
        this.old_circle_id = old_circle_id;
        this.old_division_id = old_division_id;
        this.old_sub_division_id = old_sub_division_id;
        this.file_path = file_path;
        this.res_latitude_d = res_latitude_d;
        this.res_latitude_m = res_latitude_m;
        this.res_latitude_s = res_latitude_s;
        this.res_longitude_d = res_longitude_d;
        this.res_longitude_m = res_longitude_m;
        this.res_longitude_s = res_longitude_s;
        this.free_catchment = free_catchment;
        this.intercepted = intercepted;
        this.agriculture = agriculture;
        this.drinking = drinking;
        this.industrial = industrial;
        this.other_benifits = other_benifits;
        this.evaporation = evaporation;
        this.approved_username = approved_username;
        this.deleted_by = deleted_by;
        this.deleted_time = deleted_time;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
        this.is_reassigned = is_reassigned;
        this.reser_comp_id = reser_comp_id;
        this.dead_storage_otlevel_area = dead_storage_otlevel_area;
        this.dead_storage_otlevel_level = dead_storage_otlevel_level;
        this.dead_storage_otlevel_capacity = dead_storage_otlevel_capacity;
        this.district_id = district_id;
        this.mandal_id = mandal_id;
        this.village_id = village_id;
        this.dead_storage = dead_storage;
        this.flood_cushion = flood_cushion;
        this.land_required = land_required;
    }
}
