package com.tgs.ir.entities;

public class Office_mailid_details {
@Column(name="s_id")
 
 private Integer  sId;

@Column(name="office_name")
 
 private String  officeName;

@Column(name="office_mail_id")
 
 private String  officeMailId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="created_by")
 
 private String  createdBy;

@Column(name="created_postid")
 
 private String  createdPostid;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="created_time")
 
 private timestamp without time zone  createdTime;

@Column(name="unit_name")
 
 private String  unitName;

@Column(name="circle_name")
 
 private String  circleName;

@Column(name="division_name")
 
 private String  divisionName;


    public Office_mailid_details(int s_id, Object office_name, Object office_mail_id, boolean delete_flag, Object created_by, Object created_postid, int unit_id, int circle_id, int division_id, Object created_time, Object unit_name, Object circle_name, Object division_name) {
        this.s_id = s_id;
        this.office_name = office_name;
        this.office_mail_id = office_mail_id;
        this.delete_flag = delete_flag;
        this.created_by = created_by;
        this.created_postid = created_postid;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.created_time = created_time;
        this.unit_name = unit_name;
        this.circle_name = circle_name;
        this.division_name = division_name;
    }
}
