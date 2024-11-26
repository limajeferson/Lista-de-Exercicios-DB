package OrientacaoAObjetos;

import java.util.ArrayList;
import java.util.Scanner;

public class AgendaTelefonica {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dados dados = new Dados();

        byte opcao;

        do {
            System.out.print("Digite uma opção: ");
            exibir("\n1. Adicionar Contato");
            exibir("2. Remover Contato");
            exibir("3. Buscar um Contato");
            exibir("4. Lista de Contatos");
            exibir("5. Sair");

            opcao = input.nextByte();
            input.nextLine();

            switch (opcao) {
                case (byte) 1:
                    dados.addContato(input);
                    break;
                case (byte) 2:
                    dados.deleteContato(input);
                    break;
                case (byte) 3:
                    dados.find(input);
                    break;
                case (byte) 4:
                    dados.listar();
                    break;
                case (byte) 5:
                    break;
                default:
                    exibir("Operação inválida, tente novamente");
            }
        } while (opcao != 5);

        input.close();

    }

    static void exibir(String texto) {
        System.out.println(texto);
    }
}

class Contato {
    private String nome;
    private String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}

class Dados {
    private ArrayList<Contato> listContato;

    public Dados() {
        this.listContato = new ArrayList<>();
    }

    public void addContato(Scanner input) {
        exibir("Digite o nome: ");
        String nome = input.nextLine();
        exibir("Digite o telefone: ");
        String telefone = input.nextLine();

        Contato novoContato = new Contato(nome, telefone);
        listContato.add(novoContato);
        exibir("\nNovo contato adicionado\n");
    }

    public void deleteContato(Scanner input) {
        exibir("Digite o contato a ser removido: ");
        String info = input.nextLine();

        boolean encontrado = false;
        for (Contato contato : listContato) {
            if (contato.getNome().equalsIgnoreCase(info) || contato.getTelefone().equals(info)) {
                listContato.remove(contato);
                exibir("Contato removido");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            exibir("\nContato não encontrado.\n");
        }
    }

    public void find(Scanner input) {
        exibir("Digite o nome ou telefone do contato: ");
        String info = input.nextLine();

        boolean encontrado = false;

        for (Contato contato : listContato) {
            if (contato.getNome().equalsIgnoreCase(info) || contato.getTelefone().equals(info)) {
                exibir("Contato: " + contato);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            exibir("\nContato não encontrado.\n");
        }
    }

    public void listar() {
        if (listContato.isEmpty()) {
            exibir("Agenda vazia.");
        } else {
            exibir("Lista de contatos: ");
            for (Contato contato : listContato) exibir(contato.toString() + "\n");
        }
    }

    public void exibir(String texto) {
        System.out.println(texto);
    }

}