/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

/**
 *
 * @author Asus Technology
 */
public class HitungHari {
    public int hari, tahun;
    
    void hitung(){
        if(((tahun % 4 == 0) && !(tahun % 100 == 0)) || (tahun % 4 == 0)){
            hari = 29;
        }else{
            hari = 28;
        }
    }
}
