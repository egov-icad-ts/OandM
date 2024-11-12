package com.tgs.ir.entities;

public class Designation_mst {
@Column(name="designation_id")
 
 private Double  designationId;

@Column(name="designation_name")
 
 private String  designationName;

@Column(name="status")
 
 private String  status;

@Column(name="office_name")
 
 private String  officeName;


    public Designation_mst(double designation_id, Object designation_name, Object status, Object office_name) {
        this.designation_id = designation_id;
        this.designation_name = designation_name;
        this.status = status;
        this.office_name = office_name;
    }
}
