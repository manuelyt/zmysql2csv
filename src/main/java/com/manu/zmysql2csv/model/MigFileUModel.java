package com.manu.zmysql2csv.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "MigrationFileUpload")
public class MigFileUModel extends AuditAbstractModel implements Serializable {
    private static final long serialVersionUID = -4613539081342356266L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "file_name")
    private String file_name;

    @Column(name = "user_id")
    private Integer user_id;

    @Column(name = "authority_id")
    private Integer authority_id;

    @Column(name = "file_upload_date")
    private Date file_upload_date;

    @Column(name = "total_reports_number")
    private Integer total_reports_number;

    @Column(name = "loaded_reports_number")
    private Integer loaded_reports_number;

    @Column(name = "loaded_attachments_number")
    private Integer loaded_attachments_number;

    @Column(name = "initial_process_date")
    private Date initial_process_date;

    @Column(name = "final_process_date")
    private Date final_process_date;

    @Column(name = "migration_origin_id")
    private Integer migration_origin_id;

    @Column(name = "migration_status_id")
    private Integer migration_status_id;

    @Column(name = "message")
    private String message;

}

