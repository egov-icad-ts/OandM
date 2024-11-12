package com.tgs.ir.entities;

public class Users_new {
@Column(name="userid")
 
 private Integer  userid;

@Column(name="username")
 
 private String  username;

@Column(name="password")
 
 private String  password;

@Column(name="empid")
 
 private String  empid;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="created_date")
 
 private date  createdDate;

@Column(name="logouttime")
 
 private date  logouttime;

@Column(name="access")
 
 private boolean  access;

@Column(name="id")
 
 private Integer  id;


    public Users_new(int userid, Object username, Object password, Object empid, boolean delete_flag, Object created_date, Object logouttime, boolean access, int id) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.empid = empid;
        this.delete_flag = delete_flag;
        this.created_date = created_date;
        this.logouttime = logouttime;
        this.access = access;
        this.id = id;
    }
}
