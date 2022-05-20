package gutierrez_leonardo_r4_u3;
/**
 * @author Leonardo Gutierrez Velez
 */
public class cuentaAhorro extends cuentaBase {
    public cuentaAhorro(){}
    public cuentaAhorro(Integer NCuenta){
        this.setNCuenta(NCuenta);
    }
    public cuentaAhorro(Integer NCuenta, Double apertura){        
        this.setNCuenta(NCuenta);
        this.setMonto(apertura);
    }
    public boolean invertir(  Double monto  ){
        if(monto==null){
            System.out.println("No se ha indicado el monto a invertir.");
            return false;
        }else{
            this.setMonto(sumaInteres(monto) );
            return true;
        }        
    }
    
    private Double sumaInteres(Double monto){
        Double transaccion;        
        if(this.getMontoActual() == null )
            transaccion = monto * 1.10;
        else transaccion = (monto+this.getMontoActual())* 1.15;
        return transaccion ;
    }
}
