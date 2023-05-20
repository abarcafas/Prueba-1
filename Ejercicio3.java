import java.util.Scanner;
import java.lang.Math;
public class jercicio3 {
    public static void main(String[] args) {
         Scanner leedor = new Scanner(System.in);

         System.out.println("Ingrese el radio ");
         int radio = leedor.nextInt();
        //esto..
         double pi=(Math.PI);
         //abajo de este comentario esta como parsear valores
          double parsear = (double) Math.pow(radio,2);
           System.out.println("parsear " +pi);
           
           double area= (pi*parsear);
            System.out.println("resultado " +area);

        //esto es lo msimo que el int de arriba 
        // int pi=(Math.PI);
        // int elevacion= Math.pow(radio,2);
        //  int area= (pi*elevacion);
        //    System.out.println("el resultado es:" +area);
        double perimetro=(2*pi*radio);
           System.out.println("resultado " +perimetro);
    }
}