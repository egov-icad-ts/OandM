package com.tgs.ir.entities;

public class Mb_reservoir_intakewells_level {
@Column(name="well_id")
 
 private Integer  wellId;

@Column(name="reservoir_id")
 
 private Integer  reservoirId;

@Column(name="intake_drawl_level")
 
 private Double  intakeDrawlLevel;

@Column(name="no_of_motors")
 
 private Integer  noOfMotors;

@Column(name="discharge")
 
 private Double  discharge;

@Column(name="total_discharge")
 
 private Double  totalDischarge;

@Column(name="area_covered")
 
 private Double  areaCovered;

@Column(name="no_of_villages")
 
 private Integer  noOfVillages;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="created_by")
 
 private String  createdBy;

@Column(name="created_time")
 
 private timestamp without time zone  createdTime;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="sub_division_id")
 
 private Integer  subDivisionId;

@Column(name="deleted_by")
 
 private String  deletedBy;

@Column(name="deleted_time")
 
 private timestamp without time zone  deletedTime;

@Column(name="well_no")
 
 private String  wellNo;


    public Mb_reservoir_intakewells_level(int well_id, int reservoir_id, double intake_drawl_level, int no_of_motors, double discharge, double total_discharge, double area_covered, int no_of_villages, Object remarks, boolean delete_flag, boolean is_latest, Object created_by, Object created_time, int unit_id, int circle_id, int division_id, int sub_division_id, Object deleted_by, Object deleted_time, Object well_no) {
        this.well_id = well_id;
        this.reservoir_id = reservoir_id;
        this.intake_drawl_level = intake_drawl_level;
        this.no_of_motors = no_of_motors;
        this.discharge = discharge;
        this.total_discharge = total_discharge;
        this.area_covered = area_covered;
        this.no_of_villages = no_of_villages;
        this.remarks = remarks;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.created_by = created_by;
        this.created_time = created_time;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
        this.deleted_by = deleted_by;
        this.deleted_time = deleted_time;
        this.well_no = well_no;
    }
}
