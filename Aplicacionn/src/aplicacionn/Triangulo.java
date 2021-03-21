
package aplicacionn;

public class Triangulo extends Figura {
public double base;
	public Triangulo(int MedidaF,double base) {
		super(MedidaF);
		this.base=base;

	}
	
	public double base() {
		return base;
	}
	
	public void base(double base) {
		this.base=base;
	}
	
	public double altura() {
		
		return Math.sqrt(Math.pow(MedidaF, 2)+Math.pow(base/2, 2));
	}
	

	
	@Override
	public String area() {
		return "Area Triangulo: "+ (base*altura())/2;
	}
	

	@Override
	public String perimetro() {
		return "Perimetro Triangulo: "+ MedidaF +base+ MedidaF;
	}
	
}


