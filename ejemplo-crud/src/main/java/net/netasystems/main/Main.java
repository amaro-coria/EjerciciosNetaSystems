package net.netasystems.main;

import java.sql.SQLException;
import java.util.List;

import net.netasystems.domain.CatTipoFabrica;
import net.netasystems.service.CatTipoFabricaService;

public class Main {

	public static void main(String[] args) {
		System.out.println("Iniciando programa de conexion a base de datos!");
		CatTipoFabricaService service = null;
		try {
			 service = new CatTipoFabricaService();
			 List<CatTipoFabrica> lista = service.getAllRecords();
			 for(CatTipoFabrica c : lista) {
				 System.out.println(c);
			 }
		} catch (Exception e) {
			System.out.println("Ha caido en excepcion con mensaje: "+e.getMessage());
		} finally {
			try {
				service.close();
			} catch (SQLException e) {
				System.out.println("No se pueden cerrar los recursos: "+e.getMessage());
			}
		}
		
		
	}
	
}
