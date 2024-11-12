package com.tgs.ir.entities;

public class Tender_agency_data {
@Column(name="ag_id")
 
 private Integer  agId;

@Column(name="pt_id")
 
 private Integer  ptId;

@Column(name="name_of_agency")
 
 private String  nameOfAgency;

@Column(name="mail_id")
 
 private String  mailId;

@Column(name="contact_number")
 
 private bigint  contactNumber;

@Column(name="address")
 
 private String  address;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="created_by")
 
 private String  createdBy;

@Column(name="created_time")
 
 private timestamp without time zone  createdTime;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="post_id")
 
 private bigint  postId;

@Column(name="tender_amount")
 
 private Double  tenderAmount;

@Column(name="deleted_by")
 
 private String  deletedBy;

@Column(name="deleted_time")
 
 private timestamp without time zone  deletedTime;

@Column(name="td_id")
 
 private Integer  tdId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="sub_division_id")
 
 private Integer  subDivisionId;


    public Tender_agency_data(int ag_id, int pt_id, Object name_of_agency, Object mail_id, long contact_number, Object address, boolean delete_flag, boolean is_latest, Object created_by, Object created_time, int unit_id, long post_id, double tender_amount, Object deleted_by, Object deleted_time, int td_id, int circle_id, int division_id, int sub_division_id) {
        this.ag_id = ag_id;
        this.pt_id = pt_id;
        this.name_of_agency = name_of_agency;
        this.mail_id = mail_id;
        this.contact_number = contact_number;
        this.address = address;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.created_by = created_by;
        this.created_time = created_time;
        this.unit_id = unit_id;
        this.post_id = post_id;
        this.tender_amount = tender_amount;
        this.deleted_by = deleted_by;
        this.deleted_time = deleted_time;
        this.td_id = td_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
    }
}
