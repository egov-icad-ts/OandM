package com.tgs.ir.entities;

public class Inventory_land_encroachemnt_data {
@Column(name="enc_la_id")
 
 private Integer  encLaId;

@Column(name="canal_res_list_id")
 
 private Integer  canalResListId;

@Column(name="dee_req_acq_temp_id")
 
 private Integer  deeReqAcqTempId;

@Column(name="encroachment_details")
 
 private String  encroachmentDetails;

@Column(name="acre")
 
 private Integer  acre;

@Column(name="gunta")
 
 private Double  gunta;

@Column(name="from_year_month")
 
 private String  fromYearMonth;

@Column(name="electric_customer_no")
 
 private String  electricCustomerNo;

@Column(name="plot_no")
 
 private String  plotNo;

@Column(name="ration_card_no")
 
 private String  rationCardNo;

@Column(name="location")
 
 private String  location;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="created_userid")
 
 private String  createdUserid;

@Column(name="created_timestamp")
 
 private timestamp without time zone  createdTimestamp;

@Column(name="chainage")
 
 private Double  chainage;

@Column(name="comp_type_id")
 
 private Integer  compTypeId;


    public Inventory_land_encroachemnt_data(int enc_la_id, int canal_res_list_id, int dee_req_acq_temp_id, Object encroachment_details, int acre, double gunta, Object from_year_month, Object electric_customer_no, Object plot_no, Object ration_card_no, Object location, Object remarks, boolean delete_flag, boolean is_latest, Object created_userid, Object created_timestamp, double chainage, int comp_type_id) {
        this.enc_la_id = enc_la_id;
        this.canal_res_list_id = canal_res_list_id;
        this.dee_req_acq_temp_id = dee_req_acq_temp_id;
        this.encroachment_details = encroachment_details;
        this.acre = acre;
        this.gunta = gunta;
        this.from_year_month = from_year_month;
        this.electric_customer_no = electric_customer_no;
        this.plot_no = plot_no;
        this.ration_card_no = ration_card_no;
        this.location = location;
        this.remarks = remarks;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.created_userid = created_userid;
        this.created_timestamp = created_timestamp;
        this.chainage = chainage;
        this.comp_type_id = comp_type_id;
    }
}
