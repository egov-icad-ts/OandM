package com.tgs.ir.entities;

public class Canal_mst {
@Column(name="canal_id")
 
 private Integer  canalId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="canal_name")
 
 private String  canalName;

@Column(name="canal_parent_id")
 
 private Integer  canalParentId;

@Column(name="level_id")
 
 private Integer  levelId;

@Column(name="canal_type")
 
 private String  canalType;

@Column(name="offtake_chainage")
 
 private Double  offtakeChainage;

@Column(name="canal_direction")
 
 private String  canalDirection;

@Column(name="canal_length")
 
 private Double  canalLength;

@Column(name="creation_date")
 
 private timestamp without time zone  creationDate;

@Column(name="last_updated_date")
 
 private timestamp without time zone  lastUpdatedDate;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="created_by_post")
 
 private bigint  createdByPost;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="canal_comp_id")
 
 private Integer  canalCompId;

@Column(name="last_updated")
 
 private timestamp without time zone  lastUpdated;

@Column(name="updated_by")
 
 private String  updatedBy;

@Column(name="lined_length")
 
 private Double  linedLength;

@Column(name="unlined_length")
 
 private Double  unlinedLength;

@Column(name="discharge_cumecs")
 
 private Double  dischargeCumecs;

@Column(name="assembly_code")
 
 private String  assemblyCode;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="mandal_id")
 
 private Integer  mandalId;

@Column(name="village_id")
 
 private Integer  villageId;

@Column(name="partial_lined_length")
 
 private Double  partialLinedLength;

@Column(name="canal_status_id")
 
 private Integer  canalStatusId;


    public Canal_mst(int canal_id, int project_id, int unit_id, Object canal_name, int canal_parent_id, int level_id, Object canal_type, double offtake_chainage, Object canal_direction, double canal_length, Object creation_date, Object last_updated_date, boolean delete_flag, long created_by_post, int circle_id, int division_id, int canal_comp_id, Object last_updated, Object updated_by, double lined_length, double unlined_length, double discharge_cumecs, Object assembly_code, int district_id, int mandal_id, int village_id, double partial_lined_length, int canal_status_id) {
        this.canal_id = canal_id;
        this.project_id = project_id;
        this.unit_id = unit_id;
        this.canal_name = canal_name;
        this.canal_parent_id = canal_parent_id;
        this.level_id = level_id;
        this.canal_type = canal_type;
        this.offtake_chainage = offtake_chainage;
        this.canal_direction = canal_direction;
        this.canal_length = canal_length;
        this.creation_date = creation_date;
        this.last_updated_date = last_updated_date;
        this.delete_flag = delete_flag;
        this.created_by_post = created_by_post;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.canal_comp_id = canal_comp_id;
        this.last_updated = last_updated;
        this.updated_by = updated_by;
        this.lined_length = lined_length;
        this.unlined_length = unlined_length;
        this.discharge_cumecs = discharge_cumecs;
        this.assembly_code = assembly_code;
        this.district_id = district_id;
        this.mandal_id = mandal_id;
        this.village_id = village_id;
        this.partial_lined_length = partial_lined_length;
        this.canal_status_id = canal_status_id;
    }
}
