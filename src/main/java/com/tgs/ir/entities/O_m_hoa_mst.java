package com.tgs.ir.entities;

import jakarta.persistence.Column;

public class O_m_hoa_mst {
@Column(name="id")
 
 private Integer  id;

@Column(name="head_of_account")
 
 private String  headOfAccount;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


}
