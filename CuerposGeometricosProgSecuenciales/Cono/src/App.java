import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        double radio, pBase, areaLateral, generatriz, altura, volumenCono, areaTotal, aBase;

        Scanner cono = new Scanner (System.in);

        System.out.println("Se calculara el area lateral de un cono");
        System.out.println("para ello se necesita la base de p ");
        System.out.println("tambien se necesitan datos adicionales comno lo son el radio y la altura");

        System.out.println("cual es el radio");
        radio=cono.nextDouble();

        System.out.println("cual es la altura");
        altura=cono.nextDouble();

        System.out.println("cual es la base de p");
        pBase=cono.nextDouble();

        generatriz = altura * radio;
        areaLateral = (pBase * generatriz) / 2;

        System.out.println("el area lateral es " + areaLateral);

        System.out.println("-----------------------------------------------");

        System.out.println(" se calculara el area total de un cono");
        System.out.println(" para ellos se necesita el area lateral y el radio ");

        System.out.println("cual es el radio");
        radio=cono.nextDouble();

        aBase = Math.PI * Math.pow(radio, 2);
        areaTotal = areaLateral + aBase;

        System.out.println("el area total es " + areaTotal);

        System.out.println("-----------------------------------------------");

        System.out.println("Se  calculara el volumen de un cono ");

        System.out.println("cual es la altura");
        altura=cono.nextDouble();

        System.out.println("Cual es la base de a ");
        aBase=cono.nextDouble();

        volumenCono = (aBase * altura) / 3;

        System.out.println("el volumen es " + volumenCono);

        cono.close();

    }
}