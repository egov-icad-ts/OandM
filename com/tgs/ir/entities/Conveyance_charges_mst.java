package com.tgs.ir.entities;

public class Conveyance_charges_mst {
@Column(name="conveyance_id")
 
 private Integer  conveyanceId;

@Column(name="conveyance_charge_name")
 
 private String  conveyanceChargeName;

@Column(name="conveyance_charge_km_1")
 
 private Double  conveyanceChargeKm1;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="conveyance_unit_id")
 
 private Integer  conveyanceUnitId;


    public Conveyance_charges_mst(int conveyance_id, Object conveyance_charge_name, double conveyance_charge_km_1, boolean delete_flag, boolean is_latest, int conveyance_unit_id) {
        this.conveyance_id = conveyance_id;
        this.conveyance_charge_name = conveyance_charge_name;
        this.conveyance_charge_km_1 = conveyance_charge_km_1;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.conveyance_unit_id = conveyance_unit_id;
    }
}
