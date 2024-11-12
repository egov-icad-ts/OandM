package com.tgs.ir.entities;

public class Action_on_agency {
@Column(name="ac_id")
 
 private Integer  acId;

@Column(name="ag_id")
 
 private Integer  agId;

@Column(name="work_id")
 
 private Integer  workId;

@Column(name="action_taken")
 
 private Integer  actionTaken;

@Column(name="new_agreement_type")
 
 private Integer  newAgreementType;

@Column(name="deduction_amount")
 
 private Double  deductionAmount;

@Column(name="file_path")
 
 private String  filePath;

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

@Column(name="agency_name")
 
 private String  agencyName;

@Column(name="email")
 
 private String  email;

@Column(name="contact_no")
 
 private bigint  contactNo;

@Column(name="address")
 
 private String  address;

@Column(name="new_ag_id")
 
 private Integer  newAgId;

@Column(name="deleted_by")
 
 private String  deletedBy;

@Column(name="deleted_time")
 
 private timestamp without time zone  deletedTime;

@Column(name="others")
 
 private String  others;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="sub_division_id")
 
 private Integer  subDivisionId;


    public Action_on_agency(int ac_id, int ag_id, int work_id, int action_taken, int new_agreement_type, double deduction_amount, Object file_path, boolean delete_flag, boolean is_latest, Object created_by, Object created_time, int unit_id, long post_id, Object agency_name, Object email, long contact_no, Object address, int new_ag_id, Object deleted_by, Object deleted_time, Object others, Object remarks, int circle_id, int division_id, int sub_division_id) {
        this.ac_id = ac_id;
        this.ag_id = ag_id;
        this.work_id = work_id;
        this.action_taken = action_taken;
        this.new_agreement_type = new_agreement_type;
        this.deduction_amount = deduction_amount;
        this.file_path = file_path;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.created_by = created_by;
        this.created_time = created_time;
        this.unit_id = unit_id;
        this.post_id = post_id;
        this.agency_name = agency_name;
        this.email = email;
        this.contact_no = contact_no;
        this.address = address;
        this.new_ag_id = new_ag_id;
        this.deleted_by = deleted_by;
        this.deleted_time = deleted_time;
        this.others = others;
        this.remarks = remarks;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
    }
}
