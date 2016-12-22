/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ipan97.belajarspringmvchibernate.service;

import com.github.ipan97.belajarspringmvchibernate.domain.Makanan;
import com.github.ipan97.belajarspringmvchibernate.repository.MakananRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ipan97
 */
@Service
@Transactional(readOnly = true)
public class MakananServiceImpl implements MakananService {

    @Autowired
    private MakananRepository makananRepository;

    @Transactional
    @Override
    public void saveMakanan(Makanan makanan) {
        makananRepository.save(makanan);
    }

    @Transactional
    @Override
    public void updateMakanan(Makanan makanan) {
        makananRepository.update(makanan);
    }

    @Transactional
    @Override
    public void deleteMakanan(Makanan makanan) {
        makananRepository.delete(makanan);
    }

    @Override
    public Makanan getMakanan(String idMakanan) {
        return makananRepository.getMakanan(idMakanan);
    }

    @Override
    public List<Makanan> getMakanans() {
        return makananRepository.getMakanans();
    }

}
