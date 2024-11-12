package com.tgs.ir.entities;

public class Division_level_ongoing_works {
@Column(name="work_id")
 
 private Integer  workId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="work_name")
 
 private String  workName;

@Column(name="admin_sanction")
 
 private Double  adminSanction;

@Column(name="technical_sanction")
 
 private Double  technicalSanction;

@Column(name="agency_name")
 
 private String  agencyName;

@Column(name="details_of_work")
 
 private String  detailsOfWork;

@Column(name="ew_qty")
 
 private Double  ewQty;

@Column(name="ew_amt")
 
 private Double  ewAmt;

@Column(name="linning_qty")
 
 private Double  linningQty;

@Column(name="linning_amt")
 
 private Double  linningAmt;

@Column(name="cc_qty")
 
 private Double  ccQty;

@Column(name="cc_amt")
 
 private Double  ccAmt;

@Column(name="total_amt")
 
 private Double  totalAmt;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="created_userid")
 
 private String  createdUserid;

@Column(name="created_post_id")
 
 private String  createdPostId;

@Column(name="created_time")
 
 private timestamp without time zone  createdTime;

@Column(name="others_amt")
 
 private Double  othersAmt;

@Column(name="deleted_by")
 
 private String  deletedBy;

@Column(name="deleted_time")
 
 private timestamp without time zone  deletedTime;

@Column(name="updated_by")
 
 private String  updatedBy;

@Column(name="updated_time")
 
 private timestamp without time zone  updatedTime;


    public Division_level_ongoing_works(int work_id, int project_id, Object work_name, double admin_sanction, double technical_sanction, Object agency_name, Object details_of_work, double ew_qty, double ew_amt, double linning_qty, double linning_amt, double cc_qty, double cc_amt, double total_amt, int unit_id, int circle_id, int division_id, boolean delete_flag, boolean is_latest, Object remarks, Object created_userid, Object created_post_id, Object created_time, double others_amt, Object deleted_by, Object deleted_time, Object updated_by, Object updated_time) {
        this.work_id = work_id;
        this.project_id = project_id;
        this.work_name = work_name;
        this.admin_sanction = admin_sanction;
        this.technical_sanction = technical_sanction;
        this.agency_name = agency_name;
        this.details_of_work = details_of_work;
        this.ew_qty = ew_qty;
        this.ew_amt = ew_amt;
        this.linning_qty = linning_qty;
        this.linning_amt = linning_amt;
        this.cc_qty = cc_qty;
        this.cc_amt = cc_amt;
        this.total_amt = total_amt;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.remarks = remarks;
        this.created_userid = created_userid;
        this.created_post_id = created_post_id;
        this.created_time = created_time;
        this.others_amt = others_amt;
        this.deleted_by = deleted_by;
        this.deleted_time = deleted_time;
        this.updated_by = updated_by;
        this.updated_time = updated_time;
    }
}
