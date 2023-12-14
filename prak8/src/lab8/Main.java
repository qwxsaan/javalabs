package lab8;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Создание окна с случайными фигурами
        Window window1 = new Window();
        window1.setSize(600,600);


        // Создание окна с картинкой из аргументов командной строки
        if (args.length > 0) {
            String imagePath = args[0];
            ImageIcon imageIcon = new ImageIcon(imagePath);

            JFrame window2 = new JFrame();

            window2.setSize(imageIcon.getIconWidth(), imageIcon.getIconHeight());
            window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JLabel label = new JLabel(imageIcon);
            window2.add(label);

            window2.setVisible(true);
        }

        // Создание окна с анимацией
        JFrame window3 = new JFrame();
        window3.setSize(600, 600);
        window3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon[] frames = new ImageIcon[3];
        frames[0] = new ImageIcon("src/eight/frame1.jpg");
        frames[1] = new ImageIcon("src/eight/frame2.jpg");
        frames[2] = new ImageIcon("src/eight/frame3.jpg");

        JLabel animationLabel = new JLabel();
        window3.add(animationLabel);

        Thread animationThread = new Thread(() -> {
            while (true) {
                for (ImageIcon frame : frames) {
                    animationLabel.setIcon(frame);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        animationThread.start();

        window3.setVisible(true);
    }
}
