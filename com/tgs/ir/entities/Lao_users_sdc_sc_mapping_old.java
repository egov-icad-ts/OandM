package com.tgs.ir.entities;

public class Lao_users_sdc_sc_mapping_old {
@Column(name="lao_sc_id")
 
 private Integer  laoScId;

@Column(name="lao_sdc_id")
 
 private Integer  laoSdcId;

@Column(name="deleteflag")
 
 private boolean  deleteflag;


    public Lao_users_sdc_sc_mapping_old(int lao_sc_id, int lao_sdc_id, boolean deleteflag) {
        this.lao_sc_id = lao_sc_id;
        this.lao_sdc_id = lao_sdc_id;
        this.deleteflag = deleteflag;
    }
}
