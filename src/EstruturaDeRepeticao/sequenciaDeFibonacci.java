package EstruturaDeRepeticao;

import java.util.Scanner;

public class sequenciaDeFibonacci {
    static void exibir (String texto) {
        System.out.println(texto);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        exibir("Digite um número inteiro, não negativo: ");

        byte count = input.nextByte();
    }
}
