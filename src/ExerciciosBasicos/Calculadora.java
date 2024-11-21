package ExerciciosBasicos;

import java.util.Scanner;

public class Calculadora {
    static void exibir(String texto) {
        System.out.println(texto);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        exibir("Digite o valor que escolha a operação que iremos realizar: ");
        exibir("1 - (+) adição");
        exibir("2 - (-) subtração");
        exibir("3 - (*) multiplicação");
//        exibir("4 - (/) divisão");

        byte operador = input.nextByte();

        exibir("Digite o valor do produto A");
        byte produtoA = input.nextByte();

        exibir("Digite o valor do produto B");
        byte produtoB = input.nextByte();

        switch (operador) {
            case 1:
                exibir("O resultado é: " + (produtoA + produtoB));
                break;
            case 2:
                exibir("O resultado é: " + (produtoA - produtoB));
                break;
            case 3:
                exibir("O resultado é: " + (produtoA * produtoB));
                break;
            case 4:
                exibir("O resultado é: " + (produtoA / produtoB));
                break;
            default:
                exibir("Operação inválida, tente novamente");
                break;
        }

        input.close();
    }
}
