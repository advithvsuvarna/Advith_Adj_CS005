/*Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
display the capital of the countries on console whenever the countries are selected on the list.
*/

package Swing;

	import javax.swing.*;
	import javax.swing.event.*;
	import java.util.HashMap;
	import java.util.List;

	public class JList_Swing_capital extends JFrame {
	    private JList<String> list;
	    private HashMap<String, String> capitals;

	    public JList_Swing_capital() {
	        capitals = new HashMap<>();
	        capitals.put("USA", "Washington D.C.");
	        capitals.put("India", "New Delhi");
	        capitals.put("Vietnam", "Hanoi");
	        capitals.put("Canada", "Ottawa");
	        capitals.put("Denmark", "Copenhagen");
	        capitals.put("France", "Paris");
	        capitals.put("Great Britain", "London");
	        capitals.put("Japan", "Tokyo");
	        capitals.put("Africa", "Addis Ababa");
	        capitals.put("Greenland", "Nuuk");
	        capitals.put("Singapore", "Singapore");

	        DefaultListModel<String> model = new DefaultListModel<>();
	        for (String country : capitals.keySet()) {
	            model.addElement(country);
	        }

	        list = new JList<>(model);
	        list.addListSelectionListener(new ListSelectionListener() {
	            public void valueChanged(ListSelectionEvent e) {
	                if (!e.getValueIsAdjusting()) {
	                    List<String> selected = list.getSelectedValuesList();
	                    for (String country : selected) {
	                        System.out.println("Capital of " + country + " is: " + capitals.get(country));
	                    }
	                }
	            }
	        });

	        add(new JScrollPane(list));
	        setTitle("Country and Capitals");
	        setSize(250, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);
	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        new JList_Swing_capital();
	    }
	}

