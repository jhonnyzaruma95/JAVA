package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		
		Cuadrado c1 = new Cuadrado();
		c1.lado = 4;
		
		Cuadrado c2 = new Cuadrado();
		c2.lado = 3;
		
		Cuadrado c3 = new Cuadrado();
		c3.lado = 2;
		
	    double area1 = c1.calcularArea();
		double resultadoPerimetro1 = c1.calcularPerimetro();
		
		double area2 = c2.calcularArea();
		double resultadoPerimetro2 = c2.calcularPerimetro();
		
		double area3 = c3.calcularArea();
		double resultadoPerimetro3 = c3.calcularPerimetro();
		
		System.out.println("Cuadrado 1 = Lado:  " + c1.lado +" , Area: " + area1 + ", Perimetro: " + resultadoPerimetro1);
		System.out.println("Cuadrado 2 = Lado:  " + c2.lado +" , Area: " + area2 + ", Perimetro: " + resultadoPerimetro2);
		System.out.println("Cuadrado 3 = Lado:  " + c3.lado +" , Area: " + area3 + ", Perimetro: " + resultadoPerimetro3);
		
		
	}

}
