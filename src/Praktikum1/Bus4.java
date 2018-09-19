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
public class Bus4 {
    public int penumpang;
    public int maxpenumpang;
    public int counter;
    public int penumpangBaru;
    
    public Bus4(int maxpenumpang){
        this.maxpenumpang=maxpenumpang;
    penumpang=0;
    }
    public void addpenumpang(int penumpang){
        int temp;
    temp=this.penumpang+penumpang;
    if(temp>maxpenumpang){
        System.out.println("Penumpang melebihi kuota");
    }else{
        this.penumpang=temp;
    }
    }
    public void getpenumpang(int password){
         if(password==25){
        System.out.println("Password benar");
    }else{
        System.out.println("Password salah");
    }
    }
    public void getavarage(){
        double x =penumpang/4;
            System.out.println("Rata-ratanya adalah : "+x);
    }
    public void cetak() {
            System.out.println("Penumpang Bus Sekarang adalah "+penumpang);
            System.out.println("Penumpang maksimum  "+maxpenumpang);
        }
}
