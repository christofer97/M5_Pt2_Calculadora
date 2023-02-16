package m5_pt2_calculadora_mjc;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class M5_Pt2_Calculadora_MJC {

    public static void main(String[] args) {

        double res = 0;
        String operacion;

        do {

            double n1 = Metodos.introduceNumeros();

            operacion = Metodos.introduceOperacion();

            double n2 = Metodos.introduceNumeros();

            res = Metodos.calculos(n1, n2, operacion);

            System.out.println("(" + n1 + ") " + operacion + " (" + n2 + ")" + " = " + res);

            operacion = Metodos.continuarPrograma();
        } while (operacion.equals("s") || operacion.equals("S"));

    }
}
