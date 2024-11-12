package com.tgs.ir.entities;

public class Ce_assign_se_canal_res_lift {
@Column(name="ce_assign_se_canal_res_lift_id")
 
 private Integer  ceAssignSeCanalResLiftId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="canal_res_lift_id")
 
 private Integer  canalResLiftId;

@Column(name="comp_type")
 
 private Integer  compType;

@Column(name="from_km")
 
 private Double  fromKm;

@Column(name="to_km")
 
 private Double  toKm;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="from_date")
 
 private timestamp without time zone  fromDate;

@Column(name="to_date")
 
 private timestamp without time zone  toDate;

@Column(name="delete_falg")
 
 private boolean  deleteFalg;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="post_id")
 
 private String  postId;

@Column(name="created_user_id")
 
 private String  createdUserId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="circle_post_id")
 
 private bigint  circlePostId;


    public Ce_assign_se_canal_res_lift(int ce_assign_se_canal_res_lift_id, int project_id, int canal_res_lift_id, int comp_type, double from_km, double to_km, int unit_id, Object from_date, Object to_date, boolean delete_falg, boolean is_latest, Object post_id, Object created_user_id, int circle_id, long circle_post_id) {
        this.ce_assign_se_canal_res_lift_id = ce_assign_se_canal_res_lift_id;
        this.project_id = project_id;
        this.canal_res_lift_id = canal_res_lift_id;
        this.comp_type = comp_type;
        this.from_km = from_km;
        this.to_km = to_km;
        this.unit_id = unit_id;
        this.from_date = from_date;
        this.to_date = to_date;
        this.delete_falg = delete_falg;
        this.is_latest = is_latest;
        this.post_id = post_id;
        this.created_user_id = created_user_id;
        this.circle_id = circle_id;
        this.circle_post_id = circle_post_id;
    }
}
