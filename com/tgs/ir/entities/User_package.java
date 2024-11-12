package com.tgs.ir.entities;

public class User_package {
@Column(name="user_pkg_id")
 
 private Integer  userPkgId;

@Column(name="userid")
 
 private Integer  userid;

@Column(name="projectid")
 
 private Integer  projectid;

@Column(name="packageid")
 
 private Integer  packageid;


    public User_package(int user_pkg_id, int userid, int projectid, int packageid) {
        this.user_pkg_id = user_pkg_id;
        this.userid = userid;
        this.projectid = projectid;
        this.packageid = packageid;
    }
}
