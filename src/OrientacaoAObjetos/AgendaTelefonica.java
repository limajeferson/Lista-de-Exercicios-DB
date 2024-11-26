package OrientacaoAObjetos;

import java.util.ArrayList;
import java.util.Scanner;

public class AgendaTelefonica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


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
        this.listContato = new ArrayList<> ();
    }

    public void addContato(Scanner input) {
        exibir("Digite o nome: ");
        String nome = input.nextLine();
        exibir("Digite o telefone: ");
        String telefone = input.nextLine();

        Contato novoContato = new Contato(nome, telefone);
        listContato.add(novoContato);
        exibir("Novo contato adicionado");
    }

    public void deleteContato(Scanner input) {
        exibir("Digite o contato a ser removido: ");
        String nome = input.nextLine();

        boolean encontrado = false;
        for
    }
}

void exibir(String texto) {
    System.out.print(texto);
}