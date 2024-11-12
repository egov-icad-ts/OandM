package com.tgs.ir.entities;

public class Inv_rain_gauge_data {
@Column(name="rain_gauge_id")
 
 private Integer  rainGaugeId;

@Column(name="basin_name")
 
 private String  basinName;

@Column(name="sub_basin_name")
 
 private String  subBasinName;

@Column(name="gauge_name")
 
 private String  gaugeName;

@Column(name="gauge_type")
 
 private String  gaugeType;

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

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="installed_maintained_by")
 
 private String  installedMaintainedBy;

@Column(name="deleted_by_user")
 
 private String  deletedByUser;

@Column(name="deleted_time")
 
 private timestamp without time zone  deletedTime;


    public Inv_rain_gauge_data(int rain_gauge_id, Object basin_name, Object sub_basin_name, Object gauge_name, Object gauge_type, int lat_d, int lat_m, double lat_s, int lon_d, int lon_m, double lon_s, int district_id, int mandal_id, int village_id, Object remarks, boolean delete_flag, boolean is_latest, Object created_by_user, Object created_time, int unit_id, int circle_id, int division_id, int sub_division_id, int project_id, Object installed_maintained_by, Object deleted_by_user, Object deleted_time) {
        this.rain_gauge_id = rain_gauge_id;
        this.basin_name = basin_name;
        this.sub_basin_name = sub_basin_name;
        this.gauge_name = gauge_name;
        this.gauge_type = gauge_type;
        this.lat_d = lat_d;
        this.lat_m = lat_m;
        this.lat_s = lat_s;
        this.lon_d = lon_d;
        this.lon_m = lon_m;
        this.lon_s = lon_s;
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
        this.project_id = project_id;
        this.installed_maintained_by = installed_maintained_by;
        this.deleted_by_user = deleted_by_user;
        this.deleted_time = deleted_time;
    }
}
