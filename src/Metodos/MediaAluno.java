package Metodos;

import java.util.Arrays;
import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        byte bimestre = 0;

        byte[] notasMatematica = new byte[4];

        do {
            System.out.println("Qual a nota no bimestre " + (bimestre + 1) + "?");
            switch (bimestre) {
                case 0, 1, 2, 3:
                    notasMatematica[bimestre] = input.nextByte();
                    break;
                default:
                    break;
            }
            bimestre++;
        } while (bimestre < 4);
        System.out.println("\nO aluno está " + situacao(media(notasMatematica)));

        input.close();
    }

    static float media(byte[] notas) {
        float notaAnual = 0;
        for (byte i = 0; i < notas.length; i++) {
            notaAnual += notas[i];
        }

        return (notaAnual / notas.length);
    }

    static String situacao(float resultado) {
        String estatus = (resultado > 6) ? "Aprovado"
                : (resultado < 4) ? "Reprovado"
                : "em Verificacao Suplementar";

        return estatus;
    }
}
