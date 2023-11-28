/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luas_persegi_panjang;

/**
 *
 * @author SMK-WIRA 08
 */
public class Model {
    private int Panjang;
    private int Lebar;
    private int Luas;
    
    public int getPanjang(){
        return Panjang;
    }
    
    public void setPanjang(int Panjang){
        this.Panjang = Panjang;
    }
    public int getlebar(){
        return Lebar;
    }
    public void setLebar(int Lebar){
        this.Lebar = Lebar;
    }
    public int getLuas(){
        return Luas;
    }
    public void setLuas(int Luas){
        this.Luas = Luas;
    }
}
