package com.tgs.ir.entities;

public class Consolidated_phy_progress {
@Column(name="cons_phy_id")
 
 private Integer  consPhyId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="total_ewe")
 
 private Double  totalEwe;

@Column(name="ewe_done")
 
 private Double  eweDone;

@Column(name="total_cc_qty")
 
 private Double  totalCcQty;

@Column(name="cc_workdone")
 
 private Double  ccWorkdone;

@Column(name="total_structures")
 
 private Double  totalStructures;

@Column(name="structures_completed")
 
 private Double  structuresCompleted;

@Column(name="total_main_canals")
 
 private Double  totalMainCanals;

@Column(name="main_canals_completed")
 
 private Double  mainCanalsCompleted;

@Column(name="total_distributories")
 
 private Double  totalDistributories;

@Column(name="distributory_completed")
 
 private Double  distributoryCompleted;

@Column(name="ip_comtemplated")
 
 private Double  ipComtemplated;

@Column(name="ip_created")
 
 private Double  ipCreated;

@Column(name="overall_phy_progress")
 
 private Double  overallPhyProgress;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="created_by")
 
 private String  createdBy;

@Column(name="created_timestamp")
 
 private timestamp without time zone  createdTimestamp;

@Column(name="updated_year")
 
 private Integer  updatedYear;

@Column(name="updated_month")
 
 private Integer  updatedMonth;


    public Consolidated_phy_progress(int cons_phy_id, int project_id, double total_ewe, double ewe_done, double total_cc_qty, double cc_workdone, double total_structures, double structures_completed, double total_main_canals, double main_canals_completed, double total_distributories, double distributory_completed, double ip_comtemplated, double ip_created, double overall_phy_progress, boolean delete_flag, boolean is_latest, Object created_by, Object created_timestamp, int updated_year, int updated_month) {
        this.cons_phy_id = cons_phy_id;
        this.project_id = project_id;
        this.total_ewe = total_ewe;
        this.ewe_done = ewe_done;
        this.total_cc_qty = total_cc_qty;
        this.cc_workdone = cc_workdone;
        this.total_structures = total_structures;
        this.structures_completed = structures_completed;
        this.total_main_canals = total_main_canals;
        this.main_canals_completed = main_canals_completed;
        this.total_distributories = total_distributories;
        this.distributory_completed = distributory_completed;
        this.ip_comtemplated = ip_comtemplated;
        this.ip_created = ip_created;
        this.overall_phy_progress = overall_phy_progress;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.created_by = created_by;
        this.created_timestamp = created_timestamp;
        this.updated_year = updated_year;
        this.updated_month = updated_month;
    }
}
