package com.tgs.ir.entities;

public class New_office_temp_users_reorg {
@Column(name="user_id")
 
 private Integer  userId;

@Column(name="new_unit_id")
 
 private Integer  newUnitId;

@Column(name="new_user_desc")
 
 private String  newUserDesc;

@Column(name="user_name")
 
 private String  userName;

@Column(name="password")
 
 private String  password;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="created_by")
 
 private String  createdBy;

@Column(name="created_date")
 
 private date  createdDate;

@Column(name="access")
 
 private boolean  access;

@Column(name="hrms_unit_id")
 
 private Integer  hrmsUnitId;

@Column(name="en_password")
 
 private String  enPassword;


    public New_office_temp_users_reorg(int user_id, int new_unit_id, Object new_user_desc, Object user_name, Object password, boolean delete_flag, Object created_by, Object created_date, boolean access, int hrms_unit_id, Object en_password) {
        this.user_id = user_id;
        this.new_unit_id = new_unit_id;
        this.new_user_desc = new_user_desc;
        this.user_name = user_name;
        this.password = password;
        this.delete_flag = delete_flag;
        this.created_by = created_by;
        this.created_date = created_date;
        this.access = access;
        this.hrms_unit_id = hrms_unit_id;
        this.en_password = en_password;
    }
}
