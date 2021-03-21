
package aplicacionn;


public class Cubo extends Cuadrado {
	public Cubo(int MedidaF) {
		super(MedidaF);
		
	}
	

	
	public String volumen() {
		return "Volumen del cubo: "+MedidaF*MedidaF*MedidaF;
	}

	}
