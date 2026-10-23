import java.util.Scanner;
public class Estacionamiento{
    public static void main(String[]args) throws Exception{
        Scanner teclado = new Scanner(System.in);

        int horas=0, autos=0, autosdes=0;
        double cobro=0, total=0, prom;

        do {
            System.out.print("Ingrese las horas estacionado: ");
            horas = teclado.nextInt();

            if (horas < 0) {
                System.out.println("Error: las horas negativas no son validas.");
            } else if (horas > 0) {
                cobro = horas * 15;

                if (horas > 5) {
                    cobro = cobro - 10;
                    autosdes++;
                    System.out.println("Se aplico un descuento de $10.");
                }

                autos++;
                total += cobro;

                System.out.println("Usted pagara: $"+cobro);
            }

        } while (horas != 0);
        System.out.println("Total de autos atendidos: " + autos);
        System.out.println("Total de dinero recaudado: $" + total);
        System.out.println("Autos con descuento: " + autosdes);

        if (autos > 0) {
            prom = total/autos;
            System.out.printf("Promedio pagado por auto: ",prom);
        } else {
            System.out.println("Promedio pagado: No hay autos registrados.");
        }
    }
}