package com.tgs.ir.entities;

public class Component_work_group {
@Column(name="work_group_id")
 
 private Integer  workGroupId;

@Column(name="work_group_name")
 
 private String  workGroupName;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Component_work_group(int work_group_id, Object work_group_name, boolean delete_flag) {
        this.work_group_id = work_group_id;
        this.work_group_name = work_group_name;
        this.delete_flag = delete_flag;
    }
}
