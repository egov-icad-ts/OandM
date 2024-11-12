package com.tgs.ir.entities;

public class Idc_work_status_reorg {
@Column(name="work_id")
 
 private Integer  workId;

@Column(name="lis_id")
 
 private Integer  lisId;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="division_name")
 
 private String  divisionName;

@Column(name="admin_sanction")
 
 private Double  adminSanction;

@Column(name="agency_name")
 
 private String  agencyName;

@Column(name="agt_value")
 
 private Double  agtValue;

@Column(name="works_value")
 
 private Double  worksValue;

@Column(name="well_component")
 
 private String  wellComponent;

@Column(name="well_amt")
 
 private Double  wellAmt;

@Column(name="pipe_component")
 
 private String  pipeComponent;

@Column(name="pipe_amt")
 
 private Double  pipeAmt;

@Column(name="jwph_component")
 
 private String  jwphComponent;

@Column(name="jwph_amt")
 
 private Double  jwphAmt;

@Column(name="main_component")
 
 private String  mainComponent;

@Column(name="main_amt")
 
 private Double  mainAmt;

@Column(name="cistern_component")
 
 private String  cisternComponent;

@Column(name="cistern_amt")
 
 private Double  cisternAmt;

@Column(name="gravity_component")
 
 private String  gravityComponent;

@Column(name="gravity_length")
 
 private Double  gravityLength;

@Column(name="gravity_amt")
 
 private Double  gravityAmt;

@Column(name="e_m_component")
 
 private String  eMComponent;

@Column(name="e_m_amt")
 
 private Double  eMAmt;

@Column(name="work_component")
 
 private String  workComponent;

@Column(name="other_amt")
 
 private Double  otherAmt;

@Column(name="total_amt")
 
 private Double  totalAmt;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="created_by_userid")
 
 private String  createdByUserid;

@Column(name="created_postid")
 
 private String  createdPostid;

@Column(name="created_date")
 
 private timestamp without time zone  createdDate;

@Column(name="deleted_by")
 
 private String  deletedBy;

@Column(name="deleted_date")
 
 private timestamp without time zone  deletedDate;

@Column(name="updated_date")
 
 private timestamp without time zone  updatedDate;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="sub_division_id")
 
 private Integer  subDivisionId;

@Column(name="schema_status")
 
 private String  schemaStatus;


    public Idc_work_status_reorg(int work_id, int lis_id, int district_id, Object division_name, double admin_sanction, Object agency_name, double agt_value, double works_value, Object well_component, double well_amt, Object pipe_component, double pipe_amt, Object jwph_component, double jwph_amt, Object main_component, double main_amt, Object cistern_component, double cistern_amt, Object gravity_component, double gravity_length, double gravity_amt, Object e_m_component, double e_m_amt, Object work_component, double other_amt, double total_amt, Object remarks, boolean delete_flag, boolean is_latest, Object created_by_userid, Object created_postid, Object created_date, Object deleted_by, Object deleted_date, Object updated_date, int unit_id, int circle_id, int division_id, int sub_division_id, Object schema_status) {
        this.work_id = work_id;
        this.lis_id = lis_id;
        this.district_id = district_id;
        this.division_name = division_name;
        this.admin_sanction = admin_sanction;
        this.agency_name = agency_name;
        this.agt_value = agt_value;
        this.works_value = works_value;
        this.well_component = well_component;
        this.well_amt = well_amt;
        this.pipe_component = pipe_component;
        this.pipe_amt = pipe_amt;
        this.jwph_component = jwph_component;
        this.jwph_amt = jwph_amt;
        this.main_component = main_component;
        this.main_amt = main_amt;
        this.cistern_component = cistern_component;
        this.cistern_amt = cistern_amt;
        this.gravity_component = gravity_component;
        this.gravity_length = gravity_length;
        this.gravity_amt = gravity_amt;
        this.e_m_component = e_m_component;
        this.e_m_amt = e_m_amt;
        this.work_component = work_component;
        this.other_amt = other_amt;
        this.total_amt = total_amt;
        this.remarks = remarks;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.created_by_userid = created_by_userid;
        this.created_postid = created_postid;
        this.created_date = created_date;
        this.deleted_by = deleted_by;
        this.deleted_date = deleted_date;
        this.updated_date = updated_date;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
        this.schema_status = schema_status;
    }
}
