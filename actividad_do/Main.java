import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
                Scanner teclado = new Scanner(System.in);
                int opc;
                int puntitos = 100;
                do{
                    System.out.println("1.- Ganar 20 puntos");
                    System.out.println("2.- Gastar 15 puntos");
                    System.out.println("3.- Consultar puntos");
                    System.out.println("4.- Salir");
                    System.out.println("Inresa una opcion");
                    opc=teclado.nextInt();
                    switch (opc) {
                        case 1:
                            puntitos+=20;
                            System.out.println("Has ganado 20 puntos !!");
                            break;
                        case 2:
                            puntitos-=15;
                            System.out.println("15 puntos gastados");
                            break;
                        case 3:
                            System.out.println("Sus puntos son :"+puntitos);
                            break;
                        default:
                            System.out.println("Opcion invalida");
                    }
                }while(opc!=4);
    }
}