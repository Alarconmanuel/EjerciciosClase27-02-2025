import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double peso, estatura, imc;


        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el peso de la persona en Kg");
        peso = teclado.nextDouble();

        System.out.println("Ingrese la estatura de la persona en metros");
        estatura = teclado.nextDouble();
        imc = peso/(estatura * estatura);
        System.out.println("Tu IMC es: "+imc);

        if (imc < 18.5){
            System.out.println("Bajo peso");
        }





        System.out.println("Perdiste el numero era: " );

    }
}
