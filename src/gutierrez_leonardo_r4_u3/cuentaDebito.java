package gutierrez_leonardo_r4_u3;
/**
 * @author Leonardo Gutierrez
 */
public class cuentaDebito extends cuentaBase{
    public cuentaDebito(){};
    public cuentaDebito(  Integer NCuenta  ){
        this.setNCuenta(NCuenta);
    }
    public cuentaDebito(  Integer NCuenta, Double apertura  ){        
        this.setNCuenta(NCuenta);
        this.setMonto(apertura);
    }
    
    public boolean retiro (  Double monto  ){
        if(monto <= this.getMontoActual() ){
            this.setMonto( this.getMontoActual()-monto );
            return true;
        }else {
            System.out.println("Fondos insuficientes.");            
            return false;
        }
    }
}
