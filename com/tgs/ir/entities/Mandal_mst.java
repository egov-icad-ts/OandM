package com.tgs.ir.entities;

public class Mandal_mst {
@Column(name="mandal_id")
 
 private Integer  mandalId;

@Column(name="mandal_name")
 
 private String  mandalName;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="dcode")
 
 private String  dcode;

@Column(name="mcode")
 
 private String  mcode;

@Column(name="mandal_id")
 
 private Integer  mandalId;

@Column(name="mandal_name")
 
 private String  mandalName;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="dcode")
 
 private String  dcode;

@Column(name="mcode")
 
 private String  mcode;

@Column(name="mk_dcode")
 
 private Integer  mkDcode;

@Column(name="mk_mcode")
 
 private Integer  mkMcode;


    public Mandal_mst(int mandal_id, Object mandal_name, int district_id, boolean delete_flag, Object dcode, Object mcode, int mandal_id, Object mandal_name, int district_id, boolean delete_flag, Object dcode, Object mcode, int mk_dcode, int mk_mcode) {
        this.mandal_id = mandal_id;
        this.mandal_name = mandal_name;
        this.district_id = district_id;
        this.delete_flag = delete_flag;
        this.dcode = dcode;
        this.mcode = mcode;
        this.mandal_id = mandal_id;
        this.mandal_name = mandal_name;
        this.district_id = district_id;
        this.delete_flag = delete_flag;
        this.dcode = dcode;
        this.mcode = mcode;
        this.mk_dcode = mk_dcode;
        this.mk_mcode = mk_mcode;
    }
}
