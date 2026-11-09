package com.krakedev;

public class TestRestaurante {

	public static void main(String[] args) {
		
		Restaurante rest1 = new Restaurante();
		
	    System.out.println("=====Restaurante 1 : Creado=====");
		
		System.out.println("Nombre: "+ rest1.nombre);
		System.out.println("Direccion: " + rest1.direccion);
		System.out.println("Calificacion: "+ rest1.calificaion);
		
		System.out.println("========Restaurante 1 : Valores asignados========");
		rest1.nombre = "Broaster de goku";
		rest1.direccion = "Remigio crespo";
		rest1.calificaion = 9;
		
		System.out.println("Nombre: "+ rest1.nombre);
		System.out.println("Direccion: " + rest1.direccion);
		System.out.println("Calificacion: "+ rest1.calificaion);
		
		
        Restaurante rest2 = new Restaurante();
		
	    System.out.println("=====Restaurante 2 : Creado=====");
		
		System.out.println("Nombre: "+ rest2.nombre);
		System.out.println("Direccion: " + rest2.direccion);
		System.out.println("Calificacion: "+ rest2.calificaion);
		
		System.out.println("========Restaurante 2 : Valores asignados========");
		rest2.nombre = "Pollos la parada";
		rest2.direccion = "ordoñez lasso";
		rest2.calificaion = 5;
		
		System.out.println("Nombre: "+ rest2.nombre);
		System.out.println("Direccion: " + rest2.direccion);
		System.out.println("Calificacion: "+ rest2.calificaion);
	   

	}

}
