package com.tgs.ir.entities;

public class Processor_mst {
@Column(name="p_id")
 
 private Integer  pId;

@Column(name="process_desc")
 
 private String  processDesc;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Processor_mst(int p_id, Object process_desc, boolean delete_flag) {
        this.p_id = p_id;
        this.process_desc = process_desc;
        this.delete_flag = delete_flag;
    }
}
