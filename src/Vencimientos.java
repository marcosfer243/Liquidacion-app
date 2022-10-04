import java.math.BigInteger;
import java.util.Random;

public class Vencimientos {
private String key;
private int fechaVencimiento;


//METODO CONSTRUCTOR
public Vencimientos(){
    this.key = generarKey();
    this.fechaVencimiento = fechaVencimiento;
}


public static void opcionesVencimientos(){
    System.out.println("Pronto sera agregada esta caracteristica");
}


    //Metodo para generar una key.
    public static String generarKey(){
        Random random = new Random();
        String keyCode = new BigInteger(100,random ).toString(32);
        return keyCode;
    }



}
