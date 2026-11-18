package clearminds.cuentas;

public class Cuenta {
	
	private String id;
	private String tipo = "A";
	private double saldo;
	
	//Constructor de ID
	public Cuenta(String id) {
		this.id = id;
		this.tipo = "A";
	}
	
	//Constructor Completo
	public Cuenta(String id, String tipo, double saldo) {
		this.id = id;
		this.tipo = tipo;
		this.saldo = saldo;
	}
	
    //Metodos Getter y Setter
	public String getId() {
		return id;
	}
	

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//Metodos imprimir
	public void imprimir() {
		System.out.println("***************************");
		System.out.println("          CUENTA           ");
		System.out.println("***************************");
		System.out.println("Numero de cuenta: " + this.id);
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Saldo: UDS " + this.saldo);	
		System.out.println("***************************");	
	}
	
	//Metodo imprimir con mi estilo
	public void imprimirConMiEstilo() {
		
		
		System.out.println("<------------------------------------------------------->");
		System.out.println("||||||||****************************************||||||||");
		System.out.println("                     MI CUENTA                         ");
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println("Numero de mi cuenta: " + this.id);
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Saldo de cuenta: UDS " + this.saldo);	
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");	
		System.out.println("<++++---------------BANCO DEL PACIFICO------------++++>");
		System.out.println("||||||||****************************************||||||||");	
		System.out.println("<------------------------------------------------------->");
		
		
	}

}
