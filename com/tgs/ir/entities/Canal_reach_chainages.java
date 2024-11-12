package com.tgs.ir.entities;

public class Canal_reach_chainages {
@Column(name="chainage_id")
 
 private Integer  chainageId;

@Column(name="from_km")
 
 private double precision  fromKm;

@Column(name="to_km")
 
 private double precision  toKm;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="updateby_user")
 
 private String  updatebyUser;

@Column(name="update_time")
 
 private timestamp with time zone  updateTime;

@Column(name="reach_id")
 
 private Integer  reachId;

@Column(name="canal_id")
 
 private Integer  canalId;

@Column(name="sideslope")
 
 private double precision  sideslope;


    public Canal_reach_chainages(int chainage_id, Object from_km, Object to_km, boolean delete_flag, Object updateby_user, Object update_time, int reach_id, int canal_id, Object sideslope) {
        this.chainage_id = chainage_id;
        this.from_km = from_km;
        this.to_km = to_km;
        this.delete_flag = delete_flag;
        this.updateby_user = updateby_user;
        this.update_time = update_time;
        this.reach_id = reach_id;
        this.canal_id = canal_id;
        this.sideslope = sideslope;
    }
}
