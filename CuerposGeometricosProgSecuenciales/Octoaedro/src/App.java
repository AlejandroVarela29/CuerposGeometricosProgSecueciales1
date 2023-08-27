import java.util.Scanner;
public class App{

    public static void main(String args[]){

        double area, volumen, aristas;

        Scanner octaedro = new Scanner(System.in);

        System.out.println("Se calculara el area de un octaedro");

        System.out.println("Cual es el valor de las aristas");
        aristas=octaedro.nextDouble();

        area = 2 * Math.pow(aristas, 2) * Math.sqrt(3);

        System.out.println("El area del octaedro es " + area);

        System.out.println(":::::::::::::::::::::::::::::::::::::::::");

        System.out.println("Se calculara el volumen de un octaedro");

        System.out.println("Cual es el valor de las aristas");
        aristas=octaedro.nextDouble();

        volumen = (Math.sqrt(2) / 3) * Math.pow(aristas, 3);

        System.out.println("El volumen de un octaedro es " + volumen);

        octaedro.close();


    }
}