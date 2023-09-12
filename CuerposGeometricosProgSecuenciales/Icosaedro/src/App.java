import java.util.Scanner;
public class App{

    public static void main(String args[]){

        double aristas, area, volumen;

        Scanner icoseadro = new Scanner(System.in);

        System.out.println("Se calculara el area de icoseadro");

        System.out.println("Cual es el valor de la arista");
        aristas=icoseadro.nextDouble();

        area = 5 * Math.pow(aristas, 2) * Math.sqrt(3);

        System.out.println("El area de un icoseadro es " + area);

        System.out.println(":::::::::::::::::::::::::::::::::::::::::");

        System.out.println("Se calculara el volumen de un icoseadro");
        
        System.out.println("Cual es el valor de la arista");
        aristas=icoseadro.nextDouble();

        volumen = 0.4166 * (3 + Math.sqrt(5)) * Math.pow(aristas, 3 );

        System.out.println("El volumen de un icoseadro es " + volumen);

        icoseadro.close();

    }
}


