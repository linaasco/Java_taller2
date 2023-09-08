import java.util.Scanner;
import java.util.Random;
public class computador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int Nmax = 100;
        int Nmin = 1;


        int randomNumber = random.nextInt(100) + 1;

        while (true) {

            int intento = random.nextInt(Nmax - Nmin + 1) + Nmin;
            System.out.println("¿Es " + intento + " tu número?");

            System.out.print("Responde '=' si es correcto, '<' si tu número es menor, o '>' si es mayor: ");
            String respuesta = sc.nextLine();

            if (respuesta.equals("=")) {
                System.out.println("Adivine el numero era :" + intento);
                break;
            }
            else if (respuesta.equals("<")) {
                Nmax = intento - 1;
            } else if (respuesta.equals(">")) {
                Nmin = intento + 1;
            }
        }

    }
}