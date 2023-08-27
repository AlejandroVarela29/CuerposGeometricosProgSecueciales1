import java.util.Scanner;
public class App{

    public static void main(String args[]){

        double radioMayor, radioMenor, altura, generatriz, areaLateral, areaTotal, bBaseMayor, bBaseMenor, VolumenTroncoCono;

        Scanner troncocono = new Scanner(System.in);

        System.out.println("Se calculara el area lateral del tronco de un cono");

        System.out.println("Cual es la altura");
        altura=troncocono.nextDouble();

        System.out.println("Cual es el radio menor");
        radioMenor=troncocono.nextDouble();

        System.out.println("Cual es el radio  mayor");
        radioMayor=troncocono.nextDouble();

        generatriz = radioMenor * altura;
        areaLateral = Math.PI * generatriz * ( radioMayor + radioMenor);

        System.out.println("El area lateral es " + areaLateral);

        System.out.println("___________________________________________________");

        
        System.out.println("se calculara el area total del tronco de un cono ");

        System.out.println("cual es la base menor de b");
        bBaseMenor=troncocono.nextDouble();

        System.out.println("cual es la base mayor de b");
        bBaseMayor=troncocono.nextDouble();

        areaTotal = areaLateral + bBaseMayor + bBaseMenor;

        System.out.println("El area total es " + areaTotal);

        System.out.println("___________________________________________________");

        System.out.println("Se calcular el volumen de el tronco de un cono ");

        System.out.println("Cual es la altura");
        altura=troncocono.nextDouble();

        System.out.println("Cual es el radio menor");
        radioMenor=troncocono.nextDouble();

        System.out.println("Cual es el radio  mayor");
        radioMayor=troncocono.nextDouble();

        VolumenTroncoCono = ((1/3) * (Math.PI * altura) * (Math.pow(radioMayor, 2) + Math.pow(radioMenor, 2) +radioMayor * radioMenor));
        
        System.out.println("El volumen del tronco del cono es " + VolumenTroncoCono);

        troncocono.close();
    }
}