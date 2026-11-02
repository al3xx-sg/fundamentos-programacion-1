import java.util.Scanner;

public class megas {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double tamaño, velocidad, tiempo;

        System.out.print("Ingresa el tamaño del archivo en MB: ");
        tamaño = teclado.nextDouble();

        System.out.print("Ingresa la velocidad en MB/s: ");
        velocidad = teclado.nextDouble();

        if (tamaño >= 0 && velocidad > 0) {
            tiempo = calcularTiempo(tamaño, velocidad);
            System.out.println("Tiempo de descarga: " + tiempo + " segundos");
        } else {
            System.out.println("Datos no validos");
        }

    }

    public static double calcularTiempo(double tamaño, double velocidad) {
        return tamaño / velocidad;
    }
}