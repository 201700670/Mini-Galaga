/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galaga;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author Andrea Palomo
 */
public class Galaga extends JFrame{
    public Galaga(){
        mostrarinicio();
    }
    private void mostrarinicio() {
        add(new Mosgal());
        
        setSize(600, 400);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Galaga obj = new Galaga();
                obj.setVisible(true);
            }
        });
    }
    
}
