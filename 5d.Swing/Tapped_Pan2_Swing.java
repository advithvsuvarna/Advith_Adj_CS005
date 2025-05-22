/*Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and
display the concerned color whenever the specific tab is selected in the Pan
*/
package Swing;

	import javax.swing.*;
	import java.awt.*;
	public class Tapped_Pan2_Swing{
	    JFrame f;

	    Tapped_Pan2_Swing() {
	        f = new JFrame("Tabbed Color Example");

	        JPanel cyanPanel = new JPanel();
	        JPanel magentaPanel = new JPanel();
	        JPanel yellowPanel = new JPanel();

	        cyanPanel.setBackground(Color.CYAN);
	        magentaPanel.setBackground(Color.MAGENTA);
	        yellowPanel.setBackground(Color.YELLOW);

	        JTabbedPane tp = new JTabbedPane();
	        tp.setBounds(50, 50, 200, 200);

	        tp.add("Cyan", cyanPanel);
	        tp.add("Magenta", magentaPanel);
	        tp.add("Yellow", yellowPanel);

	        f.add(tp);
	        f.setSize(400, 400);
	        f.setLayout(null);
	        f.setVisible(true);
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }

	    public static void main(String[] args) {
	        new Tapped_Pan2_Swing();
	    }
	}

