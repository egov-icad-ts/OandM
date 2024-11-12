package com.tgs.ir.entities;

public class Legal_case_files {
@Column(name="slno")
 
 private Integer  slno;

@Column(name="case_type")
 
 private Integer  caseType;

@Column(name="case_number")
 
 private Integer  caseNumber;

@Column(name="case_year")
 
 private Integer  caseYear;

@Column(name="file_type")
 
 private Integer  fileType;

@Column(name="file_name")
 
 private String  fileName;

@Column(name="file_volume")
 
 private String  fileVolume;

@Column(name="file_path")
 
 private String  filePath;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="updated_by")
 
 private String  updatedBy;

@Column(name="updated_on")
 
 private String  updatedOn;


    public Legal_case_files(int slno, int case_type, int case_number, int case_year, int file_type, Object file_name, Object file_volume, Object file_path, boolean is_latest, boolean delete_flag, Object updated_by, Object updated_on) {
        this.slno = slno;
        this.case_type = case_type;
        this.case_number = case_number;
        this.case_year = case_year;
        this.file_type = file_type;
        this.file_name = file_name;
        this.file_volume = file_volume;
        this.file_path = file_path;
        this.is_latest = is_latest;
        this.delete_flag = delete_flag;
        this.updated_by = updated_by;
        this.updated_on = updated_on;
    }
}
