import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double cateto1, cateto2, hipotenusa;

        System.out.println("Entre com o primeiro cateto: ");
        cateto1 = sc.nextDouble();

        System.out.println("Entre com o segundo cateto: ");
        cateto2 = sc.nextDouble();

        hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        System.out.println("Hipotenusa: " + hipotenusa);
    }
}