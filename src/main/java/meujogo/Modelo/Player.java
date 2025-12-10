package meujogo.Modelo;

import javax.swing.*;
import java.awt.Image;
import java.awt.event.KeyEvent;

public class Player {
    private int x,y;
    private int dx,dy;
    private Image imagem;
    private int altura,largura;

    public player(){
        this.x = 100;
        this.y = 100;
    }
    public void load(){
        ImageIcon referencia = new ImageIcon(getClass().getResource("/player.jpg"));
        this.imagem = referencia.getImage();

        altura = imagem.getHeight(null);
        largura = imagem.getWidth(null);
    }
    public void update(){
        x += dx;
        y += dy;
    }
    public void keyPressed(KeyEvent tecla){
        int codigo = tecla.getKeyCode();

        if(codigo ==KeyEvent.VK_UP){
            dy=-3;
        }
        if(codigo ==KeyEvent.VK_DOWN){
            dy=-3;
        }
        if(codigo == KeyEvent.VK_LEFT){
            dy=-3;
        }
        if(codigo ==KeyEvent.VK_RIGHT){
            dy=-3;
        }

    }
    public void keyRelease(KeyEvent tecla){
        int codigo = tecla.getKeyCode();

        if(codigo ==KeyEvent.VK_UP){
            dy=0;
        }
        if(codigo ==KeyEvent.VK_DOWN){
            dy=0;
        }
        if(codigo == KeyEvent.VK_LEFT){
            dy=0;
        }
        if(codigo ==KeyEvent.VK_RIGHT){
            dy=0;
        }

    }
}
