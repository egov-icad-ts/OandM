package com.tgs.ir.entities;

public class File_la_status {
@Column(name="file_la_status_id")
 
 private Integer  fileLaStatusId;

@Column(name="file_status_name")
 
 private String  fileStatusName;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public File_la_status(int file_la_status_id, Object file_status_name, boolean delete_flag) {
        this.file_la_status_id = file_la_status_id;
        this.file_status_name = file_status_name;
        this.delete_flag = delete_flag;
    }
}
