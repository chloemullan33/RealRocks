package app;
import controllers.EmployeeController;
import views.EditEmployee;

public class AppStart {

	public static void main(String[] args) {
		
		EmployeeController.getEmployees();
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
