package com.tgs.ir.entities;

public class Reservoir_hps_gis_la {
@Column(name="id")
 
 private Integer  id;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="comp_id")
 
 private Integer  compId;

@Column(name="res_status")
 
 private Integer  resStatus;

@Column(name="hps_acres")
 
 private Double  hpsAcres;

@Column(name="acquired_acres")
 
 private Double  acquiredAcres;

@Column(name="percentage_filling")
 
 private Integer  percentageFilling;

@Column(name="mitank_existing")
 
 private String  mitankExisting;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="created_by")
 
 private String  createdBy;

@Column(name="created_time")
 
 private timestamp without time zone  createdTime;

@Column(name="deleted_by")
 
 private String  deletedBy;

@Column(name="deleted_timestamp")
 
 private timestamp without time zone  deletedTimestamp;

@Column(name="g_acres")
 
 private Double  gAcres;

@Column(name="remarks")
 
 private String  remarks;


    public Reservoir_hps_gis_la(int id, int project_id, int comp_id, int res_status, double hps_acres, double acquired_acres, int percentage_filling, Object mitank_existing, boolean delete_flag, boolean is_latest, int unit_id, int circle_id, int division_id, Object created_by, Object created_time, Object deleted_by, Object deleted_timestamp, double g_acres, Object remarks) {
        this.id = id;
        this.project_id = project_id;
        this.comp_id = comp_id;
        this.res_status = res_status;
        this.hps_acres = hps_acres;
        this.acquired_acres = acquired_acres;
        this.percentage_filling = percentage_filling;
        this.mitank_existing = mitank_existing;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.created_by = created_by;
        this.created_time = created_time;
        this.deleted_by = deleted_by;
        this.deleted_timestamp = deleted_timestamp;
        this.g_acres = g_acres;
        this.remarks = remarks;
    }
}
