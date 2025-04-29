import javax.swing.*;
public class GifDisplay {
    
        public static void showGif(String gifPath) {
            JFrame frame = new JFrame("Victory!");
            ImageIcon gif = new ImageIcon(gifPath);
            JLabel label = new JLabel(gif);
            frame.add(label);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }
    }
     

