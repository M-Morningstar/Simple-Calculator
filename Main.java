//Mert Salih Osoydan 
//2021/1/1
//Basic calculator

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        JFrame w = new JFrame();
        w.setSize(380, 480);
        // if you want the title to change, alter the text in the quotes below
        w.setTitle("Calculator");
        GUI m = new GUI();
        //w.setExtendedState(JFrame.MAXIMIZED_BOTH);
        w.add(m);
        w.addKeyListener(new KeyInput(m));w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setVisible(true);

    }

}



