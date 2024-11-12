package com.tgs.ir.entities;

public class Reservoirs {
@Column(name="slno")
 
 private Integer  slno;

@Column(name="reservoir_name")
 
 private String  reservoirName;

@Column(name="basin_name")
 
 private String  basinName;

@Column(name="frl")
 
 private real  frl;

@Column(name="capacity")
 
 private real  capacity;

@Column(name="construction_date")
 
 private timestamp without time zone  constructionDate;

@Column(name="lastmodified")
 
 private timestamp without time zone  lastmodified;

@Column(name="mddl_level")
 
 private real  mddlLevel;

@Column(name="mddl_capacity")
 
 private real  mddlCapacity;

@Column(name="dsl_level")
 
 private real  dslLevel;

@Column(name="dsl_capacity")
 
 private real  dslCapacity;

@Column(name="power_level")
 
 private real  powerLevel;

@Column(name="power_capacity")
 
 private real  powerCapacity;

@Column(name="basinorder")
 
 private smallint  basinorder;

@Column(name="projectcode")
 
 private String  projectcode;

@Column(name="reservoir_order")
 
 private Integer  reservoirOrder;

@Column(name="inst_flag")
 
 private boolean  instFlag;


    public Reservoirs(int slno, Object reservoir_name, Object basin_name, Object frl, Object capacity, Object construction_date, Object lastmodified, Object mddl_level, Object mddl_capacity, Object dsl_level, Object dsl_capacity, Object power_level, Object power_capacity, Object basinorder, Object projectcode, int reservoir_order, boolean inst_flag) {
        this.slno = slno;
        this.reservoir_name = reservoir_name;
        this.basin_name = basin_name;
        this.frl = frl;
        this.capacity = capacity;
        this.construction_date = construction_date;
        this.lastmodified = lastmodified;
        this.mddl_level = mddl_level;
        this.mddl_capacity = mddl_capacity;
        this.dsl_level = dsl_level;
        this.dsl_capacity = dsl_capacity;
        this.power_level = power_level;
        this.power_capacity = power_capacity;
        this.basinorder = basinorder;
        this.projectcode = projectcode;
        this.reservoir_order = reservoir_order;
        this.inst_flag = inst_flag;
    }
}
