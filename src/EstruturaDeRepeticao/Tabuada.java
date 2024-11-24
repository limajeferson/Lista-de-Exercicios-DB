package EstruturaDeRepeticao;

import java.util.Scanner;

public class Tabuada {
    static void exibir(String texto) {
        System.out.print(texto);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        exibir("Digite um valor de 1 a 10: ");
        byte produto = input.nextByte();
        byte count = 10;

        for (byte i = 1; i <= count; i++) {
            exibir(produto + " + " + i + " = " + (produto + i) + " | ");
            exibir(produto + " - " + i + " = " + (produto - i) + " | ");
            exibir(produto + " x " + i + " = " + (produto * i) + " | ");
            exibir(produto + " ÷ " + i + " = " + (produto / i) + " \n");
        }

        input.close();
    }
}
