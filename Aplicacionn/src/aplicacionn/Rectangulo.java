package aplicacionn;

public class Rectangulo extends Figura{
	public double base; 
	
	public Rectangulo(int MedidaF, double base) {
		super(MedidaF);
		
		this.base=base;
		
	}
	
	public double getbase() {
		return base;
	}

	public void setbase(double base) {
		this.base=base;
	}
	
	@Override
	public String perimetro() {
		return "Perimetro Rectangulo: "+ base*2 + MedidaF*2;
	}
	@Override
	public String area() {
		return "Area Rectangulo: "+base*MedidaF;
	}
	


}
