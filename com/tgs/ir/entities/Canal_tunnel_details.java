package com.tgs.ir.entities;

public class Canal_tunnel_details {
@Column(name="tunnel_id")
 
 private Integer  tunnelId;

@Column(name="canal_id")
 
 private Integer  canalId;

@Column(name="tunnel_name")
 
 private String  tunnelName;

@Column(name="tunnel_length")
 
 private double precision  tunnelLength;

@Column(name="connect_chainage")
 
 private double precision  connectChainage;

@Column(name="connect_type")
 
 private Integer  connectType;

@Column(name="tunnel_shape")
 
 private Integer  tunnelShape;

@Column(name="tunnel_diameter")
 
 private double precision  tunnelDiameter;

@Column(name="invert_level_entry")
 
 private double precision  invertLevelEntry;

@Column(name="invert_level_exit")
 
 private double precision  invertLevelExit;

@Column(name="carrying_capacity")
 
 private double precision  carryingCapacity;

@Column(name="lining_type")
 
 private Integer  liningType;

@Column(name="hydraulic_gradient")
 
 private double precision  hydraulicGradient;

@Column(name="flow_velocity")
 
 private double precision  flowVelocity;

@Column(name="latitude")
 
 private String  latitude;

@Column(name="longitude")
 
 private String  longitude;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_approved")
 
 private boolean  isApproved;

@Column(name="reject_remarks")
 
 private String  rejectRemarks;

@Column(name="update_user")
 
 private String  updateUser;

@Column(name="update_time")
 
 private time with time zone  updateTime;

@Column(name="delete_user")
 
 private String  deleteUser;

@Column(name="delete_time")
 
 private timestamp with time zone  deleteTime;


    public Canal_tunnel_details(int tunnel_id, int canal_id, Object tunnel_name, Object tunnel_length, Object connect_chainage, int connect_type, int tunnel_shape, Object tunnel_diameter, Object invert_level_entry, Object invert_level_exit, Object carrying_capacity, int lining_type, Object hydraulic_gradient, Object flow_velocity, Object latitude, Object longitude, Object remarks, boolean delete_flag, boolean is_approved, Object reject_remarks, Object update_user, Object update_time, Object delete_user, Object delete_time) {
        this.tunnel_id = tunnel_id;
        this.canal_id = canal_id;
        this.tunnel_name = tunnel_name;
        this.tunnel_length = tunnel_length;
        this.connect_chainage = connect_chainage;
        this.connect_type = connect_type;
        this.tunnel_shape = tunnel_shape;
        this.tunnel_diameter = tunnel_diameter;
        this.invert_level_entry = invert_level_entry;
        this.invert_level_exit = invert_level_exit;
        this.carrying_capacity = carrying_capacity;
        this.lining_type = lining_type;
        this.hydraulic_gradient = hydraulic_gradient;
        this.flow_velocity = flow_velocity;
        this.latitude = latitude;
        this.longitude = longitude;
        this.remarks = remarks;
        this.delete_flag = delete_flag;
        this.is_approved = is_approved;
        this.reject_remarks = reject_remarks;
        this.update_user = update_user;
        this.update_time = update_time;
        this.delete_user = delete_user;
        this.delete_time = delete_time;
    }
}
