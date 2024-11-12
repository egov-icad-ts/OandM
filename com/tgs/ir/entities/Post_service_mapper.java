package com.tgs.ir.entities;

public class Post_service_mapper {
@Column(name="postid")
 
 private Integer  postid;

@Column(name="serviceid")
 
 private Integer  serviceid;

@Column(name="desc")
 
 private String  desc;

@Column(name="deleteflag")
 
 private boolean  deleteflag;


    public Post_service_mapper(int postid, int serviceid, Object desc, boolean deleteflag) {
        this.postid = postid;
        this.serviceid = serviceid;
        this.desc = desc;
        this.deleteflag = deleteflag;
    }
}
