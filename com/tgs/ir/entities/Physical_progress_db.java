package com.tgs.ir.entities;

public class Physical_progress_db {
@Column(name="phy_prg_id")
 
 private Integer  phyPrgId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="package_id")
 
 private Integer  packageId;

@Column(name="comp_type_id")
 
 private Integer  compTypeId;

@Column(name="comp_id")
 
 private Integer  compId;

@Column(name="sub_component_id")
 
 private Integer  subComponentId;

@Column(name="prg_year")
 
 private Integer  prgYear;

@Column(name="prg_month")
 
 private Integer  prgMonth;

@Column(name="target_quantity")
 
 private Double  targetQuantity;

@Column(name="cummulative_work_done")
 
 private Double  cummulativeWorkDone;

@Column(name="present_work_done")
 
 private Double  presentWorkDone;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="total_quantity")
 
 private Double  totalQuantity;

@Column(name="is_completed")
 
 private boolean  isCompleted;

@Column(name="is_edited")
 
 private boolean  isEdited;

@Column(name="upated_by")
 
 private String  upatedBy;

@Column(name="updated_on")
 
 private timestamp without time zone  updatedOn;


    public Physical_progress_db(int phy_prg_id, int project_id, int package_id, int comp_type_id, int comp_id, int sub_component_id, int prg_year, int prg_month, double target_quantity, double cummulative_work_done, double present_work_done, boolean is_latest, boolean delete_flag, Object remarks, double total_quantity, boolean is_completed, boolean is_edited, Object upated_by, Object updated_on) {
        this.phy_prg_id = phy_prg_id;
        this.project_id = project_id;
        this.package_id = package_id;
        this.comp_type_id = comp_type_id;
        this.comp_id = comp_id;
        this.sub_component_id = sub_component_id;
        this.prg_year = prg_year;
        this.prg_month = prg_month;
        this.target_quantity = target_quantity;
        this.cummulative_work_done = cummulative_work_done;
        this.present_work_done = present_work_done;
        this.is_latest = is_latest;
        this.delete_flag = delete_flag;
        this.remarks = remarks;
        this.total_quantity = total_quantity;
        this.is_completed = is_completed;
        this.is_edited = is_edited;
        this.upated_by = upated_by;
        this.updated_on = updated_on;
    }
}
