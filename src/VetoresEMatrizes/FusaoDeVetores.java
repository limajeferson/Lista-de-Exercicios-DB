package VetoresEMatrizes;

public class FusaoDeVetores {
    public static void main(String[] args) {

        byte[] vetorUm = new byte[50];
        byte[] vetorDois = new byte[50];
        byte[] vetorNovo = new byte[100];

        String numeros = "";

        gerarElementos(vetorUm);
        gerarElementos(vetorDois);

        bubbleSort(vetorUm);
        bubbleSort(vetorDois);

        for (byte i = 0; i < (vetorNovo.length / 2); i++) {
            vetorNovo[i] = vetorUm[i];
            vetorNovo[i + (vetorNovo.length / 2)] = vetorDois[i];
        }

        bubbleSort(vetorNovo);

        for (byte i = 0; i < vetorNovo.length; i++) {
            numeros += (vetorNovo[i] + ", ");
        }

        System.out.print(numeros);
    }

    static void bubbleSort(byte[] vetor) {
        byte auxiliar;
        for (byte i = 0; i < vetor.length; i++) {
            for (byte j = 0; j < vetor.length - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    auxiliar = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = auxiliar;
                }
            }
        }
    }

    static void gerarElementos(byte[] vetor) {
        for (byte i = 0; i < vetor.length; i++) {
            byte numero;
            numero = (byte) ((Math.random() * 256) - 128);
            vetor[i] = numero;
        }
    }
}
