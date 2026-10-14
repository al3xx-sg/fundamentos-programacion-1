import java.util.Scanner;

public class tres_num {
        public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);    
        System.out.println("--Bienvenidos a MOTEL LAS BOLAS--");
        System.out.println("Ingrese el numero de piso en el que se encuentre");
        int piso0= teclado.nextInt();

        System.out.println("Ingrese el numero de piso al que desea ir");
        int pisof= teclado.nextInt();
        
        if(piso0==0 || pisof==0 ){
            System.out.println("No se admite el piso 0");
        }else if(piso0<=pisof){
            while (piso0<=pisof) { 
            System.out.println(piso0);
            System.out.println("Usted esta subiendo el piso ");
            piso0+=1;
            }
        }else if(piso0>=pisof){
            while (piso0>=pisof) { 
            System.out.println(piso0);
            System.out.println("Usted esta bajando el piso ");
            piso0--;
        }    }   
        System.out.println("Usted ah llegado a su destino (piso):"+pisof);
    }
}