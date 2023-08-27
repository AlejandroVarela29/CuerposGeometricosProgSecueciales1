import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        double altura, radio, areaLateral, pBase, volumenCilindro, aBase, areaTotal;

        Scanner cilindro = new Scanner (System.in);

        System.out.println("para sacar el area latearal de un cilindro");
        System.out.println("Se necesita lo siguiente altura y radio");

        System.out.println("Cual es la altura del cilindro ");
        altura=cilindro.nextDouble();

        System.out.println("Cual es el radio del cilindro");
        radio=cilindro.nextDouble();

        pBase = (2 * Math.PI) * radio;

        areaLateral = pBase * altura;

        System.out.println("El area lateral de un cilindro es "+areaLateral);

        System.out.println("-----------------------------------------------");

        System.out.println("Para sacar el area total de un cilindro");
        System.out.println("Se necesita lo siguiente el area lateral, pi, radio cuadrado y a base");

        System.out.println("Cual es el radio");
        radio=cilindro.nextDouble();

        aBase = Math.PI * Math.pow(radio, 2);
        areaTotal = areaLateral + 2*aBase; 

        System.out.println("El area total es "+areaTotal);

        System.out.println("-----------------------------------------------");

        System.out.println("Para sacar el volumen de un cilindro se necesita ");
        
        System.out.println("Cual es la altura del cilindro");
        altura=cilindro.nextDouble();

        volumenCilindro = aBase * altura;

        System.out.println("El volumen del cilindro es "+volumenCilindro);

        cilindro.close();

    }
}
