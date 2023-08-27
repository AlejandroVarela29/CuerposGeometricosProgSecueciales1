import java.util.Scanner;
public class App{

    public static void main(String args[]){
        
        double aristas, volumen, diagonal, area;

        Scanner hexaedro = new Scanner (System.in);

        System.out.println("Se calculara el area de un hexaedro");

        System.out.println("Cual es el valor de la arista");
        aristas=hexaedro.nextDouble();

        area = 6 * Math.pow(aristas, 2);

        System.out.println("el area del hexaedro es " + area);

        System.out.println(":::::::::::::::::::::::::::::::::::::::::");

        System.out.println("Se calculara el volumen de un hexaedro ");

        System.out.println("Cual es el valor de la arista");
        aristas=hexaedro.nextDouble();

        volumen = Math.pow(aristas, 3);

        System.out.println("El volumen del hexaedro es " + volumen);

        System.out.println(":::::::::::::::::::::::::::::::::::::::::");

        System.out.println("Se calculara la diagonal de un hexaedro");

        System.out.println("Cual es el valor de la arista");
        aristas=hexaedro.nextDouble();

        diagonal = aristas * Math.sqrt(3);

        System.out.println("La diagonal del hexaedro es " + diagonal);

        hexaedro.close();






        


    }
}