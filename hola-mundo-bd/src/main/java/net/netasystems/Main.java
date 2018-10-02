package net.netasystems;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
	
	
	public static void main(String[] args) throws Exception {
		System.out.println("Inicio de programa");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(  
				"jdbc:oracle:thin:@198.23.75.98:1521:neta","EGLOBAL","egl0b4l");  
		System.out.println("Conexion realizada");
		Statement stmt =  con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from cat_tipo_fabrica");
		rs.getMetaData();
		System.out.println("Query realizado");
		while(rs.next()) {
			String miNombreLocal = rs.getString("NOMBRE");
			System.out.println("El nombre obtenido es: "+miNombreLocal);
		}
		rs.close();
		stmt.close();
		con.close();
	}

}
