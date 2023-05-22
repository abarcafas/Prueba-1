import java.util.Scanner;
public class jercicio3 {
     public static void main(String[] args){
       Scanner leedor = new Scanner(System.in);

        System.out.println("Ingrese los valores que quiere sumar");
        int valor1=leedor.nextInt();
        int valor2=leedor.nextInt();
        int suma=valor1+valor2;
          System.out.println("El resultado de:" +valor1 +" mas " +valor2 +" es: " +suma);
        
        System.out.println("Ingrese los valores que quiere restar");
        int valor3=leedor.nextInt();
        int valor4=leedor.nextInt();
        int resta=valor3-valor4;
        System.out.println("El resultado de:" +valor3 +" menos " +valor4 +" es: " +resta);

         System.out.println("Ingrese los valores que quiere multiplicar");
        int valor5=leedor.nextInt();
        int valor6=leedor.nextInt();
        int Multiplicar=valor5*valor6;
        System.out.println("El resultado de:" +valor5 +" multipicado por " +valor6 +" es: " +Multiplicar);

    }
}
