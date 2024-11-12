package com.tgs.ir.entities;

public class Tech_sanc_conveyance_items {
@Column(name="tech_sanc_conveyance_id")
 
 private Integer  techSancConveyanceId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="package_id")
 
 private Integer  packageId;

@Column(name="conveyance_charge_id")
 
 private Integer  conveyanceChargeId;

@Column(name="conveyance_name")
 
 private String  conveyanceName;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="conveyance_quantity")
 
 private Double  conveyanceQuantity;

@Column(name="conveyance_amount")
 
 private Double  conveyanceAmount;

@Column(name="conveyance_rate")
 
 private Double  conveyanceRate;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="submited_by")
 
 private Integer  submitedBy;

@Column(name="postid")
 
 private Integer  postid;

@Column(name="submited_time")
 
 private timestamp without time zone  submitedTime;

@Column(name="edit_flag")
 
 private boolean  editFlag;

@Column(name="edit_time")
 
 private timestamp without time zone  editTime;

@Column(name="edit_by")
 
 private boolean  editBy;


    public Tech_sanc_conveyance_items(int tech_sanc_conveyance_id, int project_id, int package_id, int conveyance_charge_id, Object conveyance_name, boolean delete_flag, double conveyance_quantity, double conveyance_amount, double conveyance_rate, Object remarks, int submited_by, int postid, Object submited_time, boolean edit_flag, Object edit_time, boolean edit_by) {
        this.tech_sanc_conveyance_id = tech_sanc_conveyance_id;
        this.project_id = project_id;
        this.package_id = package_id;
        this.conveyance_charge_id = conveyance_charge_id;
        this.conveyance_name = conveyance_name;
        this.delete_flag = delete_flag;
        this.conveyance_quantity = conveyance_quantity;
        this.conveyance_amount = conveyance_amount;
        this.conveyance_rate = conveyance_rate;
        this.remarks = remarks;
        this.submited_by = submited_by;
        this.postid = postid;
        this.submited_time = submited_time;
        this.edit_flag = edit_flag;
        this.edit_time = edit_time;
        this.edit_by = edit_by;
    }
}
