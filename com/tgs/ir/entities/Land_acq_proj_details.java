package com.tgs.ir.entities;

public class Land_acq_proj_details {
@Column(name="land_acq_id")
 
 private Integer  landAcqId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="total_land_rec_acres")
 
 private Double  totalLandRecAcres;

@Column(name="total_land_acq_acres")
 
 private Double  totalLandAcqAcres;

@Column(name="land_govt_req")
 
 private Double  landGovtReq;

@Column(name="land_pvt_req")
 
 private Double  landPvtReq;

@Column(name="land_govt_acq")
 
 private Double  landGovtAcq;

@Column(name="land_pvt_acq")
 
 private Double  landPvtAcq;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="user_id")
 
 private Integer  userId;

@Column(name="time_entry")
 
 private timestamp without time zone  timeEntry;

@Column(name="ip_address")
 
 private String  ipAddress;

@Column(name="package_id")
 
 private Integer  packageId;


    public Land_acq_proj_details(int land_acq_id, int project_id, double total_land_rec_acres, double total_land_acq_acres, double land_govt_req, double land_pvt_req, double land_govt_acq, double land_pvt_acq, boolean delete_flag, int user_id, Object time_entry, Object ip_address, int package_id) {
        this.land_acq_id = land_acq_id;
        this.project_id = project_id;
        this.total_land_rec_acres = total_land_rec_acres;
        this.total_land_acq_acres = total_land_acq_acres;
        this.land_govt_req = land_govt_req;
        this.land_pvt_req = land_pvt_req;
        this.land_govt_acq = land_govt_acq;
        this.land_pvt_acq = land_pvt_acq;
        this.delete_flag = delete_flag;
        this.user_id = user_id;
        this.time_entry = time_entry;
        this.ip_address = ip_address;
        this.package_id = package_id;
    }
}
