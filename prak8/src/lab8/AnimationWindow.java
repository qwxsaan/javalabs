package lab8;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AnimationWindow extends JFrame {

    public AnimationWindow(){
        super("AnimationWindow");
        setSize(500, 500);
        setVisible(true);
    }
    public static class Painter extends JPanel implements ActionListener {

        private int counter = 0;
        private ArrayList<Image> images = new ArrayList<>();

        public Painter(){
            Timer timer = new Timer(50, this);
            timer.start();
            images.add(new ImageIcon("C:\\Users\\tyagi\\OneDrive\\Изображения\\Снимки экрана\\anim1.png").getImage());
            images.add(new ImageIcon("C:\\Users\\tyagi\\OneDrive\\Изображения\\Снимки экрана\\anim2.png").getImage());
            images.add(new ImageIcon("C:\\Users\\tyagi\\OneDrive\\Изображения\\Снимки экрана\\anim3.png").getImage());

        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(images.get(counter), 0, 0, null);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            counter++;
            counter%=3;
            repaint();
        }
    }

    public static void main(String[] args) {
        JFrame frame = new AnimationWindow();
        JPanel panel = new Painter();
        panel.setBounds(0, 0, 500, 500);
        frame.setContentPane(panel);
    }
}
