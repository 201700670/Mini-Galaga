/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galaga;

import java.awt.Image;
import java.awt.Label;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author Andrea Palomo
 */
public class Nave {
    private int x1;
    private int y1;
    private int x;
    private int y;
    private Image naves;
    private float vx, vy;
    private final static int ANCHO = 768;
    private final static int DIAMETRO = 10;
    private final static int ALTO = 384;
    public Nave(){
        imagen();
    }
    private void imagen(){
      Image cohete = new ImageIcon(getClass().getResource("nave.png")).getImage(); 
      naves = cohete;
      x=520;
      y=0;
    }
    public void move() {
        x+=x1;
        y += y1;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImage() {
        return naves;
    }
     private int clamp(int valor, int min, int max) {
        if (valor > max)
            return max;
        if (valor < min)
            return min;
        return valor;
    }
    public void keyPressed(KeyEvent e) {
      switch(e.getKeyCode()){
//          case KeyEvent.VK_UP: System.out.println("hola");
      }
        int accion = e.getKeyCode();
        if (accion == KeyEvent.VK_UP) {
            y1 = -3;
        }
        if (accion == KeyEvent.VK_DOWN) {
            y1 = 3;
        }
        
        y = clamp(y+y1 , 8,320);
//        System.out.println(y);
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_UP) {
            y1 = 0;
        }
        

        if (key == KeyEvent.VK_DOWN) {
            y1 = 0;
        }
    }

   

}
