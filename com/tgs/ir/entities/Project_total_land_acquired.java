package com.tgs.ir.entities;

public class Project_total_land_acquired {
@Column(name="land_id")
 
 private Integer  landId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="total_land_acq_acre")
 
 private Integer  totalLandAcqAcre;

@Column(name="total_land_acq_gunta")
 
 private Double  totalLandAcqGunta;

@Column(name="delete_falg")
 
 private boolean  deleteFalg;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="created_by_username")
 
 private String  createdByUsername;

@Column(name="post_id")
 
 private String  postId;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="created_timestamp")
 
 private timestamp without time zone  createdTimestamp;

@Column(name="la_act")
 
 private Integer  laAct;


    public Project_total_land_acquired(int land_id, int project_id, int total_land_acq_acre, double total_land_acq_gunta, boolean delete_falg, boolean is_latest, Object created_by_username, Object post_id, int unit_id, int circle_id, Object created_timestamp, int la_act) {
        this.land_id = land_id;
        this.project_id = project_id;
        this.total_land_acq_acre = total_land_acq_acre;
        this.total_land_acq_gunta = total_land_acq_gunta;
        this.delete_falg = delete_falg;
        this.is_latest = is_latest;
        this.created_by_username = created_by_username;
        this.post_id = post_id;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.created_timestamp = created_timestamp;
        this.la_act = la_act;
    }
}
