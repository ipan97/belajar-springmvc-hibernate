/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ipan97.belajarspringmvchibernate.repository;

import com.github.ipan97.belajarspringmvchibernate.domain.Makanan;
import java.util.List;

/**
 *
 * @author ipan97
 */
public interface MakananRepository {
   void save(Makanan makanan);
   void update(Makanan makanan);
   void delete(Makanan makanan);
   Makanan getMakanan(String idMakanan);
   List<Makanan> getMakanans();
   
}
