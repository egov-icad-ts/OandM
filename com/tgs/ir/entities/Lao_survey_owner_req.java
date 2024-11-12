package com.tgs.ir.entities;

public class Lao_survey_owner_req {
@Column(name="lao_survey_owner_req_id")
 
 private Integer  laoSurveyOwnerReqId;

@Column(name="dee_enter_req_id")
 
 private Integer  deeEnterReqId;

@Column(name="survey_number_id")
 
 private Integer  surveyNumberId;

@Column(name="owner_id")
 
 private Integer  ownerId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="created_by_user")
 
 private String  createdByUser;

@Column(name="created_date")
 
 private timestamp without time zone  createdDate;

@Column(name="status_id")
 
 private Integer  statusId;

@Column(name="owner_acres")
 
 private Double  ownerAcres;

@Column(name="owner_guntas")
 
 private Double  ownerGuntas;

@Column(name="tree_amount")
 
 private Double  treeAmount;

@Column(name="land_amount")
 
 private Double  landAmount;

@Column(name="structure_amount")
 
 private Double  structureAmount;

@Column(name="total_amount")
 
 private Double  totalAmount;

@Column(name="lao_view_id")
 
 private Integer  laoViewId;

@Column(name="ref_id")
 
 private Integer  refId;

@Column(name="proc_id")
 
 private Integer  procId;

@Column(name="income_tax")
 
 private Double  incomeTax;

@Column(name="net_amount")
 
 private Double  netAmount;

@Column(name="dee_req_acq_temp_id")
 
 private Integer  deeReqAcqTempId;

@Column(name="owner_sqyrds")
 
 private Double  ownerSqyrds;

@Column(name="no_of_structures")
 
 private Integer  noOfStructures;

@Column(name="benificiary_id")
 
 private String  benificiaryId;


    public Lao_survey_owner_req(int lao_survey_owner_req_id, int dee_enter_req_id, int survey_number_id, int owner_id, boolean delete_flag, Object created_by_user, Object created_date, int status_id, double owner_acres, double owner_guntas, double tree_amount, double land_amount, double structure_amount, double total_amount, int lao_view_id, int ref_id, int proc_id, double income_tax, double net_amount, int dee_req_acq_temp_id, double owner_sqyrds, int no_of_structures, Object benificiary_id) {
        this.lao_survey_owner_req_id = lao_survey_owner_req_id;
        this.dee_enter_req_id = dee_enter_req_id;
        this.survey_number_id = survey_number_id;
        this.owner_id = owner_id;
        this.delete_flag = delete_flag;
        this.created_by_user = created_by_user;
        this.created_date = created_date;
        this.status_id = status_id;
        this.owner_acres = owner_acres;
        this.owner_guntas = owner_guntas;
        this.tree_amount = tree_amount;
        this.land_amount = land_amount;
        this.structure_amount = structure_amount;
        this.total_amount = total_amount;
        this.lao_view_id = lao_view_id;
        this.ref_id = ref_id;
        this.proc_id = proc_id;
        this.income_tax = income_tax;
        this.net_amount = net_amount;
        this.dee_req_acq_temp_id = dee_req_acq_temp_id;
        this.owner_sqyrds = owner_sqyrds;
        this.no_of_structures = no_of_structures;
        this.benificiary_id = benificiary_id;
    }
}
