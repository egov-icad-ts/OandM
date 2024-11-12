package com.tgs.ir.entities;

public class Gis_sub_basin_mst {
@Column(name="sub_basin_id")
 
 private Integer  subBasinId;

@Column(name="sub_basin_name")
 
 private String  subBasinName;

@Column(name="basin_id")
 
 private Integer  basinId;

@Column(name="basin_name")
 
 private String  basinName;


    public Gis_sub_basin_mst(int sub_basin_id, Object sub_basin_name, int basin_id, Object basin_name) {
        this.sub_basin_id = sub_basin_id;
        this.sub_basin_name = sub_basin_name;
        this.basin_id = basin_id;
        this.basin_name = basin_name;
    }
}
