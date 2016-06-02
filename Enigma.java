
/**
 * Write a description of class Enigma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enigma
{

    /**
     * Constructor for objects of class Enigma
     */
    public Enigma()
    {}

    /**
     * Encripa un valor dado
     * 
     * @param  num valor a encriptar
     * @param  mecanismo01 mecanismo de encripacion
     * @return     el numero encriptado 
     */
    public int encripta(Mecanismo mecanismo01, int num)
    {
        int result = -1;
        if(num > 10)
            result = mecanismo01.cifrado(num);
        return result;
    }

    /**
     * Desencripa un valor dado
     * 
     * @param  num valor a desencriptar
     * @param  mecanismo01 mecanismo de encripacion
     * @return     el numero desencriptado 
     */
    public int desencripta(Mecanismo mecanismo01, int num)
    {
        int result = mecanismo01.descifrado(num);
        if(result <= 10)
            result = -1;
        return result;
    }
}
