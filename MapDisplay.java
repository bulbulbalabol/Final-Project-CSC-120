import javax.swing.*;

public class MapDisplay {
    public static void showMap(String imagePath) {
        JFrame frame = new JFrame("Treasure Map");
        ImageIcon mapIcon = new ImageIcon(imagePath);
        JLabel label = new JLabel(mapIcon);
        frame.add(label);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}


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