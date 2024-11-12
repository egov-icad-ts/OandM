package com.tgs.ir.entities;

public class Mission_bgrt_data {
@Column(name="slno")
 
 private Integer  slno;

@Column(name="reservoir_id")
 
 private Integer  reservoirId;

@Column(name="mb_capacity")
 
 private Double  mbCapacity;

@Column(name="mb_frl")
 
 private Double  mbFrl;

@Column(name="mpdl_capacity")
 
 private Double  mpdlCapacity;

@Column(name="mb_deadstorage")
 
 private Double  mbDeadstorage;

@Column(name="requirement_july")
 
 private Double  requirementJuly;

@Column(name="basin_id")
 
 private Integer  basinId;

@Column(name="modified_frl")
 
 private Double  modifiedFrl;

@Column(name="modified_capacity")
 
 private Double  modifiedCapacity;


    public Mission_bgrt_data(int slno, int reservoir_id, double mb_capacity, double mb_frl, double mpdl_capacity, double mb_deadstorage, double requirement_july, int basin_id, double modified_frl, double modified_capacity) {
        this.slno = slno;
        this.reservoir_id = reservoir_id;
        this.mb_capacity = mb_capacity;
        this.mb_frl = mb_frl;
        this.mpdl_capacity = mpdl_capacity;
        this.mb_deadstorage = mb_deadstorage;
        this.requirement_july = requirement_july;
        this.basin_id = basin_id;
        this.modified_frl = modified_frl;
        this.modified_capacity = modified_capacity;
    }
}
