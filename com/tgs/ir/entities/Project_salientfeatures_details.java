package com.tgs.ir.entities;

public class Project_salientfeatures_details {
@Column(name="proj_salient_detail_id")
 
 private Integer  projSalientDetailId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="source_of_water")
 
 private String  sourceOfWater;

@Column(name="water_allocation")
 
 private String  waterAllocation;

@Column(name="total_ayacut_to_be_benefited")
 
 private String  totalAyacutToBeBenefited;

@Column(name="discharge_at_head")
 
 private String  dischargeAtHead;

@Column(name="cropping_pattern")
 
 private String  croppingPattern;

@Column(name="length_of_gravity_canal")
 
 private String  lengthOfGravityCanal;

@Column(name="no_of_lifts_pumping_stations")
 
 private Integer  noOfLiftsPumpingStations;

@Column(name="length_of_pressure_main")
 
 private String  lengthOfPressureMain;

@Column(name="districts_covered")
 
 private String  districtsCovered;

@Column(name="linediagram")
 
 private String  linediagram;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="tot_prop_ayacut")
 
 private Double  totPropAyacut;

@Column(name="new_ayacut_acres")
 
 private Double  newAyacutAcres;

@Column(name="stabilized_ayacut_acres")
 
 private Double  stabilizedAyacutAcres;

@Column(name="additional_ayacut_acres")
 
 private Double  additionalAyacutAcres;

@Column(name="lis_ayacut_acres")
 
 private Double  lisAyacutAcres;

@Column(name="no_reservoirs")
 
 private Integer  noReservoirs;

@Column(name="total_gross_capacity_reservoirs")
 
 private String  totalGrossCapacityReservoirs;

@Column(name="total_length_tunnel")
 
 private String  totalLengthTunnel;


    public Project_salientfeatures_details(int proj_salient_detail_id, int project_id, Object source_of_water, Object water_allocation, Object total_ayacut_to_be_benefited, Object discharge_at_head, Object cropping_pattern, Object length_of_gravity_canal, int no_of_lifts_pumping_stations, Object length_of_pressure_main, Object districts_covered, Object linediagram, boolean is_latest, boolean delete_flag, double tot_prop_ayacut, double new_ayacut_acres, double stabilized_ayacut_acres, double additional_ayacut_acres, double lis_ayacut_acres, int no_reservoirs, Object total_gross_capacity_reservoirs, Object total_length_tunnel) {
        this.proj_salient_detail_id = proj_salient_detail_id;
        this.project_id = project_id;
        this.source_of_water = source_of_water;
        this.water_allocation = water_allocation;
        this.total_ayacut_to_be_benefited = total_ayacut_to_be_benefited;
        this.discharge_at_head = discharge_at_head;
        this.cropping_pattern = cropping_pattern;
        this.length_of_gravity_canal = length_of_gravity_canal;
        this.no_of_lifts_pumping_stations = no_of_lifts_pumping_stations;
        this.length_of_pressure_main = length_of_pressure_main;
        this.districts_covered = districts_covered;
        this.linediagram = linediagram;
        this.is_latest = is_latest;
        this.delete_flag = delete_flag;
        this.tot_prop_ayacut = tot_prop_ayacut;
        this.new_ayacut_acres = new_ayacut_acres;
        this.stabilized_ayacut_acres = stabilized_ayacut_acres;
        this.additional_ayacut_acres = additional_ayacut_acres;
        this.lis_ayacut_acres = lis_ayacut_acres;
        this.no_reservoirs = no_reservoirs;
        this.total_gross_capacity_reservoirs = total_gross_capacity_reservoirs;
        this.total_length_tunnel = total_length_tunnel;
    }
}
