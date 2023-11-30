import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el radio de la esfera");
        double radio = scanner.nextDouble();
        double volumen = (4.0/3.0) * Math.PI * Math.pow(radio,3);

        System.out.println("El volumen de la esfera es: "+ volumen);
    }
}