/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cst.dao;
import com.cst.model.Siswa;
/**
 *
 * @author pika
 */

public interface SiswaDAO {
    public void insertSiswa(String nis);
    public void siswa();
    public void hapusSiswa(String nis);
    public void updateSiswa(Siswa siswa);
}
