package com.netasystems.calculadora.main;

import com.netasystems.calculadora.business.Calculadora;

public class Main {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		//1st step
		String primerArg = args[0];
		String segundoArg = args[1];
		String tercerArg = args[2];
		Double op1 = 0.0;
		Double op2 = 0.0;
		//Convertirlos a numeros
		try {
			op1 = Double.parseDouble(primerArg);
			op2 = Double.parseDouble(segundoArg);
			//asdasd
		}catch(NumberFormatException ne) {
			System.out.println("No se ha podido convertir la entrada de texto en numero.");
			System.out.println("Mensaje de error:" +ne.getMessage());
			System.exit(100);
			//asdasd
		}finally {
			
		}
		//Declarar variable para almacenar el resultado
		double resultado;
		switch (tercerArg) {
		case "+":
			resultado = calc.suma(op1, op2);
			break;
		case "-":
			resultado = calc.resta(op1, op2);
			break;
		case "*":
			resultado = calc.multiplica(op1, op2);
			break;
		case "/":
			resultado = calc.divide(op1, op2);
			break;
		default:
			resultado = -1;
			break;
		}
		System.out.println("El resultado de la operación es: "+resultado);
		
		
	}
	
}
