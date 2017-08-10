package data;

import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class DbContext {
	
	private Connection connect = null;
    private PreparedStatement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    
    

}
