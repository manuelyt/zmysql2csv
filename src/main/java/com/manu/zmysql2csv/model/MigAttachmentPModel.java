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

@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "MigrationAttachmentProcessed")
public class MigAttachmentPModel extends AuditAbstractModel implements Serializable {
    private static final long serialVersionUID = -4613539081342356266L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "migration_report_processed_id")
    private Integer migration_report_processed_id;

}

