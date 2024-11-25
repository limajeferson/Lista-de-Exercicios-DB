package Metodos;

import java.util.Scanner;

public class ConversorDeTempo {
    public static void main(String[] args) {

        System.out.println("Digite um valor em segundos: ");

        System.out.print(escrita());
    }

    static void info(String texto) {
        System.out.println(texto);
    }

    static int leitura() {
        Scanner input = new Scanner(System.in);

        int dados = input.nextInt();

        input.close();

        return (dados);
    }


    static String escrita() {
        int segundos = leitura();

        String mensagem = (segundos < 60) ?
                segundos + " segundos equivalem a "
                        + emSegundos(segundos) : (segundos < 3600) ?
                segundos + " segundos equivalem a "
                        + emMinutos(segundos) :
                segundos + " segundos equivalem a "
                        + emHoras(segundos);

        return mensagem;
    }

    static String emSegundos(int tempo) {
        return ("0h"
                + "0min"
                + tempo + "seg");
    }

    static String emMinutos(int tempo) {
        return ("0h"
                + (tempo / 60) + "min"
                + (tempo % 60) + "seg");
    }

    static String emHoras(int tempo) {
        return ((tempo / 3600) + "h"
                + ((tempo % 3600) / 60) + "min"
                + ((tempo % 3600) % 60) + "seg");
    }
}
