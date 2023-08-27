import java.util.Scanner;
public class Prisma {

    public static void main(String args[]){

        double pBase, altura, largo, areaLateral, aBase, apotema, perimetro, areaTotal, alfa, volumenPrisma;
        int nLados;

        Scanner prisma = new Scanner (System.in);

        System.out.println("Se calculara el area lateral de un prisma");
       
        System.out.println("Cuantos lados contiene el prisma");
        nLados=prisma.nextInt();

        System.out.println("Cual es el largo del prisma");
        largo=prisma.nextDouble();

        System.out.println("Cual es la altura del prisma");
        altura=prisma.nextDouble();

        pBase = nLados * largo ;
        areaLateral = pBase * altura;

        System.out.println("El area lateral del prisma es" + areaLateral);

        System.out.println("-----------------------------------------------");

        System.out.println("Se calculara el area total de un prisma");

        System.out.println("Cual es el perimetro del prisma");
        perimetro=prisma.nextDouble();

        alfa = 360/nLados;

        apotema = largo / 2*Math.tan(alfa/2);
        aBase= perimetro * apotema / 2;
        areaTotal= areaLateral * aBase;

        System.out.println("El area total del prisma es "+areaTotal);

        System.out.println("-----------------------------------------------");

        System.out.println("Se calculara el volumen de un prisma ");

        System.out.println("Cual es la altura del prisma");
        altura=prisma.nextDouble();

        volumenPrisma= aBase * altura;

        System.out.println("El volumen de un prisma es "+volumenPrisma);

        prisma.close();
    }
}