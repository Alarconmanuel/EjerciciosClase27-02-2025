import java.util.Random;

public class Main {
    public static void main(String[] args) {


        int min = 1;
        int max = 50;
        int num;


        Random ale = new Random();


        num = ale.nextInt((max- min + 1)) + min;



        if (contD1 > contD2) {
            System.out.println("La suma del Dado 1 es mayor");
        } else {
            System.out.println("La suma del Dado 2 es mayor");
        }


        }
    }
