package com.krakedev;

public class TestPlato {

	public static void main(String[] args) {
        Plato platoA = new Plato("Humitas","Entrada",1.00, true);
		
	    System.out.println("=====Plato A : Creado=====");
		
		System.out.println("Nombre: "+ platoA.getNombre());
		System.out.println("Tipo: " + platoA.getTipo());
		System.out.println("Precio: "+ platoA.getPrecio());
		System.out.println("Disponible: "+ platoA.getDisponible());
		
		
		System.out.println("========Plato A : Valores modificados========");
		platoA.setNombre("Tamales");
		platoA.setTipo("Principal");
		platoA.setPrecio(2.00);
		platoA.setDisponible(false);
		
		System.out.println("Nombre: "+ platoA.getNombre());
		System.out.println("Tipo: " + platoA.getTipo());
		System.out.println("Precio: "+ platoA.getPrecio());
		System.out.println("Disponible: "+ platoA.getDisponible());
		
		
        Plato platoB = new Plato("Seco de pollo","Plato fuerte", 2.50,true);
		
	    System.out.println("=====Plato B : Creado=====");
		
		System.out.println("Nombre: "+ platoB.getNombre());
		System.out.println("Tipo: " + platoB.getTipo());
		System.out.println("Precio: "+ platoB.getPrecio());
		System.out.println("Disponible: "+ platoB.getDisponible());
		
		
		System.out.println("========Plato B : Valores modificados========");
		platoB.setNombre("Seco de carne");
		platoB.setTipo("Plato listo");
		platoB.setPrecio(3.50);
		platoB.setDisponible(false);
		
		System.out.println("Nombre: "+ platoB.getNombre());
		System.out.println("Tipo: " + platoB.getTipo());
		System.out.println("Precio: "+ platoB.getPrecio());
		System.out.println("Disponible: "+ platoB.getDisponible());
		
		
        Plato platoC = new Plato("Dulze de higo","Postre", 0.00, false);
		
	    System.out.println("=====Plato C : Creado=====");
		
		System.out.println("Nombre: "+ platoC.getNombre());
		System.out.println("Tipo: " + platoC.getTipo());
		System.out.println("Precio: "+ platoC.getPrecio());
		System.out.println("Disponible: "+ platoC.getDisponible());
		
		
		System.out.println("========Plato C : Valores modificados========");
		platoC.setNombre("Dulze de leche");
		platoC.setTipo("postre");
		platoC.setPrecio(0.50);
		platoC.setDisponible(true);
		
		System.out.println("Nombre: "+ platoC.getNombre());
		System.out.println("Tipo: " + platoC.getTipo());
		System.out.println("Precio: "+ platoC.getPrecio());
		System.out.println("Disponible: "+ platoC.getDisponible());
	

	}

}
