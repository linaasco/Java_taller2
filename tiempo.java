import java.util.Scanner;
public class tiempo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int suma = 0;
        int veces = 0;

        while (true) {
            System.out.println("Ingrese el " + (veces + 1) + " viaje");
            int numero = sc.nextInt();
            veces++;

            if (numero == 0) {

                break;
            }

            suma = suma + numero;
        }

        int horas = suma / 60;
        int minutos = suma % 60;

        System.out.println("Ha pasado " + horas + " horas con " + minutos + " minutos");
    }
}
