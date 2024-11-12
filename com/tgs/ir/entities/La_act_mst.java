package com.tgs.ir.entities;

public class La_act_mst {
@Column(name="la_act_id")
 
 private Integer  laActId;

@Column(name="la_act")
 
 private String  laAct;


    public La_act_mst(int la_act_id, Object la_act) {
        this.la_act_id = la_act_id;
        this.la_act = la_act;
    }
}
