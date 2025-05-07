import javax.swing.*;
public class GifDisplay {
        // This method displays a GIF in a new window
        public static void showGif(String gifPath) {
            // Create a new window (JFrame) with the title "Victory!"
            JFrame frame = new JFrame("Victory!");
            // Load the GIF from the specified path
            ImageIcon gif = new ImageIcon(gifPath);
            // Create a JLabel to hold and display the GIF
            JLabel label = new JLabel(gif);
            // Add the label (with the GIF) to the frame
            frame.add(label);
            // Ensure the program exits when the window is closed
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // Automatically sizes the frame based on the contents
            frame.pack();
            // Center the frame on the screen
            frame.setLocationRelativeTo(null);
            // Make the frame visible
            frame.setVisible(true);
        }
    }
     

