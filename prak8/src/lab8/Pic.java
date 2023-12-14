package lab8;

//import piriampiriam.Circle;
//import piriampiriam.Rectangle;
//import piriampiriam.Shape;
//import piriampiriam.Window;

import javax.swing.*;
import java.awt.*;

public class Pic extends JFrame {

    public Pic(){
        super("PicWindow");
        setSize(1000, 750);
        setVisible(true);
    }

    public static class Painter extends JPanel{
        Image img;

        public Painter(String route){
            img = new ImageIcon(route).getImage();
        }

        @Override
        protected void paintComponent(java.awt.Graphics g) {
            g.drawImage(img, 0, 0 , null);
        }

    }

    public static void main(String[] args) {
        JFrame frame = new Pic();
        JPanel panel = new Pic.Painter(args[0]);
        panel.setBounds(0, 0 , 1000, 1000);
        frame.setContentPane(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}