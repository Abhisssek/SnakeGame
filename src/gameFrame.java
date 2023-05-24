import javax.swing.*;
import java.awt.*;

public class gameFrame extends JFrame {
    gameFrame() {
        this.add(new gamPanel());
        this.setTitle("Sanke");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

}
