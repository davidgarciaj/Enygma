
/**
 * Write a description of class MecanismoOffset here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MecanismoOffset extends Mecanismo
{
    public MecanismoOffset(int enc){
        super(enc);
    }
    
    /**
     * 
     */
    @Override
    public int cifrado(int num){
        int result = 0;
        while(num > 10){
            if(result != 0){
                
                result+= ((num % 10) + getEncriptador()) * 10;
            }
            else{
                result = (num % 10) + getEncriptador();
            }
            num = num / 10;
        }
        return result;
    }

    /**
     * 
     */
    @Override
    public int descifrado(int num){
        return -1;
    }
}

