package bakh.tennis.com;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GameFrame extends JFrame
{
	
	GamePanel panel = new GamePanel();
	GameFrame(){
		
		panel = new GamePanel();
		
		this.add(panel);
		this.setTitle("PongGame");
		this.setResizable(false);
        this.setBackground(Color.white);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// to close the app when hitting clpse 
        this.pack(); // adjusting the window to the content 
        this.setVisible(true);
        

	}

}
	 
