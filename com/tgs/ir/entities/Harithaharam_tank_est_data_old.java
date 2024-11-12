package com.tgs.ir.entities;

public class Harithaharam_tank_est_data_old {
@Column(name="ht_id")
 
 private Integer  htId;

@Column(name="tank_length_2022")
 
 private Double  tankLength2022;

@Column(name="tank_length_2023")
 
 private Double  tankLength2023;

@Column(name="tank_fors_acres_2022")
 
 private Double  tankForsAcres2022;

@Column(name="tank_fors_acres_2023")
 
 private Double  tankForsAcres2023;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="mandal_id")
 
 private Integer  mandalId;

@Column(name="tank_no")
 
 private Integer  tankNo;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="created_by")
 
 private String  createdBy;

@Column(name="created_timestamp")
 
 private timestamp without time zone  createdTimestamp;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="deleted_by")
 
 private String  deletedBy;

@Column(name="deleted_timestamp")
 
 private timestamp without time zone  deletedTimestamp;

@Column(name="est_amount")
 
 private Double  estAmount;


    public Harithaharam_tank_est_data_old(int ht_id, double tank_length_2022, double tank_length_2023, double tank_fors_acres_2022, double tank_fors_acres_2023, int district_id, int mandal_id, int tank_no, boolean delete_flag, Object created_by, Object created_timestamp, int unit_id, Object deleted_by, Object deleted_timestamp, double est_amount) {
        this.ht_id = ht_id;
        this.tank_length_2022 = tank_length_2022;
        this.tank_length_2023 = tank_length_2023;
        this.tank_fors_acres_2022 = tank_fors_acres_2022;
        this.tank_fors_acres_2023 = tank_fors_acres_2023;
        this.district_id = district_id;
        this.mandal_id = mandal_id;
        this.tank_no = tank_no;
        this.delete_flag = delete_flag;
        this.created_by = created_by;
        this.created_timestamp = created_timestamp;
        this.unit_id = unit_id;
        this.deleted_by = deleted_by;
        this.deleted_timestamp = deleted_timestamp;
        this.est_amount = est_amount;
    }
}
