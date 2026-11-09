package com.krakedev;

public class Calculadora {
	
	public int sumar(int a, int b) {
		
		int resultado;
		resultado = a + b;
		return resultado;
	}
	
	public int restar(int a, int b) {
		
		int resultado;
		resultado = a - b;
		return resultado;
	}
		
	public double multiplicar(double valor1, double valor2) {
			
		double resultado;
		resultado = valor1 * valor2;
		return resultado;
	}
	public double dividir(double valor1, double valor2) {
			
		double resultado;
		resultado = valor1 / valor2 ;
		return resultado;
		
	}
		
	public double promediar(double valor1, double valor2, double valor3) {
			
		double resultado;
		double total;
		resultado = valor1 + valor2  + valor3;
		total = resultado / 3;
		return total;
		
	}

}
