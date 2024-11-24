package VetoresEMatrizes;

public class BubbleSort {
    public static void main(String[] args) {
        byte numero;
        byte[] vetorDeCemNumeros = new byte[100];

        String numeros = "";
        byte auxiliar = 0;

        for (byte i = 0; i < vetorDeCemNumeros.length; i++) {
            numero = (byte) ((Math.random() * 256) - 128);
            vetorDeCemNumeros[i] = numero;
        }

        for (byte i = 0; i < vetorDeCemNumeros.length; i++) {
            for (byte j = 0; j < vetorDeCemNumeros.length - 1; j++) {
                if (vetorDeCemNumeros[j] > vetorDeCemNumeros[j + 1]) {
                    auxiliar = vetorDeCemNumeros[j];
                    vetorDeCemNumeros[j] = vetorDeCemNumeros[j + 1];
                    vetorDeCemNumeros[j + 1] = auxiliar;
                }
            }
        }

        for (byte i = 0; i < vetorDeCemNumeros.length; i++) {
            numeros += (vetorDeCemNumeros[i] + ", ");
        }

        System.out.print(numeros);

        /*
         * Fonte: https://www.devmedia.com.br/entendendo-o-algoritmo-bubble-sort-em-java/24812
         * */

    }
}
