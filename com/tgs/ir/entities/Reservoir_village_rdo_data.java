package com.tgs.ir.entities;

public class Reservoir_village_rdo_data {
@Column(name="resvill_id")
 
 private Integer  resvillId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="reservoir_id")
 
 private Integer  reservoirId;

@Column(name="reservoir_status")
 
 private Integer  reservoirStatus;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="mandal_id")
 
 private Integer  mandalId;

@Column(name="village_id")
 
 private Integer  villageId;

@Column(name="submergence_status")
 
 private Integer  submergenceStatus;

@Column(name="requisi_acres")
 
 private Integer  requisiAcres;

@Column(name="requisi_guntas")
 
 private Double  requisiGuntas;

@Column(name="sub_vill_acres")
 
 private Integer  subVillAcres;

@Column(name="sub_vill_guntas")
 
 private Double  subVillGuntas;

@Column(name="nonsub_vill_acres")
 
 private Integer  nonsubVillAcres;

@Column(name="nonsub_vill_guntas")
 
 private Double  nonsubVillGuntas;

@Column(name="acquired_acres")
 
 private Integer  acquiredAcres;

@Column(name="acquired_guntas")
 
 private Double  acquiredGuntas;

@Column(name="percentage_of_filling")
 
 private Integer  percentageOfFilling;

@Column(name="remarks")
 
 private String  remarks;

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

@Column(name="sub_division_id")
 
 private Integer  subDivisionId;

@Column(name="created_by")
 
 private String  createdBy;

@Column(name="created_timestamp")
 
 private timestamp without time zone  createdTimestamp;

@Column(name="deleted_by")
 
 private String  deletedBy;

@Column(name="deleted_timestamp")
 
 private timestamp without time zone  deletedTimestamp;

@Column(name="gis_acres")
 
 private Integer  gisAcres;

@Column(name="gis_guntas")
 
 private Double  gisGuntas;

@Column(name="comp_type_id")
 
 private Integer  compTypeId;


    public Reservoir_village_rdo_data(int resvill_id, int project_id, int reservoir_id, int reservoir_status, int district_id, int mandal_id, int village_id, int submergence_status, int requisi_acres, double requisi_guntas, int sub_vill_acres, double sub_vill_guntas, int nonsub_vill_acres, double nonsub_vill_guntas, int acquired_acres, double acquired_guntas, int percentage_of_filling, Object remarks, boolean delete_flag, boolean is_latest, int unit_id, int circle_id, int division_id, int sub_division_id, Object created_by, Object created_timestamp, Object deleted_by, Object deleted_timestamp, int gis_acres, double gis_guntas, int comp_type_id) {
        this.resvill_id = resvill_id;
        this.project_id = project_id;
        this.reservoir_id = reservoir_id;
        this.reservoir_status = reservoir_status;
        this.district_id = district_id;
        this.mandal_id = mandal_id;
        this.village_id = village_id;
        this.submergence_status = submergence_status;
        this.requisi_acres = requisi_acres;
        this.requisi_guntas = requisi_guntas;
        this.sub_vill_acres = sub_vill_acres;
        this.sub_vill_guntas = sub_vill_guntas;
        this.nonsub_vill_acres = nonsub_vill_acres;
        this.nonsub_vill_guntas = nonsub_vill_guntas;
        this.acquired_acres = acquired_acres;
        this.acquired_guntas = acquired_guntas;
        this.percentage_of_filling = percentage_of_filling;
        this.remarks = remarks;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
        this.created_by = created_by;
        this.created_timestamp = created_timestamp;
        this.deleted_by = deleted_by;
        this.deleted_timestamp = deleted_timestamp;
        this.gis_acres = gis_acres;
        this.gis_guntas = gis_guntas;
        this.comp_type_id = comp_type_id;
    }
}
