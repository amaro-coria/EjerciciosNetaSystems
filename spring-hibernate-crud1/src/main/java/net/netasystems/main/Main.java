package net.netasystems.main;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.netasystems.persistence.dao.GlobalAreaDAO;
import net.netasystems.persistence.entities.GlobalArea;

public class Main {

	public static void main(String[] args) {
		System.out.println("Iniciando programa de pruebas spring-hibernate crud #1");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		GlobalAreaDAO gdao = ctx.getBean(GlobalAreaDAO.class);
		
		List<GlobalArea> listaAreas = gdao.findAll();
		System.out.println("Lista de areas obtenida");
		if (listaAreas == null || listaAreas.isEmpty()) {
			System.out.println("No hay areas!");
		} else {
			listaAreas.forEach(c -> System.out.println(c));
		}
		
		//Mandando llamar a metodo de insert
		/*
		GlobalArea garea = new GlobalArea();
		garea.setEstatus(new Character('E'));
		garea.setFechaModificacion(new Date(System.currentTimeMillis()));
		garea.setIdArea(new BigDecimal(8));
		garea.setIdUsuario(new BigDecimal(1));
		garea.setNombre("SPRING_H");
		gdao.insert(garea);
		*/
		/*
		GlobalArea area8 = gdao
				.findById(new BigDecimal(8));
		System.out.println(area8);
		*/
	}

}
