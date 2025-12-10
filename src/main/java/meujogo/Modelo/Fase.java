package meujogo.Modelo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Fase extends JPanel implements ActionListener {

    private Image fundo;
    private Player player;



    public Fase() {
        ImageIcon referencia = new ImageIcon(getClass().getResource("/background.jpg"));
        fundo = referencia.getImage();
        player = new Player();
        player.load();
    }

    @Override
    public void paintComponent(Graphics g) {
        // paintComponent é o método correto do Swing
        super.paintComponent(g);

        Graphics2D graficos = (Graphics2D) g;

        if (fundo != null) {
            // 'this' no lugar de 'null' é a prática recomendada para o ImageObserver
            graficos.drawImage(fundo, 0, 0, this);
        }

        // Não use g.dispose() no paintComponent, o Swing cuida disso.
    }
}