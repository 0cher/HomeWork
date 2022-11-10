package methodClass;

import javax.swing.*;

public class Swing extends JFrame {

    public Swing() {
        setTitle("Sea Battle");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Swing ex = new Swing();
        ex.setVisible(true);
    }




}
