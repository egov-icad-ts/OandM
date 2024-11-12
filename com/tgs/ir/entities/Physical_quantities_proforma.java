package com.tgs.ir.entities;

public class Physical_quantities_proforma {
@Column(name="phy_id")
 
 private Integer  phyId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="package_id")
 
 private Integer  packageId;

@Column(name="agreement_value")
 
 private Double  agreementValue;

@Column(name="exp_cum_lastmonth")
 
 private Double  expCumLastmonth;

@Column(name="exp_present_month")
 
 private Double  expPresentMonth;

@Column(name="exp_cumlative")
 
 private Double  expCumlative;

@Column(name="total_ew")
 
 private Double  totalEw;

@Column(name="cum_ewdone_upto_lastmonth")
 
 private Double  cumEwdoneUptoLastmonth;

@Column(name="ew_present_month")
 
 private Double  ewPresentMonth;

@Column(name="total_ewe_done")
 
 private Double  totalEweDone;

@Column(name="total_conc_quantity")
 
 private Double  totalConcQuantity;

@Column(name="cum_conc_upto_lastmonth")
 
 private Double  cumConcUptoLastmonth;

@Column(name="conc_present_month")
 
 private Double  concPresentMonth;

@Column(name="total_conc_workdone")
 
 private Double  totalConcWorkdone;

@Column(name="total_structures")
 
 private Double  totalStructures;

@Column(name="structures_compl_lastmonth")
 
 private Double  structuresComplLastmonth;

@Column(name="structure_compl_present_month")
 
 private Double  structureComplPresentMonth;

@Column(name="cum_structures_completed")
 
 private Double  cumStructuresCompleted;

@Column(name="total_main_canals")
 
 private Double  totalMainCanals;

@Column(name="canals_completed_lastmonth")
 
 private Double  canalsCompletedLastmonth;

@Column(name="canals_completed_present_month")
 
 private Double  canalsCompletedPresentMonth;

@Column(name="cum_canals_completed")
 
 private Double  cumCanalsCompleted;

@Column(name="total_distributories")
 
 private Double  totalDistributories;

@Column(name="dstrbtry_compltd_lastmonth")
 
 private Double  dstrbtryCompltdLastmonth;

@Column(name="dstrbtry_present_month")
 
 private Double  dstrbtryPresentMonth;

@Column(name="cum_dstrbtry_completed")
 
 private Double  cumDstrbtryCompleted;

@Column(name="updated_month")
 
 private Integer  updatedMonth;

@Column(name="updated_year")
 
 private Integer  updatedYear;

@Column(name="updated_by")
 
 private String  updatedBy;

@Column(name="updated_timestamp")
 
 private timestamp without time zone  updatedTimestamp;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="admin_sanc_amount")
 
 private Double  adminSancAmount;


    public Physical_quantities_proforma(int phy_id, int project_id, int package_id, double agreement_value, double exp_cum_lastmonth, double exp_present_month, double exp_cumlative, double total_ew, double cum_ewdone_upto_lastmonth, double ew_present_month, double total_ewe_done, double total_conc_quantity, double cum_conc_upto_lastmonth, double conc_present_month, double total_conc_workdone, double total_structures, double structures_compl_lastmonth, double structure_compl_present_month, double cum_structures_completed, double total_main_canals, double canals_completed_lastmonth, double canals_completed_present_month, double cum_canals_completed, double total_distributories, double dstrbtry_compltd_lastmonth, double dstrbtry_present_month, double cum_dstrbtry_completed, int updated_month, int updated_year, Object updated_by, Object updated_timestamp, boolean is_latest, double admin_sanc_amount) {
        this.phy_id = phy_id;
        this.project_id = project_id;
        this.package_id = package_id;
        this.agreement_value = agreement_value;
        this.exp_cum_lastmonth = exp_cum_lastmonth;
        this.exp_present_month = exp_present_month;
        this.exp_cumlative = exp_cumlative;
        this.total_ew = total_ew;
        this.cum_ewdone_upto_lastmonth = cum_ewdone_upto_lastmonth;
        this.ew_present_month = ew_present_month;
        this.total_ewe_done = total_ewe_done;
        this.total_conc_quantity = total_conc_quantity;
        this.cum_conc_upto_lastmonth = cum_conc_upto_lastmonth;
        this.conc_present_month = conc_present_month;
        this.total_conc_workdone = total_conc_workdone;
        this.total_structures = total_structures;
        this.structures_compl_lastmonth = structures_compl_lastmonth;
        this.structure_compl_present_month = structure_compl_present_month;
        this.cum_structures_completed = cum_structures_completed;
        this.total_main_canals = total_main_canals;
        this.canals_completed_lastmonth = canals_completed_lastmonth;
        this.canals_completed_present_month = canals_completed_present_month;
        this.cum_canals_completed = cum_canals_completed;
        this.total_distributories = total_distributories;
        this.dstrbtry_compltd_lastmonth = dstrbtry_compltd_lastmonth;
        this.dstrbtry_present_month = dstrbtry_present_month;
        this.cum_dstrbtry_completed = cum_dstrbtry_completed;
        this.updated_month = updated_month;
        this.updated_year = updated_year;
        this.updated_by = updated_by;
        this.updated_timestamp = updated_timestamp;
        this.is_latest = is_latest;
        this.admin_sanc_amount = admin_sanc_amount;
    }
}
