package ventanapruebatiempo2;
import java.text.DecimalFormat;
public class Tiempo {
    private int hora;     // 0 - 23
    private int minuto;   // 0 - 59
    private int segundo;   // 0 - 59
    // un objeto de formato para compartir en toString y
    // StringUniversal
    private static DecimalFormat dosDigitos = new DecimalFormat ( "00" );
    // el constructor de Tiempo inicializa cada variable de
    // instancia en cero;
    // se asegura que cada objeto Tiempo inicie en un estado
    // consistente
    public Tiempo ( ) {
        this ( 0, 0, 0 );     // invocar al constructor de Tiempo
                                    // con tres argumentos
    }
    public Tiempo ( int h ) {
        this ( h, 0, 0 );
    }
    public Tiempo ( int h, int m ) {
        this ( h, m, 0 );
    }
    public Tiempo ( int h, int m, int s ) {
        establecerTiempo ( h, m, s );
    }
    public Tiempo ( Tiempo tiempo ) {
        this ( tiempo.obtenerHora ( ), tiempo.obtenerMinuto ( ), 
                 tiempo.obtenerSegundo ( ) );
    }
    // Métodos Establecer
    public void establecerTiempo ( int h, int m, int s ) {
        establecerHora ( h );         // establecer la hora
        establecerMinuto ( m );    // establecer el minuto
        establecerSegundo ( s );  // establecer el segundo
    }
    public void establecerHora ( int h ) { 
        hora = ( ( h >= 0 && h < 24 ) ? h : 0 );
    }
    public void establecerMinuto ( int m ) {
        minuto = ( ( m >= 0 && m < 60 ) ? m : 0 );
    }
    public void establecerSegundo ( int s ) {
        segundo = ( ( s >= 0 && s < 60 ) ? s : 0 );
    }
    // Métodos Obtener
    
    public int obtenerHora ( ) {     // obtener valor de hora
        return hora;
    }

     public int obtenerMinuto ( ) {     // obtener valor de minuto
        return minuto;
    }

    public int obtenerSegundo ( ) {    // obtener valor de segundo
        return segundo;
    }
    // convertir a String en formato de hora universal
    public String aStringUniversal ( ) {
        return dosDigitos.format ( obtenerHora ( ) ) + ":"
                + dosDigitos.format ( obtenerMinuto ( ) ) + ":"
                + dosDigitos.format ( obtenerSegundo ( ) );
    }
    // convertir a String en formato de hora estándar
    public String toString ( ) {
        return (( obtenerHora ( ) == 12 || obtenerHora ( ) == 0) ? 
                       12 : obtenerHora ( ) % 12 ) + ":" +
                       dosDigitos.format ( obtenerMinuto ( ) )
                       + ":" + dosDigitos.format ( obtenerSegundo ( ) )
                       + ( obtenerHora ( ) < 12 ? " AM" : " PM" );
    }
}     




    