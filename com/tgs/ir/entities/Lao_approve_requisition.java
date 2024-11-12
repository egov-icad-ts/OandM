package com.tgs.ir.entities;

public class Lao_approve_requisition {
@Column(name="lao_approve_req_id")
 
 private Integer  laoApproveReqId;

@Column(name="dee_enter_req_id")
 
 private Integer  deeEnterReqId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="package_id")
 
 private Integer  packageId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="submited_date")
 
 private timestamp without time zone  submitedDate;

@Column(name="ee_la_file_id")
 
 private Integer  eeLaFileId;

@Column(name="createdby_userid")
 
 private Integer  createdbyUserid;


    public Lao_approve_requisition(int lao_approve_req_id, int dee_enter_req_id, int project_id, int package_id, boolean delete_flag, Object submited_date, int ee_la_file_id, int createdby_userid) {
        this.lao_approve_req_id = lao_approve_req_id;
        this.dee_enter_req_id = dee_enter_req_id;
        this.project_id = project_id;
        this.package_id = package_id;
        this.delete_flag = delete_flag;
        this.submited_date = submited_date;
        this.ee_la_file_id = ee_la_file_id;
        this.createdby_userid = createdby_userid;
    }
}
