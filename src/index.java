import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class index {
    public static void main( String[] args) {

        //Cliente cliente = new Cliente();
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir)
        {

            System.out.println("1. Crear nuevo Cliente");
            System.out.println("2. Mostrar clientes");
            System.out.println("3. Consultar Liquidaciones");
            System.out.println("4. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        Cliente.agregarCliente();
                        break;
                    case 2:
                        Cliente.mostrarCliente();
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        break;
                    case 4:
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



    }

