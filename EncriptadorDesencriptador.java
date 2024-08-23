package Proyecto1;
import java.util.List;
import java.util.Scanner;

public class EncriptadorDesencriptador {
    Scanner scanner = new Scanner(System.in);

    List<Character> alfabeto = Alfabeto.getAlfabeto();

    int tamanoAlfabeto = alfabeto.size();

    String textoLeido;
    String textoEncriptado1;
    int claveDeDesplazamiento;
    String textoEncriptado2;

    public EncriptadorDesencriptador(String textoLeido) {

        this.textoLeido = textoLeido;

    }

    public String encriptar() {

        System.out.println("Seleccionaste la opción: Encriptar");

        System.out.println("¿Cuál será el número de desplazamiento de carácteres? ");
                    claveDeDesplazamiento = scanner.nextInt();


        StringBuilder textoEncriptado = new StringBuilder();


        for (int i = 0; i < textoLeido.length(); i++) {
            char posicionActual = textoLeido.charAt(i);
            boolean esParteAlfabeto = false;
            for (int a = 0; a < tamanoAlfabeto; a++) {
                if (posicionActual == alfabeto.get(a)) {
                    int nuevaPosicion = (a + claveDeDesplazamiento) % tamanoAlfabeto;
                    textoEncriptado.append(alfabeto.get(nuevaPosicion));
                    esParteAlfabeto = true;
                    break;
                }
            }
            if (!esParteAlfabeto) {
                textoEncriptado.append(posicionActual);
            }


        }
        textoEncriptado1= textoEncriptado.toString();
        return textoEncriptado.toString();

    }

    public String desencriptar() {

        String textoEncriptado2= ManejoDeArchivos.lectorDeArchivo("C:\\Users\\52443\\codegym\\11424239\\codegym-project\\src\\Proyecto1\\TextoALeerEncriptado");

        int claveDeDesencriptado = 10;
        System.out.println("Seleccionaste la opción: Desencriptar");

        System.out.println("La clave para desencriptar es 10 :) ");

        if (textoEncriptado2==null){
            System.out.println(" Lo siento, no se encontró ningún valor :( ");
            return null;
        }

        StringBuilder textoDesencriptado = new StringBuilder();


            for (int i = 0; i < textoEncriptado2.length(); i++) {
                char posicionActual = textoEncriptado2.charAt(i);
                boolean esParteAlfabeto = false;
                for (int a = 0; a < tamanoAlfabeto; a++) {
                    if (posicionActual == alfabeto.get(a)) {
                        int nuevaPosicion = (a - claveDeDesencriptado) % tamanoAlfabeto;

                        if (nuevaPosicion < 0) {
                            nuevaPosicion += tamanoAlfabeto;
                        }
                        textoDesencriptado.append(alfabeto.get(nuevaPosicion));
                        esParteAlfabeto = true;
                        break;
                    }
                }
                if (!esParteAlfabeto) {
                    textoDesencriptado.append(posicionActual);
                }

            }
             textoEncriptado2 = textoDesencriptado.toString();
            return textoDesencriptado.toString();


        }
    }





