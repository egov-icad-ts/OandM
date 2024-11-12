package com.tgs.ir.entities;

public class Canal_sideslopes {
@Column(name="slno")
 
 private Integer  slno;

@Column(name="side_slope")
 
 private double precision  sideSlope;

@Column(name="description")
 
 private String  description;

@Column(name="display_status")
 
 private boolean  displayStatus;


    public Canal_sideslopes(int slno, Object side_slope, Object description, boolean display_status) {
        this.slno = slno;
        this.side_slope = side_slope;
        this.description = description;
        this.display_status = display_status;
    }
}
