package com.tgs.ir.entities;

public class Gis_crop_acreage_maps {
@Column(name="slno")
 
 private Integer  slno;

@Column(name="crop_year")
 
 private Integer  cropYear;

@Column(name="season")
 
 private String  season;

@Column(name="map_type")
 
 private String  mapType;

@Column(name="map_name")
 
 private String  mapName;

@Column(name="file_name")
 
 private String  fileName;

@Column(name="file_url")
 
 private String  fileUrl;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="updated_on")
 
 private timestamp without time zone  updatedOn;


    public Gis_crop_acreage_maps(int slno, int crop_year, Object season, Object map_type, Object map_name, Object file_name, Object file_url, boolean delete_flag, int project_id, Object updated_on) {
        this.slno = slno;
        this.crop_year = crop_year;
        this.season = season;
        this.map_type = map_type;
        this.map_name = map_name;
        this.file_name = file_name;
        this.file_url = file_url;
        this.delete_flag = delete_flag;
        this.project_id = project_id;
        this.updated_on = updated_on;
    }
}
