import java.util.Scanner;
public class App{
    
    public static void main(String args[]){

        double area, aristas, cara, base, volumen, diagonal;

        Scanner ortoedro = new Scanner(System.in);

        System.out.println("Se calculara el area de un ortoedro");

        System.out.println("Cual es el valor de la arista");
        aristas=ortoedro.nextDouble();

        System.out.println("Cual es el valor de la base");
        base=ortoedro.nextDouble();

        System.out.println("Cual es el valor de la cara");
        cara=ortoedro.nextDouble();

        area = 2 * ((aristas * base) * (aristas * cara) * (base * cara));

        System.out.println("El area de un ortoedro es " + area);

        System.out.println(":::::::::::::::::::::::::::::::::::::::::");

        System.out.println("Se calculara el volumen de un ortoedro");

        System.out.println("Cual es el valor de la arista");
        aristas=ortoedro.nextDouble();

        System.out.println("Cual es el valor de la base");
        base=ortoedro.nextDouble();

        System.out.println("Cual es el valor de la cara");
        cara=ortoedro.nextDouble();

        volumen = aristas * base * cara;

        System.out.println("El volumen de un ortoedro es " + volumen);

        System.out.println(":::::::::::::::::::::::::::::::::::::::::");

        System.out.println("Se calculara la diagonal de un ortoedro");

        System.out.println("Cual es el valor de la arista");
        aristas=ortoedro.nextDouble();

        System.out.println("Cual es el valor de la base");
        base=ortoedro.nextDouble();

        System.out.println("Cual es el valor de la cara");
        cara=ortoedro.nextDouble();

        diagonal = Math.sqrt(Math.pow(aristas + base + cara, 2));

        System.out.println("La diagonal de un ortoedero es " + diagonal);

        ortoedro.close();

    }
}