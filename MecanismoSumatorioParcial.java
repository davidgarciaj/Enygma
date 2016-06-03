
/**
 * Write a description of class MecanismoSumatorioParcial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MecanismoSumatorioParcial extends Mecanismo
{
    
    public MecanismoSumatorioParcial(int enc){
        super(enc);
    }
    
    /**
     * 
     */
    @Override
    public int cifrado(int num){
        int result = 0;
        int sum = num;
        while( sum >= getEncriptador()){
            result += sum;
            sum--;
        }
        return result;
    }

    /**
     * 
     */
    @Override
    public int descifrado(int num){
        int result = 0;
        int divi = num - getEncriptador();
        int sum = 1;
        for(int i = 0; i <= divi; i++)
            sum += i;
        result = (num + sum)/ divi;
        return result;
    }
}
