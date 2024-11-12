package com.tgs.ir.entities;

public class Canal_village_ip {
@Column(name="canal_ip_id")
 
 private Integer  canalIpId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="pkg_id")
 
 private Integer  pkgId;

@Column(name="canal_id")
 
 private Integer  canalId;

@Column(name="old_sub_division_id")
 
 private Integer  oldSubDivisionId;

@Column(name="assembly_code")
 
 private String  assemblyCode;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="mandal_id")
 
 private Integer  mandalId;

@Column(name="village_id")
 
 private Integer  villageId;

@Column(name="ip_created_acres")
 
 private Double  ipCreatedAcres;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="updated_by")
 
 private String  updatedBy;

@Column(name="updated_timestamp")
 
 private timestamp without time zone  updatedTimestamp;

@Column(name="ip_stabilised_acres")
 
 private Double  ipStabilisedAcres;

@Column(name="ip_contemplated")
 
 private Double  ipContemplated;

@Column(name="contemplated_wet")
 
 private Double  contemplatedWet;

@Column(name="contemplated_dry")
 
 private Double  contemplatedDry;

@Column(name="created_wet")
 
 private Double  createdWet;

@Column(name="created_dry")
 
 private Double  createdDry;

@Column(name="stabilised_wet")
 
 private Double  stabilisedWet;

@Column(name="stabilised_dry")
 
 private Double  stabilisedDry;

@Column(name="deleted_timestamp")
 
 private timestamp without time zone  deletedTimestamp;

@Column(name="stabilisaion_project_id")
 
 private Integer  stabilisaionProjectId;

@Column(name="sub_division_id")
 
 private Integer  subDivisionId;

@Column(name="is_updated")
 
 private String  isUpdated;


    public Canal_village_ip(int canal_ip_id, int project_id, int pkg_id, int canal_id, int old_sub_division_id, Object assembly_code, int district_id, int mandal_id, int village_id, double ip_created_acres, boolean delete_flag, boolean is_latest, Object updated_by, Object updated_timestamp, double ip_stabilised_acres, double ip_contemplated, double contemplated_wet, double contemplated_dry, double created_wet, double created_dry, double stabilised_wet, double stabilised_dry, Object deleted_timestamp, int stabilisaion_project_id, int sub_division_id, Object is_updated) {
        this.canal_ip_id = canal_ip_id;
        this.project_id = project_id;
        this.pkg_id = pkg_id;
        this.canal_id = canal_id;
        this.old_sub_division_id = old_sub_division_id;
        this.assembly_code = assembly_code;
        this.district_id = district_id;
        this.mandal_id = mandal_id;
        this.village_id = village_id;
        this.ip_created_acres = ip_created_acres;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.updated_by = updated_by;
        this.updated_timestamp = updated_timestamp;
        this.ip_stabilised_acres = ip_stabilised_acres;
        this.ip_contemplated = ip_contemplated;
        this.contemplated_wet = contemplated_wet;
        this.contemplated_dry = contemplated_dry;
        this.created_wet = created_wet;
        this.created_dry = created_dry;
        this.stabilised_wet = stabilised_wet;
        this.stabilised_dry = stabilised_dry;
        this.deleted_timestamp = deleted_timestamp;
        this.stabilisaion_project_id = stabilisaion_project_id;
        this.sub_division_id = sub_division_id;
        this.is_updated = is_updated;
    }
}
