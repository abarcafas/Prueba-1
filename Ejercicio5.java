import java.util.Scanner;

public class jercicio3 {
    public static void main(String[] args) {
    Scanner leedor = new Scanner(System.in);

    System.out.println("Ingrese un numero ");
    int numero = leedor.nextInt();
    int factorial=1;
    while (numero !=0 ) {
    factorial=factorial*numero; numero--;
    System.out.println(factorial);
    }

}   
}