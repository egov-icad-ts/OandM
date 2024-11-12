package com.tgs.ir.entities;

public class Rr_boq_items_work_progress {
@Column(name="rr_work_progress_id")
 
 private Integer  rrWorkProgressId;

@Column(name="rr_boq_item_id")
 
 private Integer  rrBoqItemId;

@Column(name="rr_secondary_item_id")
 
 private Integer  rrSecondaryItemId;

@Column(name="agreement_quantity")
 
 private Double  agreementQuantity;

@Column(name="previous_quantity")
 
 private Double  previousQuantity;

@Column(name="present_quantity")
 
 private Double  presentQuantity;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="submited_by")
 
 private String  submitedBy;

@Column(name="submited_date")
 
 private timestamp without time zone  submitedDate;

@Column(name="edit_flag")
 
 private boolean  editFlag;

@Column(name="edit_date")
 
 private timestamp without time zone  editDate;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="rr_boq_total_id")
 
 private Integer  rrBoqTotalId;

@Column(name="edit_by")
 
 private String  editBy;


    public Rr_boq_items_work_progress(int rr_work_progress_id, int rr_boq_item_id, int rr_secondary_item_id, double agreement_quantity, double previous_quantity, double present_quantity, boolean delete_flag, Object submited_by, Object submited_date, boolean edit_flag, Object edit_date, boolean is_latest, int rr_boq_total_id, Object edit_by) {
        this.rr_work_progress_id = rr_work_progress_id;
        this.rr_boq_item_id = rr_boq_item_id;
        this.rr_secondary_item_id = rr_secondary_item_id;
        this.agreement_quantity = agreement_quantity;
        this.previous_quantity = previous_quantity;
        this.present_quantity = present_quantity;
        this.delete_flag = delete_flag;
        this.submited_by = submited_by;
        this.submited_date = submited_date;
        this.edit_flag = edit_flag;
        this.edit_date = edit_date;
        this.is_latest = is_latest;
        this.rr_boq_total_id = rr_boq_total_id;
        this.edit_by = edit_by;
    }
}
