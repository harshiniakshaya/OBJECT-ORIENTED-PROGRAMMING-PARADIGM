/*
In a BorderLayout, you can technically add only one component (including buttons) to each of its five regions: North, South, East, West, and Center. However, if you want to have multiple components in a single region, you would need to place those components inside another container (like a JPanel) and then add that container to the desired region.
*/
import javax.swing.*;
import java.awt.*;
public class swings_demo{
	public static void main(String[] args) {
		JFrame f = new JFrame("Swings demo");
		f.setSize(500,500);
		JPanel p = new JPanel();
		f.add(p);
		p.setLayout(new BorderLayout());
		JButton b1 = new JButton("North");
		JButton b2 = new JButton("South");
		JButton b3 = new JButton("East");
		JButton b4 = new JButton("West");
		JButton b5 = new JButton("Center");		
		p.add(b1,BorderLayout.NORTH);;
		p.add(b2,BorderLayout.SOUTH);
		p.add(b3,BorderLayout.EAST);
		p.add(b4,BorderLayout.WEST);
		p.add(b5,BorderLayout.CENTER);
		f.setVisible(true);
	}
}
