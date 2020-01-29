/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cst.main;
import com.cst.model.Siswa;

/**
 *
 * @author pika
 */
public class Utama {
    public static void main(String[] args) {
        Siswa obj=new Siswa();
        obj.setNama("Adit");
        System.out.println(obj.getNama());     
    }
}
