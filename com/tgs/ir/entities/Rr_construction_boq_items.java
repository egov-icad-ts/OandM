package com.tgs.ir.entities;

public class Rr_construction_boq_items {
@Column(name="rr_boq_item_id")
 
 private Integer  rrBoqItemId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="package_id")
 
 private Integer  packageId;

@Column(name="name_of_work")
 
 private String  nameOfWork;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="mandal_id")
 
 private Integer  mandalId;

@Column(name="village_id")
 
 private Integer  villageId;

@Column(name="rr_type_id")
 
 private Integer  rrTypeId;

@Column(name="rr_item_id")
 
 private Integer  rrItemId;

@Column(name="rr_primary_item_id")
 
 private Integer  rrPrimaryItemId;

@Column(name="rr_secondary_item_id")
 
 private Integer  rrSecondaryItemId;

@Column(name="quantity")
 
 private Double  quantity;

@Column(name="rate")
 
 private Double  rate;

@Column(name="amount")
 
 private Double  amount;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="submited_by")
 
 private String  submitedBy;

@Column(name="submited_time")
 
 private timestamp without time zone  submitedTime;

@Column(name="edit_flag")
 
 private boolean  editFlag;

@Column(name="edit_time")
 
 private timestamp without time zone  editTime;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="rr_boq_total_id")
 
 private Integer  rrBoqTotalId;

@Column(name="edit_by")
 
 private String  editBy;

@Column(name="rr_admin_id")
 
 private Integer  rrAdminId;


    public Rr_construction_boq_items(int rr_boq_item_id, int project_id, int package_id, Object name_of_work, int district_id, int mandal_id, int village_id, int rr_type_id, int rr_item_id, int rr_primary_item_id, int rr_secondary_item_id, double quantity, double rate, double amount, boolean delete_flag, Object submited_by, Object submited_time, boolean edit_flag, Object edit_time, boolean is_latest, int rr_boq_total_id, Object edit_by, int rr_admin_id) {
        this.rr_boq_item_id = rr_boq_item_id;
        this.project_id = project_id;
        this.package_id = package_id;
        this.name_of_work = name_of_work;
        this.district_id = district_id;
        this.mandal_id = mandal_id;
        this.village_id = village_id;
        this.rr_type_id = rr_type_id;
        this.rr_item_id = rr_item_id;
        this.rr_primary_item_id = rr_primary_item_id;
        this.rr_secondary_item_id = rr_secondary_item_id;
        this.quantity = quantity;
        this.rate = rate;
        this.amount = amount;
        this.delete_flag = delete_flag;
        this.submited_by = submited_by;
        this.submited_time = submited_time;
        this.edit_flag = edit_flag;
        this.edit_time = edit_time;
        this.is_latest = is_latest;
        this.rr_boq_total_id = rr_boq_total_id;
        this.edit_by = edit_by;
        this.rr_admin_id = rr_admin_id;
    }
}
