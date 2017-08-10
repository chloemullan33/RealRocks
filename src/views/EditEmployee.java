package views;

import java.awt.Frame;
import java.util.ArrayList;
import java.awt.*;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Models.Employee;

public class EditEmployee{
	private JTextField txtAddress1 = null, txtAddress2 = null, txtTown = null, txtPostcode = null, txtName = null, txtNatInsurance = null,
			txtBankAccountNo = null, txtSortCode = null, txtStartSalary = null;
	
	public void createAndShow() {
		
		
		
		ArrayList<JTextField> textboxes = new ArrayList<JTextField>();
		textboxes.add(txtAddress2);
		textboxes.add(txtAddress1);
		textboxes.add(txtTown);
		textboxes.add(txtName);
		textboxes.add(txtNatInsurance);
		textboxes.add(txtBankAccountNo);
		textboxes.add(txtSortCode);
		textboxes.add(txtStartSalary);
		
		
		
		Container pane = new Container();
		pane.setLayout(new BoxLayout(pane,BoxLayout.Y_AXIS));
		
        //Create and set up the window.
        JFrame frame = new JFrame("Employees");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        createLabel(pane,"Name");
        createTextField(pane, txtName);
        
        createLabel(pane,"Address Line 1");
        createTextField(pane, txtAddress1);
        
        createLabel(pane,"Address Line 2");
        createTextField(pane, txtAddress1);
        
        createLabel(pane,"Town");
        createTextField(pane, txtTown);
        
        createLabel(pane,"Postcode");
        createTextField(pane, txtPostcode);
        
        createLabel(pane,"Nat Insurance");
        createTextField(pane, txtNatInsurance);
        
        createLabel(pane,"Bank Account No.");
        createTextField(pane, txtBankAccountNo);
        
        createLabel(pane,"Sort Code");
        createTextField(pane, txtSortCode);
        
        createLabel(pane,"Starting Salary");
        
        
        createTextField(pane, txtStartSalary);
        
        frame.getContentPane().add(pane);
 
 
        //Display the window.
        frame.setSize(400,500);//400 width and 500 height  
        frame.setVisible(true);//making the frame visible  
        
        
    }
	
	private void createLabel(Container pane, String text){
		pane.add(new JLabel(text));
	}
	
	private void createTextField(Container pane, JTextField text) {
		text = new JTextField();
	pane.add(text);
	}
	
	public Employee getEmployeeFromInputs() {
		Employee emp = new Employee();
		emp.setAddressLine1(txtAddress1.getText());
		emp.setAddressLine1(txtAddress2.getText());
		emp.setAddressLine1(txtName.getText());
		emp.setAddressLine1(txtTown.getText());
		emp.setAddressLine1(txtPostcode.getText());
		emp.setAddressLine1(txtNatInsurance.getText());
		emp.setAddressLine1(txtBankAccountNo.getText());
		emp.setAddressLine1(txtSortCode.getText());
		emp.setAddressLine1(txtStartSalary.getText());
		return emp;
	}
}
