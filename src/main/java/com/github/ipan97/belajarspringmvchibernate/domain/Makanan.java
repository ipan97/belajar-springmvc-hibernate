/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ipan97.belajarspringmvchibernate.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author ipan97
 */
@Entity
@Table(name = "tb_makanan")
public class Makanan implements Serializable {

    @Id
    @Column(name = "id_makanan", length = 150)
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String idMakanan;
    @Column(name = "nama_makanan", length = 40)
    private String namaMakanan;
    @Column(name = "harga_makanan")
    private BigDecimal hargaMakanan;
    @JsonFormat(pattern = "dd/MM/yyyy", shape = JsonFormat.Shape.STRING)
    @Column(name = "tanggal_kadaluarsa")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tanggalKadaluarsa;

    public String getIdMakanan() {
        return idMakanan;
    }

    public void setIdMakanan(String idMakanan) {
        this.idMakanan = idMakanan;
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public void setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
    }

    public BigDecimal getHargaMakanan() {
        return hargaMakanan;
    }

    public void setHargaMakanan(BigDecimal hargaMakanan) {
        this.hargaMakanan = hargaMakanan;
    }

    public Date getTanggalKadaluarsa() {
        return tanggalKadaluarsa;
    }

    public void setTanggalKadaluarsa(Date tanggalKadaluarsa) {
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }

}
