/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luas_persegi_panjang;
import java.util.Scanner;

public class MVC_pattern {
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in); 
        Model model = input_tampil();
        View view = new View();
        
        Control controller = new Control(model,view);
        controller.updateView();
    }
    private static Model input_tampil(){
        System.out.println("HITUNG LUAS PERSEGI PANJANG DENGAN MVC");
        Scanner keyboard = new Scanner(System.in);
        
        Model tampil = new Model();
        System.out.print("INPUT PANJANG: ");
        int x = keyboard.nextInt();
        tampil.setPanjang(x);
        
        System.out.print("INPUT LEBAR:");
        int y = keyboard.nextInt();
        tampil.setLebar(y);
        return tampil;
    }
}
