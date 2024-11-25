package OrientacaoAObjetos;

import java.util.ArrayList;

import static OrientacaoAObjetos.EmprestimoLivro.exibir;
/*
 * * OBSERVAÇÃO, analisar antes de apresentar
 * * Entendi porque tive que fazer essa importação,
 * * mas não entendi porque o METODO exibir quebra o código fora do main
 * */

public class EmprestimoLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Sonho Grande", "Cristiane Correa");
        Livro livro2 = new Livro("O Segredo", "Rhonda Byrne");
        Livro livro3 = new Livro("O Guia do Mochileiro das Galáxias", "Douglas Adams");

        Pessoa pessoa1 = new Pessoa("Primeiro Cliente", "00000000000");
        Pessoa pessoa2 = new Pessoa("Segundo Cliente", "00000000001");

        ArrayList<Livro> dados = new ArrayList<>();
        dados.add(livro1);
        dados.add(livro2);
        dados.add(livro3);

        Emprestimo emprestimo1 = new Emprestimo(pessoa1, livro1);
        emprestimo1.fazerEmprestimo();

        Emprestimo emprestimo2 = new Emprestimo(pessoa2, livro2);
        emprestimo2.fazerEmprestimo();

        Emprestimo emprestimo3 = new Emprestimo(pessoa2, livro1);
        emprestimo3.fazerEmprestimo();

        emprestimo1.devolverLivro();
        emprestimo3.fazerEmprestimo();

    }

    static void exibir(String texto) {
        System.out.println(texto);
    }
}

class Pessoa {
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}

class Livro {
    private String titulo;
    private String autor;
    private boolean emprestado;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", emprestado=" + emprestado +
                '}';
    }
}

class Emprestimo {
    private Pessoa pessoa;
    private Livro livro;

    public Emprestimo(Pessoa pessoa, Livro livro) {
        this.pessoa = pessoa;
        this.livro = livro;
    }

    public boolean fazerEmprestimo() {
        if (!livro.isEmprestado()) {
            livro.setEmprestado(true);
            exibir(pessoa.getNome() + " emprestou o livro: " + livro.getTitulo());
            return true;
        } else {
            exibir("O livro " + livro.getTitulo() + " já está emprestado.");
            return false;
        }
    }

    public void devolverLivro() {
        if (livro.isEmprestado()) {
            livro.setEmprestado(false);
            exibir(pessoa.getNome() + " devolveu o livro " + livro.getTitulo());
        } else {
            exibir("O livro " + livro.getTitulo() + " já está disponível.");
        }
    }
}
