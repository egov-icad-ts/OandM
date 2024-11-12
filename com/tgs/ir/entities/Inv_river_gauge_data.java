package com.tgs.ir.entities;

public class Inv_river_gauge_data {
@Column(name="river_gauge_id")
 
 private Integer  riverGaugeId;

@Column(name="basin_name")
 
 private String  basinName;

@Column(name="code_grid_ref")
 
 private String  codeGridRef;

@Column(name="sub_basin_name")
 
 private String  subBasinName;

@Column(name="gauge_name")
 
 private String  gaugeName;

@Column(name="ho_ff_hoi")
 
 private String  hoFfHoi;

@Column(name="station_type")
 
 private String  stationType;

@Column(name="river_type")
 
 private String  riverType;

@Column(name="river_name")
 
 private Integer  riverName;

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

@Column(name="hfl")
 
 private Double  hfl;

@Column(name="catchement_area")
 
 private Double  catchementArea;

@Column(name="channel_condition")
 
 private String  channelCondition;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="mandal_id")
 
 private Integer  mandalId;

@Column(name="village_id")
 
 private Integer  villageId;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="created_by_user")
 
 private String  createdByUser;

@Column(name="created_time")
 
 private timestamp without time zone  createdTime;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="sub_division_id")
 
 private Integer  subDivisionId;

@Column(name="installed_maintained_by")
 
 private String  installedMaintainedBy;

@Column(name="deleted_user")
 
 private String  deletedUser;

@Column(name="deleted_time")
 
 private timestamp without time zone  deletedTime;


    public Inv_river_gauge_data(int river_gauge_id, Object basin_name, Object code_grid_ref, Object sub_basin_name, Object gauge_name, Object ho_ff_hoi, Object station_type, Object river_type, int river_name, int lat_d, int lat_m, double lat_s, int lon_d, int lon_m, double lon_s, double hfl, double catchement_area, Object channel_condition, int district_id, int mandal_id, int village_id, Object remarks, boolean delete_flag, boolean is_latest, Object created_by_user, Object created_time, int unit_id, int circle_id, int division_id, int sub_division_id, Object installed_maintained_by, Object deleted_user, Object deleted_time) {
        this.river_gauge_id = river_gauge_id;
        this.basin_name = basin_name;
        this.code_grid_ref = code_grid_ref;
        this.sub_basin_name = sub_basin_name;
        this.gauge_name = gauge_name;
        this.ho_ff_hoi = ho_ff_hoi;
        this.station_type = station_type;
        this.river_type = river_type;
        this.river_name = river_name;
        this.lat_d = lat_d;
        this.lat_m = lat_m;
        this.lat_s = lat_s;
        this.lon_d = lon_d;
        this.lon_m = lon_m;
        this.lon_s = lon_s;
        this.hfl = hfl;
        this.catchement_area = catchement_area;
        this.channel_condition = channel_condition;
        this.district_id = district_id;
        this.mandal_id = mandal_id;
        this.village_id = village_id;
        this.remarks = remarks;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.created_by_user = created_by_user;
        this.created_time = created_time;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
        this.installed_maintained_by = installed_maintained_by;
        this.deleted_user = deleted_user;
        this.deleted_time = deleted_time;
    }
}
