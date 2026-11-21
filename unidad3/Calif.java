import java.util.Scanner;

public class Calif {

    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {

        int[] cal = capturar();

        mostrar(cal);

        System.out.println("Alumnos aprobados: " + aprobados(cal));
        System.out.println("Alumnos reprobados: " + reprobados(cal));

    }

    public static int[] capturar() {

        int[] cal = new int[10];

        for (int i = 0; i < 10; i++) {

            System.out.print("Captura la calificacion del alumno " + (i + 1) + ": ");
            cal[i] = teclado.nextInt();

            while (cal[i] < 0 || cal[i] > 100) {
                System.out.println("Calificacion no valida. Intenta nuevamente.");
                System.out.print("Captura la calificacion del alumno " + (i + 1) + ": ");
                cal[i] = teclado.nextInt();
            }

        }

        return cal;
    }

    public static void mostrar(int[] cal) {

        System.out.println("\n\nCalificaciones capturadas:");

        for (int i = 0; i < 10; i++) {
            System.out.println("Alumno " + (i + 1) + ": " + cal[i]);
        }

    }

    public static int aprobados(int[] cal) {

        int ap = 0;

        for (int i = 0; i < 10; i++) {
            if (cal[i] >= 70) {
                ap++;
            }
        }

        return ap;
    }

    public static int reprobados(int[] cal) {

        int rep = 0;

        for (int i = 0; i < 10; i++) {
            if (cal[i] < 70) {
                rep++;
            }
        }

        return rep;
    }

}