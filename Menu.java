package Proyecto1;
import java.util.Scanner;
public class Menu {


        public void desplegarMenu()
    {
        Scanner scanner = new Scanner(System.in);

        int opcion;


            System.out.println("*********************************************");
            System.out.println("*********************************************");
            System.out.println("*************  Hola usuario :)  *************");
            System.out.println("************* Bienvenido al Menú ************");
            System.out.println("*********************************************");
            System.out.println("*********************************************");
            System.out.println("1. Encriptar");
            System.out.println("2. Desencriptar con clave");
            System.out.println("0. Salir");
            System.out.println((" Seleccióna una opción ---> "));
            opcion = scanner.nextInt();
            System.out.println();

        String textoLeido =  ManejoDeArchivos.lectorDeArchivo("C:\\Users\\52443\\codegym\\11424239\\codegym-project\\src\\Proyecto1\\TextoALeer");
        String textoEncriptado2 =ManejoDeArchivos.lectorDeArchivo("C:\\Users\\52443\\codegym\\11424239\\codegym-project\\src\\Proyecto1\\TextoALeerEncriptado");


        if (opcion == 1) {
            EncriptadorDesencriptador encriptador = new EncriptadorDesencriptador(textoLeido);
            String textoEncriptado= encriptador.encriptar();
            System.out.println("Este es el texto encriptado:");
            System.out.println(textoEncriptado);

            } else if (opcion == 2) {

            EncriptadorDesencriptador desencriptador = new EncriptadorDesencriptador(textoEncriptado2);
            String textoDesencriptado = desencriptador.desencriptar();
            System.out.println(" Este es el texto desencriptado :) :");
            System.out.println(textoDesencriptado);


            } else if (opcion == 0) {

                System.out.println(("Hasta luego :)"));

            } else {
                System.out.println(("Opción invalida. Intenta otra vez :) "));

                Menu menu = new Menu();
                menu.desplegarMenu();
                opcion = scanner.nextInt();
                System.out.println();

            }
        }
    }
