package com.tgs.ir.entities;

public class Lao_users {
@Column(name="lao_userid")
 
 private Integer  laoUserid;

@Column(name="laoname")
 
 private String  laoname;

@Column(name="password")
 
 private String  password;

@Column(name="roleid")
 
 private Integer  roleid;

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

@Column(name="lastlogin")
 
 private timestamp without time zone  lastlogin;


    public Lao_users(int lao_userid, Object laoname, Object password, int roleid, Object en_password, boolean delete_flag, Object created_date, Object created_by, boolean access, Object lastlogin) {
        this.lao_userid = lao_userid;
        this.laoname = laoname;
        this.password = password;
        this.roleid = roleid;
        this.en_password = en_password;
        this.delete_flag = delete_flag;
        this.created_date = created_date;
        this.created_by = created_by;
        this.access = access;
        this.lastlogin = lastlogin;
    }
}
