package com.tgs.ir.entities;

public class User_login_attempt {
@Column(name="atmp_id")
 
 private Integer  atmpId;

@Column(name="username")
 
 private String  username;

@Column(name="attempt_no")
 
 private Integer  attemptNo;

@Column(name="updated_time")
 
 private timestamp without time zone  updatedTime;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public User_login_attempt(int atmp_id, Object username, int attempt_no, Object updated_time, boolean delete_flag) {
        this.atmp_id = atmp_id;
        this.username = username;
        this.attempt_no = attempt_no;
        this.updated_time = updated_time;
        this.delete_flag = delete_flag;
    }
}
