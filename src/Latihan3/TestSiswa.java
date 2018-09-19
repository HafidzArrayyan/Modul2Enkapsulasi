/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author Lenovo
 */
public class TestSiswa {
    
    public static void main(String[] args) {
        EncapSiswa siswa=new EncapSiswa();
        siswa.setName("Hafidz");
        siswa.setAge(25);
        siswa.getAddress("Malang");
        
        System.out.print("Name : "+siswa.getName()+"\nAbsen : "+siswa.getAbsen()+"\nAddress : "+siswa.getAddress());
        System.out.println("");
    }
}
