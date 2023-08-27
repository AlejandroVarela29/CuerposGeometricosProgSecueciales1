import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

   double radio, area;

    Scanner esfera = new Scanner(System.in);

    System.out.println("Se calculara el area de una esfera");
    System.out.println("Cual es el radio ");
    radio=esfera.nextDouble();

    area = 4 * Math.PI * Math.pow(radio, 2);

    System.out.println("El area es " + area);

    System.out.println("-----------------------------------------------");
  
    double volumenEsfera;

    System.out.println("Se calculara el volumen de una esfera ");

    System.out.println("Cual es el radio");
    radio=esfera.nextDouble();

    volumenEsfera = (4 / 3) * Math.PI * Math.pow(radio, 3);

    System.out.println("El voluman de la esfera es " + volumenEsfera);

    esfera.close();
  }

}