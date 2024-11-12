package com.tgs.ir.entities;

public class Unit_mst_old {
@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="unit_name")
 
 private String  unitName;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="unit_address")
 
 private String  unitAddress;

@Column(name="unit_contact_no")
 
 private Double  unitContactNo;

@Column(name="unit_email_id")
 
 private String  unitEmailId;

@Column(name="phone_code")
 
 private String  phoneCode;


    public Unit_mst_old(int unit_id, Object unit_name, boolean delete_flag, Object unit_address, double unit_contact_no, Object unit_email_id, Object phone_code) {
        this.unit_id = unit_id;
        this.unit_name = unit_name;
        this.delete_flag = delete_flag;
        this.unit_address = unit_address;
        this.unit_contact_no = unit_contact_no;
        this.unit_email_id = unit_email_id;
        this.phone_code = phone_code;
    }
}
