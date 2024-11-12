package com.tgs.ir.entities;

public class Village_mst {
@Column(name="village_name")
 
 private String  villageName;

@Column(name="mandal_id")
 
 private Integer  mandalId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="dcode")
 
 private String  dcode;

@Column(name="mcode")
 
 private String  mcode;

@Column(name="vcode")
 
 private String  vcode;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="village_id")
 
 private Integer  villageId;

@Column(name="village_name")
 
 private String  villageName;

@Column(name="mandal_id")
 
 private Integer  mandalId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="dcode")
 
 private String  dcode;

@Column(name="mcode")
 
 private String  mcode;

@Column(name="vcode")
 
 private String  vcode;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="village_id")
 
 private Integer  villageId;

@Column(name="mk_dcode")
 
 private Integer  mkDcode;

@Column(name="mk_mcode")
 
 private Integer  mkMcode;

@Column(name="mk_vcode")
 
 private Integer  mkVcode;


    public Village_mst(Object village_name, int mandal_id, boolean delete_flag, Object dcode, Object mcode, Object vcode, int district_id, int village_id, Object village_name, int mandal_id, boolean delete_flag, Object dcode, Object mcode, Object vcode, int district_id, int village_id, int mk_dcode, int mk_mcode, int mk_vcode) {
        this.village_name = village_name;
        this.mandal_id = mandal_id;
        this.delete_flag = delete_flag;
        this.dcode = dcode;
        this.mcode = mcode;
        this.vcode = vcode;
        this.district_id = district_id;
        this.village_id = village_id;
        this.village_name = village_name;
        this.mandal_id = mandal_id;
        this.delete_flag = delete_flag;
        this.dcode = dcode;
        this.mcode = mcode;
        this.vcode = vcode;
        this.district_id = district_id;
        this.village_id = village_id;
        this.mk_dcode = mk_dcode;
        this.mk_mcode = mk_mcode;
        this.mk_vcode = mk_vcode;
    }
}
