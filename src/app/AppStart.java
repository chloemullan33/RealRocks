package app;
import java.sql.SQLException;

import controllers.EmployeeController;
import views.EditEmployee;
import views.ViewEmployee;

public class AppStart {

	public static void main(String[] args) {
		
		try {
			EmployeeController.getEmployees();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ViewEmployee viewScreen = new ViewEmployee();
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            		
                viewScreen.createAndShow();
            }
        });
    }

}
