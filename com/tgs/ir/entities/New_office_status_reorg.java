package com.tgs.ir.entities;

public class New_office_status_reorg {
@Column(name="office_status_id")
 
 private Integer  officeStatusId;

@Column(name="office_id")
 
 private Integer  officeId;

@Column(name="office_status")
 
 private String  officeStatus;

@Column(name="officer_name")
 
 private String  officerName;

@Column(name="officer_status")
 
 private String  officerStatus;

@Column(name="major_issue")
 
 private String  majorIssue;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="created_by_userid")
 
 private String  createdByUserid;

@Column(name="created_date")
 
 private timestamp without time zone  createdDate;

@Column(name="updated_date")
 
 private timestamp without time zone  updatedDate;

@Column(name="office_address")
 
 private String  officeAddress;

@Column(name="vehicle_alloted_status")
 
 private String  vehicleAllotedStatus;

@Column(name="contact_number")
 
 private String  contactNumber;


    public New_office_status_reorg(int office_status_id, int office_id, Object office_status, Object officer_name, Object officer_status, Object major_issue, boolean delete_flag, boolean is_latest, Object created_by_userid, Object created_date, Object updated_date, Object office_address, Object vehicle_alloted_status, Object contact_number) {
        this.office_status_id = office_status_id;
        this.office_id = office_id;
        this.office_status = office_status;
        this.officer_name = officer_name;
        this.officer_status = officer_status;
        this.major_issue = major_issue;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.created_by_userid = created_by_userid;
        this.created_date = created_date;
        this.updated_date = updated_date;
        this.office_address = office_address;
        this.vehicle_alloted_status = vehicle_alloted_status;
        this.contact_number = contact_number;
    }
}
