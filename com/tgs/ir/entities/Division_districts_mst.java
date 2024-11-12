package com.tgs.ir.entities;

public class Division_districts_mst {
@Column(name="dd_id")
 
 private Integer  ddId;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="district_id")
 
 private Integer  districtId;


    public Division_districts_mst(int dd_id, int unit_id, int circle_id, int division_id, int district_id) {
        this.dd_id = dd_id;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.district_id = district_id;
    }
}
