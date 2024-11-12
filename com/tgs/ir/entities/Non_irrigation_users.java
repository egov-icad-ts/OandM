package com.tgs.ir.entities;

public class Non_irrigation_users {
@Column(name="userid")
 
 private Integer  userid;

@Column(name="username")
 
 private String  username;

@Column(name="password")
 
 private String  password;

@Column(name="roleid")
 
 private Integer  roleid;

@Column(name="projectid")
 
 private Integer  projectid;

@Column(name="en_password")
 
 private String  enPassword;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="created_date")
 
 private date  createdDate;

@Column(name="created_by")
 
 private String  createdBy;

@Column(name="access")
 
 private boolean  access;

@Column(name="last_login")
 
 private time without time zone  lastLogin;


    public Non_irrigation_users(int userid, Object username, Object password, int roleid, int projectid, Object en_password, boolean delete_flag, Object created_date, Object created_by, boolean access, Object last_login) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.roleid = roleid;
        this.projectid = projectid;
        this.en_password = en_password;
        this.delete_flag = delete_flag;
        this.created_date = created_date;
        this.created_by = created_by;
        this.access = access;
        this.last_login = last_login;
    }
}
