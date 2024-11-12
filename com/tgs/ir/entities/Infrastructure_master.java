package com.tgs.ir.entities;

public class Infrastructure_master {
@Column(name="infra_id")
 
 private Integer  infraId;

@Column(name="name_of_infrastructure")
 
 private String  nameOfInfrastructure;


    public Infrastructure_master(int infra_id, Object name_of_infrastructure) {
        this.infra_id = infra_id;
        this.name_of_infrastructure = name_of_infrastructure;
    }
}
