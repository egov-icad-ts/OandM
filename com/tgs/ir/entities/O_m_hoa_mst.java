package com.tgs.ir.entities;

public class O_m_hoa_mst {
@Column(name="id")
 
 private Integer  id;

@Column(name="head_of_account")
 
 private String  headOfAccount;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public O_m_hoa_mst(int id, Object head_of_account, boolean delete_flag) {
        this.id = id;
        this.head_of_account = head_of_account;
        this.delete_flag = delete_flag;
    }
}
