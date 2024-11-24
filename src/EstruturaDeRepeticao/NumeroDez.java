package EstruturaDeRepeticao;

import java.util.Scanner;

public class NumeroDez {
    static void exibir(String texto) {
        System.out.println(texto);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte valor = input.;

        do {
            exibir("Por favor, digite o valor 10: ");
            valor = input.nextByte();
        } while (valor != 10);

        input.close();
    }

}
