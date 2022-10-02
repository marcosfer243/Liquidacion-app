import java.math.BigInteger;
import java.util.*;
import javax.swing.JOptionPane;


public class Cliente {

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
    private int añoContrato;
    private int diaContrato;
    private int mesContrato;


    //Method constructor
    public Cliente() {

        this.key = generarKey();
        this.codigoCliente = "";
        this.razonSocial = "";
        this.nombreFantasia = "";
        this.email = "";
        this.cuitPrefijo = 0;
        this.cuitMedio = 0;
        this.cuitSufijo = 0;
        this.añoContrato = 0;
        this.mesContrato = 0;
        this.diaContrato = 0;
    }

    //===============================METODOS===================================

    //Metodo para agregar una nueva instancia de la clase Cliente.
    public static void agregarCliente(){

        // creamos el objeto cliente.
        Cliente cliente = new Cliente();
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el codigo del Cliente");
        String codigo_Cliente = input.next();

        System.out.println("Ingrese el nombre completo");
        String nombre_Fantasia = input.next();

        System.out.println("Ingrese la razon social");
        String razon_social = input.next();

        System.out.println("Ingrese el email");
        String _email = input.next();

        System.out.println("Ingrese el prefijo del Cuit");
        int cuit_Prefijo = Integer.parseInt(input.next());

        System.out.println("Ingrese la parte media del Cuit");
        int cuit_Medio = Integer.parseInt(input.next());

        System.out.println("Ingrese el sufijo del Cuit");
        int cuit_Sufijo = Integer.parseInt(input.next());

        // REVISAR: REEMPLAZAR PARA QUE SEA AUTOMATICO.
        System.out.println("Ingrese el año de inicio de contrato");
        int anio_Contrato = Integer.parseInt(input.next());

        System.out.println("Ingrese el mes de inicio del contrato");
        int mes_Contrato = Integer.parseInt(input.next());

        System.out.println("Ingrese el dia de inicio del contrato");
        int dia_Contrato = Integer.parseInt(input.next());

        cliente.setCodigoCliente(codigo_Cliente);
        cliente.setNombreFantasia(nombre_Fantasia);
        cliente.setEmail(_email);
        cliente.setRazonSocial(razon_social);
        cliente.setCuitPrefijo(cuit_Prefijo);
        cliente.setCuitMedio(cuit_Medio);
        cliente.setCuitSufijo(cuit_Sufijo);
        cliente.setAñoContrato(anio_Contrato);
        cliente.setMesContrato(mes_Contrato);
        cliente.setDiaContrato(dia_Contrato);

        // Añadimos al nuevo cliente a la array de listaDeClientes.
        listaDeClientes.add(cliente);

    }

    //Metodo para generar una key.
    public static String generarKey(){
        Random random = new Random();
        String keyCode = new BigInteger(100,random ).toString(32);
        return keyCode;
    }

    //Mostramos una lista de cliente con sus datos.
    public static void mostrarCliente(/*String CodigoCliente, String Nombre, String email, String razonSocial, int cuitPrefijo, int cuitMedio, int cuitSufijo, int anioContrato, int mesContrato, int diaContrato*/){
    System.out.println("Lista de clientes: ");
    // EN caso de que no se hayan agregado clientes, este condicional mostrara un mensaje al usuario.
        if(listaDeClientes.size() == 0){
            System.out.println("No hay clientes agregados actualmente");
        }

        for(int i = 0;i< listaDeClientes.size();i++){
            //listaAuxiliar.add(listaDeClientes.get(i));


            System.out.println("Cliente numero: " + i + "\n1Name: " + listaDeClientes.get(i).obtenerNombre() + "\n" + "Email: " + listaDeClientes.get(i).obtenerEmail());
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

    public void setAñoContrato(int AñoContrato) {
        this.añoContrato = añoContrato;
    }

    public void setMesContrato(int MesContrato){
        this.mesContrato = MesContrato;
    }

    public void setDiaContrato(int DiaContrato ){
        this.diaContrato = DiaContrato;
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
