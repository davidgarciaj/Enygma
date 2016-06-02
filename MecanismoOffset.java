
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
        int i = 0;
        int aux;
        while(num > 10){
            aux = (num % 10) + getEncriptador();
            if(aux >= 10)
                aux = aux % 10;
            result += aux * (Math.pow(10, i));
            num = num / 10;
            i++;
        }
        result += num * (Math.pow(10, i));
        return result;
    }

    /**
     * 
     */
    @Override
    public int descifrado(int num){
        int result = 0;
        int i = 0;
        int aux;
        while(num > 10){
            aux = (num % 10) - getEncriptador() + 10;
            if(aux >= 10)
                aux = aux % 10;
            result += aux * (Math.pow(10, i));
            num = num / 10;
            i++;
        }
        result += num * (Math.pow(10, i));
        return result;
    }
}

