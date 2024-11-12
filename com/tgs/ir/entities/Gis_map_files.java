package com.tgs.ir.entities;

public class Gis_map_files {
@Column(name="slno")
 
 private Integer  slno;

@Column(name="category_id")
 
 private Integer  categoryId;

@Column(name="type_id")
 
 private Integer  typeId;

@Column(name="assembly_id")
 
 private Integer  assemblyId;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="mandal_id")
 
 private Integer  mandalId;

@Column(name="map_size")
 
 private String  mapSize;

@Column(name="file_path")
 
 private String  filePath;

@Column(name="file_name")
 
 private String  fileName;

@Column(name="map_status")
 
 private String  mapStatus;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="updated_by")
 
 private String  updatedBy;

@Column(name="updated_time")
 
 private timestamp without time zone  updatedTime;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="toposheet_id")
 
 private Integer  toposheetId;

@Column(name="basin_id")
 
 private Integer  basinId;

@Column(name="sub_basin_id")
 
 private Integer  subBasinId;

@Column(name="stream_id")
 
 private Integer  streamId;

@Column(name="misc_map")
 
 private String  miscMap;


    public Gis_map_files(int slno, int category_id, int type_id, int assembly_id, int district_id, int mandal_id, Object map_size, Object file_path, Object file_name, Object map_status, boolean is_latest, Object updated_by, Object updated_time, int unit_id, int project_id, int toposheet_id, int basin_id, int sub_basin_id, int stream_id, Object misc_map) {
        this.slno = slno;
        this.category_id = category_id;
        this.type_id = type_id;
        this.assembly_id = assembly_id;
        this.district_id = district_id;
        this.mandal_id = mandal_id;
        this.map_size = map_size;
        this.file_path = file_path;
        this.file_name = file_name;
        this.map_status = map_status;
        this.is_latest = is_latest;
        this.updated_by = updated_by;
        this.updated_time = updated_time;
        this.unit_id = unit_id;
        this.project_id = project_id;
        this.toposheet_id = toposheet_id;
        this.basin_id = basin_id;
        this.sub_basin_id = sub_basin_id;
        this.stream_id = stream_id;
        this.misc_map = misc_map;
    }
}
