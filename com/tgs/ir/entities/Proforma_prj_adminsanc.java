package com.tgs.ir.entities;

public class Proforma_prj_adminsanc {
@Column(name="pa_id")
 
 private Integer  paId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="admn_sanc")
 
 private Double  admnSanc;

@Column(name="is_proforma")
 
 private boolean  isProforma;


    public Proforma_prj_adminsanc(int pa_id, int project_id, double admn_sanc, boolean is_proforma) {
        this.pa_id = pa_id;
        this.project_id = project_id;
        this.admn_sanc = admn_sanc;
        this.is_proforma = is_proforma;
    }
}
