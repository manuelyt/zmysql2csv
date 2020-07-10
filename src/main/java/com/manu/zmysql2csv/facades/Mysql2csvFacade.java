package com.manu.zmysql2csv.facades;

import com.manu.zmysql2csv.model.MigFileUModel;
import com.manu.zmysql2csv.repository.MigFileURepository;
import org.easa.eccairs.migration.dtos.FetchedFieldQueryDTO;
import org.easa.eccairs.migration.dtos.PaginationQueryDTO;
import org.easa.eccairs.migration.dtos.SearchRequestDTO;
import org.easa.eccairs.migration.dtos.SortQueryDTO;
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

    private ElasticService elasticService;

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

    public String elastic(final int idFile) {
        final String ret = "";


        final SearchRequestDTO searchRequestDTO = new SearchRequestDTO();
//        final String query = "{\"bool\": {\"must\": [{\"match\": " +
//                "{\"e2Id.keyword\": \"OR-0000000000000001\"}}]}}";
        final String query = "{\"query\": {\"bool\": {\"must\": [{\"match_all\": {}}]}}}";

        final SortQueryDTO sortQueryDTO = new SortQueryDTO();
        final FetchedFieldQueryDTO fetchedFieldQueryDTO = new FetchedFieldQueryDTO();
        final PaginationQueryDTO paginationQueryDTO = new PaginationQueryDTO();

        searchRequestDTO.setIndex("test");
        searchRequestDTO.setQuery(query);
        searchRequestDTO.setSamePage(true);

        final String responseBody = this.elasticService.executeQueryFilter(query);
//        final SearchResponse searchResponse = this.elasticService.query(searchRequestDTO);
        final int kk22 = 0;


        return ret;

    }
}