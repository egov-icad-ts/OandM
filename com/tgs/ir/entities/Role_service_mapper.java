package com.tgs.ir.entities;

public class Role_service_mapper {
@Column(name="roleid")
 
 private Integer  roleid;

@Column(name="serviceid")
 
 private Integer  serviceid;

@Column(name="deleteflag")
 
 private boolean  deleteflag;


    public Role_service_mapper(int roleid, int serviceid, boolean deleteflag) {
        this.roleid = roleid;
        this.serviceid = serviceid;
        this.deleteflag = deleteflag;
    }
}
