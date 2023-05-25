import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Se declara este array donde se guardan los objetos o instancia del
        // la clase Color
        Color[] colors = new Color[3];

        for (int i = 0; i < colors.length; i++) {
            try {
                System.out.println("Ingrese los colores rojo, verde y azul separados por espacio: ");
                String[] ints = in.nextLine().split(" ");
                if (ints.length != 3) {
                    System.out.println("Has ingresado una cantidad de colores invalidos");
                    i--;
                    continue;
                }

                // Se crea un nuevo objeto de la clase color pasandole como argumento
                // los bytes de cada color RGB
                colors[i] = new Color(
                    Integer.parseInt(ints[0]), 
                    Integer.parseInt(ints[1]), 
                    Integer.parseInt(ints[2])
                );
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }

        // Se imprimen los colores agregados en el array. El metodo Arrays.toString
        // llama al metodo toString de la clase Color y los concatena con los demas
        // objetos del array 
        System.out.println("Colores agregados: " + Arrays.toString(colors));
    }
}