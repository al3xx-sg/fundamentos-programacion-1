import java.util.Scanner;

public class batery {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int bateria;
        System.out.print("Bateria inicial del dron: ");
        bateria = teclado.nextInt();
        int min = 1;

        while (bateria >= 7) {
            bateria = bateria - 7;
            System.out.println("Minuto " + min + " -----" + bateria + "%");
            min++;
        }
    }
}