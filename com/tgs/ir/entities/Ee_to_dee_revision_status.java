package com.tgs.ir.entities;

public class Ee_to_dee_revision_status {
@Column(name="ee_to_dee_rev_id")
 
 private Integer  eeToDeeRevId;

@Column(name="dee_post_id")
 
 private bigint  deePostId;

@Column(name="ee_la_file_id")
 
 private Integer  eeLaFileId;

@Column(name="file_status")
 
 private Integer  fileStatus;

@Column(name="ee_post_id")
 
 private bigint  eePostId;

@Column(name="ee_sent_date")
 
 private timestamp without time zone  eeSentDate;

@Column(name="remarks")
 
 private String  remarks;


    public Ee_to_dee_revision_status(int ee_to_dee_rev_id, long dee_post_id, int ee_la_file_id, int file_status, long ee_post_id, Object ee_sent_date, Object remarks) {
        this.ee_to_dee_rev_id = ee_to_dee_rev_id;
        this.dee_post_id = dee_post_id;
        this.ee_la_file_id = ee_la_file_id;
        this.file_status = file_status;
        this.ee_post_id = ee_post_id;
        this.ee_sent_date = ee_sent_date;
        this.remarks = remarks;
    }
}
