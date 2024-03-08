import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GameWindow extends JFrame
{

    GamePanel gamePanel = new GamePanel();


    GameWindow()
    {
        this.setSize(1280, 720);
        this.setTitle("Ping Pong Game");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);

        this.setVisible(true);
    }
}
