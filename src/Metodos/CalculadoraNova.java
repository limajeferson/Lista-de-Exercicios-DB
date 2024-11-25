package Metodos;

import java.util.Scanner;

public class CalculadoraNova {
    static void exibir(String texto) {
        System.out.println(texto);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        display();
        byte operador = input.nextByte();

        exibir("Digite o valor do produto A");
        float produtoA = input.nextFloat();

        exibir("Digite o valor do produto B");
        float produtoB = input.nextFloat();

        switch (operador) {
            case 1:
                exibir("O resultado é: " + adicao(produtoA, produtoB));
                break;
            case 2:
                exibir("O resultado é: " + subtracao(produtoA, produtoB));
                break;
            case 3:
                exibir("O resultado é: " + multiplicacao(produtoA, produtoB));
                break;
            case 4:
                exibir("O resultado é: " + divisao(produtoA, produtoB));
                break;
            case 5:
                exibir("O resultado é: " + potencia(produtoA, produtoB));
                break;
            default:
                exibir("Operação inválida, tente novamente");
                break;
        }

        input.close();
    }

    static void display() {
        exibir("Digite o valor que escolha a operação que iremos realizar: ");
        exibir("1 - (+) adição");
        exibir("2 - (-) subtração");
        exibir("3 - (*) multiplicação");
        exibir("4 - (/) divisão");
        exibir("5 - (^) potencia");
    }

    static float adicao(float prodA, float prodB) {
        return (float) (prodA + prodB);
    }

    static float subtracao(float prodA, float prodB) {
        return (float) (prodA - prodB);
    }

    static float multiplicacao(float prodA, float prodB) {
        return (float) (prodA * prodB);
    }

    static float divisao(float prodA, float prodB) {
        return (float) (prodA / prodB);
    }

    static float potencia(float prodA, float prodB) {
        return (float) Math.pow(prodA, prodB);
    }
}
