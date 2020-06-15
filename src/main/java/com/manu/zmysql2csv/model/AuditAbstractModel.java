package com.manu.zmysql2csv.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Size;
import java.util.Date;

@Getter
@Setter
@SuperBuilder
@EntityListeners(AuditingEntityListener.class)
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public abstract class AuditAbstractModel {

    @Column(name = "au_creation_date")
    @DateTimeFormat
    private Date creationDate;

    @Column(name = "au_creation_user")
    @Size(max = 50)
    private String creationUser;

    @Column(name = "au_modification_date")
    @DateTimeFormat
    private Date modificationDate;

    @Column(name = "au_modification_user")
    @Size(max = 50)
    private String modificationUser;

    @Column(name = "au_active")
    private Boolean active;

}
