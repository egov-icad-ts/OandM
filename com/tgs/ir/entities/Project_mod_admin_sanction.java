package com.tgs.ir.entities;

public class Project_mod_admin_sanction {
@Column(name="id")
 
 private Integer  id;

@Column(name="wk_id")
 
 private Integer  wkId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="type_of_works")
 
 private Integer  typeOfWorks;

@Column(name="name_of_work")
 
 private String  nameOfWork;

@Column(name="admin_sanction_amount")
 
 private Double  adminSanctionAmount;

@Column(name="ecv_amount")
 
 private Double  ecvAmount;

@Column(name="non_ecv_amount")
 
 private Double  nonEcvAmount;

@Column(name="go_number")
 
 private String  goNumber;

@Column(name="go_date")
 
 private date  goDate;

@Column(name="go_file_path")
 
 private String  goFilePath;

@Column(name="ssr_year")
 
 private String  ssrYear;

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

@Column(name="orig_rev")
 
 private Integer  origRev;

@Column(name="head_of_account")
 
 private String  headOfAccount;

@Column(name="ref_work_id")
 
 private Integer  refWorkId;


    public Project_mod_admin_sanction(int id, int wk_id, int project_id, int type_of_works, Object name_of_work, double admin_sanction_amount, double ecv_amount, double non_ecv_amount, Object go_number, Object go_date, Object go_file_path, Object ssr_year, boolean delete_flag, boolean is_latest, Object created_by, Object created_time, int unit_id, long post_id, Object deleted_by, Object deleted_time, int circle_id, int division_id, int sub_division_id, int orig_rev, Object head_of_account, int ref_work_id) {
        this.id = id;
        this.wk_id = wk_id;
        this.project_id = project_id;
        this.type_of_works = type_of_works;
        this.name_of_work = name_of_work;
        this.admin_sanction_amount = admin_sanction_amount;
        this.ecv_amount = ecv_amount;
        this.non_ecv_amount = non_ecv_amount;
        this.go_number = go_number;
        this.go_date = go_date;
        this.go_file_path = go_file_path;
        this.ssr_year = ssr_year;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.created_by = created_by;
        this.created_time = created_time;
        this.unit_id = unit_id;
        this.post_id = post_id;
        this.deleted_by = deleted_by;
        this.deleted_time = deleted_time;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
        this.orig_rev = orig_rev;
        this.head_of_account = head_of_account;
        this.ref_work_id = ref_work_id;
    }
}
