package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		
		Calculadora c1 = new Calculadora();
		int r1;
		r1 = c1.sumar(4, 2);
		System.out.println("Resultado de Suma es: " + r1);
		
		int r2; 
		r2 = c1.restar(4, 2);
		System.out.println("Resultado de Resta es: " + r2);
		
		double r3; 
		r3 = c1.multiplicar(10, 5);
		System.out.println("Resultado de Multiplicar es: " + r3);
		
		double r4; 
		r4 = c1.dividir(10, 2);
		System.out.println("Resultado de division es: " + r4);
		
		double r5; 
		r5 = c1.promediar(10, 8, 9);
		System.out.println("Resultado del promedio es: " + r5);
		

		c1.mostrarResultado();

	}

}
