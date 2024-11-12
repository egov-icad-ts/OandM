package com.tgs.ir.entities;

public class Component_work_subgroup {
@Column(name="work_subgroup_id")
 
 private Integer  workSubgroupId;

@Column(name="work_subgroup_name")
 
 private String  workSubgroupName;

@Column(name="work_grp_id")
 
 private Integer  workGrpId;

@Column(name="work_subgroup_order")
 
 private Integer  workSubgroupOrder;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Component_work_subgroup(int work_subgroup_id, Object work_subgroup_name, int work_grp_id, int work_subgroup_order, boolean delete_flag) {
        this.work_subgroup_id = work_subgroup_id;
        this.work_subgroup_name = work_subgroup_name;
        this.work_grp_id = work_grp_id;
        this.work_subgroup_order = work_subgroup_order;
        this.delete_flag = delete_flag;
    }
}
