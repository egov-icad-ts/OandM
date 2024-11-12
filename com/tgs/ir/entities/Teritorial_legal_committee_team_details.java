package com.tgs.ir.entities;

public class Teritorial_legal_committee_team_details {
@Column(name="id")
 
 private Integer  id;

@Column(name="officer_name")
 
 private String  officerName;

@Column(name="designation")
 
 private String  designation;

@Column(name="phone_no")
 
 private bigint  phoneNo;

@Column(name="office_name")
 
 private String  officeName;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="unit_name")
 
 private String  unitName;


    public Teritorial_legal_committee_team_details(int id, Object officer_name, Object designation, long phone_no, Object office_name, int unit_id, int circle_id, boolean delete_flag, Object unit_name) {
        this.id = id;
        this.officer_name = officer_name;
        this.designation = designation;
        this.phone_no = phone_no;
        this.office_name = office_name;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.delete_flag = delete_flag;
        this.unit_name = unit_name;
    }
}
