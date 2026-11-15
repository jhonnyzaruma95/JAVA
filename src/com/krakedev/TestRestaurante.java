package com.krakedev;

public class TestRestaurante {

	public static void main(String[] args) {
		
		Restaurante rest1 = new Restaurante("Broaster de goku", "Remigio crespo", 9);
		
	    System.out.println("=====Restaurante 1 : Creado=====");
		
		System.out.println("Nombre: "+ rest1.getNombre());
		System.out.println("Direccion: " + rest1.getDireccion());
		System.out.println("Calificacion: "+ rest1.getCalificacion());
		
		System.out.println("========Restaurante 1 : Valores modificados========");
		rest1.setNombre("Secos ricos");
		rest1.setDireccion("Remigio crespo");
		rest1.setCalificacion(6);
		
		System.out.println("Nombre: "+ rest1.getNombre());
		System.out.println("Direccion: " + rest1.getDireccion());
		System.out.println("Calificacion: "+ rest1.getCalificacion());
		
		
        Restaurante rest2 = new Restaurante("Pollos la parada", "ordoñez lasso", 5);
		
	    System.out.println("=====Restaurante 2 : Creado=====");
		
		System.out.println("Nombre: "+ rest2.getNombre());
		System.out.println("Direccion: " + rest2.getDireccion());
		System.out.println("Calificacion: "+ rest2.getCalificacion());
		
		System.out.println("========Restaurante 2 : Valores modificados========");
		rest2.setNombre("Ceviches");
		rest2.setDireccion("Maria auxiliadora");
		rest2.setCalificacion(2);
		
		System.out.println("Nombre: "+ rest2.getNombre());
		System.out.println("Direccion: " + rest2.getDireccion());
		System.out.println("Calificacion: "+ rest2.getCalificacion());
	   

	}

}
