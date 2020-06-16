package com.manu.zmysql2csv.repository;

import com.manu.zmysql2csv.model.MigFileUModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MigFileURepository extends JpaRepository<MigFileUModel, Integer> {
}
