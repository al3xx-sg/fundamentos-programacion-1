import java.util.Scanner;

public class Bicis {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int opc, horas;
        double tarifa = 0;
        double subtotal, descuento, total;
        boolean membresia;

        System.out.println("-- RENTA DE BICIS ALEX--");
        System.out.println("1. Bicicleta urbana - $40 por hora");
        System.out.println("2. Bicicleta de montaña - $60 por hora");
        System.out.println("3. Bicicleta eléctrica - $90 por hora");
        System.out.print("Selecciona el tipo de bicicleta: ");
        opc = teclado.nextInt();

        switch (opc) {
            case 1:
                tarifa = 40;
                System.out.println("Bicicleta urbana");
                break;

            case 2:
                tarifa = 60;
                System.out.println("Bicicleta de montaña");
                break;

            case 3:
                tarifa = 90;
                System.out.println("Bicicleta electrica");
                break;

            default:
                System.out.println("Opción no válida");
        }

        if (opc >= 1 && opc <= 3) {
            System.out.println("Ingresa la cantidad de horas: ");
            horas = teclado.nextInt();

            if (horas > 0) {
                System.out.println("¿Tienes membresía? (true/false): ");
                membresia = teclado.nextBoolean();
                subtotal = tarifa * horas;
                if (membresia) {
                    descuento = subtotal * 0.20;
                } else {
                    descuento = 0;
                }
                total = subtotal - descuento;

                System.out.println("-RESUMEN DE RENTA-");
                System.out.println("Subtotal: $" + subtotal);
                System.out.println("Descuento: $" + descuento);
                System.out.println("Total a pagar: $" + total);

            } else {
                System.out.println("Cantidad de horas no válidas");
            }
        }

    }
}