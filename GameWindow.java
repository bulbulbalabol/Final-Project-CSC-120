import javax.swing.*;

public class GameWindow {
    private final JFrame frame;

    public GameWindow() {
        frame = new JFrame("Pirate Adventure Game");

        // Example button
        JButton startButton = new JButton("Start Game");
        startButton.addActionListener(e -> {
            // Action when button clicked
            System.out.println("Game Started!");
        });

        // Add components
        JPanel panel = new JPanel();
        panel.add(startButton);

        frame.add(panel);
        frame.setSize(400, 300); // width, height
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}


