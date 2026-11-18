
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        int peso = 0, opc = 0, res = 0;
        int aceptados = 0, rechazos = 0, fragil = 0;

        double precio = 0, total = 0;
        double costoM = 0;

        int limite = 0;
        String tipo = "";

        System.out.println("SISTEMA DE PAQUETES");

        do {

            System.out.println("\n\nIngrese el peso del paquete en kg (0 termina):");
            peso = teclado.nextInt();

            if (peso == 0) {
                break;
            }

          
            while (peso < 0) {
                System.out.println("Peso invalido. Ingrese nuevamente:");
                peso = teclado.nextInt();

                if (peso == 0) {
                    break;
                }
            }

            do {
                System.out.println("\n\nSeleccione el tipo de envio:");
                System.out.println("1.- Local");
                System.out.println("2.- Nacional");
                System.out.println("3.- Express");
                opc = teclado.nextInt();

                if (opc < 1 || opc > 3) {
                    System.out.println("Opcion invalida. Intente nuevamente.");
                }

            } while (opc < 1 || opc > 3);

            // Fckin limite ahh
            switch (opc) {

                case 1:
                    tipo = "Local";
                    limite = 12;
                    precio = 30 + 8 * peso;
                    break;

                case 2:
                    tipo = "Nacional";
                    limite = 20;
                    precio = 50 + 12 * peso;
                    break;

                case 3:
                    tipo = "Express";
                    limite = 5;
                    precio = 80 + 20 * peso;
                    break;
            }

            // Compruebo ohsiohsi
            if (peso > limite) {

                System.out.println("Paquete rechazado.");
                rechazos++;

            } else {

                do {
                    System.out.println("¿El paquete es fragil?");
                    System.out.println("1.- Si");
                    System.out.println("2.- No");
                    res = teclado.nextInt();

                    if (res != 1 && res != 2) {
                        System.out.println("Opcion invalida.");
                    }

                } while (res != 1 && res != 2);

                if (res == 1) {
                    precio += 25;
                    fragil++;
                }

                aceptados++;
                total += precio;

                if (precio > costoMayor) {
                    costoM = precio;
                }

                System.out.println("\n\nRESULTADOS");
                System.out.println("Tipo de envio: " + tipo);
                System.out.println("Peso: " + peso + " kg");
                System.out.println("Total a pagar: $" + df.format(precio));
            }

        } while (peso != 0);

        System.out.println("\n\nRESULTADOS FINALES");
        System.out.println("Paquetes aceptados: " + aceptados);
        System.out.println("Paquetes rechazados: " + rechazos);
        System.out.println("Paquetes fragiles aceptados: " + fragil);
        System.out.println("Dinero recaudado: $" + df.format(total));
        System.out.println("Costo mas alto: $" + df.format(costoM));

        teclado.close();
    }
}
