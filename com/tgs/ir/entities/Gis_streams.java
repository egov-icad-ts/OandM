package com.tgs.ir.entities;

public class Gis_streams {
@Column(name="stream_no")
 
 private Integer  streamNo;

@Column(name="stream_name")
 
 private String  streamName;


    public Gis_streams(int stream_no, Object stream_name) {
        this.stream_no = stream_no;
        this.stream_name = stream_name;
    }
}
