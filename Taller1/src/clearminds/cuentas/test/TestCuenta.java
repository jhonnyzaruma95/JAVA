package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		// 1. Creacion de instancias con diferentes constructores
		Cuenta cuenta1 = new Cuenta("03476");
		cuenta1.setSaldo(675);
		Cuenta cuenta2 = new Cuenta("03476", "C" , 98);
		Cuenta cuenta3 = new Cuenta("03476");
		cuenta3.setTipo("C");
		
	
	   // 2. Visualizacion inicial
	   System.out.println("-------Valores Iniciales--------");
	   cuenta1.imprimir();
	   cuenta2.imprimir();
	   cuenta3.imprimir();
	
     
	  Cuenta cuenta4 = new Cuenta("22046789");
	  cuenta4.setSaldo(550.50);
	  
	  Cuenta cuenta5 = new Cuenta("22567809");
	  cuenta5.setTipo("G");
	  cuenta5.setSaldo(875.80);
	  
	  Cuenta cuenta6 = new Cuenta("22789909");
	  cuenta6.setTipo("Z");
	  cuenta6.setSaldo(999.99);
	  
	  cuenta4.imprimirConMiEstilo();
	  cuenta5.imprimirConMiEstilo();
	  cuenta6.imprimirConMiEstilo();
	  
	  
	}
}
	
	
