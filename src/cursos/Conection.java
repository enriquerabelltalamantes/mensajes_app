package cursos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conection {
	
	public Connection get_connection() {
		Connection conection = null;
			
				try {
					conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app", "root", "");
				} catch (SQLException e) {
					e.printStackTrace();
				}				
			return conection;
	}
}
