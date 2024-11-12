package com.tgs.ir.entities;

public class O_m_work_called_type {
@Column(name="type_id")
 
 private Integer  typeId;

@Column(name="type_name")
 
 private String  typeName;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public O_m_work_called_type(int type_id, Object type_name, boolean delete_flag) {
        this.type_id = type_id;
        this.type_name = type_name;
        this.delete_flag = delete_flag;
    }
}
