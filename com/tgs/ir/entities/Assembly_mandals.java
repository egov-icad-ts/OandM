package com.tgs.ir.entities;

public class Assembly_mandals {
@Column(name="slno")
 
 private Integer  slno;

@Column(name="acode")
 
 private String  acode;

@Column(name="aname")
 
 private String  aname;

@Column(name="mname")
 
 private String  mname;

@Column(name="mandal_id")
 
 private Integer  mandalId;

@Column(name="mcode")
 
 private String  mcode;


    public Assembly_mandals(int slno, Object acode, Object aname, Object mname, int mandal_id, Object mcode) {
        this.slno = slno;
        this.acode = acode;
        this.aname = aname;
        this.mname = mname;
        this.mandal_id = mandal_id;
        this.mcode = mcode;
    }
}
