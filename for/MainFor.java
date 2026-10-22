import java.text.DecimalFormat;
import java.util.Scanner;
public class MainFor{
    public static void main(String[]args) throws Exception{
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        double puntos=0;
        double acum=0;
        int puntosmax=0;
        int puntosmin=0;
        double prom=0;
        for(int i=1; i<8; i++){
            System.out.println("ESta es la partida "+i);
            System.out.print("Ingrese su puntuacion: ");
            puntos = teclado.nextDouble();
            acum+=puntos;
            if (puntos>1000) {
                puntosmax+=1;
            }else{
                puntosmin+=1;
            }
        }
        prom=acum/7;
        System.out.println("Sus puntos acumulados son: "+acum);
        System.out.println("El promedio de puntuacion es: "+df.format(prom));
        System.out.println("Las partidas con mas de 1000 puntos fueron: "+puntosmax);
        System.out.println("Las partidas con menos de 1000 puntos fueron: "+puntosmin);
    }
}