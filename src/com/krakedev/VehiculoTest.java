package com.krakedev;

public class VehiculoTest {

	public static void main(String[] args) {
		
		Vehiculo v = new Vehiculo("Chevrolet", "Nuevo","2011");
		
		System.out.println("=====Vehiculo 1 : Creado=====");
		
		System.out.println("Marca: "+ v.getMarca());
		System.out.println("Modelo: "+ v.getModelo());
		System.out.println("Año: "+ v.getAnio());
		
		System.out.println("========Vehiculo 1 : Valores modificados========");
		v.setAnio("2015");
		v.setMarca("Mazda");
		v.setModelo("Seminuevo");
		
		System.out.println("Año: "+ v.getAnio());
		System.out.println("Marca: "+ v.getMarca());
		System.out.println("Modelo: "+ v.getModelo());
		
	    System.out.println("=====Vehiculo 2 : Creado=====");
	    
	    Vehiculo v2 = new Vehiculo("Hyunday", "El mas rapido","2026");
		
		System.out.println("Marca: "+ v2.getMarca());
		System.out.println("Modelo: "+ v2.getModelo());
		System.out.println("Año: "+ v2.getAnio());
		
		System.out.println("========Vehiculo 2 : Valores modificados========");
		v2.setAnio("2025");
		v2.setMarca("Nissan");
		v2.setModelo("El mas veloz");
		
		System.out.println("Año: "+ v2.getAnio());
		System.out.println("Marca: "+ v2.getMarca());
		System.out.println("Modelo: "+ v2.getModelo());
		
	}

}
