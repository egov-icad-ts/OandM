package com.tgs.ir.entities;

public class Ee_la_files {
@Column(name="ee_la_file_id")
 
 private Integer  eeLaFileId;

@Column(name="ee_division_id")
 
 private Integer  eeDivisionId;

@Column(name="ee_post_id")
 
 private bigint  eePostId;

@Column(name="file_name")
 
 private String  fileName;

@Column(name="file_date")
 
 private String  fileDate;

@Column(name="created_date")
 
 private timestamp without time zone  createdDate;

@Column(name="created_user")
 
 private String  createdUser;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="lao_id")
 
 private Integer  laoId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Ee_la_files(int ee_la_file_id, int ee_division_id, long ee_post_id, Object file_name, Object file_date, Object created_date, Object created_user, boolean is_latest, int lao_id, boolean delete_flag) {
        this.ee_la_file_id = ee_la_file_id;
        this.ee_division_id = ee_division_id;
        this.ee_post_id = ee_post_id;
        this.file_name = file_name;
        this.file_date = file_date;
        this.created_date = created_date;
        this.created_user = created_user;
        this.is_latest = is_latest;
        this.lao_id = lao_id;
        this.delete_flag = delete_flag;
    }
}
