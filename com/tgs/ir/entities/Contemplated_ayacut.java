package com.tgs.ir.entities;

public class Contemplated_ayacut {
@Column(name="ip_id")
 
 private Integer  ipId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="mandal_id")
 
 private Integer  mandalId;

@Column(name="village_id")
 
 private Integer  villageId;

@Column(name="contempalted_ip")
 
 private Double  contempaltedIp;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="updatedby")
 
 private String  updatedby;

@Column(name="updated_timestamp")
 
 private timestamp without time zone  updatedTimestamp;

@Column(name="is_record")
 
 private boolean  isRecord;


    public Contemplated_ayacut(int ip_id, int project_id, int district_id, int mandal_id, int village_id, double contempalted_ip, boolean delete_flag, boolean is_latest, Object updatedby, Object updated_timestamp, boolean is_record) {
        this.ip_id = ip_id;
        this.project_id = project_id;
        this.district_id = district_id;
        this.mandal_id = mandal_id;
        this.village_id = village_id;
        this.contempalted_ip = contempalted_ip;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.updatedby = updatedby;
        this.updated_timestamp = updated_timestamp;
        this.is_record = is_record;
    }
}
