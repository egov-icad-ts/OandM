package com.tgs.ir.entities;

public class Onm_ce_staff_data {
@Column(name="onm_id")
 
 private Integer  onmId;

@Column(name="staff_id")
 
 private Integer  staffId;

@Column(name="main_canal_length")
 
 private Double  mainCanalLength;

@Column(name="main_canal_nos")
 
 private Integer  mainCanalNos;

@Column(name="branch_canal_length")
 
 private Double  branchCanalLength;

@Column(name="branch_canal_nos")
 
 private Integer  branchCanalNos;

@Column(name="dbm_ayacut")
 
 private Double  dbmAyacut;

@Column(name="dbm_nos")
 
 private Integer  dbmNos;

@Column(name="cross_reg_count")
 
 private Double  crossRegCount;

@Column(name="cross_reg_nos")
 
 private Integer  crossRegNos;

@Column(name="flood_bank_length")
 
 private Double  floodBankLength;

@Column(name="flood_bank_nos")
 
 private Integer  floodBankNos;

@Column(name="gate_count")
 
 private Integer  gateCount;

@Column(name="gate_nos")
 
 private Integer  gateNos;

@Column(name="other_nos")
 
 private Integer  otherNos;

@Column(name="total")
 
 private Integer  total;

@Column(name="already_working")
 
 private Integer  alreadyWorking;

@Column(name="net_requirement")
 
 private Integer  netRequirement;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="created_by")
 
 private String  createdBy;

@Column(name="created_time")
 
 private timestamp without time zone  createdTime;

@Column(name="edited_by")
 
 private String  editedBy;

@Column(name="edited_time")
 
 private timestamp without time zone  editedTime;

@Column(name="post_id")
 
 private String  postId;

@Column(name="deleted_by")
 
 private String  deletedBy;

@Column(name="deleted_time")
 
 private timestamp without time zone  deletedTime;


    public Onm_ce_staff_data(int onm_id, int staff_id, double main_canal_length, int main_canal_nos, double branch_canal_length, int branch_canal_nos, double dbm_ayacut, int dbm_nos, double cross_reg_count, int cross_reg_nos, double flood_bank_length, int flood_bank_nos, int gate_count, int gate_nos, int other_nos, int total, int already_working, int net_requirement, Object remarks, int unit_id, boolean delete_flag, boolean is_latest, Object created_by, Object created_time, Object edited_by, Object edited_time, Object post_id, Object deleted_by, Object deleted_time) {
        this.onm_id = onm_id;
        this.staff_id = staff_id;
        this.main_canal_length = main_canal_length;
        this.main_canal_nos = main_canal_nos;
        this.branch_canal_length = branch_canal_length;
        this.branch_canal_nos = branch_canal_nos;
        this.dbm_ayacut = dbm_ayacut;
        this.dbm_nos = dbm_nos;
        this.cross_reg_count = cross_reg_count;
        this.cross_reg_nos = cross_reg_nos;
        this.flood_bank_length = flood_bank_length;
        this.flood_bank_nos = flood_bank_nos;
        this.gate_count = gate_count;
        this.gate_nos = gate_nos;
        this.other_nos = other_nos;
        this.total = total;
        this.already_working = already_working;
        this.net_requirement = net_requirement;
        this.remarks = remarks;
        this.unit_id = unit_id;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.created_by = created_by;
        this.created_time = created_time;
        this.edited_by = edited_by;
        this.edited_time = edited_time;
        this.post_id = post_id;
        this.deleted_by = deleted_by;
        this.deleted_time = deleted_time;
    }
}
