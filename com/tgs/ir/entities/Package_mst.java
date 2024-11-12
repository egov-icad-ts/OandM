package com.tgs.ir.entities;

public class Package_mst {
@Column(name="pkg_id")
 
 private Integer  pkgId;

@Column(name="pkg_name")
 
 private String  pkgName;

@Column(name="pkg_code")
 
 private String  pkgCode;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="user_id")
 
 private String  userId;

@Column(name="created_date")
 
 private date  createdDate;

@Column(name="deleteflag")
 
 private boolean  deleteflag;

@Column(name="post_id")
 
 private String  postId;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="extent")
 
 private Double  extent;

@Column(name="agrmnt_value_crores")
 
 private Double  agrmntValueCrores;

@Column(name="is_proforma")
 
 private boolean  isProforma;

@Column(name="epc")
 
 private Integer  epc;

@Column(name="sanction_amt")
 
 private Double  sanctionAmt;


    public Package_mst(int pkg_id, Object pkg_name, Object pkg_code, int project_id, int circle_id, Object user_id, Object created_date, boolean deleteflag, Object post_id, boolean is_latest, double extent, double agrmnt_value_crores, boolean is_proforma, int epc, double sanction_amt) {
        this.pkg_id = pkg_id;
        this.pkg_name = pkg_name;
        this.pkg_code = pkg_code;
        this.project_id = project_id;
        this.circle_id = circle_id;
        this.user_id = user_id;
        this.created_date = created_date;
        this.deleteflag = deleteflag;
        this.post_id = post_id;
        this.is_latest = is_latest;
        this.extent = extent;
        this.agrmnt_value_crores = agrmnt_value_crores;
        this.is_proforma = is_proforma;
        this.epc = epc;
        this.sanction_amt = sanction_amt;
    }
}
