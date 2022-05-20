package gutierrez_leonardo_r4_u3;
/**
 * @author Leonardo Gutierrez Velez
 */
public class cuentaBase {
    private Integer NCuenta;
    private Double montoActual;
    
    public cuentaBase(){};
    public cuentaBase(Integer NCuenta){
        this.NCuenta=NCuenta;
    }
    public cuentaBase(Integer NCuenta, Double apertura){
        this.NCuenta=NCuenta;
        this.montoActual=apertura ;
    }
    public Integer getNCuenta(){  return NCuenta;  }
    public Double getMontoActual(){  return montoActual;  }
    
    public boolean setNCuenta(  Integer NCuenta  ){
        if(NCuenta >0){
            this.NCuenta=NCuenta;
            return true;
        }else return false;
    }
    
    public boolean setMonto(  Double monto  ){
        if(monto!=null){
            this.montoActual= monto ;
            return true;
        }else return false;
    }
    
    public boolean depositar(  Double monto  ){
        
        if( NCuenta!=null ){
            if(monto>0){
                if(this.getMontoActual()!=null ){
                    this.setMonto(this.montoActual+monto);
                } else {
                    this.setMonto(monto);
                }
                System.out.println("Se ha procesado el deposito.\n");
                return true;                    
            }else {
                System.out.println("No se ha procesado el deposito.\n"); 
                return false;
                }            
        }else { 
            System.out.println("No hay numero de cuenta resgistado para procesar el deposito.\n");
            return false;
        }
    }
        
    public void status(){
        System.out.println("NCuenta: "+NCuenta+"\n"+ 
                           "Monto Actual: "+montoActual+"\n"
                          );
    }
}
