package com.tgs.ir.entities;

public class Project_package_tech_sanction {
@Column(name="pts_id")
 
 private Integer  ptsId;

@Column(name="pas_id")
 
 private Integer  pasId;

@Column(name="tech_sanction_amount")
 
 private Double  techSanctionAmount;

@Column(name="tech_ecv_amount")
 
 private Double  techEcvAmount;

@Column(name="tech_non_ecv_amount")
 
 private Double  techNonEcvAmount;

@Column(name="tech_go_number")
 
 private String  techGoNumber;

@Column(name="tech_go_date")
 
 private date  techGoDate;

@Column(name="tech_go_file_path")
 
 private String  techGoFilePath;

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

@Column(name="post_id")
 
 private bigint  postId;

@Column(name="is_epc")
 
 private Integer  isEpc;

@Column(name="is_original")
 
 private Integer  isOriginal;

@Column(name="ref_pas_no")
 
 private Integer  refPasNo;

@Column(name="ssr_year")
 
 private String  ssrYear;

@Column(name="tech_sanc_auth")
 
 private String  techSancAuth;

@Column(name="deleted_by")
 
 private String  deletedBy;

@Column(name="deleted_time")
 
 private timestamp without time zone  deletedTime;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="sub_division_id")
 
 private Integer  subDivisionId;


    public Project_package_tech_sanction(int pts_id, int pas_id, double tech_sanction_amount, double tech_ecv_amount, double tech_non_ecv_amount, Object tech_go_number, Object tech_go_date, Object tech_go_file_path, boolean delete_flag, boolean is_latest, Object created_by, Object created_time, int unit_id, long post_id, int is_epc, int is_original, int ref_pas_no, Object ssr_year, Object tech_sanc_auth, Object deleted_by, Object deleted_time, int circle_id, int division_id, int sub_division_id) {
        this.pts_id = pts_id;
        this.pas_id = pas_id;
        this.tech_sanction_amount = tech_sanction_amount;
        this.tech_ecv_amount = tech_ecv_amount;
        this.tech_non_ecv_amount = tech_non_ecv_amount;
        this.tech_go_number = tech_go_number;
        this.tech_go_date = tech_go_date;
        this.tech_go_file_path = tech_go_file_path;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.created_by = created_by;
        this.created_time = created_time;
        this.unit_id = unit_id;
        this.post_id = post_id;
        this.is_epc = is_epc;
        this.is_original = is_original;
        this.ref_pas_no = ref_pas_no;
        this.ssr_year = ssr_year;
        this.tech_sanc_auth = tech_sanc_auth;
        this.deleted_by = deleted_by;
        this.deleted_time = deleted_time;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
    }
}
