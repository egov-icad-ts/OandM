package com.tgs.ir.entities;

public class O_m_canal_eff_structure_wise {
@Column(name="eff_str_id")
 
 private Integer  effStrId;

@Column(name="canal_eff_id")
 
 private Integer  canalEffId;

@Column(name="structure_id")
 
 private Integer  structureId;

@Column(name="design_discharge_cusecs")
 
 private Double  designDischargeCusecs;

@Column(name="discharge_released_cusecs")
 
 private Double  dischargeReleasedCusecs;

@Column(name="tanks_fed_above_100ac")
 
 private Integer  tanksFedAbove100ac;

@Column(name="tanks_fed_below_100ac")
 
 private Integer  tanksFedBelow100ac;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="updated_by")
 
 private String  updatedBy;

@Column(name="updated_on")
 
 private timestamp without time zone  updatedOn;


    public O_m_canal_eff_structure_wise(int eff_str_id, int canal_eff_id, int structure_id, double design_discharge_cusecs, double discharge_released_cusecs, int tanks_fed_above_100ac, int tanks_fed_below_100ac, Object remarks, boolean is_latest, boolean delete_flag, Object updated_by, Object updated_on) {
        this.eff_str_id = eff_str_id;
        this.canal_eff_id = canal_eff_id;
        this.structure_id = structure_id;
        this.design_discharge_cusecs = design_discharge_cusecs;
        this.discharge_released_cusecs = discharge_released_cusecs;
        this.tanks_fed_above_100ac = tanks_fed_above_100ac;
        this.tanks_fed_below_100ac = tanks_fed_below_100ac;
        this.remarks = remarks;
        this.is_latest = is_latest;
        this.delete_flag = delete_flag;
        this.updated_by = updated_by;
        this.updated_on = updated_on;
    }
}
