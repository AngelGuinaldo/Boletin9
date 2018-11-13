package boletin9_1;

import java.util.Scanner;

/**
 *
 * @author aguinaldogonzalez
 */
public class Numeros {

    Scanner ler = new Scanner(System.in);
    private int numero;
//    private int negativos;
//    private int positivos;
//    private int ceros;

    public void ingresarNumeros() {
        int cont;
        int contneg = 0;
        int contpos = 0;
        int contcer = 0;

        for (cont = 0; cont < 10; cont++) {
            System.out.println("Introduce un numero");
            numero = ler.nextInt();
            if (numero < 0) {
                contneg = ++contneg;
            } else if (numero == 0) {
                contcer = ++contcer;
            } else {
                contpos = ++contpos;
            }
        }
            System.out.println("En el grupo de 10 numeros hay:\n" + contneg + " Negativos\n" + contcer + " Ceros\n" + contpos + " Positivos");


    }
}
