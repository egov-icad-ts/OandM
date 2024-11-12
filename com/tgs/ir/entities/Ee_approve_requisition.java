package com.tgs.ir.entities;

public class Ee_approve_requisition {
@Column(name="ee_approve_req_id")
 
 private Integer  eeApproveReqId;

@Column(name="dee_enter_req_id")
 
 private Integer  deeEnterReqId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="package_id")
 
 private Integer  packageId;

@Column(name="createdby_userid")
 
 private String  createdbyUserid;

@Column(name="postid")
 
 private String  postid;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="submited_date")
 
 private timestamp without time zone  submitedDate;

@Column(name="revision_lao")
 
 private String  revisionLao;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="ee_la_file_id")
 
 private Integer  eeLaFileId;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;


    public Ee_approve_requisition(int ee_approve_req_id, int dee_enter_req_id, int project_id, int package_id, Object createdby_userid, Object postid, boolean delete_flag, Object submited_date, Object revision_lao, boolean is_latest, int ee_la_file_id, int unit_id, int circle_id, int division_id) {
        this.ee_approve_req_id = ee_approve_req_id;
        this.dee_enter_req_id = dee_enter_req_id;
        this.project_id = project_id;
        this.package_id = package_id;
        this.createdby_userid = createdby_userid;
        this.postid = postid;
        this.delete_flag = delete_flag;
        this.submited_date = submited_date;
        this.revision_lao = revision_lao;
        this.is_latest = is_latest;
        this.ee_la_file_id = ee_la_file_id;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
    }
}
