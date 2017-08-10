package views;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Models.Employee;
import controllers.EmployeeController;


public class ViewEmployee {
	Map<Integer, String> departments;
	
	public void createAndShow() {
		departments = new HashMap<Integer, String>();
		departments.put(1, "IT");
		departments.put(2, "HR");
		departments.put(3, "Sales");
		
		
		Container pane = new Container();
		pane.setLayout(new BoxLayout(pane,BoxLayout.Y_AXIS));
		
		Container paneDepartments = new Container();
		pane.setLayout(new BoxLayout(pane,BoxLayout.X_AXIS));
		
		JComboBox<String> departmentBox = new JComboBox<String>();
		departmentBox.setBounds(50, 50, 150, 50);
		for(int i = 1; i <= departments.size(); i++) {
			departmentBox.addItem(departments.get(i));
		}
		
		departmentBox.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        JComboBox combo = (JComboBox)e.getSource();
                        int index = combo.getSelectedIndex();
                        
                        
                    }
                }            
        );
		
		paneDepartments.add(departmentBox);
		pane.add(paneDepartments);
		
		
		
		
		
		
		
		
		Container paneAdd = new Container();
		paneAdd.setLayout(new BoxLayout(paneAdd,BoxLayout.X_AXIS));
		JLabel lblAdd = new JLabel("Add new employee");
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  javax.swing.SwingUtilities.invokeLater(new Runnable() {
		            public void run() {
		            		EditEmployee editScreen = new EditEmployee();
		                editScreen.createAndShow(departmentBox.getSelectedIndex());
		            }
		        });
		  }
		});
		paneAdd.add(lblAdd);
		paneAdd.add(btnAdd);
		
		pane.add(paneAdd);
		
		JFrame frame = new JFrame("Employees");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ArrayList<Employee> emps = new ArrayList<Employee>();
        try {
			emps = EmployeeController.getEmployeesByDepartment(2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        for(Employee emp : emps) {
        		Container pane2 = new Container();
        		pane2.setLayout(new BoxLayout(pane2,BoxLayout.X_AXIS));
        		createLabel(pane2,"Name: " + emp.name);
        		createEditButton(pane2, "Edit", emp);
        		pane.add(pane2);
        		
        }
        
        frame.getContentPane().add(pane);
        
        
        //Display the window.
        frame.setSize(400,500);//400 width and 500 height  
        frame.setVisible(true);//making the frame visible  
        
	}
	
	private void createLabel(Container pane, String text){
		pane.add(new JLabel(text));
	}
	
	private void createEditButton(Container pane, String text, Employee emp) {
		JButton button = new JButton(text);
		button.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  javax.swing.SwingUtilities.invokeLater(new Runnable() {
		            public void run() {
		            		EditEmployee editScreen = new EditEmployee();
		                editScreen.createAndShow(emp, 3);
		            }
		        });
		  }
		});
		pane.add(button);
	}
	
	

}
