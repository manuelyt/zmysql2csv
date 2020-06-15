package com.manu.zmysql2csv.facades;

import com.manu.zmysql2csv.model.MFUModel;
import com.manu.zmysql2csv.repository.MFURepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mysql2csvFacade {


    @Autowired
    private MFURepository mFURepository;


    public String convert(final int idFile
    ) {

        final MFUModel mfu = this.mFURepository.getOne(idFile);

        return "";

    }
}