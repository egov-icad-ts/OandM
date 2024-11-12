package com.tgs.ir.entities;

public class Inventory_quarter_encroachemnt_data {
@Column(name="encr_id")
 
 private Integer  encrId;

@Column(name="quarter_id")
 
 private Integer  quarterId;

@Column(name="encroachment_details")
 
 private String  encroachmentDetails;

@Column(name="from_year_month")
 
 private String  fromYearMonth;

@Column(name="electric_customer_no")
 
 private String  electricCustomerNo;

@Column(name="location")
 
 private String  location;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="created_userid")
 
 private String  createdUserid;

@Column(name="created_timestamp")
 
 private timestamp without time zone  createdTimestamp;


    public Inventory_quarter_encroachemnt_data(int encr_id, int quarter_id, Object encroachment_details, Object from_year_month, Object electric_customer_no, Object location, Object remarks, boolean delete_flag, boolean is_latest, Object created_userid, Object created_timestamp) {
        this.encr_id = encr_id;
        this.quarter_id = quarter_id;
        this.encroachment_details = encroachment_details;
        this.from_year_month = from_year_month;
        this.electric_customer_no = electric_customer_no;
        this.location = location;
        this.remarks = remarks;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.created_userid = created_userid;
        this.created_timestamp = created_timestamp;
    }
}
