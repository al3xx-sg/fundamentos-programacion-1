import java.util.Scanner;

public class batery {

    public static int calcularMinutos(int bateria) {
        int minutos = 0;

        while (bateria < 100) {
            bateria += 8;
            minutos++;

            if (bateria > 100) {
                bateria = 100;
            }
        }
        return minutos;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int bateria;
        int minutos;
        int opcion = 1;

        while (opcion == 1) {

            System.out.print("Ingresa el porcentaje inicial de bateria: ");
            bateria = teclado.nextInt();

            while (bateria < 0 || bateria > 100) {
                System.out.println("Error: el porcentaje debe estar entre 0 y 100.");
                System.out.print("Ingresa nuevamente el porcentaje: ");
                bateria = teclado.nextInt();
            }

            minutos = calcularMinutos(bateria);

            System.out.println("Minutos necesarios para completar la carga: " + minutos);

            System.out.println("\n¿Deseas realizar otra simulacion?");
            System.out.println("1. Si");
            System.out.println("2. No");
            System.out.print("Selecciona una opcion: ");
            opcion = teclado.nextInt();

            while (opcion != 1 && opcion != 2) {
                System.out.println("Opcion no valida.");
                System.out.print("Selecciona 1 para continuar o 2 para salir: ");
                opcion = teclado.nextInt();
            }

        }

        System.out.println("Programa finalizado.");
        teclado.close();
    }
}