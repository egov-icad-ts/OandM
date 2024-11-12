package com.tgs.ir.entities;

public class Inv_office_files_data {
@Column(name="file_id")
 
 private Integer  fileId;

@Column(name="file_number")
 
 private String  fileNumber;

@Column(name="file_name")
 
 private String  fileName;

@Column(name="no_of_volumes")
 
 private Integer  noOfVolumes;

@Column(name="total_pages")
 
 private Integer  totalPages;

@Column(name="file_status")
 
 private String  fileStatus;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circleid")
 
 private Integer  circleid;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="sub_division_id")
 
 private Integer  subDivisionId;

@Column(name="post_id")
 
 private String  postId;

@Column(name="created_by")
 
 private String  createdBy;

@Column(name="created_time")
 
 private timestamp with time zone  createdTime;

@Column(name="updated_by")
 
 private String  updatedBy;

@Column(name="updated_time")
 
 private timestamp with time zone  updatedTime;

@Column(name="deleted_by")
 
 private String  deletedBy;

@Column(name="deleted_time")
 
 private timestamp with time zone  deletedTime;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;


    public Inv_office_files_data(int file_id, Object file_number, Object file_name, int no_of_volumes, int total_pages, Object file_status, Object remarks, int unit_id, int circleid, int division_id, int sub_division_id, Object post_id, Object created_by, Object created_time, Object updated_by, Object updated_time, Object deleted_by, Object deleted_time, boolean delete_flag, boolean is_latest) {
        this.file_id = file_id;
        this.file_number = file_number;
        this.file_name = file_name;
        this.no_of_volumes = no_of_volumes;
        this.total_pages = total_pages;
        this.file_status = file_status;
        this.remarks = remarks;
        this.unit_id = unit_id;
        this.circleid = circleid;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
        this.post_id = post_id;
        this.created_by = created_by;
        this.created_time = created_time;
        this.updated_by = updated_by;
        this.updated_time = updated_time;
        this.deleted_by = deleted_by;
        this.deleted_time = deleted_time;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
    }
}
