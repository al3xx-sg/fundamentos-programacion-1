import java.util.Scanner;

public class sisa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    
        System.out.print("Ingresa el promedio: ");
        double promedio = teclado.nextDouble();
        System.out.print("Ingresa el porcentaje de asistencia: ");
        double asistencia = teclado.nextDouble();

        if (promedio < 7.0) {
            System.out.println("Reprobado por calificación");
        } else if (asistencia < 80.0) {
            System.out.println("Reprobado por faltas");
        } else {
            System.out.println("Aprobado regular");
        }
    }
}