package com.manu.zmysql2csv.controller;

import com.manu.zmysql2csv.facades.Mysql2csvFacade;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    private final Mysql2csvFacade mysql2csvFacade;

    public SampleController(final Mysql2csvFacade mysql2csvFacade) {
        this.mysql2csvFacade = mysql2csvFacade;
    }

    @RequestMapping("/")
    String jsonval(@RequestParam("idFile") final int idFile) {
        return this.mysql2csvFacade.convert(idFile);
    }

    @RequestMapping("/")
    String elastic(@RequestParam("idFile") final int idFile) {
        return this.mysql2csvFacade.elastic(idFile);
    }
}