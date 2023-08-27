import java.util.Scanner;
public class App{

    public static void main(String args[]){

        double aristas, area, volumen, altura;

        Scanner tetraedro = new Scanner(System.in);

        System.out.println("Se calculara el area del tetraedro");

        System.out.println("Cual es arista");
        aristas=tetraedro.nextDouble();

        area = Math.pow(aristas, 2) * Math.sqrt(3);

        System.out.println("El area del tetraedo es " + area);

        System.out.println(":::::::::::::::::::::::::::::::::::::::::");

        System.out.println("Se calculara el volumen del tetraedo");

        System.out.println("Cual es la arista");
        aristas=tetraedro.nextDouble();

        volumen = (Math.sqrt(2) / 12) * Math.pow(aristas, 3);

        System.out.println("El volumen del tetraedo es " + volumen);

        System.out.println(":::::::::::::::::::::::::::::::::::::::::");

        System.out.println("Se calculara la altura del tetraedo");

        System.out.println("Cual es la arista");
        aristas=tetraedro.nextDouble();

        altura = aristas * (Math.sqrt(6) / 3);

        System.out.println("La altura del tetraedo es " + altura);

        tetraedro.close();

        


          
    }
}