package com.tgs.ir.entities;

public class Tech_sanc_boq_items {
@Column(name="tech_sanc_boq_id")
 
 private Integer  techSancBoqId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="package_id")
 
 private Integer  packageId;

@Column(name="work_comp_id")
 
 private Integer  workCompId;

@Column(name="midified_item_name")
 
 private String  midifiedItemName;

@Column(name="main_item_id")
 
 private Integer  mainItemId;

@Column(name="primary_item_id")
 
 private Integer  primaryItemId;

@Column(name="secondary_item_id")
 
 private Integer  secondaryItemId;

@Column(name="quantity")
 
 private Double  quantity;

@Column(name="rate")
 
 private Double  rate;

@Column(name="amount")
 
 private Double  amount;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="submited_by")
 
 private Integer  submitedBy;

@Column(name="submited_time")
 
 private timestamp without time zone  submitedTime;

@Column(name="edit_flag")
 
 private boolean  editFlag;

@Column(name="edit_time")
 
 private timestamp without time zone  editTime;

@Column(name="edit_by")
 
 private Integer  editBy;

@Column(name="is_latest")
 
 private boolean  isLatest;


    public Tech_sanc_boq_items(int tech_sanc_boq_id, int project_id, int package_id, int work_comp_id, Object midified_item_name, int main_item_id, int primary_item_id, int secondary_item_id, double quantity, double rate, double amount, Object remarks, boolean delete_flag, int submited_by, Object submited_time, boolean edit_flag, Object edit_time, int edit_by, boolean is_latest) {
        this.tech_sanc_boq_id = tech_sanc_boq_id;
        this.project_id = project_id;
        this.package_id = package_id;
        this.work_comp_id = work_comp_id;
        this.midified_item_name = midified_item_name;
        this.main_item_id = main_item_id;
        this.primary_item_id = primary_item_id;
        this.secondary_item_id = secondary_item_id;
        this.quantity = quantity;
        this.rate = rate;
        this.amount = amount;
        this.remarks = remarks;
        this.delete_flag = delete_flag;
        this.submited_by = submited_by;
        this.submited_time = submited_time;
        this.edit_flag = edit_flag;
        this.edit_time = edit_time;
        this.edit_by = edit_by;
        this.is_latest = is_latest;
    }
}
