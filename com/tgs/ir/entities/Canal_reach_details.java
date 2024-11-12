package com.tgs.ir.entities;

public class Canal_reach_details {
@Column(name="reach_id")
 
 private Integer  reachId;

@Column(name="reach_from")
 
 private double precision  reachFrom;

@Column(name="reach_to")
 
 private double precision  reachTo;

@Column(name="reach_name")
 
 private String  reachName;

@Column(name="hps_type_revised")
 
 private boolean  hpsTypeRevised;

@Column(name="reach_start_bed_level")
 
 private double precision  reachStartBedLevel;

@Column(name="line_dia_path")
 
 private String  lineDiaPath;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="canal_id")
 
 private Integer  canalId;

@Column(name="fsd")
 
 private double precision  fsd;

@Column(name="freeboard")
 
 private double precision  freeboard;

@Column(name="bedfall")
 
 private double precision  bedfall;

@Column(name="req_discharge")
 
 private double precision  reqDischarge;

@Column(name="updateby_user")
 
 private String  updatebyUser;

@Column(name="is_approved")
 
 private boolean  isApproved;

@Column(name="update_time")
 
 private timestamp with time zone  updateTime;

@Column(name="delete_user")
 
 private String  deleteUser;

@Column(name="delete_time")
 
 private timestamp with time zone  deleteTime;

@Column(name="prev_id")
 
 private Integer  prevId;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="banking_type")
 
 private String  bankingType;

@Column(name="banking")
 
 private String  banking;

@Column(name="ground_level")
 
 private Double  groundLevel;


    public Canal_reach_details(int reach_id, Object reach_from, Object reach_to, Object reach_name, boolean hps_type_revised, Object reach_start_bed_level, Object line_dia_path, boolean delete_flag, int canal_id, Object fsd, Object freeboard, Object bedfall, Object req_discharge, Object updateby_user, boolean is_approved, Object update_time, Object delete_user, Object delete_time, int prev_id, boolean is_latest, Object banking_type, Object banking, double ground_level) {
        this.reach_id = reach_id;
        this.reach_from = reach_from;
        this.reach_to = reach_to;
        this.reach_name = reach_name;
        this.hps_type_revised = hps_type_revised;
        this.reach_start_bed_level = reach_start_bed_level;
        this.line_dia_path = line_dia_path;
        this.delete_flag = delete_flag;
        this.canal_id = canal_id;
        this.fsd = fsd;
        this.freeboard = freeboard;
        this.bedfall = bedfall;
        this.req_discharge = req_discharge;
        this.updateby_user = updateby_user;
        this.is_approved = is_approved;
        this.update_time = update_time;
        this.delete_user = delete_user;
        this.delete_time = delete_time;
        this.prev_id = prev_id;
        this.is_latest = is_latest;
        this.banking_type = banking_type;
        this.banking = banking;
        this.ground_level = ground_level;
    }
}
