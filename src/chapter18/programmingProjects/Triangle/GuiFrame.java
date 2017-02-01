package chapter18.programmingProjects.Triangle;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GuiFrame extends JFrame{
	
	private final int FRAME_HEIGHT = 800;
	private final int FRAME_WIDTH = 800;
	private final int PADDING = 50;
	
	private final String TITLE = "Sierpinski Gasket";
	
	private Triangle triangle;
	private JFrame quitFrame;
	
	public GuiFrame() {
		
		this.setSize(FRAME_HEIGHT, FRAME_WIDTH);
		// big triangle points
		
		// X point is the upper corner in the middle of the frame
		Point x = new Point((this.getWidth() / 2) , 0 + this.PADDING);
		
		// Y point is the lower left corner of the triangle
		Point y = new Point(0 + PADDING, this.getHeight() - this.PADDING);
		
		// Z point is the lower right corner of the triangle
		Point z = new Point(this.getWidth() - this.PADDING, this.getHeight() - this.PADDING);
		
		
		this.triangle = new Triangle(x, y, z);
		
		this.setTitle(TITLE);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.addWindowListener(new windowListener());
		this.setVisible(true);
		
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		/*
		 * I realized the the naming convention that I 
		 * picked for the members of Triangle class is confusing
		 * 
		 * the members of the Triangle class X, Y, Z are Points
		 * each of these points have an x coordinate and y coordinate.
		 * 
		 * I know its confusing.
		 */
		g.drawLine(this.triangle.getX().x, 
				this.triangle.getX().y, 
				this.triangle.getY().x, 
				this.triangle.getY().y);
		
		g.drawLine(this.triangle.getX().x, 
				this.triangle.getX().y, 
				this.triangle.getZ().x, 
				this.triangle.getZ().y);
		
		g.drawLine(this.triangle.getY().x, 
				this.triangle.getY().y, 
				this.triangle.getZ().x, 
				this.triangle.getZ().y);
		
		for (int i = 0; i < 50000; i ++){
			
			Point p = this.triangle.pointToDraw();
			g.drawOval(p.x, p.y, 2, 2);
			//g.drawLine(p.x, p.y, p.x, p.y);
		}
		
	}
	
	private class yesOrNoListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (e.getActionCommand().equals("Yes")){
				System.exit(0);
			}
			else if (e.getActionCommand().equals("No")){
				quitFrame.dispose();
			}
			
		}
		
	}
	
	private class windowListener extends WindowAdapter{


		@Override
		public void windowClosing(WindowEvent e) {
			
			quitFrame = new JFrame();
			
			quitFrame.setSize(200,150);
			
			// middle x coordinate
			int xLocation = GuiFrame.this.getLocation().x 
					+ (GuiFrame.this.getWidth()/ 2);
			
			// middle y coordinate
			int yLocation = GuiFrame.this.getLocation().y
					+ (GuiFrame.this.getHeight() / 2);
			
			quitFrame.setLocation(xLocation, yLocation);
			
			quitFrame.add(new JLabel("Are you sure you want to quit?"));
			
			JPanel buttonsPanel = new JPanel();
			buttonsPanel.setLayout(new FlowLayout());
			
			JButton yes = new JButton("Yes");
			JButton no = new JButton("No");
			
			yes.addActionListener(new yesOrNoListener());
			no.addActionListener(new yesOrNoListener());
			buttonsPanel.add(yes);
			buttonsPanel.add(no);

			quitFrame.add(buttonsPanel, BorderLayout.SOUTH);
			quitFrame.setVisible(true);
			
		}
		
	}
	

}
