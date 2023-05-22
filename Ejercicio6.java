import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leedor = new Scanner(System.in);
        
        System.out.println("Ingrese un numero para hacer la tabla");
        int numero=leedor.nextInt();

        System.out.println("Tabla de Multiplicar del:" +numero);
        for  (int i = 1; i <=10; i++){
            int resultado=numero*i;
            System.out.println("resultado es:" +resultado);
        }
    }
}