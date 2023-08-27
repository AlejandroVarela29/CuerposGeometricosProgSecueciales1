import java.util.Scanner;
public class App{

    public static void main(String[] args){

        double areaZonaEsferica, altura, radioMayor, volumenCasqueteEsferico, volumenZonaEsferica;

        Scanner esfera2 = new Scanner(System.in);

        System.out.println("Se calculara el area de una zona esferica");

        System.out.println("cual es el radio");
        radioMayor=esfera2.nextDouble();

        System.out.println("cual es la altura");
        altura=esfera2.nextDouble();

        areaZonaEsferica = 2 * Math.PI * radioMayor * altura;

        System.out.println("el area de la zona esferica es " + areaZonaEsferica);

        System.out.println("-----------------------------------------------");

        System.out.println("Se calcura el volumen de la zona esferica ");

        System.out.println("Cual es la altura");
        altura=esfera2.nextDouble();

        System.out.println("Cual es el radio");
        radioMayor=esfera2.nextDouble();

        volumenZonaEsferica =( Math.PI * altura * (Math.pow(altura, 2) * (3 * Math.pow(radioMayor, 2)) * (3 * Math.pow(radioMayor,2)))) / 6 ;

        System.out.println("El vomuen de la zona esferica es " + volumenZonaEsferica);

        System.out.println("-----------------------------------------------");

        System.out.println("Se calculara el volumen de el casquete esferico");
        System.out.println("Para ello se necesita el radio mayor y la altura ");

        System.out.println("Cual es el radio");
        radioMayor=esfera2.nextDouble();

        System.out.println("Cual es la altura");
        altura=esfera2.nextDouble();

        volumenCasqueteEsferico = (Math.PI * altura * ((3 * radioMayor) - altura)) / 3;

        System.out.println("El volumen del casuqete esferico es " + volumenCasqueteEsferico);

        esfera2.close();
    }
}