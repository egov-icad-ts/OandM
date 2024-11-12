package com.tgs.ir.entities;

public class Roles {
@Column(name="roleid")
 
 private Integer  roleid;

@Column(name="rolename")
 
 private String  rolename;

@Column(name="role_desc")
 
 private String  roleDesc;


    public Roles(int roleid, Object rolename, Object role_desc) {
        this.roleid = roleid;
        this.rolename = rolename;
        this.role_desc = role_desc;
    }
}
