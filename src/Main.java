import java.util.Random;

public class Main {
    public static void main(String[] args) {


        int min = 1;
        int max = 10;
        int rondas, d1, d2;
        int contD1=0;
        int contD2=0;

        Random ale = new Random();


        rondas = ale.nextInt((max- min + 1)) + min;
        System.out.println("CANTIDAD DE RONDAS: " + rondas);

        for (int i=1; i<= rondas; i++ ){
            d1 = ale.nextInt((6- 1 + 1)) + min;
            contD1 +=d1;
            d2 = ale.nextInt((6- 1 + 1)) + min;
            contD2 +=d2;

            System.out.print("");
            System.out.print("Dado 1: " + d1);

            System.out.print(" Dado 2: " +d2);
            System.out.println();

        }

        System.out.println("Suma Dado 1: " +contD1);
        System.out.println("Suma Dado 2: " +contD2);
        System.out.println();

        if (contD1 > contD2) {
            System.out.println("La suma del Dado 1 es mayor");
        } else {
            System.out.println("La suma del Dado 2 es mayor");
        }


    }
}
