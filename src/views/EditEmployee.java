package views;

import java.awt.Container;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import Models.Employee;
import controllers.EmployeeController;
import javafx.event.ActionEvent;

public class EditEmployee{
	private JTextField txtAddress1 = new JTextField();
	private JTextField txtAddress2 = new JTextField();;
	private JTextField txtTown = new JTextField();;
	private JTextField txtPostcode = new JTextField();;
	private JTextField txtName = new JTextField();;
	private JTextField txtNatInsurance = new JTextField();;
	private JTextField txtBankAccountNo = new JTextField();;
	private JTextField txtSortCode = new JTextField();;
	private JTextField txtStartSalary = new JTextField();;
	
	public void createAndShow(int dept_id) {
		
		ArrayList<JTextField> textboxes = new ArrayList<JTextField>();
		
		textboxes.add(txtAddress1);
		textboxes.add(txtAddress2);
		textboxes.add(txtTown);
		textboxes.add(txtName);
		textboxes.add(txtNatInsurance);
		textboxes.add(txtBankAccountNo);
		textboxes.add(txtSortCode);
		textboxes.add(txtStartSalary);
		JButton submitButton = new JButton("Submit");
		
		Container pane = new Container();
		pane.setLayout(new BoxLayout(pane,BoxLayout.Y_AXIS));
		
        //Create and set up the window.
        JFrame frame = new JFrame("Edit Employee");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        createLabel(pane,"Name");
        createTextField(pane, txtName);
        
        createLabel(pane,"Address Line 1");
        createTextField(pane, txtAddress1);
        
        createLabel(pane,"Address Line 2");
        createTextField(pane, txtAddress2);
        
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
        
        
        
        pane.add(submitButton);
        
        submitButton.addActionListener(new ActionListener() {
    		@Override
			public void actionPerformed(java.awt.event.ActionEvent e) {

    				System.out.println("submit clicked");
    				try {
    					Employee emp = getEmployeeFromInputs();
    					emp.setDeptId(dept_id);
						EmployeeController.insertData(emp);
						ViewEmployee view = new ViewEmployee();
						view.createAndShow();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}});
        
        frame.getContentPane().add(pane);
 
 
        //Display the window.
        frame.setSize(400,500);//400 width and 500 height  
        frame.setVisible(true);//making the frame visible  
        
        
    }
	
	public void createAndShow(Employee emp, int deptId) {
		this.createAndShow(deptId);
		this.setEmployeeFields(emp);
	}
	
	private void createLabel(Container pane, String text){
		pane.add(new JLabel(text));
	}
	
	private void createTextField(Container pane, JTextField text) {

	pane.add(text);
	}

	
	public Employee getEmployeeFromInputs() {
		Employee emp = new Employee();
		
		emp.setAddressLine1(txtAddress1.getText().toString());
		emp.setAddressLine2(txtAddress2.getText().toString());
		emp.setName(txtName.getText().toString());
		emp.setTown(txtTown.getText().toString());
		emp.setPostcode(txtPostcode.getText().toString());
		emp.setNatInsurance(txtNatInsurance.getText().toString());
		emp.setBankAccountNo(txtBankAccountNo.getText().toString());
		emp.setSortCode(txtSortCode.getText().toString());
		emp.setStartSalary(Double.parseDouble(txtStartSalary.getText()));
		return emp;
	}
	
	public void setEmployeeFields(Employee emp) {
		txtAddress1.setText(emp.addressLine1);
		txtAddress2.setText(emp.addressLine2);
		txtBankAccountNo.setText(emp.bankAccountNo);
		txtPostcode.setText(emp.postcode);
		txtTown.setText(emp.town);
		txtName.setText(emp.name);
		txtStartSalary.setText(Double.toString(emp.getStartSalary()));
	}
	
	
}
