package com.tgs.ir.entities;

public class Lis_pumping_stations {
@Column(name="ps_id")
 
 private Integer  psId;

@Column(name="pumping_station_name")
 
 private String  pumpingStationName;

@Column(name="pumping_head_mt")
 
 private Double  pumpingHeadMt;

@Column(name="each_motor_rating_mw")
 
 private Double  eachMotorRatingMw;

@Column(name="actual_each_motor_rating_mw")
 
 private Double  actualEachMotorRatingMw;

@Column(name="each_pump_discharge_cumec")
 
 private Double  eachPumpDischargeCumec;

@Column(name="no_of_motors")
 
 private Integer  noOfMotors;

@Column(name="total_connected_load_of_pumping_station_mw")
 
 private Double  totalConnectedLoadOfPumpingStationMw;

@Column(name="actual_load_of_pumping_station_mw")
 
 private Double  actualLoadOfPumpingStationMw;

@Column(name="sub_station_voltage")
 
 private String  subStationVoltage;

@Column(name="prject_id")
 
 private Integer  prjectId;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="work_status")
 
 private String  workStatus;

@Column(name="basin")
 
 private String  basin;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_child")
 
 private boolean  isChild;


    public Lis_pumping_stations(int ps_id, Object pumping_station_name, double pumping_head_mt, double each_motor_rating_mw, double actual_each_motor_rating_mw, double each_pump_discharge_cumec, int no_of_motors, double total_connected_load_of_pumping_station_mw, double actual_load_of_pumping_station_mw, Object sub_station_voltage, int prject_id, int unit_id, Object work_status, Object basin, boolean delete_flag, boolean is_child) {
        this.ps_id = ps_id;
        this.pumping_station_name = pumping_station_name;
        this.pumping_head_mt = pumping_head_mt;
        this.each_motor_rating_mw = each_motor_rating_mw;
        this.actual_each_motor_rating_mw = actual_each_motor_rating_mw;
        this.each_pump_discharge_cumec = each_pump_discharge_cumec;
        this.no_of_motors = no_of_motors;
        this.total_connected_load_of_pumping_station_mw = total_connected_load_of_pumping_station_mw;
        this.actual_load_of_pumping_station_mw = actual_load_of_pumping_station_mw;
        this.sub_station_voltage = sub_station_voltage;
        this.prject_id = prject_id;
        this.unit_id = unit_id;
        this.work_status = work_status;
        this.basin = basin;
        this.delete_flag = delete_flag;
        this.is_child = is_child;
    }
}
