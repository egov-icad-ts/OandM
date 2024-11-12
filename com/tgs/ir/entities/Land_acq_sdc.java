package com.tgs.ir.entities;

public class Land_acq_sdc {
@Column(name="land_acq_sdc_id")
 
 private Integer  landAcqSdcId;

@Column(name="land_acq_req_id")
 
 private Double  landAcqReqId;

@Column(name="land_acq_id")
 
 private Double  landAcqId;

@Column(name="project_id")
 
 private Double  projectId;

@Column(name="package_id")
 
 private Double  packageId;

@Column(name="land_dt_mro")
 
 private String  landDtMro;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="user_id")
 
 private String  userId;

@Column(name="user_id_edit")
 
 private String  userIdEdit;

@Column(name="edit_flag")
 
 private boolean  editFlag;

@Column(name="time_entry")
 
 private timestamp without time zone  timeEntry;

@Column(name="time_entry_edit")
 
 private timestamp without time zone  timeEntryEdit;

@Column(name="time_entry_status")
 
 private timestamp without time zone  timeEntryStatus;

@Column(name="ip_address")
 
 private String  ipAddress;

@Column(name="sdc_file_req_date")
 
 private String  sdcFileReqDate;

@Column(name="land_sdc_file_no")
 
 private String  landSdcFileNo;

@Column(name="land_dt_1")
 
 private String  landDt1;

@Column(name="land_dt_mro_extent")
 
 private Double  landDtMroExtent;

@Column(name="land_dt_1_acres")
 
 private Double  landDt1Acres;

@Column(name="land_sdc_file_2")
 
 private String  landSdcFile2;

@Column(name="sdc_file_2_date")
 
 private date  sdcFile2Date;

@Column(name="spec_type")
 
 private String  specType;

@Column(name="spec_file_no_req")
 
 private String  specFileNoReq;

@Column(name="spec_file_req_date")
 
 private String  specFileReqDate;

@Column(name="land_acq_lao")
 
 private String  landAcqLao;

@Column(name="dt_mro_name")
 
 private String  dtMroName;


    public Land_acq_sdc(int land_acq_sdc_id, double land_acq_req_id, double land_acq_id, double project_id, double package_id, Object land_dt_mro, boolean delete_flag, Object remarks, Object user_id, Object user_id_edit, boolean edit_flag, Object time_entry, Object time_entry_edit, Object time_entry_status, Object ip_address, Object sdc_file_req_date, Object land_sdc_file_no, Object land_dt_1, double land_dt_mro_extent, double land_dt_1_acres, Object land_sdc_file_2, Object sdc_file_2_date, Object spec_type, Object spec_file_no_req, Object spec_file_req_date, Object land_acq_lao, Object dt_mro_name) {
        this.land_acq_sdc_id = land_acq_sdc_id;
        this.land_acq_req_id = land_acq_req_id;
        this.land_acq_id = land_acq_id;
        this.project_id = project_id;
        this.package_id = package_id;
        this.land_dt_mro = land_dt_mro;
        this.delete_flag = delete_flag;
        this.remarks = remarks;
        this.user_id = user_id;
        this.user_id_edit = user_id_edit;
        this.edit_flag = edit_flag;
        this.time_entry = time_entry;
        this.time_entry_edit = time_entry_edit;
        this.time_entry_status = time_entry_status;
        this.ip_address = ip_address;
        this.sdc_file_req_date = sdc_file_req_date;
        this.land_sdc_file_no = land_sdc_file_no;
        this.land_dt_1 = land_dt_1;
        this.land_dt_mro_extent = land_dt_mro_extent;
        this.land_dt_1_acres = land_dt_1_acres;
        this.land_sdc_file_2 = land_sdc_file_2;
        this.sdc_file_2_date = sdc_file_2_date;
        this.spec_type = spec_type;
        this.spec_file_no_req = spec_file_no_req;
        this.spec_file_req_date = spec_file_req_date;
        this.land_acq_lao = land_acq_lao;
        this.dt_mro_name = dt_mro_name;
    }
}
