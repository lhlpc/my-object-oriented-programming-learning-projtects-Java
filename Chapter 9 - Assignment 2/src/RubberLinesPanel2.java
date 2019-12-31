import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Line2D;
import java.util.ArrayList;

import javax.swing.JPanel;

public class RubberLinesPanel2 extends JPanel

{
	private static final long serialVersionUID = 1L;

	private Point point1 = null, point2 = null;

	private ArrayList<Line2D.Double> lines;

	public RubberLinesPanel2()

	{

		lines = new ArrayList<Line2D.Double>();
		LineListener listener = new LineListener();

		addMouseListener(listener);
		addMouseMotionListener(listener);

		setBackground(Color.black);

		setPreferredSize(new Dimension(400, 200));

	}

	public void paintComponent(Graphics page)

	{

		super.paintComponent(page);
		page.setColor(Color.yellow);
		for (int i = 0; i < lines.size(); i++)

		{

			if (lines.get(i) != null)

			{

				page.drawLine((int) lines.get(i).getX1(), (int) lines.get(i)
						.getY1(), (int) lines.get(i).getX2(), (int) lines
						.get(i).getY2());

			}

		}
	}

	private class LineListener implements MouseListener, MouseMotionListener

	{
		public void mousePressed(MouseEvent event)

		{

			point1 = event.getPoint();

		}

		/* Method not implemented */

		public void mouseDragged(MouseEvent event)

		{

		}

		/* Method not implemented */

		public void mouseClicked(MouseEvent event) {

		}

		public void mouseReleased(MouseEvent event) {

			point2 = event.getPoint();

			Line2D.Double newLine = new Line2D.Double(point1, point2);
			lines.add(newLine);

			repaint();

		}

		/* Method not implemented */

		public void mouseEntered(MouseEvent event) {
		}

		/* Method not implemented */
		public void mouseExited(MouseEvent event) {
		}

		/* Method not implemented */
		public void mouseMoved(MouseEvent event) {
		}

	}

}
