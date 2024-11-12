package com.tgs.ir.entities;

public class Project_canal_lengths {
@Column(name="ls_id")
 
 private Integer  lsId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="comp_type_id")
 
 private Integer  compTypeId;

@Column(name="reservoir_id")
 
 private Integer  reservoirId;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="mandal_id")
 
 private Integer  mandalId;

@Column(name="village_id")
 
 private Integer  villageId;

@Column(name="mc_total")
 
 private Double  mcTotal;

@Column(name="mc_completed")
 
 private Double  mcCompleted;

@Column(name="mc_functional")
 
 private Double  mcFunctional;

@Column(name="bc_total")
 
 private Double  bcTotal;

@Column(name="bc_complted")
 
 private Double  bcComplted;

@Column(name="bc_functional")
 
 private Double  bcFunctional;

@Column(name="total_lascars")
 
 private Integer  totalLascars;

@Column(name="req_lascars")
 
 private Integer  reqLascars;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="updated_by")
 
 private String  updatedBy;

@Column(name="deleted_by")
 
 private String  deletedBy;

@Column(name="created_timestamp")
 
 private timestamp without time zone  createdTimestamp;

@Column(name="updated_timestamp")
 
 private timestamp without time zone  updatedTimestamp;

@Column(name="deleted_timestamp")
 
 private timestamp without time zone  deletedTimestamp;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="is_updated")
 
 private boolean  isUpdated;

@Column(name="remarks")
 
 private String  remarks;


    public Project_canal_lengths(int ls_id, int project_id, int comp_type_id, int reservoir_id, int district_id, int mandal_id, int village_id, double mc_total, double mc_completed, double mc_functional, double bc_total, double bc_complted, double bc_functional, int total_lascars, int req_lascars, boolean delete_flag, boolean is_latest, Object updated_by, Object deleted_by, Object created_timestamp, Object updated_timestamp, Object deleted_timestamp, int unit_id, int circle_id, int division_id, boolean is_updated, Object remarks) {
        this.ls_id = ls_id;
        this.project_id = project_id;
        this.comp_type_id = comp_type_id;
        this.reservoir_id = reservoir_id;
        this.district_id = district_id;
        this.mandal_id = mandal_id;
        this.village_id = village_id;
        this.mc_total = mc_total;
        this.mc_completed = mc_completed;
        this.mc_functional = mc_functional;
        this.bc_total = bc_total;
        this.bc_complted = bc_complted;
        this.bc_functional = bc_functional;
        this.total_lascars = total_lascars;
        this.req_lascars = req_lascars;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.updated_by = updated_by;
        this.deleted_by = deleted_by;
        this.created_timestamp = created_timestamp;
        this.updated_timestamp = updated_timestamp;
        this.deleted_timestamp = deleted_timestamp;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.is_updated = is_updated;
        this.remarks = remarks;
    }
}
