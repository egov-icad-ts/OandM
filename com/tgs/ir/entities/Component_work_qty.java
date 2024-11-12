package com.tgs.ir.entities;

public class Component_work_qty {
@Column(name="comp_work_qty_id")
 
 private Integer  compWorkQtyId;

@Column(name="comp_id")
 
 private Integer  compId;

@Column(name="work_subgrp_id")
 
 private Integer  workSubgrpId;

@Column(name="measure_id")
 
 private Integer  measureId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="package_id")
 
 private Integer  packageId;

@Column(name="total_qty")
 
 private Double  totalQty;

@Column(name="unit_rate")
 
 private Double  unitRate;

@Column(name="amount")
 
 private Double  amount;

@Column(name="is_latest")
 
 private String  isLatest;

@Column(name="struct_count")
 
 private Integer  structCount;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_approved")
 
 private boolean  isApproved;

@Column(name="userid")
 
 private Double  userid;

@Column(name="postid")
 
 private Double  postid;


    public Component_work_qty(int comp_work_qty_id, int comp_id, int work_subgrp_id, int measure_id, int project_id, int package_id, double total_qty, double unit_rate, double amount, Object is_latest, int struct_count, boolean delete_flag, boolean is_approved, double userid, double postid) {
        this.comp_work_qty_id = comp_work_qty_id;
        this.comp_id = comp_id;
        this.work_subgrp_id = work_subgrp_id;
        this.measure_id = measure_id;
        this.project_id = project_id;
        this.package_id = package_id;
        this.total_qty = total_qty;
        this.unit_rate = unit_rate;
        this.amount = amount;
        this.is_latest = is_latest;
        this.struct_count = struct_count;
        this.delete_flag = delete_flag;
        this.is_approved = is_approved;
        this.userid = userid;
        this.postid = postid;
    }
}
