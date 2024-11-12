package com.tgs.ir.entities;

public class Ce_assign_works {
@Column(name="ce_assign_work_id")
 
 private Integer  ceAssignWorkId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="package_id")
 
 private Integer  packageId;

@Column(name="package_code")
 
 private String  packageCode;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="to_date")
 
 private timestamp without time zone  toDate;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="post_id")
 
 private String  postId;

@Column(name="created_user_id")
 
 private String  createdUserId;

@Column(name="from_date")
 
 private timestamp without time zone  fromDate;


    public Ce_assign_works(int ce_assign_work_id, int project_id, int package_id, Object package_code, int division_id, int circle_id, Object to_date, boolean delete_flag, boolean is_latest, Object post_id, Object created_user_id, Object from_date) {
        this.ce_assign_work_id = ce_assign_work_id;
        this.project_id = project_id;
        this.package_id = package_id;
        this.package_code = package_code;
        this.division_id = division_id;
        this.circle_id = circle_id;
        this.to_date = to_date;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.post_id = post_id;
        this.created_user_id = created_user_id;
        this.from_date = from_date;
    }
}
