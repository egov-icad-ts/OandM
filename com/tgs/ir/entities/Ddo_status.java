package com.tgs.ir.entities;

public class Ddo_status {
@Column(name="ddo_id")
 
 private Integer  ddoId;

@Column(name="ddo_name")
 
 private String  ddoName;

@Column(name="ddo_code")
 
 private String  ddoCode;

@Column(name="gstn")
 
 private String  gstn;

@Column(name="tan")
 
 private String  tan;

@Column(name="ddo_date")
 
 private String  ddoDate;

@Column(name="gst_date")
 
 private String  gstDate;

@Column(name="tan_date")
 
 private String  tanDate;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="created_post_id")
 
 private String  createdPostId;

@Column(name="created_username")
 
 private String  createdUsername;

@Column(name="created_time")
 
 private timestamp without time zone  createdTime;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="deleted_by")
 
 private String  deletedBy;

@Column(name="deleted_time")
 
 private timestamp without time zone  deletedTime;

@Column(name="ddo_designation")
 
 private Integer  ddoDesignation;

@Column(name="ddo_post_id")
 
 private String  ddoPostId;

@Column(name="ddo_remarks")
 
 private String  ddoRemarks;

@Column(name="gst_remarks")
 
 private String  gstRemarks;

@Column(name="tan_remarks")
 
 private String  tanRemarks;

@Column(name="name_change_status")
 
 private String  nameChangeStatus;

@Column(name="gst_change_status")
 
 private String  gstChangeStatus;

@Column(name="tan_change_status")
 
 private String  tanChangeStatus;


    public Ddo_status(int ddo_id, Object ddo_name, Object ddo_code, Object gstn, Object tan, Object ddo_date, Object gst_date, Object tan_date, int unit_id, int circle_id, int division_id, Object created_post_id, Object created_username, Object created_time, boolean delete_flag, Object deleted_by, Object deleted_time, int ddo_designation, Object ddo_post_id, Object ddo_remarks, Object gst_remarks, Object tan_remarks, Object name_change_status, Object gst_change_status, Object tan_change_status) {
        this.ddo_id = ddo_id;
        this.ddo_name = ddo_name;
        this.ddo_code = ddo_code;
        this.gstn = gstn;
        this.tan = tan;
        this.ddo_date = ddo_date;
        this.gst_date = gst_date;
        this.tan_date = tan_date;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.created_post_id = created_post_id;
        this.created_username = created_username;
        this.created_time = created_time;
        this.delete_flag = delete_flag;
        this.deleted_by = deleted_by;
        this.deleted_time = deleted_time;
        this.ddo_designation = ddo_designation;
        this.ddo_post_id = ddo_post_id;
        this.ddo_remarks = ddo_remarks;
        this.gst_remarks = gst_remarks;
        this.tan_remarks = tan_remarks;
        this.name_change_status = name_change_status;
        this.gst_change_status = gst_change_status;
        this.tan_change_status = tan_change_status;
    }
}
