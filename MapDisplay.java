import javax.swing.*;
/**
 * The MapDisplay class displays our map image.
 */

public class MapDisplay {

    /**
     * Displays our map image in a GUI window with the title "Treasure Map".
     * This method creates a new JFrame, loads an image from the specified
     * path, and shows it centered on the screen.
     *
     * @param imagePath the file path to the map image to be displayed
     */
    public static void showMap(String imagePath) {
        // Create a new window (JFrame) titled "Treasure Map"
        JFrame frame = new JFrame("Treasure Map");
        // Load the image located at the given file path
        ImageIcon mapIcon = new ImageIcon(imagePath);
        // Create a label and set the image as its icon
        JLabel label = new JLabel(mapIcon);
        // Add the label (which holds the image) to the frame
        frame.add(label);
        // Resize the window to fit the image
        frame.pack();
        // Center the window on the screen
        frame.setLocationRelativeTo(null);
        // Make the window visible
        frame.setVisible(true);
    }
}

