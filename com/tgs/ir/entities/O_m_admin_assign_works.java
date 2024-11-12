package com.tgs.ir.entities;

public class O_m_admin_assign_works {
@Column(name="slno")
 
 private Integer  slno;

@Column(name="work_id")
 
 private Integer  workId;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="sub_division_id")
 
 private Integer  subDivisionId;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="updated_by")
 
 private String  updatedBy;

@Column(name="updated_on")
 
 private timestamp without time zone  updatedOn;


    public O_m_admin_assign_works(int slno, int work_id, int unit_id, int circle_id, int division_id, int sub_division_id, boolean is_latest, boolean delete_flag, Object updated_by, Object updated_on) {
        this.slno = slno;
        this.work_id = work_id;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
        this.is_latest = is_latest;
        this.delete_flag = delete_flag;
        this.updated_by = updated_by;
        this.updated_on = updated_on;
    }
}
