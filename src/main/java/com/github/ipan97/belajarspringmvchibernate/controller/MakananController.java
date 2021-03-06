/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ipan97.belajarspringmvchibernate.controller;

import com.github.ipan97.belajarspringmvchibernate.domain.Makanan;
import com.github.ipan97.belajarspringmvchibernate.service.MakananService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ipan97
 */
@RestController
@RequestMapping(value = "/api")
public class MakananController {

    @Autowired
    private MakananService makananService;

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/makanan", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Makanan> getMakanans() {
        return makananService.getMakanans();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "/makanan", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public Map<String, Object> saveMakanan(@RequestBody Makanan makanan) {
        makananService.saveMakanan(makanan);
        Map<String, Object> m = new HashMap<>();
        m.put("Success", Boolean.TRUE);
        m.put("Info", "Data Tersimpan");
        return m;
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/makanan", method = RequestMethod.PUT, produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public Map<String, Object> updateMakanan(@RequestBody Makanan makanan) {
        makananService.updateMakanan(makanan);
        Map<String, Object> m = new HashMap<>();
        m.put("Success", Boolean.TRUE);
        m.put("Info", "Data berhasil di update");
        return m;
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/makanan/{idMakanan}", method = RequestMethod.DELETE, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Map<String, Object> deleteMakanan(@PathVariable String idMakanan) {
        makananService.deleteMakanan(makananService.getMakanan(idMakanan));
        Map<String, Object> m = new HashMap<>();
        m.put("Succes", Boolean.TRUE);
        m.put("Info", "Data berhasil dihapus");
        return m;
    }
}
