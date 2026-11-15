package com.krakedev;

public class TestRestaurante {

	public static void main(String[] args) {
		
		Restaurante rest1 = new Restaurante();
		
	    System.out.println("=====Restaurante 1 : Creado=====");
		
		System.out.println("Nombre: "+ rest1.getNombre());
		System.out.println("Direccion: " + rest1.getDireccion());
		System.out.println("Calificacion: "+ rest1.getCalificacion());
		
		System.out.println("========Restaurante 1 : Valores asignados========");
		rest1.setNombre("Broaster de goku");
		rest1.setDireccion("Remigio crespo");
		rest1.setCalificacion(9);
		
		System.out.println("Nombre: "+ rest1.getNombre());
		System.out.println("Direccion: " + rest1.getDireccion());
		System.out.println("Calificacion: "+ rest1.getCalificacion());
		
		
        Restaurante rest2 = new Restaurante();
		
	    System.out.println("=====Restaurante 2 : Creado=====");
		
		System.out.println("Nombre: "+ rest2.getNombre());
		System.out.println("Direccion: " + rest2.getDireccion());
		System.out.println("Calificacion: "+ rest2.getCalificacion());
		
		System.out.println("========Restaurante 2 : Valores asignados========");
		rest2.setNombre("Pollos la parada");
		rest2.setDireccion("ordoñez lasso");
		rest2.setCalificacion(5);
		
		System.out.println("Nombre: "+ rest2.getNombre());
		System.out.println("Direccion: " + rest2.getDireccion());
		System.out.println("Calificacion: "+ rest2.getCalificacion());
	   

	}

}
