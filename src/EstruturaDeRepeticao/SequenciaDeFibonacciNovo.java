package EstruturaDeRepeticao;

import java.util.ArrayList;
import java.util.Scanner;

public class SequenciaDeFibonacciNovo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número inteiro, não negativo: ");

        byte numero = input.nextByte();
        ArrayList<Integer> lista = new ArrayList<>();

        byte valor = 0;
        byte count = 0;

        do {
            if (count == 1 || count == 0) {
                lista.add((int) count);
            } else {
                valor = (byte) (lista.get(count - 1) + lista.get(count - 2));
                if (valor <= numero ){
                    lista.add((int) valor);
                }
            }
            count++;
        } while (valor < numero);

        System.out.print((lista));

        input.close();
    }
}
