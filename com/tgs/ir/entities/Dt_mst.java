package com.tgs.ir.entities;

public class Dt_mst {
@Column(name="dt_id")
 
 private Integer  dtId;

@Column(name="dt_name")
 
 private String  dtName;

@Column(name="lao_id")
 
 private Integer  laoId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Dt_mst(int dt_id, Object dt_name, int lao_id, boolean delete_flag) {
        this.dt_id = dt_id;
        this.dt_name = dt_name;
        this.lao_id = lao_id;
        this.delete_flag = delete_flag;
    }
}
