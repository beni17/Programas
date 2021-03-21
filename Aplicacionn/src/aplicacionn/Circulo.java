package aplicacionn;



public class Circulo extends Figura {


	public Circulo(int MedidaF) {
		super(MedidaF);
		}
	@Override
	public String perimetro() {
		return "Perimetro Circulo:"+ 2*Math.PI*MedidaF ;
	}
	@Override
	public String area() {
		return "Area Circulo: "+Math.PI*Math.pow(MedidaF, 2);
	}
	

}
