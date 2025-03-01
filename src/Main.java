import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int min=1, max= 100, num1, num2, continuar, respuesta;
        double respuesta2;
        String operacion;

        Scanner teclado = new Scanner(System.in);
        Random ale = new Random();
        num1 = ale.nextInt((max- min + 1)) + min;
        num2 = ale.nextInt((max- min + 1)) + min;
        System.out.println("El primer número generado es: "+num1);
        System.out.println("El segundo número generado es: "+num2);


        System.out.println("CALCULADORA");
        do {
            System.out.print("Operaciones: +, -, *, /, ^, %: ");
            operacion = teclado.next();

            switch (operacion) {
              case "+" -> {
                  respuesta = num1+num2;
                System.out.println("La suma de "+num1+" y "+num2+" es: "+respuesta);
              }
              case "-" ->  {
                  respuesta = num1-num2;
                System.out.println("La resta de "+num1+" y "+num2+" es: "+respuesta);
              }
              case "*" ->  {
                  respuesta = num1*num2;
                System.out.println("La multiplicación entre "+num1+" y "+num2+" es: "+respuesta);
              }
              case "/" ->  {
                  respuesta2 = (double)num1/num2;
                System.out.println("La división entre "+num1+" y "+num2+" es: "+respuesta2);
              }
              case "^" ->  {
                  respuesta2 = Math.pow(num1,num2);
                System.out.println(num1 +" elevado a "+num2+" es: "+respuesta2);
              }
              case "%" -> {
                  respuesta = num1%num2;
                  System.out.println("El residuo entre "+num1+" y "+num2+" es: "+respuesta);
              }
                default ->
                    System.out.println("Escoja una opción válida");
            }

            System.out.println("Si desea hacer otra operacion oprima 1 de lo contrario oprima 2");
            continuar = teclado.nextInt();
        } while(continuar==1);
        System.out.println("Fin");
    }
}
