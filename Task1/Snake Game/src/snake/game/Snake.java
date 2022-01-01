package snake.game;

import javax.swing.*;
import java.awt.*;


public class Snake extends JFrame{
	

		Snake(){
			add(new Board());
			
		
		setLocationRelativeTo(null);
		pack();
		setTitle("Snake Game");
		setResizable(false);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 new Snake().setVisible(true);
	}

}
