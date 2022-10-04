import java.math.BigInteger;
import java.util.*;
import javax.swing.*;
import javax.swing.JOptionPane;


public class Cliente {

    //Definimos los atributos de la clase cliente
    private String key;
    private String codigoCliente;
    private String razonSocial;
    private static String nombreFantasia;
    String[] liquidacionesContratadas = {"IIBB", "IVA", "SUELDO", "PRODUCTOS"};
    static ArrayList< Cliente > listaDeClientes = new ArrayList();
    private String email;
    private int cuitPrefijo;
    private int cuitMedio;
    private int cuitSufijo;


    //Method constructor
    public Cliente() {

        //Inicializamos las variables del metodo constructor
        this.key = generarKey();
        this.codigoCliente = "";
        this.razonSocial = "";
        this.nombreFantasia = "";
        this.email = "";
        this.cuitPrefijo = 0;
        this.cuitMedio = 0;
        this.cuitSufijo = 0;

    }

    //===============================METODOS===================================


    //Metodo para agregar una nueva instancia de la clase Cliente.
    public static void agregarCliente(){

        // creamos el objeto cliente.
        Cliente cliente = new Cliente();

        // Tomamos los valores ingresados por el usuario con JOptionPane y el metodo showInputDialog.
        String codigo_Cliente = JOptionPane.showInputDialog("Ingrese el codigo del Cliente: ");

        String nombre_Fantasia = JOptionPane.showInputDialog("Ingrese el Nombre completo: ");

        String razon_social = JOptionPane.showInputDialog("Ingrese la Razon social: ");

        String _email = JOptionPane.showInputDialog("Ingrese el correo electronico: ");

        int cuit_Prefijo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el prefijo del Cuit: "));

        int cuit_Medio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el termino medio del Cuit: "));

        int cuit_Sufijo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el sufijo del Cuit: "));

        // Con los metodos set, establecemos los valores de los atributos luego de que el usuario ingresa los datos.
        cliente.setCodigoCliente(codigo_Cliente);
        cliente.setNombreFantasia(nombre_Fantasia);
        cliente.setEmail(_email);
        cliente.setRazonSocial(razon_social);
        cliente.setCuitPrefijo(cuit_Prefijo);
        cliente.setCuitMedio(cuit_Medio);
        cliente.setCuitSufijo(cuit_Sufijo);

        // Añadimos al nuevo cliente a la array de listaDeClientes.
        listaDeClientes.add(cliente);

        //Mostramos un mensaje al usuario.
        JOptionPane.showMessageDialog(null,"El Cliente ha sido agregado exitosamente!");

    }

    //Metodo para generar una key.
    public static String generarKey(){
        Random random = new Random();
        String keyCode = new BigInteger(100,random ).toString(32);
        return keyCode;
    }

    //Mostramos una lista de cliente con sus datos.
    public static void mostrarCliente(){
    System.out.println("Lista de clientes: ");
    // EN caso de que no se hayan agregado clientes, este condicional mostrara un mensaje al usuario.
        if(listaDeClientes.size() == 0){
            System.out.println("No hay clientes agregados actualmente");
        }

        // Con un ciclo for recorremos el arraylist listaDeClientes y mostramos los datos de cada cliente agregado.
        for(int i = 0;i< listaDeClientes.size();i++){
            System.out.println("================================");
            System.out.println("Cliente numero: " + i + "\nNombre: " + listaDeClientes.get(i).obtenerNombre() + "\n" + "Email: " + listaDeClientes.get(i).obtenerEmail() + "\n" + "Razon social: " + listaDeClientes.get(i).obtenerRazonSocial() + "\n" + "CUIT: " + listaDeClientes.get(i).obtenerCuitPrefijo()+"-"+listaDeClientes.get(i).obtenerCuitMedio()+"-"+listaDeClientes.get(i).obtenerCuitSufijo());
        }

    }

    //DESPLEGAMOS MENU DE OPCIONES EN CLIENTE

    public static void opcionesCliente(){

        //Con la clase escanner recibimos lo que el usuario escribe por teclado en sn.
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir)
        {

            System.out.println("====================================");
            System.out.println("MENU DE OPCIONES DE CLIENTE");
            System.out.println("");
            System.out.println("1. Crear nuevo Cliente");
            System.out.println("2. Mostrar Clientes");
            System.out.println("3. Modificar clientes"); // pronto sera agregado
            System.out.println("4. Eliminar cliente"); // pronto sera agregado
            System.out.println("5. Salir");
            System.out.println("");
            System.out.println("====================================");

            try {

                System.out.println("Escribe una de las opciones: \n");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        Cliente.agregarCliente();
                        break;
                    case 2:
                        Cliente.mostrarCliente();
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


    //Metodos settler:



    public void setNombreFantasia(String NombreFantasia){
        this.nombreFantasia = NombreFantasia;
    }


    public void setRazonSocial(String RazonSocial){
        this.razonSocial = RazonSocial;
    }


    public void setCodigoCliente(String CodigoCliente){
        this.codigoCliente = CodigoCliente;
    }


    public void setEmail(String Email){
        this.email = Email;
    }

    public void setCuitPrefijo(int CuitPre){
        this.cuitPrefijo = CuitPre;
    }

    public void setCuitMedio(int CuitMedio){
        this.cuitMedio = CuitMedio;
    }

    public void setCuitSufijo(int CuitSufijo){
        this.cuitSufijo = CuitSufijo;
    }

    //Metodos getter:

    public String obtenerKey(){

        return key;
    }
    public String obtenerCodigoCliente(){

        return codigoCliente;
    }
    public static String obtenerNombre(){

        return nombreFantasia;
    }
    public String obtenerRazonSocial(){

        return razonSocial;
    }
    public String obtenerEmail(){

        return email;
    }
    public int obtenerCuitPrefijo(){

        return cuitPrefijo;
    }
    public int obtenerCuitMedio(){
        return cuitMedio;
    }
    public int obtenerCuitSufijo(){
        return cuitSufijo;
    }

} // fin de clase Cliente
