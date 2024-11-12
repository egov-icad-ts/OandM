package com.tgs.ir.entities;

public class Canal_structures_data {
@Column(name="struc_id")
 
 private Integer  strucId;

@Column(name="canal_id")
 
 private Integer  canalId;

@Column(name="struc_type")
 
 private Integer  strucType;

@Column(name="struc_chainage")
 
 private double precision  strucChainage;

@Column(name="struc_head_loss")
 
 private double precision  strucHeadLoss;

@Column(name="struc_lat")
 
 private String  strucLat;

@Column(name="struc_long")
 
 private String  strucLong;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="updateby_user")
 
 private String  updatebyUser;

@Column(name="update_time")
 
 private timestamp with time zone  updateTime;

@Column(name="reach_id")
 
 private Integer  reachId;

@Column(name="struc_condition")
 
 private Integer  strucCondition;

@Column(name="remarks")
 
 private String  remarks;


    public Canal_structures_data(int struc_id, int canal_id, int struc_type, Object struc_chainage, Object struc_head_loss, Object struc_lat, Object struc_long, boolean delete_flag, Object updateby_user, Object update_time, int reach_id, int struc_condition, Object remarks) {
        this.struc_id = struc_id;
        this.canal_id = canal_id;
        this.struc_type = struc_type;
        this.struc_chainage = struc_chainage;
        this.struc_head_loss = struc_head_loss;
        this.struc_lat = struc_lat;
        this.struc_long = struc_long;
        this.delete_flag = delete_flag;
        this.updateby_user = updateby_user;
        this.update_time = update_time;
        this.reach_id = reach_id;
        this.struc_condition = struc_condition;
        this.remarks = remarks;
    }
}
