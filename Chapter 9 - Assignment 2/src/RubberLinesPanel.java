//********************************************************************
//  RubberLinesPanel.java       Author: Lewis/Loftus
//
//  Represents the primary drawing panel for the RubberLines program.
//********************************************************************

import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class RubberLinesPanel extends JPanel {

	/**
	 * 
	 */

	private Point point1 = null, point2 = null;
	private ArrayList<Point> points;

	// -----------------------------------------------------------------
	// Constructor: Sets up this panel to listen for mouse events.
	// -----------------------------------------------------------------
	public RubberLinesPanel() {
		points = new ArrayList<Point>();
		LineListener listener = new LineListener();
		addMouseListener(listener);
		addMouseMotionListener(listener);

		setBackground(Color.black);
		setPreferredSize(new Dimension(400, 200));
	}

	// -----------------------------------------------------------------
	// Draws the current line from the initial mouse-pressed point to
	// the current position of the mouse.
	// -----------------------------------------------------------------
	public void paintComponent(Graphics page) {
		super.paintComponent(page);

		page.setColor(Color.yellow);
		
		for(int i=0; i<points.size(); i+=2){
			if((points.get(i) != null) && (points.get(i+1) != null)){
				page.drawLine((int)points.get(i).x, (int)points.get(i).y, (int)points.get(i+1).x, (int)points.get(i+1).y);
			}
		
			
			/*if (point1 != null && point2 != null)
				page.drawLine(point1.x, point1.y, point2.x, point2.y);
			*/
		}
		
	}

	// *****************************************************************
	// Represents the listener for all mouse events.
	// *****************************************************************
	private class LineListener implements MouseListener, MouseMotionListener {
		public LineListener() {
			// TODO Auto-generated constructor stub
		}

		// --------------------------------------------------------------
		// Captures the initial position at which the mouse button is
		// pressed.
		// --------------------------------------------------------------
		public void mousePressed(MouseEvent event) {
			point1 = event.getPoint();
		}

		// --------------------------------------------------------------
		// Gets the current position of the mouse as it is dragged and
		// redraws the line to create the rubberband effect.
		// --------------------------------------------------------------
		public void mouseDragged(MouseEvent event) {
			point2 = event.getPoint();
		}

		// --------------------------------------------------------------
		// Provide empty definitions for unused event methods.
		// --------------------------------------------------------------
		public void mouseClicked(MouseEvent event) {
		}

		public void mouseReleased(MouseEvent event) {
			point2 = event.getPoint();
			
			points.add(point1);
			points.add(point2);
			repaint();
		}

		public void mouseEntered(MouseEvent event) {
		}

		public void mouseExited(MouseEvent event) {
		}

		public void mouseMoved(MouseEvent event) {
		}
	}
}
