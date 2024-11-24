package EstruturaDeRepeticao;

import java.util.Arrays;

public class GeradorNumerico {
    public static void main(String[] args) {
        int numero;
        int[] arrayDeNumeros = new int[10];

        String numeros = "";
        String maior;
        String menor;

        for (byte i = 0; i < arrayDeNumeros.length; i++) {
            numero = (int) (Math.random() * 101);
            arrayDeNumeros[i] = numero;
        }

        Arrays.sort(arrayDeNumeros);

        for (byte i = 0; i < arrayDeNumeros.length; i++) {
            numeros += (arrayDeNumeros[i] + ", ");
        }

        menor = String.valueOf(arrayDeNumeros[0]);
        maior = String.valueOf(arrayDeNumeros[arrayDeNumeros.length - 1]);

        System.out.print("Os números são: " + numeros + "o maior é: " + maior + " e o menor é: " + menor);
    }
}
