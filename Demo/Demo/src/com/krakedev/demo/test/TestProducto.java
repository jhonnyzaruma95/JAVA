package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		
		Producto p = new Producto(101,"Laptop");
		p.setDescripcion("Computadora de alto rendimiento");
		p.setPeso(2.5);
		
		
		System.out.println("Codigo: " + p.getCodigo());
		System.out.println("Nombre: " + p.getNombre());
		System.out.println("Descripcion: " + p.getDescripcion());
		System.out.println("Peso: " + p.getPeso());
		
		System.out.println("----------------------------------");
		
		Producto p2 = new Producto(99,"Peluche");
		p2.setDescripcion("Peluche grande ideal para niños");
		p2.setPeso(1.5);
		
		
		System.out.println("Codigo: " + p2.getCodigo());
		System.out.println("Nombre: " + p2.getNombre());
		System.out.println("Descripcion: " + p2.getDescripcion());
		System.out.println("Peso: " + p2.getPeso());
		
		
	}

}
