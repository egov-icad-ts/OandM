package com.tgs.ir.entities;

public class New_section_employee_mst_reorg {
@Column(name="new_emp_id")
 
 private Integer  newEmpId;

@Column(name="office_id")
 
 private Integer  officeId;

@Column(name="officer_name")
 
 private String  officerName;

@Column(name="officer_contact_no")
 
 private String  officerContactNo;

@Column(name="officer_status")
 
 private String  officerStatus;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="new_unit_id")
 
 private Integer  newUnitId;

@Column(name="new_circle_id")
 
 private Integer  newCircleId;

@Column(name="new_division_id")
 
 private Integer  newDivisionId;

@Column(name="created_by_userid")
 
 private String  createdByUserid;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="created_date")
 
 private timestamp without time zone  createdDate;

@Column(name="updated_date")
 
 private timestamp without time zone  updatedDate;


    public New_section_employee_mst_reorg(int new_emp_id, int office_id, Object officer_name, Object officer_contact_no, Object officer_status, boolean delete_flag, boolean is_latest, int new_unit_id, int new_circle_id, int new_division_id, Object created_by_userid, Object remarks, Object created_date, Object updated_date) {
        this.new_emp_id = new_emp_id;
        this.office_id = office_id;
        this.officer_name = officer_name;
        this.officer_contact_no = officer_contact_no;
        this.officer_status = officer_status;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.new_unit_id = new_unit_id;
        this.new_circle_id = new_circle_id;
        this.new_division_id = new_division_id;
        this.created_by_userid = created_by_userid;
        this.remarks = remarks;
        this.created_date = created_date;
        this.updated_date = updated_date;
    }
}
