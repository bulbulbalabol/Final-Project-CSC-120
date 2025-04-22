import javax.swing.*;

public class MapDisplay {
    public static void showMap(String imagePath) {
        JFrame frame = new JFrame("Treasure Map");
        ImageIcon mapIcon = new ImageIcon(imagePath);
        JLabel label = new JLabel(mapIcon);
        frame.add(label);
        frame.pack();
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }
}
