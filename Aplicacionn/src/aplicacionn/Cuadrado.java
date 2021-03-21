
package aplicacionn;

public class Cuadrado extends Figura {
	public Cuadrado(int MedidaF) {
		super(MedidaF);
		
	}	
	
	@Override
	public String area() {
		return "Perimetro: Cuadrado"+ Math.pow(MedidaF, 2);
	}
	@Override
	public String perimetro() {
		return "Pereimetro: Cuadrado"+MedidaF*4;
	}
	

	

}

