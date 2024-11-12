package com.tgs.ir.entities;

public class Library_book_data {
@Column(name="book_id")
 
 private Integer  bookId;

@Column(name="accession_no")
 
 private String  accessionNo;

@Column(name="author_name")
 
 private String  authorName;

@Column(name="title_of_publication")
 
 private String  titleOfPublication;

@Column(name="publishers_name")
 
 private String  publishersName;

@Column(name="subject_id")
 
 private Integer  subjectId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="created_by_user")
 
 private String  createdByUser;

@Column(name="created_post_id")
 
 private String  createdPostId;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="sub_division_id")
 
 private Integer  subDivisionId;

@Column(name="created_date")
 
 private timestamp without time zone  createdDate;

@Column(name="deleted_by")
 
 private String  deletedBy;

@Column(name="deleted_timestamp")
 
 private timestamp without time zone  deletedTimestamp;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="edit_flag")
 
 private boolean  editFlag;

@Column(name="updated_username")
 
 private String  updatedUsername;

@Column(name="updated_timestamp")
 
 private timestamp without time zone  updatedTimestamp;


    public Library_book_data(int book_id, Object accession_no, Object author_name, Object title_of_publication, Object publishers_name, int subject_id, boolean delete_flag, boolean is_latest, Object created_by_user, Object created_post_id, int unit_id, int circle_id, int division_id, int sub_division_id, Object created_date, Object deleted_by, Object deleted_timestamp, Object remarks, boolean edit_flag, Object updated_username, Object updated_timestamp) {
        this.book_id = book_id;
        this.accession_no = accession_no;
        this.author_name = author_name;
        this.title_of_publication = title_of_publication;
        this.publishers_name = publishers_name;
        this.subject_id = subject_id;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.created_by_user = created_by_user;
        this.created_post_id = created_post_id;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
        this.created_date = created_date;
        this.deleted_by = deleted_by;
        this.deleted_timestamp = deleted_timestamp;
        this.remarks = remarks;
        this.edit_flag = edit_flag;
        this.updated_username = updated_username;
        this.updated_timestamp = updated_timestamp;
    }
}
