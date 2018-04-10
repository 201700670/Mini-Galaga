/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galaga;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Andrea Palomo
 */
public class Mosgal extends JPanel implements ActionListener {
    private Timer timer;
    private Nave cohete;
    private final int NUMERO = 10;
        public Mosgal(){
            pantalla();
        }
        private void pantalla() {
        addKeyListener(new Adpt());
        setFocusable(true);
        setBackground(Color.WHITE);

        cohete = new Nave();

        timer = new Timer(NUMERO, this);
        timer.start();
        }
         @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        doDrawing(g);

        Toolkit.getDefaultToolkit().sync();
    }

    private void doDrawing(Graphics g) {
        
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(cohete.getImage(), cohete.getX(), cohete.getY(), this);        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        cohete.move();
        repaint();
    }

    private class Adpt implements KeyListener {
    

        @Override
        public void keyTyped(KeyEvent ke) {
        }

        @Override
        public void keyPressed(KeyEvent ke) {
            cohete.keyPressed(ke);
        }

        @Override
        public void keyReleased(KeyEvent ke) {
            cohete.keyReleased(ke);
       }
    }

}
