import java.util.Scanner;
public class App{

    public static void main(String args[]){

        double altura, apotemaBaseb, areaLateral, pBase, apotema, apotemaPiramide, aBase, areaTotal, volumenPiramide;

        Scanner piramide = new Scanner(System.in);

        System.out.println("Se calculara el area lateral de una piramide");

        System.out.println("Cual es la altura de la piramide");
        altura=piramide.nextDouble();

        System.out.println("Cual es el apotema base b ");
        apotemaBaseb=piramide.nextDouble();

        System.out.println("Cual es la base de p");
        pBase=piramide.nextDouble();

        apotema = Math.sqrt(Math.pow(altura, 2) + Math.pow(apotemaBaseb, 2));
        apotemaPiramide = altura * apotema;
        areaLateral = (pBase * apotemaPiramide) / 2;

        System.out.println("El area lateral es " + areaLateral);

        System.out.println("-----------------------------------------------");

        System.out.println("Se calculara el area total de una piramide");

        System.out.println("Cual es la base de a");
        aBase=piramide.nextDouble();

        areaTotal = areaLateral + aBase;

        System.out.println("El area total es " +  areaTotal);

        System.out.println("-----------------------------------------------");

        System.out.println("Se calculara el volumen de la piramide");

        System.out.println("Cual es la base de a ");
        aBase=piramide.nextDouble();

        System.out.println("Cual es la altura");
        altura=piramide.nextDouble();

        volumenPiramide = (aBase * altura) / 3;

        System.out.println("El volumen de la piramide es " + volumenPiramide);

        piramide.close();

    }
}