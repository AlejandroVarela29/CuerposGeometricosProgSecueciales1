import java.util.Scanner;
public class App{

    public static void main(String args[]){

        double areaLateral, pBaseMenor, pBaseMayor, areaTotal, volumenTroncoPiramide, altura, aBaseMenor, aBaseMayor, apotemaTroncoPiramide, apotemaBaseMenor, apotemaBaseMayor;
        
 
        Scanner troncopiramide = new Scanner(System.in);

        System.out.println("Se calculara el area lateral del tronco de una piramide ");

        System.out.println("Cual es la base mayor de p");
        pBaseMayor=troncopiramide.nextDouble();

        System.out.println("Cual es la base menor de p");
        pBaseMenor=troncopiramide.nextDouble();

        System.out.println("Cual es el apotema base menor");
        apotemaBaseMenor=troncopiramide.nextDouble();

        System.out.println("Cual es el apotema base mayor");
        apotemaBaseMayor=troncopiramide.nextDouble();

        System.out.println("Cual es la altura");
        altura=troncopiramide.nextDouble();

        apotemaTroncoPiramide = Math.sqrt(Math.pow(altura, 2) - Math.pow(apotemaBaseMayor - apotemaBaseMenor, 2) );
        areaLateral = ((pBaseMayor + pBaseMenor) / 2) * apotemaTroncoPiramide;

        System.out.println("El area lateral es " + areaLateral);

        System.out.println("___________________________________________________");

        System.out.println("Se calculara el area total del tronco de la piramide");

        System.out.println("Cual es la base mayor de a");
        aBaseMayor=troncopiramide.nextDouble();

        System.out.println("Cual es la base menor de a");
        aBaseMenor=troncopiramide.nextDouble();

        areaTotal = areaLateral + aBaseMayor + aBaseMenor;

        System.out.println("El area total es " + areaTotal);

        System.out.println("___________________________________________________");

        System.out.println("Se calculara el volumen de la tronco de la piramide");

        System.out.println("Cual es la base mayor de a");
        aBaseMayor=troncopiramide.nextDouble();

        System.out.println("Cual es la base menor de a");
        aBaseMenor=troncopiramide.nextDouble();

        System.out.println("Cual es la altura");
        altura=troncopiramide.nextDouble();

        volumenTroncoPiramide = (1/3) * altura * (aBaseMayor + aBaseMenor + Math.sqrt(aBaseMayor * aBaseMenor));

        System.out.println("El volumen del tronco de la piramide es " + volumenTroncoPiramide);

        troncopiramide.close();


    }
}
