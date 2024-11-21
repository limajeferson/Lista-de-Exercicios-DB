package ExerciciosBasicos;

import java.util.Scanner;

public class Jokenpo {
    static void exibir(String texto) {
        System.out.println(texto);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maquina = (int) (Math.random() * 3);

        exibir("Escolha entre pedra, papel ou tesoura: ");
        String opcao = input.next().toUpperCase();

        switch (opcao) {
            case "PEDRA":
                if (maquina == 0) {
                    exibir("Pedra empata com pedra!");
                } else if (maquina == 1) {
                    exibir("Pedra perde para papel!");
                } else {
                exibir("Pedra vence tesoura!");
            }
            break;
            case "PAPEL":
                if (maquina == 0) {
                    exibir("Papel vence pedra!");
                } else if (maquina == 1) {
                    exibir("Papel empata com papel!");
                } else {
                exibir("Papel perde para tesoura!");
            }
            break;
            case "TESOURA":
                if (maquina == 0) {
                    exibir("Tesoura perde para pedra!");
                } else if (maquina == 1) {
                    exibir("Tesoura vence papel!");
                } else {
                exibir("Tesoura empata com tesoura!");
            }
            break;
            default:
                exibir("Você não sabe brincar :(");
        }

        input.close();
    }
}

