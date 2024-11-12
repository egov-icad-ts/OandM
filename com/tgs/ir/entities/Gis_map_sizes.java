package com.tgs.ir.entities;

public class Gis_map_sizes {
@Column(name="id")
 
 private Integer  id;

@Column(name="map_size")
 
 private String  mapSize;


    public Gis_map_sizes(int id, Object map_size) {
        this.id = id;
        this.map_size = map_size;
    }
}
