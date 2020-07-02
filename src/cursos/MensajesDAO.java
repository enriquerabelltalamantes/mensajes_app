package cursos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MensajesDAO {
	public static void crearMensajesDB(Mensajes mensaje) {
		Conection db_connect = new Conection();
		
		try(Connection conection = db_connect.get_connection()){
			PreparedStatement ps = null;
			try(){
			}catch() {
			}
			}
		}catch(SQLException e){
			System.out.println(e);
		}
		
	}
	public static void leerMensajesDB() {
		
	}
	public static void borrarMensajesDB(int id_mensaje) {
		
	}
	public static void actualizarMensajesDB(Mensajes mensaje) {
	
}
	
}