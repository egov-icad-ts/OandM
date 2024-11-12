package com.tgs.ir.entities;

public class Non_irrrigation_subposts {
@Column(name="subposts_seq")
 
 private Integer  subpostsSeq;

@Column(name="officeid")
 
 private bigint  officeid;

@Column(name="postid")
 
 private bigint  postid;

@Column(name="post_name")
 
 private String  postName;

@Column(name="designation")
 
 private bigint  designation;

@Column(name="postno")
 
 private bigint  postno;

@Column(name="unit_id")
 
 private bigint  unitId;

@Column(name="circle_id")
 
 private bigint  circleId;

@Column(name="division_id")
 
 private bigint  divisionId;

@Column(name="subdivision_id")
 
 private bigint  subdivisionId;

@Column(name="section_id")
 
 private bigint  sectionId;

@Column(name="post_status")
 
 private String  postStatus;

@Column(name="submitted_date")
 
 private timestamp without time zone  submittedDate;

@Column(name="post_alloted_to")
 
 private String  postAllotedTo;


    public Non_irrrigation_subposts(int subposts_seq, long officeid, long postid, Object post_name, long designation, long postno, long unit_id, long circle_id, long division_id, long subdivision_id, long section_id, Object post_status, Object submitted_date, Object post_alloted_to) {
        this.subposts_seq = subposts_seq;
        this.officeid = officeid;
        this.postid = postid;
        this.post_name = post_name;
        this.designation = designation;
        this.postno = postno;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.subdivision_id = subdivision_id;
        this.section_id = section_id;
        this.post_status = post_status;
        this.submitted_date = submitted_date;
        this.post_alloted_to = post_alloted_to;
    }
}
