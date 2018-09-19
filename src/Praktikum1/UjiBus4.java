/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

/**
 *
 * @author Lenovo
 */
public class UjiBus4 {
    public static void main(String[]args){
         
          Bus4 busBesar = new Bus4(40);
         
          busBesar.addpenumpang(1);
          busBesar.cetak();
          busBesar.addpenumpang(5);
          busBesar.cetak();
          busBesar.addpenumpang(2);
          busBesar.cetak();
          busBesar.getavarage();
       }
}
