import java.util.Scanner;
public class histograma {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int positivos=0;
        int negativos=0;

        while (true){

            System.out.println("Ingrese el numero");
            int numero= sc.nextInt();

            if (numero==0){

                break;
            }
            if (numero>0){

                positivos++;

            } else if (numero<0) {

                negativos++;
            }

            for (int i = 0; i < positivos; i++) {
                System.out.println("*");
            }

            System.out.println();

            for (int i = 0; i < negativos; i++) {
                System.out.println("*");
            }

            System.out.println();

        }
        System.out.println("Numeros positivos "+positivos);
        System.out.println("Numeros negativos "+negativos);
    }
}