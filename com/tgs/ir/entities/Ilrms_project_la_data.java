package com.tgs.ir.entities;

public class Ilrms_project_la_data {
@Column(name="ilrms_la_id")
 
 private Integer  ilrmsLaId;

@Column(name="division_name")
 
 private String  divisionName;

@Column(name="village_code")
 
 private String  villageCode;

@Column(name="survey_number")
 
 private String  surveyNumber;

@Column(name="acre")
 
 private Integer  acre;

@Column(name="gunta")
 
 private Double  gunta;

@Column(name="village_id")
 
 private Integer  villageId;

@Column(name="mandal_id")
 
 private Integer  mandalId;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="project_id")
 
 private Integer  projectId;


    public Ilrms_project_la_data(int ilrms_la_id, Object division_name, Object village_code, Object survey_number, int acre, double gunta, int village_id, int mandal_id, int district_id, int project_id) {
        this.ilrms_la_id = ilrms_la_id;
        this.division_name = division_name;
        this.village_code = village_code;
        this.survey_number = survey_number;
        this.acre = acre;
        this.gunta = gunta;
        this.village_id = village_id;
        this.mandal_id = mandal_id;
        this.district_id = district_id;
        this.project_id = project_id;
    }
}
