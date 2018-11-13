package boletin9_3;

import java.util.Scanner;

/**
 *
 * @author aguinaldogonzalez
 */
public class Rectangulo {

    Scanner ler = new Scanner(System.in);
    private int base;
    private int altura;

    public void calcular() {

        System.out.println("Introduce Base:");
        base = ler.nextInt();

        System.out.println("Introduce Altura:");
        altura = ler.nextInt();

        if (base < 0 || altura < 0) {
            System.out.println("Introduce valor positivo");
        } else {
            System.out.println("El area del rectangulo es: " + base * altura);
        }

    }

}
