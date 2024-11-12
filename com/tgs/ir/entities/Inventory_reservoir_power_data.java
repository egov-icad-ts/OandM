package com.tgs.ir.entities;

public class Inventory_reservoir_power_data {
@Column(name="reservoir_id")
 
 private Integer  reservoirId;

@Column(name="main_no_of_penstocks")
 
 private Integer  mainNoOfPenstocks;

@Column(name="main_size_of_penstock")
 
 private String  mainSizeOfPenstock;

@Column(name="main_centre_line_elevation")
 
 private String  mainCentreLineElevation;

@Column(name="main_no_of_powerunits")
 
 private Double  mainNoOfPowerunits;

@Column(name="main_type_of_powerunit")
 
 private String  mainTypeOfPowerunit;

@Column(name="main_capacity_powerunit")
 
 private Double  mainCapacityPowerunit;

@Column(name="main_mddl")
 
 private Double  mainMddl;

@Column(name="main_discharging_capacity")
 
 private Double  mainDischargingCapacity;

@Column(name="left_no_of_penstocks")
 
 private Integer  leftNoOfPenstocks;

@Column(name="left_size_of_penstock")
 
 private String  leftSizeOfPenstock;

@Column(name="left_centre_line_elevation")
 
 private String  leftCentreLineElevation;

@Column(name="left_no_of_powerunits")
 
 private Double  leftNoOfPowerunits;

@Column(name="left_type_of_powerunit")
 
 private String  leftTypeOfPowerunit;

@Column(name="left_capacity_powerunit")
 
 private Double  leftCapacityPowerunit;

@Column(name="left_mddl")
 
 private Double  leftMddl;

@Column(name="left_discharging_capacity")
 
 private Double  leftDischargingCapacity;

@Column(name="right_no_of_penstocks")
 
 private Integer  rightNoOfPenstocks;

@Column(name="right_size_of_penstock")
 
 private String  rightSizeOfPenstock;

@Column(name="right_centre_line_elevation")
 
 private String  rightCentreLineElevation;

@Column(name="right_no_of_powerunits")
 
 private Double  rightNoOfPowerunits;

@Column(name="right_type_of_powerunit")
 
 private String  rightTypeOfPowerunit;

@Column(name="right_capacity_powerunit")
 
 private Double  rightCapacityPowerunit;

@Column(name="right_mddl")
 
 private Double  rightMddl;

@Column(name="right_discharging_capacity")
 
 private Double  rightDischargingCapacity;

@Column(name="created_by_username")
 
 private String  createdByUsername;

@Column(name="post_id")
 
 private String  postId;

@Column(name="created_timestamp")
 
 private timestamp without time zone  createdTimestamp;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="edit_flag")
 
 private boolean  editFlag;

@Column(name="updated_timestamp")
 
 private timestamp without time zone  updatedTimestamp;

@Column(name="old_unit_id")
 
 private Integer  oldUnitId;

@Column(name="old_circle_id")
 
 private Integer  oldCircleId;

@Column(name="old_division_id")
 
 private Integer  oldDivisionId;

@Column(name="old_sub_division_id")
 
 private Integer  oldSubDivisionId;

@Column(name="status_id")
 
 private Integer  statusId;

@Column(name="res_id")
 
 private Integer  resId;

@Column(name="approved_username")
 
 private String  approvedUsername;

@Column(name="deleted_by")
 
 private String  deletedBy;

@Column(name="deleted_time")
 
 private timestamp without time zone  deletedTime;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="sub_division_id")
 
 private Integer  subDivisionId;


    public Inventory_reservoir_power_data(int reservoir_id, int main_no_of_penstocks, Object main_size_of_penstock, Object main_centre_line_elevation, double main_no_of_powerunits, Object main_type_of_powerunit, double main_capacity_powerunit, double main_mddl, double main_discharging_capacity, int left_no_of_penstocks, Object left_size_of_penstock, Object left_centre_line_elevation, double left_no_of_powerunits, Object left_type_of_powerunit, double left_capacity_powerunit, double left_mddl, double left_discharging_capacity, int right_no_of_penstocks, Object right_size_of_penstock, Object right_centre_line_elevation, double right_no_of_powerunits, Object right_type_of_powerunit, double right_capacity_powerunit, double right_mddl, double right_discharging_capacity, Object created_by_username, Object post_id, Object created_timestamp, int project_id, boolean delete_flag, boolean is_latest, boolean edit_flag, Object updated_timestamp, int old_unit_id, int old_circle_id, int old_division_id, int old_sub_division_id, int status_id, int res_id, Object approved_username, Object deleted_by, Object deleted_time, int unit_id, int circle_id, int division_id, int sub_division_id) {
        this.reservoir_id = reservoir_id;
        this.main_no_of_penstocks = main_no_of_penstocks;
        this.main_size_of_penstock = main_size_of_penstock;
        this.main_centre_line_elevation = main_centre_line_elevation;
        this.main_no_of_powerunits = main_no_of_powerunits;
        this.main_type_of_powerunit = main_type_of_powerunit;
        this.main_capacity_powerunit = main_capacity_powerunit;
        this.main_mddl = main_mddl;
        this.main_discharging_capacity = main_discharging_capacity;
        this.left_no_of_penstocks = left_no_of_penstocks;
        this.left_size_of_penstock = left_size_of_penstock;
        this.left_centre_line_elevation = left_centre_line_elevation;
        this.left_no_of_powerunits = left_no_of_powerunits;
        this.left_type_of_powerunit = left_type_of_powerunit;
        this.left_capacity_powerunit = left_capacity_powerunit;
        this.left_mddl = left_mddl;
        this.left_discharging_capacity = left_discharging_capacity;
        this.right_no_of_penstocks = right_no_of_penstocks;
        this.right_size_of_penstock = right_size_of_penstock;
        this.right_centre_line_elevation = right_centre_line_elevation;
        this.right_no_of_powerunits = right_no_of_powerunits;
        this.right_type_of_powerunit = right_type_of_powerunit;
        this.right_capacity_powerunit = right_capacity_powerunit;
        this.right_mddl = right_mddl;
        this.right_discharging_capacity = right_discharging_capacity;
        this.created_by_username = created_by_username;
        this.post_id = post_id;
        this.created_timestamp = created_timestamp;
        this.project_id = project_id;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.edit_flag = edit_flag;
        this.updated_timestamp = updated_timestamp;
        this.old_unit_id = old_unit_id;
        this.old_circle_id = old_circle_id;
        this.old_division_id = old_division_id;
        this.old_sub_division_id = old_sub_division_id;
        this.status_id = status_id;
        this.res_id = res_id;
        this.approved_username = approved_username;
        this.deleted_by = deleted_by;
        this.deleted_time = deleted_time;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
    }
}
