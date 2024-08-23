package Proyecto1;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ManejoDeArchivos {


    public static String lectorDeArchivo(String ruta) {
        StringBuilder textoALeer = new StringBuilder();

        try (Scanner textoLeido= new Scanner(Path.of(ruta))){

            while (textoLeido.hasNextLine()) {
                textoALeer.append(textoLeido.nextLine()).append(System.lineSeparator());
                    }
    }
catch (IOException e) {
    System.err.println("*** Lo siento usuario. No se pudo leer el archivo :( ***");


        }

        return textoALeer.toString();

        }
    public static String lectorDeArchivoEncriptado(String ruta2) {
        StringBuilder textoLeido2  = new StringBuilder();

        try (Scanner lectorDesencriptador = new Scanner(Path.of(ruta2)))

        {
            while (lectorDesencriptador.hasNextLine()) {
                textoLeido2 .append(lectorDesencriptador.nextLine()).append(System.lineSeparator());
            }

        }
        catch (IOException e) {
            System.err.println("*** Lo siento usuario. No se pudo leer el archivo :( ***");
        }
        return textoLeido2 .toString();
    }


}


