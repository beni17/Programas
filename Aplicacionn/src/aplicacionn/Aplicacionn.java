
package aplicacionn;

public class Aplicacionn {


    public static void main(String[] args) {
        // TODO code application logic here
Figura objfigura[]= new Figura[5];
		
		objfigura[0]= new Circulo(9);
		objfigura[1]= new Rectangulo(7,4.4);
		objfigura[2]= new Triangulo(8,10);
		objfigura[3]= new Cuadrado(65);
		objfigura[4]= new Cubo(6);
		
		for(Figura figura:objfigura) {
			System.out.println(figura.perimetro());
			System.out.println(figura.area());
			System.out.println(" ");


	}

	}
        }
    
    
