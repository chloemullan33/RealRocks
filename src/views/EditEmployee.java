package views;

import java.awt.Frame;
import java.awt.*;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EditEmployee{
	
	public void createAndShow() {
		
		JTextField txtAddress1 = null, txtAddress2 = null, txtTown, txtPostcode = null, txtName = null, txtNatInsurance = null,
		txtBankAccountNo = null, txtSortCode = null, txtStartSalary = null;
		
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
        createTextField(pane, txtAddress2);
        
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
}
