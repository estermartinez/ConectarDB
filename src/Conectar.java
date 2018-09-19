import java.sql.Connection;
import java.sql.DriverManager;

public class Conectar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/login", "root", "caracoles");
			System.out.println("Conexion exitosa");
		}catch(Exception e){
			System.out.println(e);
			
		}
	}

}
