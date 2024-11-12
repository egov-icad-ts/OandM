package com.tgs.ir.entities;

public class Mandal_village_ayacut {
@Column(name="mv_id")
 
 private Integer  mvId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="mandal_id")
 
 private Integer  mandalId;

@Column(name="village_id")
 
 private Integer  villageId;

@Column(name="ayacut")
 
 private Double  ayacut;

@Column(name="year")
 
 private String  year;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="updatedby")
 
 private String  updatedby;

@Column(name="updated_timestamp")
 
 private timestamp without time zone  updatedTimestamp;

@Column(name="stabilization_ip")
 
 private Double  stabilizationIp;


    public Mandal_village_ayacut(int mv_id, int project_id, int district_id, int mandal_id, int village_id, double ayacut, Object year, boolean delete_flag, boolean is_latest, Object updatedby, Object updated_timestamp, double stabilization_ip) {
        this.mv_id = mv_id;
        this.project_id = project_id;
        this.district_id = district_id;
        this.mandal_id = mandal_id;
        this.village_id = village_id;
        this.ayacut = ayacut;
        this.year = year;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.updatedby = updatedby;
        this.updated_timestamp = updated_timestamp;
        this.stabilization_ip = stabilization_ip;
    }
}
