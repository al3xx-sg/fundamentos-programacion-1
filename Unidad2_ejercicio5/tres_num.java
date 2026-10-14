public class tres_num {
        public static void main(String [] args){
        int a, b, c;
        a=0;
        b=10;
        c=1;

        if(a==0 || b==0 || c==0){
            System.out.println("No se admiten 0");
        }else if( a>b && a>c){
            System.out.println(" El mayor es: "+a);
        }else if(b>a && b>c){
            System.out.println("El mayor es b"+b);
        }else{
            System.out.println("El mayor es c"+c);
        }
    }
}