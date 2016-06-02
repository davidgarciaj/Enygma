
/**
 * Abstract class Mecanismo - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Mecanismo
{
    private int enc;
    
    public Mecanismo(int enc){
        this.enc = enc;
    }
    
    public abstract int cifrado(int num);

    public abstract int descifrado(int num);
    
    /**
     * 
     */
    public int getEncriptador(){
        return enc;
    }
}
