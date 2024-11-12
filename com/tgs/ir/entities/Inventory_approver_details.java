package com.tgs.ir.entities;

public class Inventory_approver_details {
@Column(name="inventory_approver_details_id")
 
 private Integer  inventoryApproverDetailsId;

@Column(name="postid")
 
 private Double  postid;

@Column(name="approver_postid")
 
 private Double  approverPostid;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="submitted_date")
 
 private timestamp without time zone  submittedDate;


    public Inventory_approver_details(int inventory_approver_details_id, double postid, double approver_postid, boolean is_latest, boolean delete_flag, Object submitted_date) {
        this.inventory_approver_details_id = inventory_approver_details_id;
        this.postid = postid;
        this.approver_postid = approver_postid;
        this.is_latest = is_latest;
        this.delete_flag = delete_flag;
        this.submitted_date = submitted_date;
    }
}
