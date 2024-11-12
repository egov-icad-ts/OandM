package com.tgs.ir.entities;

public class Inv_office_registers_data {
@Column(name="reg_id")
 
 private Integer  regId;

@Column(name="reg_number")
 
 private String  regNumber;

@Column(name="reg_name")
 
 private String  regName;

@Column(name="utilized_pages")
 
 private Integer  utilizedPages;

@Column(name="unutilized_pages")
 
 private Integer  unutilizedPages;

@Column(name="total_pages")
 
 private Integer  totalPages;

@Column(name="reg_status")
 
 private String  regStatus;

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


    public Inv_office_registers_data(int reg_id, Object reg_number, Object reg_name, int utilized_pages, int unutilized_pages, int total_pages, Object reg_status, Object remarks, int unit_id, int circleid, int division_id, int sub_division_id, Object post_id, Object created_by, Object created_time, Object updated_by, Object updated_time, Object deleted_by, Object deleted_time, boolean delete_flag, boolean is_latest) {
        this.reg_id = reg_id;
        this.reg_number = reg_number;
        this.reg_name = reg_name;
        this.utilized_pages = utilized_pages;
        this.unutilized_pages = unutilized_pages;
        this.total_pages = total_pages;
        this.reg_status = reg_status;
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
