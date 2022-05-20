package gutierrez_leonardo_r4_u3;
/**
 * @author Leonardo Gutierrez Velez
 */
public class cuentaCredito extends cuentaBase{
    //private Float montoActual;
    public cuentaCredito(){};
    public cuentaCredito(Integer NCuenta){
        this.setNCuenta(NCuenta);
    }
    public cuentaCredito(Integer NCuenta, Double apertura){        
        this.setNCuenta(NCuenta);
        this.setMonto( this.sumaInteres(apertura)  );
    }
    private Double sumaInteres(Double monto){
        Double transaccion;        
        if(this.getMontoActual() == null )
            transaccion = monto * 1.15;
        else transaccion = (monto+this.getMontoActual())* 1.15;
        return transaccion *-1 ;
    }
}
