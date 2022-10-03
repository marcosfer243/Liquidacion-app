import javax.swing.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Liquidacion {

    //Definimos los atributos de la clase Liquidacion
    private String key;
    private String nombreLiquidacion;
    private static float monto;
    static ArrayList< Liquidacion > listaDeLiquidaciones = new ArrayList();
    private short añoDeAlta;
    private byte mesDeAlta;
    private byte diaDeAlta;

    //Metodo constructor de la clase Liquidacion.
    public Liquidacion(){

        this.key = generarKey();
        this.nombreLiquidacion = "";
        this.monto = 0.0F;
        this.añoDeAlta = 0;
        this.mesDeAlta = 0;
        this.diaDeAlta = 0;

    }


    // Al igual que hicimos en el metodo agregarCliente(), también programamos un metodo agregaliquidacion para instanciar la clase Liquidacion.
    public static void añadirLiquidacion(){

        // Creamos el objeto Liquidacion.
        Liquidacion liquidacion = new Liquidacion();

        // Tomamos los valores ingresados por el usuario con JOptionPane y el metodo showInputDialog.

        String nombre_Liquidacion = JOptionPane.showInputDialog("Ingrese el nombre de la liquidacion: ");

        float montoLiquidacion = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el monto de la liquidacion: "));

        short año_De_Alta = Short.parseShort(JOptionPane.showInputDialog("Ingrese el año de alta de la liquidacion: "));

        byte mes_De_Alta = Byte.parseByte(JOptionPane.showInputDialog("Ingrese el mes de alta de la liquidacion: "));

        byte dia_De_Alta = Byte.parseByte(JOptionPane.showInputDialog("Ingrese el dia de alta de la liquidacion: "));


        // Con los metodos set, establecemos los valores de los atributos luego de que el usuario ingresa los datos.
        liquidacion.setNombreLiquidacion(nombre_Liquidacion);
        liquidacion.setMontoLiquidacion(montoLiquidacion);
        liquidacion.setAñoDeAltaLiquidacion(año_De_Alta);
        liquidacion.setMesDeAltaLiquidacion(mes_De_Alta);
        liquidacion.setDiaDeAltaLiquidacion(dia_De_Alta);

        // Añadimos la nueva liquidacion a la array de lista De Liquidaciones.
        listaDeLiquidaciones.add(liquidacion);

        //Mostramos un mensaje al usuario
        JOptionPane.showMessageDialog(null,"La liquidacion ha sido agregada exitosamente!");


    }

    //===================METODOS==================================================

    //Metodo para generar una key.
    public static String generarKey(){
        Random random = new Random();
        String keyCode = new BigInteger(100,random ).toString(32);
        return keyCode;
    }

    //Mostramos una lista de cliente con sus datos.
    public static void mostrarLiquidaciones(){
        System.out.println("Lista de liquidaciones: ");
        // EN caso de que no se hayan agregado liquidaciones, este condicional mostrara un mensaje al usuario.
        if(listaDeLiquidaciones.size() == 0){
            System.out.println("No hay liquidaciones agregadas actualmente");
        }

        // Con un ciclo for recorremos el arraylist listaDeLiquidaciones y mostramos los datos de cada liquidacion agregada.
        for(int i = 0;i< listaDeLiquidaciones.size();i++){
            System.out.println("================================");
            System.out.println("Liquidacion numero: " + (i + 1) + "\nNombre: " + listaDeLiquidaciones.get(i).getNombreLiquidacion() + "\n" + "Monto: " + listaDeLiquidaciones.get(i).getMonto());
        }

    }


    //DESPLEGAMOS MENU DE OPCIONES EN LIQUIDACION.

    public static void opcionesLiquidacion(){

        //Con la clase escanner recibimos lo que el usuario escribe por teclado en sn.
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir)
        {

            System.out.println("====================================");
            System.out.println("MENU DE OPCIONES DE LIQUIDACIONES");
            System.out.println("");
            System.out.println("1. Crear nueva Liquidacion");
            System.out.println("2. Mostrar Liquidaciones");
            System.out.println("3. Modificar liquidacion"); // pronto sera agregado
            System.out.println("4. Eliminar liquidacion"); // pronto sera agregado
            System.out.println("5. Salir");
            System.out.println("");
            System.out.println("====================================");

            try {

                System.out.println("Escribe una de las opciones: \n");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        Liquidacion.añadirLiquidacion();
                        break;
                    case 2:
                        Liquidacion.mostrarLiquidaciones();
                        break;
                    case 3:
                        //agregar metodo modificar cliente.
                        break;
                    case 4:
                        //agregar metodo eliminar cliente.
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }


    //Metodos settler: Para establecer los valores a traves de metodos y parametros

    public void setNombreLiquidacion(String nameLiquidacion){
        this.nombreLiquidacion = nameLiquidacion;
    }
    public void setMontoLiquidacion(float montoLiquidacion){
        this.monto = montoLiquidacion;
    }
    public void setAñoDeAltaLiquidacion(short yearLiquidacion){
        this.añoDeAlta = yearLiquidacion;
    }
    public void setMesDeAltaLiquidacion(byte monthLiquidacion){
        this.mesDeAlta = monthLiquidacion;
    }

    public void setDiaDeAltaLiquidacion(byte dayLiquidacion){
        this.diaDeAlta = dayLiquidacion;
    }

    //Metodos getter:

    public String getKey(){

        return key;
    }
    public String getNombreLiquidacion(){

        return nombreLiquidacion;
    }
    public static float getMonto(){

        return monto;
    }
    public short getAñoDeAltaLiquidacion(){

        return añoDeAlta;
    }

    public byte getMesDeAltaLiquidacion(){

        return mesDeAlta;
    }

    public byte getDiaDeAltaLiquidacion(){

        return diaDeAlta;
    }



}
