package com.tgs.ir.entities;

public class Camp_land_colony_mapping {
@Column(name="camp_id")
 
 private Integer  campId;

@Column(name="village_id")
 
 private Integer  villageId;

@Column(name="colony_name")
 
 private String  colonyName;

@Column(name="sub_division_id")
 
 private Integer  subDivisionId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="created_by")
 
 private String  createdBy;


    public Camp_land_colony_mapping(int camp_id, int village_id, Object colony_name, int sub_division_id, int division_id, int circle_id, int unit_id, int project_id, Object created_by) {
        this.camp_id = camp_id;
        this.village_id = village_id;
        this.colony_name = colony_name;
        this.sub_division_id = sub_division_id;
        this.division_id = division_id;
        this.circle_id = circle_id;
        this.unit_id = unit_id;
        this.project_id = project_id;
        this.created_by = created_by;
    }
}
