package main;
import com.mysql.jdbc.Connection;

import conexion.Conexion;
import igu.Principal;

public class App {

	public static void main(String[] args) {
		Conexion db=new Conexion();
		Connection cin =(Connection) db.getConnection();
		Principal principal = new Principal();
		principal.setVisible(true);
		principal.setLocationRelativeTo(null);

	}

}
