import java.util.Scanner;
public class App{

    public static void main(String args[]){

        double areaHusoEsferico, radio, numeroDeGrados;

        Scanner esfera3 = new Scanner(System.in);

        System.out.println("Se calculara el huso esferico ");

        System.out.println("Cual es radio");
        radio=esfera3.nextDouble();

        System.out.println("Cual es el numero de grado ");
        numeroDeGrados=esfera3.nextDouble();

        areaHusoEsferico = (4 * Math.PI * Math.pow(radio, 2) * numeroDeGrados) / 360;

        System.out.println("El huso esferico es " + areaHusoEsferico);

        System.out.println("___________________________________________________");


        double volumenCunaEsferica;

        System.out.println("Se calculara la cuna esferica ");

        System.out.println("Cual es el radio");
        radio=esfera3.nextDouble();

        System.out.println("Cual es el numero de grado ");
        numeroDeGrados=esfera3.nextDouble();

        volumenCunaEsferica = (4/3) * ((Math.PI * Math.pow(radio, 3) * numeroDeGrados )/ 360);

        System.out.println("El volumen de la cuna esferica es " + volumenCunaEsferica);

        esfera3.close();
    }
}