package com.tgs.ir.entities;

public class Services {
@Column(name="service_id")
 
 private Integer  serviceId;

@Column(name="service_name")
 
 private String  serviceName;

@Column(name="parent_id")
 
 private Integer  parentId;

@Column(name="deleteflag")
 
 private boolean  deleteflag;

@Column(name="url")
 
 private String  url;


    public Services(int service_id, Object service_name, int parent_id, boolean deleteflag, Object url) {
        this.service_id = service_id;
        this.service_name = service_name;
        this.parent_id = parent_id;
        this.deleteflag = deleteflag;
        this.url = url;
    }
}
