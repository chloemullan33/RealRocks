package app;
import java.sql.SQLException;

import controllers.EmployeeController;
import views.EditEmployee;

public class AppStart {

	public static void main(String[] args) {
		
		try {
			EmployeeController.getEmployees();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		EditEmployee editScreen = new EditEmployee();
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            		
                editScreen.createAndShow();
            }
        });
    }

}
