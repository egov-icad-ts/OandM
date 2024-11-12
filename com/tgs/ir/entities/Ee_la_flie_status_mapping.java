package com.tgs.ir.entities;

public class Ee_la_flie_status_mapping {
@Column(name="la_file_status_map_id")
 
 private Integer  laFileStatusMapId;

@Column(name="ee_la_file_id")
 
 private Integer  eeLaFileId;

@Column(name="file_la_status_id")
 
 private Integer  fileLaStatusId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="changed_to_file_id")
 
 private Integer  changedToFileId;

@Column(name="remarks")
 
 private String  remarks;


    public Ee_la_flie_status_mapping(int la_file_status_map_id, int ee_la_file_id, int file_la_status_id, boolean delete_flag, boolean is_latest, int changed_to_file_id, Object remarks) {
        this.la_file_status_map_id = la_file_status_map_id;
        this.ee_la_file_id = ee_la_file_id;
        this.file_la_status_id = file_la_status_id;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.changed_to_file_id = changed_to_file_id;
        this.remarks = remarks;
    }
}
