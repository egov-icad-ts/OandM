package com.tgs.ir.entities;

public class Civil_comp_of_lis_idc_o {
@Column(name="lis_id")
 
 private Integer  lisId;

@Column(name="civ_comp_lis_id")
 
 private Integer  civCompLisId;

@Column(name="surgepool_size")
 
 private String  surgepoolSize;

@Column(name="deliverymain_length")
 
 private String  deliverymainLength;

@Column(name="deliverymain_diameter")
 
 private String  deliverymainDiameter;

@Column(name="deliverymain_thickness")
 
 private String  deliverymainThickness;

@Column(name="delivery_cistern_length")
 
 private Double  deliveryCisternLength;

@Column(name="delivery_cistern_width")
 
 private Double  deliveryCisternWidth;

@Column(name="delivery_cistern_no")
 
 private Double  deliveryCisternNo;

@Column(name="created_by_userid")
 
 private String  createdByUserid;

@Column(name="created_date")
 
 private timestamp without time zone  createdDate;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="update_flag")
 
 private boolean  updateFlag;

@Column(name="updated_date")
 
 private timestamp without time zone  updatedDate;

@Column(name="post_id")
 
 private String  postId;

@Column(name="project_id")
 
 private Integer  projectId;

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

@Column(name="file_path")
 
 private String  filePath;

@Column(name="approved_userid")
 
 private String  approvedUserid;

@Column(name="approved_post_id")
 
 private String  approvedPostId;

@Column(name="approved_timestamp")
 
 private timestamp without time zone  approvedTimestamp;

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


    public Civil_comp_of_lis_idc_o(int lis_id, int civ_comp_lis_id, Object surgepool_size, Object deliverymain_length, Object deliverymain_diameter, Object deliverymain_thickness, double delivery_cistern_length, double delivery_cistern_width, double delivery_cistern_no, Object created_by_userid, Object created_date, boolean delete_flag, boolean update_flag, Object updated_date, Object post_id, int project_id, int old_unit_id, int old_circle_id, int old_division_id, int old_sub_division_id, int status_id, Object file_path, Object approved_userid, Object approved_post_id, Object approved_timestamp, Object deleted_by, Object deleted_time, int unit_id, int circle_id, int division_id, int sub_division_id) {
        this.lis_id = lis_id;
        this.civ_comp_lis_id = civ_comp_lis_id;
        this.surgepool_size = surgepool_size;
        this.deliverymain_length = deliverymain_length;
        this.deliverymain_diameter = deliverymain_diameter;
        this.deliverymain_thickness = deliverymain_thickness;
        this.delivery_cistern_length = delivery_cistern_length;
        this.delivery_cistern_width = delivery_cistern_width;
        this.delivery_cistern_no = delivery_cistern_no;
        this.created_by_userid = created_by_userid;
        this.created_date = created_date;
        this.delete_flag = delete_flag;
        this.update_flag = update_flag;
        this.updated_date = updated_date;
        this.post_id = post_id;
        this.project_id = project_id;
        this.old_unit_id = old_unit_id;
        this.old_circle_id = old_circle_id;
        this.old_division_id = old_division_id;
        this.old_sub_division_id = old_sub_division_id;
        this.status_id = status_id;
        this.file_path = file_path;
        this.approved_userid = approved_userid;
        this.approved_post_id = approved_post_id;
        this.approved_timestamp = approved_timestamp;
        this.deleted_by = deleted_by;
        this.deleted_time = deleted_time;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
    }
}
