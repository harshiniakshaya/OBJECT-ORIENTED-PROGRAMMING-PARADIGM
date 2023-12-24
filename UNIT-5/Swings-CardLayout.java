import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class swings_demo extends JFrame implements ActionListener {
    CardLayout crd;
    JButton b1, b2, b3;
    Container cpane;

    swings_demo() {
        cpane = getContentPane();
        crd = new CardLayout();
        cpane.setLayout(crd);

        b1 = new JButton("Apple");
        b2 = new JButton("Orange");
        b3 = new JButton("Mango");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        cpane.add("a", b1);
        cpane.add("b", b2);
        cpane.add("c", b3);
    }

    public void actionPerformed(ActionEvent e) {
        crd.next(cpane);
    }

    public static void main(String[] args) {
    	swings_demo crd1 = new swings_demo();
        crd1.setSize(300, 300);
        crd1.setVisible(true);

    }
}
