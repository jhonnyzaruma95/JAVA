package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		
		Rectangulo r1 = new Rectangulo();
		r1.altura = 5;
		r1.base = 4;
		
		int resultadoArea;
		resultadoArea = r1.calcularArea();
		double resultadoPerimetro1 = r1.calcularPerimetro();
		System.out.println("Resultado Rectangulo 1: " + resultadoArea);
		System.out.println("Perimetro Rectangulo 1: " + resultadoPerimetro1);
		
		
		Rectangulo r2 = new Rectangulo();
		r2.altura = 8;
		r2.base = 2;
		
		int resultadoArea2;
		resultadoArea2 = r2.calcularArea();
		double resultadoPerimetro2 = r2.calcularPerimetro();
		System.out.println("Resultado Rectangulo 2: " + resultadoArea2);
		System.out.println("Perimetro Rectangulo 2: " + resultadoPerimetro2);
		
		
	}
	

}
