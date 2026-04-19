/*Develop a simple swing program for illustrating mouse operations such as mouse down, up double click , single click with help of a button
*/
 
package Swings;
import javax.swing.*;
import java.awt.event.*;

public class SwingExercise2 {
	public static void main(String[] args) {

        JFrame frame = new JFrame("Mouse Operations Demo");
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click Me!");
        button.setBounds(130, 100, 120, 40);
        frame.add(button);

        JLabel label = new JLabel("");
        label.setBounds(120, 160, 200, 30);
        frame.add(label);

        button.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    label.setText("Double Click");
                } else {
                    label.setText("Single Click");
                }
            }

            public void mousePressed(MouseEvent e) {
                label.setText("Mouse Pressed");
            }

            public void mouseReleased(MouseEvent e) {
                label.setText("Mouse Released");
            }
        });

        frame.setVisible(true);
    }
}


