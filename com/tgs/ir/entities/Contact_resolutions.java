package com.tgs.ir.entities;

public class Contact_resolutions {
@Column(name="resolution_id")
 
 private Integer  resolutionId;

@Column(name="resolution")
 
 private String  resolution;


    public Contact_resolutions(int resolution_id, Object resolution) {
        this.resolution_id = resolution_id;
        this.resolution = resolution;
    }
}
