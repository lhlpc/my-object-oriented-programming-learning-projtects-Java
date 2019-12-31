import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;


public class TestingGUI{

	int x, y;
	
	
	
	public static void main(String[] args) {
	
		TestingGUI test = new TestingGUI();
		test.createWindow();
		
	}
	
	public void createWindow(){
		
		//Panel and your button
		Panel panel = new Panel();
		
		
		
		//Creating the frame and adding the components
		JFrame frame = new JFrame();
		
		frame.getContentPane().add(BorderLayout.CENTER, panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(300, 400);
		frame.setVisible(true);
		
		for(int i = 0; i < 130; i++){
			x++;
			y++;
			
			panel.repaint();
			
			try{
				Thread.sleep(50);
			}
			catch(Exception e){ }
			
		}
		
	}

	class Panel extends JPanel{
		
		public void paintComponent(Graphics g){
			g.setColor(Color.black);
			g.fillOval(x, y, 40, 40);
		}
	}
	
	
		
	}

