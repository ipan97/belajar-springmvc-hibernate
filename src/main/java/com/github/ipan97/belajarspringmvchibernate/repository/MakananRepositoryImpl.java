/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ipan97.belajarspringmvchibernate.repository;

import com.github.ipan97.belajarspringmvchibernate.domain.Makanan;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ipan97
 */
@Repository
public class MakananRepositoryImpl implements MakananRepository {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Makanan makanan) {
        sessionFactory.getCurrentSession().save(makanan);
    }

    @Override
    public void update(Makanan makanan) {
        sessionFactory.getCurrentSession().update(makanan);
    }

    @Override
    public void delete(Makanan makanan) {
        sessionFactory.getCurrentSession().delete(makanan);
    }

    @Override
    public Makanan getMakanan(String idMakanan) {
        return sessionFactory.getCurrentSession().get(Makanan.class, idMakanan);
    }

    @Override
    public List<Makanan> getMakanans() {
        return sessionFactory.getCurrentSession().createCriteria(Makanan.class).list();
    }

}
