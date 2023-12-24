// default layout - flow layout (hence no need to mention)
import javax.swing.*;
import java.awt.*;
public class swings_demo{
	public static void main(String[] args) {
		JFrame f = new JFrame("Swings demo");
		f.setSize(500,500);
		JPanel p = new JPanel();
		f.add(p);
		JButton b1 = new JButton("button 1");
		JButton b2 = new JButton("button 2");
		JButton b3 = new JButton("button 3");
		JButton b4 = new JButton("button 4");
		JButton b5 = new JButton("button 5");
		JButton b6 = new JButton("button 6");
		p.add(b1);p.add(b2);p.add(b3);
		p.add(b4);p.add(b5);p.add(b6);
		f.setVisible(true);
	}
}
