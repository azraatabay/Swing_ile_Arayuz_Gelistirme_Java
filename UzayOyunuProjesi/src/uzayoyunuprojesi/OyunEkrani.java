/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uzayoyunuprojesi;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author ASUS
 */
public class OyunEkrani extends JFrame{

    public OyunEkrani(String title) throws HeadlessException {
        super(title);
    }
    
    
    public static void main(String args[]){
        OyunEkrani ekran = new OyunEkrani("Uzay Oyunu");
        ekran.setVisible(true);
        ekran.setResizable(false);
        ekran.setFocusable(false);
        ekran.setSize(800, 600);
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Oyun oyun = new Oyun();
        
        oyun.addKeyListener(oyun);
        oyun.setFocusable(true);
        oyun.setFocusTraversalKeysEnabled(false);//klavye işlemlerinin direkt olarak gerçekleşmesi için gerekli 
        
        ekran.add(oyun);
        ekran.setVisible(true);
        oyun.requestFocus();
    }
}
