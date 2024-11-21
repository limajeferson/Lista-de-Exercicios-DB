package ExerciciosBasicos;

import java.util.Scanner;

public class DefinirIdade {
    static void exibir(String texto) {
        System.out.print(texto);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        exibir("Digite a idade: ");

        if (input.nextShort() < 18) {
            exibir("Não é maior de idade");
        } else {
            exibir("É maior de idade");
        }

        input.close();
    }
}
