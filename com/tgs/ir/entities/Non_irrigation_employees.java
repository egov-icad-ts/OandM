package com.tgs.ir.entities;

public class Non_irrigation_employees {
@Column(name="non_irrigation_employee_seq")
 
 private Integer  nonIrrigationEmployeeSeq;

@Column(name="employee_id")
 
 private String  employeeId;

@Column(name="employee_name")
 
 private String  employeeName;

@Column(name="dob")
 
 private date  dob;

@Column(name="designation_id")
 
 private Double  designationId;

@Column(name="designation_name")
 
 private String  designationName;

@Column(name="present_post_doj")
 
 private date  presentPostDoj;

@Column(name="service_doj")
 
 private date  serviceDoj;

@Column(name="post_held_details")
 
 private String  postHeldDetails;

@Column(name="office_name")
 
 private String  officeName;

@Column(name="unit_id")
 
 private Double  unitId;

@Column(name="unit_name")
 
 private String  unitName;

@Column(name="circle_id")
 
 private Double  circleId;

@Column(name="circle_name")
 
 private String  circleName;

@Column(name="postid")
 
 private bigint  postid;

@Column(name="division_id")
 
 private Double  divisionId;

@Column(name="division_name")
 
 private String  divisionName;

@Column(name="sub_division_id")
 
 private Double  subDivisionId;

@Column(name="sub_division_name")
 
 private String  subDivisionName;


    public Non_irrigation_employees(int non_irrigation_employee_seq, Object employee_id, Object employee_name, Object dob, double designation_id, Object designation_name, Object present_post_doj, Object service_doj, Object post_held_details, Object office_name, double unit_id, Object unit_name, double circle_id, Object circle_name, long postid, double division_id, Object division_name, double sub_division_id, Object sub_division_name) {
        this.non_irrigation_employee_seq = non_irrigation_employee_seq;
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.dob = dob;
        this.designation_id = designation_id;
        this.designation_name = designation_name;
        this.present_post_doj = present_post_doj;
        this.service_doj = service_doj;
        this.post_held_details = post_held_details;
        this.office_name = office_name;
        this.unit_id = unit_id;
        this.unit_name = unit_name;
        this.circle_id = circle_id;
        this.circle_name = circle_name;
        this.postid = postid;
        this.division_id = division_id;
        this.division_name = division_name;
        this.sub_division_id = sub_division_id;
        this.sub_division_name = sub_division_name;
    }
}
