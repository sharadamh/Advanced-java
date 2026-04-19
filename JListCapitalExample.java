/*
6c. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
display the capital of the countries on console whenever the countries are selected on the list.
*/
package PRG6;

import java.util.HashMap;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JListCapitalExample extends JFrame {
	 private JList<String> countryList;
	    private HashMap<String, String> capitalMap;

	    public JListCapitalExample() {

	        // Create capital map
	        capitalMap = new HashMap<>();
	        capitalMap.put("USA", "Washington D.C.");
	        capitalMap.put("India", "New Delhi");
	        capitalMap.put("Vietnam", "Hanoi");
	        capitalMap.put("Canada", "Ottawa");
	        capitalMap.put("Denmark", "Copenhagen");
	        capitalMap.put("France", "Paris");
	        capitalMap.put("Great Britain", "London");
	        capitalMap.put("Japan", "Tokyo");
	        capitalMap.put("Africa", "Addis Ababa");
	        capitalMap.put("Greenland", "Nuuk");
	        capitalMap.put("Singapore", "Singapore");

	        // List model
	        DefaultListModel<String> listModel = new DefaultListModel<>();
	        for (String country : capitalMap.keySet()) {
	            listModel.addElement(country);
	        }

	        // JList
	        countryList = new JList<>(listModel);

	        countryList.addListSelectionListener(new ListSelectionListener() {
	            public void valueChanged(ListSelectionEvent e) {
	                if (!e.getValueIsAdjusting()) {
	                    List<String> selected = countryList.getSelectedValuesList();
	                    for (String country : selected) {
	                        System.out.println("Capital of " + country + " is: " + capitalMap.get(country));
	                    }
	                }
	            }
	        });

	        add(new JScrollPane(countryList));

	        setTitle("Country Capitals");
	        setSize(300, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);
	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        new JListCapitalExample();
	    }
	}


