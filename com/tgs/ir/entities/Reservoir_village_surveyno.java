package com.tgs.ir.entities;

public class Reservoir_village_surveyno {
@Column(name="id")
 
 private Integer  id;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="reservoir_id")
 
 private Integer  reservoirId;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="mandal_id")
 
 private Integer  mandalId;

@Column(name="village_id")
 
 private Integer  villageId;

@Column(name="submergence_status")
 
 private Integer  submergenceStatus;

@Column(name="twris_survey_no")
 
 private String  twrisSurveyNo;

@Column(name="dharani_acres")
 
 private Integer  dharaniAcres;

@Column(name="dharani_guntas")
 
 private Double  dharaniGuntas;

@Column(name="mutation_status")
 
 private Integer  mutationStatus;

@Column(name="percentage_filling")
 
 private Integer  percentageFilling;

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

@Column(name="created_time")
 
 private timestamp without time zone  createdTime;

@Column(name="deleted_by")
 
 private String  deletedBy;

@Column(name="deleted_timestamp")
 
 private timestamp without time zone  deletedTimestamp;

@Column(name="mut_reason")
 
 private Integer  mutReason;

@Column(name="canal_other")
 
 private Integer  canalOther;


    public Reservoir_village_surveyno(int id, int project_id, int reservoir_id, int district_id, int mandal_id, int village_id, int submergence_status, Object twris_survey_no, int dharani_acres, double dharani_guntas, int mutation_status, int percentage_filling, Object remarks, boolean delete_flag, boolean is_latest, int unit_id, int circle_id, int division_id, int sub_division_id, Object created_by, Object created_time, Object deleted_by, Object deleted_timestamp, int mut_reason, int canal_other) {
        this.id = id;
        this.project_id = project_id;
        this.reservoir_id = reservoir_id;
        this.district_id = district_id;
        this.mandal_id = mandal_id;
        this.village_id = village_id;
        this.submergence_status = submergence_status;
        this.twris_survey_no = twris_survey_no;
        this.dharani_acres = dharani_acres;
        this.dharani_guntas = dharani_guntas;
        this.mutation_status = mutation_status;
        this.percentage_filling = percentage_filling;
        this.remarks = remarks;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
        this.created_by = created_by;
        this.created_time = created_time;
        this.deleted_by = deleted_by;
        this.deleted_timestamp = deleted_timestamp;
        this.mut_reason = mut_reason;
        this.canal_other = canal_other;
    }
}
