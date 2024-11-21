package ExerciciosBasicos;

import java.util.Scanner;

public class CupomFiscal {
    static void exibir(String texto) {
        System.out.println(texto);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        exibir("Digite o produto (Ex.: UVA): ");
        String nome = input.next();

        exibir("Digite o valor (Ex.: 10,50): ");
        float preco = input.nextFloat();

        exibir("Digite a quantidade (Ex.: 4): ");
        short quantidade = input.nextShort();

        float pagar = preco * quantidade;

        if (quantidade > 10 && quantidade < 21) {
            exibir(nome + ", $" + (pagar * .9) + " Dinheiros");
        } else if (quantidade > 20 && quantidade < 51) {
            exibir(nome + ", $" + (pagar * .8) + " Dinheiros");
        } else if (quantidade > 50) {
            exibir(nome + ", $" + (pagar * .75) + " Dinheiros");
        } else {
            exibir(nome + ", $" + pagar + " Dinheiros");
        }

        input.close();
    }
}
