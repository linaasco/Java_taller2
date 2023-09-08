import java.util.Scanner;
public class rango {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int cantidad;
        int mayor = -10;
        int menor= 100000;

        System.out.println("Ingrese la cantidad de datos que serán ingresados");
        cantidad = sc.nextInt();

        int [] datos = new int[cantidad];


        for (int i=0; i<cantidad; i++) {

            System.out.println("Ingrese el " + (i + 1) + " dato");

            datos[i] = sc.nextInt();
        }

        for(int i=0; i<cantidad;i++){
            int numero = datos[i];

            if ( numero > mayor){
                mayor=numero;
            } else if (numero<menor) {
                menor =numero;
            }
        }
        int rango = mayor-menor;
        System.out.println("Los números ingresados son:");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("valor "+(i+1)+" es :"+datos[i]);
            System.out.println("");
        }
        System.out.println("Su rango es :" + rango);
    }
}
