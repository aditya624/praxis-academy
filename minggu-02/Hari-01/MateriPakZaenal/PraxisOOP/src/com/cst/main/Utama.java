package com.cst.main;
import com.cst.test.Customer;
import com.cst.test.Supplier;
import com.cst.test.Siswa;
public class Utama{
    public static void main(String[] args) {
        Customer pelanggan=new Customer();
        pelanggan.nama="Adit";
        System.out.println(pelanggan.nama);
        Supplier sup=new Supplier();
        sup.nama="Doni";
        System.out.println(sup.nama);
        
        Siswa objSiswa=new Siswa();
        objSiswa.email="adityaadit677@gmail.com";
        
    }
}