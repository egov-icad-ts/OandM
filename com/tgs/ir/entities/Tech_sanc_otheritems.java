package com.tgs.ir.entities;

public class Tech_sanc_otheritems {
@Column(name="tech_sanc_other_id")
 
 private Integer  techSancOtherId;

@Column(name="other_items_id")
 
 private Integer  otherItemsId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="other_item_percentage")
 
 private Double  otherItemPercentage;

@Column(name="percentage_flag")
 
 private boolean  percentageFlag;

@Column(name="submited_by")
 
 private Integer  submitedBy;

@Column(name="sumition_time")
 
 private timestamp without time zone  sumitionTime;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="package_id")
 
 private Integer  packageId;

@Column(name="edit_flag")
 
 private boolean  editFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="edit_by")
 
 private Integer  editBy;

@Column(name="edit_time")
 
 private timestamp without time zone  editTime;

@Column(name="postid")
 
 private Integer  postid;


    public Tech_sanc_otheritems(int tech_sanc_other_id, int other_items_id, boolean delete_flag, double other_item_percentage, boolean percentage_flag, int submited_by, Object sumition_time, int project_id, int package_id, boolean edit_flag, boolean is_latest, int edit_by, Object edit_time, int postid) {
        this.tech_sanc_other_id = tech_sanc_other_id;
        this.other_items_id = other_items_id;
        this.delete_flag = delete_flag;
        this.other_item_percentage = other_item_percentage;
        this.percentage_flag = percentage_flag;
        this.submited_by = submited_by;
        this.sumition_time = sumition_time;
        this.project_id = project_id;
        this.package_id = package_id;
        this.edit_flag = edit_flag;
        this.is_latest = is_latest;
        this.edit_by = edit_by;
        this.edit_time = edit_time;
        this.postid = postid;
    }
}
