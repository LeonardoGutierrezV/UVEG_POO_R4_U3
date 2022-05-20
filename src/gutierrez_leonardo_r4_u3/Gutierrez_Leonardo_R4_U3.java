package gutierrez_leonardo_r4_u3;
/**
 * Asesor:Yadira Márquez Barrios
 * @author Leonardo Gutierrez Velez
 * Fecha de elaboración: 15-05-2022
 * Nombre del Modulo: Programación Orientada a Objetos
 * Reto 4. Herencia de clases y paso de parámetros
 */
public class Gutierrez_Leonardo_R4_U3 {

    public static void main(String[] args) {
        System.out.println( "Asesor: Yadira Marquez Barrios\n" +
                            "Alumno: Leonardo Gutierrez Velez\n" +
                            "Fecha de elaboración: 15-05-2022\n" +
                            "Nombre del Modulo: Programacion Orientada a Objetos\n" +
                            "Reto 4. Herencia de clases y paso de parametros\n"+
                            "-----------------------------------------------------------"
                          );
        // Creación cuenta de ahorro sin parametros en el constructor
        System.out.println("\n\nCuenta de Ahorro");
        cuentaAhorro CAhorro;
        CAhorro = new cuentaAhorro();        
        CAhorro.status();
        CAhorro.depositar(100.50);
        //Asignación de numero de cuenta mediante Seter
        if(CAhorro.setNCuenta(10)){
            if(CAhorro.depositar(100.50))
                CAhorro.status();
            else System.out.println("No se ha podido realizar el deposito.");
        }else System.out.println("No se ha podido asignar el número de cuenta");
        if(CAhorro.invertir(100.5)){
            System.out.println("Se ha podido realzado la inversión");
            CAhorro.status();
        }else System.out.println("No se ha podido realziar la inversión");
                
        //Creación de cuenta de debito con un valor en el constructor
        System.out.println("\n\nCuenta de Debito");
        cuentaDebito CDebito;
        CDebito = new cuentaDebito( 55 );        
        CDebito.status();        
        //Asignación de monto mendiante procedimiento
        if(CDebito.depositar(370.50))
            CDebito.status();
         else System.out.println("No se ha procesado el deposito.");
        if( CDebito.retiro(5000.0) ){
            System.out.println("Se ha procesado el retiro.");
            CDebito.status();
        }
        else System.out.println("No se ha procesado el retiro.");
        
        if( CDebito.retiro(100.0) ){
            System.out.println("Se ha procesado el retiro.");
            CDebito.status();  
        }else System.out.println("No se ha procesado el retiro.");
      
        //Creación de cuenta de credito con parametros en constructor
        System.out.println("\n\nCuenta de credito");
        cuentaCredito CCredito;
        CCredito = new cuentaCredito(100, 1000.00);
        CCredito.status();
        if(CCredito.depositar(380.0))
            CCredito.status();
        else System.out.println("No se ha procesado el deposito.");
        
    }
    
}
