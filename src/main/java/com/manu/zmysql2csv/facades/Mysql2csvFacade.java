package com.manu.zmysql2csv.facades;

import com.manu.zmysql2csv.model.MigFileUModel;
import com.manu.zmysql2csv.repository.MigFileURepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Optional;

@Component
public class Mysql2csvFacade {


    @Autowired
    private MigFileURepository mFURepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(Mysql2csvFacade.class);

    public String convert(final int idFile) {
        String ret = "";
        final ArrayList<MigFileUModel> mfu4 = (ArrayList<MigFileUModel>) this.mFURepository.findAll();
        final Integer kk22 = idFile;
        final Optional<MigFileUModel> mfu2 = this.mFURepository.findById(idFile);
        if (mfu2.isPresent()) {
            final MigFileUModel mfu3 = mfu2.get();
            ret = mfu3.getFile_name();
            LOGGER.info(" log s ");
        }
        return ret;

    }
}