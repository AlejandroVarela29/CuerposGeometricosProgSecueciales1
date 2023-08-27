import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
 double area, aristas, volumen;

        Scanner dodecaedro = new Scanner(System.in);

        System.out.println("Se calculara el area de un dodecaedro");

        System.out.println("Cual es el valor de la arista");
        aristas=dodecaedro.nextDouble();

        area = 3 * Math.pow(aristas, 3) * Math.sqrt(25 + 10 * Math.sqrt(5));

        System.out.println("El area de un dodecaedro es " + area);

        System.out.println(":::::::::::::::::::::::::::::::::::::::::");

        System.out.println("Se calculara el volumen de un dodecaedro");

        System.out.println("Cual es el valor de la arista");
        aristas=dodecaedro.nextDouble();

        volumen = (1 / 4) * (15 + 7 * Math.sqrt(5)) * Math.pow(aristas, 3);

        System.out.println("El volumen de un dodecaedro es " + volumen);

        dodecaedro.close();


    }
}

