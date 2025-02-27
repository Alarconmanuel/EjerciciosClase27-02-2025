import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int min = 1;
        int max = 50;
        int num;
        int intentos = 3;


        Random ale = new Random();


        num = ale.nextInt((max - min + 1)) + min;
        System.out.println("Intenta adivinar el numero de 1 a 50 en 3 intentos");

        int op;
        Scanner teclado = new Scanner(System.in);


        for (int i = 1; i <= intentos; i++){
            System.out.println("Ingrese un numero: ");
            op = teclado.nextInt();

            if (op > num) {
                System.out.println("El numero a adivinar es menor");
            } else if (op < num) {
                System.out.println("El numero a adivinar es mayor");
            } else {
                System.out.println("Felicitaciones adivinaste el numero");
            }

        }

        System.out.println("Perdiste el numero era: " + num);

    }
}
