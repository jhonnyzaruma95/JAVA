package com.krakedev;

public class TestPlato {

	public static void main(String[] args) {
        Plato platoA = new Plato();
		
	    System.out.println("=====Plato A : Creado=====");
		
		System.out.println("Nombre: "+ platoA.getNombre());
		System.out.println("Tipo: " + platoA.getTipo());
		System.out.println("Precio: "+ platoA.getPrecio());
		System.out.println("Disponible: "+ platoA.getDisponible());
		
		
		System.out.println("========Plato A : Valores asignados========");
		platoA.setNombre("Humitas");
		platoA.setTipo("Entrada");
		platoA.setPrecio(1.00);
		platoA.setDisponible(true);
		
		System.out.println("Nombre: "+ platoA.getNombre());
		System.out.println("Tipo: " + platoA.getTipo());
		System.out.println("Precio: "+ platoA.getPrecio());
		System.out.println("Disponible: "+ platoA.getDisponible());
		
		
        Plato platoB = new Plato();
		
	    System.out.println("=====Plato B : Creado=====");
		
		System.out.println("Nombre: "+ platoB.getNombre());
		System.out.println("Tipo: " + platoB.getTipo());
		System.out.println("Precio: "+ platoB.getPrecio());
		System.out.println("Disponible: "+ platoB.getDisponible());
		
		
		System.out.println("========Plato B : Valores asignados========");
		platoB.setNombre("Seco de pollo");
		platoB.setTipo("Entrada");
		platoB.setPrecio(2.50);
		platoB.setDisponible(true);
		
		System.out.println("Nombre: "+ platoB.getNombre());
		System.out.println("Tipo: " + platoB.getTipo());
		System.out.println("Precio: "+ platoB.getPrecio());
		System.out.println("Disponible: "+ platoB.getDisponible());
		
		
        Plato platoC = new Plato();
		
	    System.out.println("=====Plato C : Creado=====");
		
		System.out.println("Nombre: "+ platoC.getNombre());
		System.out.println("Tipo: " + platoC.getTipo());
		System.out.println("Precio: "+ platoC.getPrecio());
		System.out.println("Disponible: "+ platoC.getDisponible());
		
		
		System.out.println("========Plato C : Valores asignados========");
		platoC.setNombre("Dulze de higo");
		platoC.setTipo("Postre");
		platoC.setPrecio(0.00);
		platoC.setDisponible(false);
		
		System.out.println("Nombre: "+ platoC.getNombre());
		System.out.println("Tipo: " + platoC.getTipo());
		System.out.println("Precio: "+ platoC.getPrecio());
		System.out.println("Disponible: "+ platoC.getDisponible());
	

	}

}
