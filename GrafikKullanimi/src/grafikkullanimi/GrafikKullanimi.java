/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafikkullanimi;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author ASUS
 */
public class GrafikKullanimi extends JPanel{

    @Override
    public void paint(Graphics g) {
        super.paint(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        g.setColor(Color.red);
        g.drawRect(100, 10, 30, 40);
        g.fillRect(200, 100, 30, 40);
        g.setColor(Color.blue);
        g.drawOval(200, 200, 60, 30);
        g.fillOval(300, 300, 40, 40);
        g.setColor(Color.yellow);
        g.drawLine(100, 100, 300, 300);
    }

    public GrafikKullanimi() {
        setBackground(Color.BLACK);
    }
    
    
}
