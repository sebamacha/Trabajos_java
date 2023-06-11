package conexion;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
	
	
	private static String driver="com.mysql.jdbc.Driver";
	private static String usuario="root";
	private static String password="root";
	private static String url="jdbc:mysql://localhost:3306/pet_shop";
	
	static {
		try {
			Class.forName(driver);
			System.out.println("conexion con mysql" );
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("error en el driver" );
		}
		
	}
	
				Connection con=null;
		public Connection getConnection() {
	
			
			
			try {
			
				 con=DriverManager.getConnection(url, usuario, password);
				 System.out.println("conectado a mysql" );
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("error de conexion");
			
			}
			return con;
			
			
		}
		
		
		
		public Connection close() {
		

			try {
			
				 con.close();
				 System.out.println("se cerro la conexion exitosamente" );
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("error de conexion");
			
			}
			return con;
		}
		
		
		
		
	
		
		
	

		
		
		
		
		
		
		
		
		
		
}