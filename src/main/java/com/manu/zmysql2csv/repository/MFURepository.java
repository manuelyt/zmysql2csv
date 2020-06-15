package com.manu.zmysql2csv.repository;

import com.manu.zmysql2csv.model.MFUModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MFURepository extends JpaRepository<MFUModel, Integer> {
}
