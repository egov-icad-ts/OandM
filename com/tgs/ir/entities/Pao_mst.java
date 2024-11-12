package com.tgs.ir.entities;

public class Pao_mst {
@Column(name="pao_id")
 
 private Integer  paoId;

@Column(name="pao_code")
 
 private Integer  paoCode;

@Column(name="pao_name")
 
 private String  paoName;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Pao_mst(int pao_id, int pao_code, Object pao_name, int district_id, boolean delete_flag) {
        this.pao_id = pao_id;
        this.pao_code = pao_code;
        this.pao_name = pao_name;
        this.district_id = district_id;
        this.delete_flag = delete_flag;
    }
}
