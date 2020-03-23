
package u04e01;

import java.util.Scanner;

public class U04E01 {

    public static void main(String[] args) {
        System.out.print("Ingrese area del cuadrado: ");
        Scanner entrada= new Scanner(System.in);
        double area = entrada.nextDouble();
        double lado = Math.sqrt(area);
        double perimetro = lado*4;
        System.out.println("El perimetro del cuadrado es: "+perimetro);
    }
}