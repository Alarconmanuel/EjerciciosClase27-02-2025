import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int min = 1;
        int max = 3;
        int num, dinero ;
        int respuesta = 1;


        Random ale = new Random();


        Scanner teclado = new Scanner(System.in);
        num = ale.nextInt((max - min + 1)) + min;
        System.out.print("Ingresa la cantidad de dinero que desees apostar: ");
        dinero = teclado.nextInt();


        do {
            if (num==1) {
                dinero *= 2;
                System.out.println("Duplicaste tu dinero");
                System.out.println("Si Quieres seguir jugando oprime 1 de lo contario 2");
                respuesta = teclado.nextInt();
            } else if (num==2) {
                dinero /= 2;
                System.out.println("Perdiste la mitad de tu dinero");
                System.out.println("Si Quieres seguir jugando oprime 1 de lo contario 2");
                respuesta = teclado.nextInt();
            } else {
                dinero *=0;
                System.out.println("Perdiste tu dinero");
            }
        } while (respuesta==1);
         System.out.println("Te retiraste del juego tu dinero actual es: " +dinero);
        }

    }

