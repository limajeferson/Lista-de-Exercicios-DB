package EstruturaDeRepeticao;

import java.util.Arrays;
import java.util.Scanner;

public class SequenciaDeFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número inteiro, não negativo: ");

        byte count = input.nextByte();
        int[] lista = new int[count + 1];

        for (byte i = 0; i <= count; i++) {
            if (i == 1 || i == 0) {
                lista[i] = i;
            } else {
                lista[i] = lista[i - 1] + lista[i - 2];
            }
        }

        System.out.print(Arrays.toString(lista));

        input.close();
    }
}
