package com.tgs.ir.entities;

public class O_m_work_type_mst {
@Column(name="work_type_id")
 
 private Integer  workTypeId;

@Column(name="work_type_name")
 
 private String  workTypeName;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public O_m_work_type_mst(int work_type_id, Object work_type_name, boolean delete_flag) {
        this.work_type_id = work_type_id;
        this.work_type_name = work_type_name;
        this.delete_flag = delete_flag;
    }
}
