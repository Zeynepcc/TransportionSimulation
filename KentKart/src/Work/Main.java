package Work;

import java.awt.EventQueue;
import javax.swing.JFrame;

import Gui.Model;

public class Main {

    public static void main(String[] args) {

        Model mg = new Model();
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                mg.getFrame().setVisible(true);
                mg.getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });

    }

}
