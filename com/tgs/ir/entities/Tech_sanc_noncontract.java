package com.tgs.ir.entities;

public class Tech_sanc_noncontract {
@Column(name="tech_sanc_noncontract_id")
 
 private Integer  techSancNoncontractId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="package_id")
 
 private Integer  packageId;

@Column(name="non_contract_item_id")
 
 private Integer  nonContractItemId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="percentage_noncontract")
 
 private Double  percentageNoncontract;

@Column(name="submited_by")
 
 private Integer  submitedBy;

@Column(name="submited_time")
 
 private timestamp without time zone  submitedTime;

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


    public Tech_sanc_noncontract(int tech_sanc_noncontract_id, int project_id, int package_id, int non_contract_item_id, boolean delete_flag, double percentage_noncontract, int submited_by, Object submited_time, boolean edit_flag, boolean is_latest, int edit_by, Object edit_time, int postid) {
        this.tech_sanc_noncontract_id = tech_sanc_noncontract_id;
        this.project_id = project_id;
        this.package_id = package_id;
        this.non_contract_item_id = non_contract_item_id;
        this.delete_flag = delete_flag;
        this.percentage_noncontract = percentage_noncontract;
        this.submited_by = submited_by;
        this.submited_time = submited_time;
        this.edit_flag = edit_flag;
        this.is_latest = is_latest;
        this.edit_by = edit_by;
        this.edit_time = edit_time;
        this.postid = postid;
    }
}
