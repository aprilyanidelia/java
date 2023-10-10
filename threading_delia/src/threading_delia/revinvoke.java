/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threading_delia;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
public class revinvoke {

    private static JButton good = new JButton("THREAD 1");
    private static JButton bad2 = new JButton("THREAD 2");
    private static JLabel resultLabel = new JLabel("THREAD SIAP DICOBA",JLabel.CENTER);
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel p = new JPanel();
        p.setOpaque(true);
        p.setLayout(new FlowLayout());
        p.add(good);
        p.add(bad2);
        
        Container c = f.getContentPane();
        c.setLayout(new BorderLayout());
        c.add(p, BorderLayout.CENTER);
        c.add(resultLabel, BorderLayout.SOUTH);
        
        good.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ev){
        resultLabel.setText("Thread 1 sedang berjalan .  .  .");
        setEnabled(false);
        
        Thread worker = new Thread(){
            public void run(){
                try{
                    Thread.sleep(5000);
                }catch (InterruptedException ex){}
            }
        };
        worker.start();
        }
    }); 
        bad2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ev){
                resultLabel.setText("Thread 2 sedang berjalan .  .  .");
                setEnabled(false);
                
                SwingUtilities.invokeLater(new Runnable(){
                    public void run(){
                        try{
                            Thread.sleep(5000);
                        }catch (InterruptedException ex){}
                        
                        resultLabel.setText("THREAD 2 BERHENTI");
                        setEnabled(true);
                    }
                });
            }
        });
        
        f.setSize(300,100);
        f.setVisible(true);
    }
        static void setEnabled(boolean b){
            good.setEnabled(b);
            bad2.setEnabled(b);
        }
    }
    

