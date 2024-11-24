package VetoresEMatrizes;

import java.util.Arrays;
import java.util.Scanner;

public class SomaDiagonal {
    static void exibir(String texto) {
        System.out.print(texto);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        exibir("Vamos criar uma Matriz de elementos decimais aleatórios" +
                "\nDigite o tamanho para a Matriz: ");

        byte tamanho = input.nextByte();

        byte[][] matriz = new byte[tamanho][tamanho];
        byte numero;
        int soma = 0;

        for (byte row = 0; row < matriz.length; row++) {
            for (byte column = 0; column < matriz[row].length; column++) {
                numero = (byte) ((Math.random() * 199) - 99);
                matriz[row][column] = numero;
            }
        }

        for (byte row = 0; row < matriz.length; row++) {
            for (byte column = 0; column < matriz[row].length; column++) {
                exibir(matriz[row][column] + ", ");
            }
            exibir("\n");
        }

        for (byte rowColumn = 0; rowColumn < matriz.length; rowColumn++) {
            soma += matriz[rowColumn][rowColumn];
        }

        exibir("A soma da diagonal principal é: " + soma);

        input.close();
    }
}
