import java.text.DecimalFormat;
import java.util.Scanner;
public class examenu2{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        double pesoL=0.0, pesoN=0.0, pesoE=0.0;
        int rechazos=0, res=0, fragil=0, opc=0;
        double aceptadoL=0.0, aceptadoN=0.0, aceptadoE=0.0;
        double peso=0.0;

        System.out.println("---SISTEMA DE PAQUETES---");

        do{
            System.out.println("Ingrese el peso del paquete en kg (0 termina el programa, no se valen valores negativos)");
            peso=teclado.nextDouble();

            System.out.println("Ingrese el tipo de envio");
            System.out.println("1.- Local");
            System.out.println("2.- Nacional");
            System.out.println("1.- Express");
            opc=teclado.nextInt();
            switch (opc) {
                case 1:
                    if (peso>12){
                        aceptadoL=30+8*peso;
                    }
                    break;
                case 2:
                    if (peso>20) {
                        aceptadoN=50+12*peso;
                    }
                    break;
                case 3:
                    if (peso>5) {
                        aceptadoE=80+20*peso;
                    }
                    break;        
                default:
                    System.out.println("Invalido");
            }
            for (int i = 1; i < 3; i++) {
                System.out.println("1.- Local");
                System.out.println("2.- Nacional");
                System.out.println("3.- Express");
                System.out.println("Su paquete "+i+" es fragil?");
                System.out.println("1.- SI");
                System.out.println("2.- NO");
                res=teclado.nextInt();
                if (res==1 && i==1) {
                    aceptadoL+=25;
                    fragil+=1;
                }else if (res==2 && i==2){
                    aceptadoN+=25;
                    fragil+=1;
                }else if (res==3 && i==3){
                    aceptadoE+=25;
                    fragil+=1;
                }
            }
        }while(peso==0); 

        System.out.println("--------------");
        System.out.println("--------------");
        System.out.println("--------------");
        System.out.println("--------------");
        double tot=0;
        tot=aceptadoE+aceptadoL+aceptadoN;
        System.out.println("Resultado de paquetes: ");
        System.out.println("Reachazados: "+rechazos);
        System.out.println("Fragiles: "+fragil);
        System.out.println("El total recaudado fue de: "+df.format(tot));
    }
}