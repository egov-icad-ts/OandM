package com.tgs.ir.entities;

public class Contact_us {
@Column(name="contactus_id")
 
 private Integer  contactusId;

@Column(name="name")
 
 private String  name;

@Column(name="designation")
 
 private String  designation;

@Column(name="contact_for")
 
 private Integer  contactFor;

@Column(name="subject")
 
 private String  subject;

@Column(name="description")
 
 private String  description;

@Column(name="email")
 
 private String  email;

@Column(name="contact_no")
 
 private Double  contactNo;

@Column(name="file_path")
 
 private String  filePath;

@Column(name="random_number")
 
 private bigint  randomNumber;

@Column(name="userid")
 
 private String  userid;

@Column(name="ip")
 
 private String  ip;

@Column(name="time")
 
 private timestamp without time zone  time;

@Column(name="resolution")
 
 private Integer  resolution;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="last_updated")
 
 private timestamp without time zone  lastUpdated;

@Column(name="last_updated_from")
 
 private String  lastUpdatedFrom;

@Column(name="status")
 
 private Integer  status;

@Column(name="public_view")
 
 private String  publicView;

@Column(name="last_updated_by")
 
 private String  lastUpdatedBy;

@Column(name="file_name")
 
 private ARRAY  fileName;

@Column(name="filename")
 
 private String  filename;


    public Contact_us(int contactus_id, Object name, Object designation, int contact_for, Object subject, Object description, Object email, double contact_no, Object file_path, long random_number, Object userid, Object ip, Object time, int resolution, Object remarks, Object last_updated, Object last_updated_from, int status, Object public_view, Object last_updated_by, Object file_name, Object filename) {
        this.contactus_id = contactus_id;
        this.name = name;
        this.designation = designation;
        this.contact_for = contact_for;
        this.subject = subject;
        this.description = description;
        this.email = email;
        this.contact_no = contact_no;
        this.file_path = file_path;
        this.random_number = random_number;
        this.userid = userid;
        this.ip = ip;
        this.time = time;
        this.resolution = resolution;
        this.remarks = remarks;
        this.last_updated = last_updated;
        this.last_updated_from = last_updated_from;
        this.status = status;
        this.public_view = public_view;
        this.last_updated_by = last_updated_by;
        this.file_name = file_name;
        this.filename = filename;
    }
}
