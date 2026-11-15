package com.krakedev;

public class TestPlato {

	public static void main(String[] args) {
        Plato A = new Plato();
		
	    System.out.println("=====Plato A : Creado=====");
		
		System.out.println("Nombre: "+ A.nombre);
		System.out.println("Tipo: " + A.tipo);
		System.out.println("Precio: "+ A.precio);
		System.out.println("Disponible: "+ A.disponible);
		
		
		System.out.println("========Plato A : Valores asignados========");
		A.nombre = "Humitas";
		A.tipo = "Entrada";
		A.precio = 1.00;
		A.disponible = true;
		
		System.out.println("Nombre: "+ A.nombre);
		System.out.println("Tipo: " + A.tipo);
		System.out.println("Precio: "+ A.precio);
		System.out.println("Disponible: "+ A.disponible);
		
		
        Plato B = new Plato();
		
	    System.out.println("=====Plato B : Creado=====");
		
		System.out.println("Nombre: "+ B.nombre);
		System.out.println("Tipo: " + B.tipo);
		System.out.println("Precio: "+ B.precio);
		System.out.println("Disponible: "+ B.disponible);
		
		
		System.out.println("========Plato B : Valores asignados========");
		B.nombre = "Seco de pollo";
		B.tipo = "Entrada";
		B.precio = 2.50;
		B.disponible = true;
		
		System.out.println("Nombre: "+ B.nombre);
		System.out.println("Tipo: " + B.tipo);
		System.out.println("Precio: "+ B.precio);
		System.out.println("Disponible: "+ B.disponible);
		
		
        Plato C = new Plato();
		
	    System.out.println("=====Plato C : Creado=====");
		
		System.out.println("Nombre: "+ C.nombre);
		System.out.println("Tipo: " + C.tipo);
		System.out.println("Precio: "+ C.precio);
		System.out.println("Disponible: "+ C.disponible);
		
		
		System.out.println("========Plato C : Valores asignados========");
		C.nombre = "Dulze de higo";
		C.tipo = "Postre";
		C.precio = 0.00;
		C.disponible = false;
		
		System.out.println("Nombre: "+ C.nombre);
		System.out.println("Tipo: " + C.tipo);
		System.out.println("Precio: "+ C.precio);
		System.out.println("Disponible: "+ C.disponible);
	
		

	}

}
