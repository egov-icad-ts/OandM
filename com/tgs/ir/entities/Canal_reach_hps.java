package com.tgs.ir.entities;

public class Canal_reach_hps {
@Column(name="reach_hps_id")
 
 private Integer  reachHpsId;

@Column(name="side_slope")
 
 private double precision  sideSlope;

@Column(name="bed_width")
 
 private double precision  bedWidth;

@Column(name="velocity")
 
 private double precision  velocity;

@Column(name="inspec_width")
 
 private double precision  inspecWidth;

@Column(name="non_inspec_width")
 
 private double precision  nonInspecWidth;

@Column(name="dowel_bank")
 
 private String  dowelBank;

@Column(name="des_discharge")
 
 private double precision  desDischarge;

@Column(name="reach_id")
 
 private Integer  reachId;

@Column(name="canal_id")
 
 private Integer  canalId;

@Column(name="updateby_user")
 
 private String  updatebyUser;

@Column(name="update_time")
 
 private timestamp with time zone  updateTime;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="rugosity")
 
 private double precision  rugosity;


    public Canal_reach_hps(int reach_hps_id, Object side_slope, Object bed_width, Object velocity, Object inspec_width, Object non_inspec_width, Object dowel_bank, Object des_discharge, int reach_id, int canal_id, Object updateby_user, Object update_time, boolean delete_flag, Object rugosity) {
        this.reach_hps_id = reach_hps_id;
        this.side_slope = side_slope;
        this.bed_width = bed_width;
        this.velocity = velocity;
        this.inspec_width = inspec_width;
        this.non_inspec_width = non_inspec_width;
        this.dowel_bank = dowel_bank;
        this.des_discharge = des_discharge;
        this.reach_id = reach_id;
        this.canal_id = canal_id;
        this.updateby_user = updateby_user;
        this.update_time = update_time;
        this.delete_flag = delete_flag;
        this.rugosity = rugosity;
    }
}
