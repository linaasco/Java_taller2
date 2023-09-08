import java.util.Scanner;
import java.util.Random;
public class random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();


        int randomNumber = random.nextInt(100)+1;

        int numero;

        do {
            System.out.println("Intenta adivinar el número ");
            numero = sc.nextInt();
            if (numero > randomNumber) {
                System.out.println("El número "+numero+" es mayor al numero en busqueda");
            } else if (numero < randomNumber) {
                System.out.println("El número "+numero+" es menor al numero en busqueda");
            }
        } while (randomNumber != numero);

        System.out.println("Has acertado, el numero es " + randomNumber);
    }

}

