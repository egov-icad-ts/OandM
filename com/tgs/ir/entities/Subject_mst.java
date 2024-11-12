package com.tgs.ir.entities;

public class Subject_mst {
@Column(name="subject_id")
 
 private Integer  subjectId;

@Column(name="subject")
 
 private String  subject;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Subject_mst(int subject_id, Object subject, boolean delete_flag) {
        this.subject_id = subject_id;
        this.subject = subject;
        this.delete_flag = delete_flag;
    }
}
