import javax.swing.*;
/**
 * GifDisplay is a utility class used to display animated GIFs in a pop-up window.
 */
public class GifDisplay {  
       /**
        * Displays a GIF in a new JFrame window titled "Victory!".
        * The window is automatically sized to fit the GIF and centered on the screen.
        *
        * @param gifPath the file path to the GIF image to be displayed
        */  
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
     

