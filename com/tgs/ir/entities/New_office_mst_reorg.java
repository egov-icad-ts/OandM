package com.tgs.ir.entities;

public class New_office_mst_reorg {
@Column(name="office_id")
 
 private Integer  officeId;

@Column(name="new_unit_name")
 
 private String  newUnitName;

@Column(name="new_circle_name")
 
 private String  newCircleName;

@Column(name="new_division_name")
 
 private String  newDivisionName;

@Column(name="new_sub_division_name")
 
 private String  newSubDivisionName;

@Column(name="no_section")
 
 private Integer  noSection;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="is_office")
 
 private String  isOffice;


    public New_office_mst_reorg(int office_id, Object new_unit_name, Object new_circle_name, Object new_division_name, Object new_sub_division_name, int no_section, int unit_id, int circle_id, int division_id, Object is_office) {
        this.office_id = office_id;
        this.new_unit_name = new_unit_name;
        this.new_circle_name = new_circle_name;
        this.new_division_name = new_division_name;
        this.new_sub_division_name = new_sub_division_name;
        this.no_section = no_section;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.is_office = is_office;
    }
}
