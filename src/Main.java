import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double peso, estatura, imc;


        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el peso de la persona en Kg: ");
        peso = teclado.nextDouble();

        System.out.print("Ingrese la estatura de la persona en metros: ");
        estatura = teclado.nextDouble();
        imc = peso/(estatura * estatura);
        System.out.println("Tu IMC es: "+imc);

        if (imc < 18.5){
            System.out.println("Bajo peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("peso normal");
        } else if (imc >= 25 && imc <=26.9 ) {
            System.out.println("Sobrepeso grado I");
        } else if (imc >= 27 && imc <=29.9){
            System.out.println("Sobrepeso grado II");
        } else if (imc >= 30 && imc <=34.9 ) {
            System.out.println("Obesidad tipo I");
        } else if (imc >= 35 && imc <=39.9 ) {
            System.out.println("Obesidad tipo II");
        } else if (imc >= 40 && imc <=49.9 ) {
            System.out.println("Obesidad tipo III (mórbida)");
        } else {
            System.out.println("Obesidad tipo IV (extrema)");
        }


    }
}
