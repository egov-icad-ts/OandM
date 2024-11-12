package com.tgs.ir.entities;

public class Old_new_user_mapping {
@Column(name="id")
 
 private Integer  id;

@Column(name="lao_sdc_id_old")
 
 private Integer  laoSdcIdOld;

@Column(name="lao_sdc_id_new")
 
 private Integer  laoSdcIdNew;

@Column(name="deleteflag")
 
 private boolean  deleteflag;


    public Old_new_user_mapping(int id, int lao_sdc_id_old, int lao_sdc_id_new, boolean deleteflag) {
        this.id = id;
        this.lao_sdc_id_old = lao_sdc_id_old;
        this.lao_sdc_id_new = lao_sdc_id_new;
        this.deleteflag = deleteflag;
    }
}
