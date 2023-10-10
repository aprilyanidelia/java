/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threading_delia;



public class multithreading implements Runnable{

    public void run(){
        
    }
    
    public static void main(String[] args) {
        Thread MThread1 = new Thread("Percobaan 1");
        Thread MThread2 = new Thread("Percobaan 2");
        Thread MThread3 = new Thread("Percobaan 3");
        MThread1.start();
        MThread2.start();
        MThread3.start();
        System.out.println("MULTITHREAD SEDANG BERJALAN NIH:");
        System.out.println(MThread1.getName());
        System.out.println(MThread2.getName());
        System.out.println(MThread3.getName());
    }
    
}
