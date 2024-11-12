package com.tgs.ir.entities;

public class Map_upload {
@Column(name="map_id")
 
 private Integer  mapId;

@Column(name="survey_id")
 
 private Integer  surveyId;

@Column(name="village_id")
 
 private Integer  villageId;

@Column(name="tippon_map_path")
 
 private String  tipponMapPath;

@Column(name="podi_map_path")
 
 private String  podiMapPath;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="edit_flag")
 
 private boolean  editFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="created_date")
 
 private timestamp without time zone  createdDate;

@Column(name="created_by_user")
 
 private Integer  createdByUser;


    public Map_upload(int map_id, int survey_id, int village_id, Object tippon_map_path, Object podi_map_path, boolean delete_flag, boolean edit_flag, boolean is_latest, Object created_date, int created_by_user) {
        this.map_id = map_id;
        this.survey_id = survey_id;
        this.village_id = village_id;
        this.tippon_map_path = tippon_map_path;
        this.podi_map_path = podi_map_path;
        this.delete_flag = delete_flag;
        this.edit_flag = edit_flag;
        this.is_latest = is_latest;
        this.created_date = created_date;
        this.created_by_user = created_by_user;
    }
}
