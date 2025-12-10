package meujogo;

import meujogo.Modelo.Fase;

import javax.swing.JFrame;

public class Container extends JFrame {
    public Container(){
        add (new Fase());
        setTitle("Touhou Lunar Night");
        setSize(435,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.setResizable(true);
        setVisible(true);
    }
    public static void main(String []args){
        new Container();
    }
}
