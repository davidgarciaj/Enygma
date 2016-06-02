
/**
 * Write a description of class MecanimsoMultiplicacionPrimo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MecanismoMultiplicacionPrimo extends Mecanismo
{
    public MecanismoMultiplicacionPrimo(int enc){
        super(enc);
    }
    
    /**
     * 
     */
    @Override
    public int cifrado(int num){
        int encriptado = num * getEncriptador();            
        return encriptado;
    }

    /**
     * 
     */
    @Override
    public  int descifrado(int num){
        int encriptado = num / getEncriptador();
        return encriptado;    
    }
}
