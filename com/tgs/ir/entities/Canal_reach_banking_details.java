package com.tgs.ir.entities;

public class Canal_reach_banking_details {
@Column(name="banking_id")
 
 private Integer  bankingId;

@Column(name="reach_id")
 
 private Integer  reachId;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="mandal_id")
 
 private Integer  mandalId;

@Column(name="village_id")
 
 private Integer  villageId;

@Column(name="full_banking_from")
 
 private Double  fullBankingFrom;

@Column(name="full_banking_to")
 
 private Double  fullBankingTo;

@Column(name="partial_banking_from")
 
 private Double  partialBankingFrom;

@Column(name="partial_banking_to")
 
 private Double  partialBankingTo;

@Column(name="full_cuttin_from")
 
 private Double  fullCuttinFrom;

@Column(name="full_cutting_to")
 
 private Double  fullCuttingTo;

@Column(name="canal_length")
 
 private Double  canalLength;

@Column(name="canal_id")
 
 private Integer  canalId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="delete_user")
 
 private String  deleteUser;

@Column(name="delete_time")
 
 private timestamp with time zone  deleteTime;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="sub_division_id")
 
 private Integer  subDivisionId;


    public Canal_reach_banking_details(int banking_id, int reach_id, int district_id, int mandal_id, int village_id, double full_banking_from, double full_banking_to, double partial_banking_from, double partial_banking_to, double full_cuttin_from, double full_cutting_to, double canal_length, int canal_id, boolean delete_flag, Object delete_user, Object delete_time, boolean is_latest, int sub_division_id) {
        this.banking_id = banking_id;
        this.reach_id = reach_id;
        this.district_id = district_id;
        this.mandal_id = mandal_id;
        this.village_id = village_id;
        this.full_banking_from = full_banking_from;
        this.full_banking_to = full_banking_to;
        this.partial_banking_from = partial_banking_from;
        this.partial_banking_to = partial_banking_to;
        this.full_cuttin_from = full_cuttin_from;
        this.full_cutting_to = full_cutting_to;
        this.canal_length = canal_length;
        this.canal_id = canal_id;
        this.delete_flag = delete_flag;
        this.delete_user = delete_user;
        this.delete_time = delete_time;
        this.is_latest = is_latest;
        this.sub_division_id = sub_division_id;
    }
}
