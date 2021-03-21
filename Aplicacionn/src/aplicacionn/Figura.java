
package aplicacionn;

public abstract class Figura {
  public int MedidaF;
	
	public Figura(int MedidaF) {
		this.MedidaF=MedidaF;
	}
	
	public int getMediaF() {
		return MedidaF;
	}
	
	public void setMediaF(int MedidaF) {
		this.MedidaF=MedidaF;
	}
	
	public abstract String perimetro();
	public abstract String area();

	
}


