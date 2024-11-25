package OrientacaoAObjetos;

public class ArvoreGenealogica {
    public static void main(String[] args) {
        Pessoas pessoa1 = new Pessoas("Oãda", (short)70, null, null);
        Pessoas pessoa2 = new Pessoas("Ave", (short)45, null, null);
        Pessoas pessoa3 = new Pessoas("Miac", (short)21, pessoa1, pessoa2);
        Pessoas pessoa4 = new Pessoas("Leba", (short)19, pessoa1, pessoa2);
        Pessoas pessoa5 = new Pessoas("Filho 1", (short)1, pessoa4, null);
        Pessoas pessoa6 = new Pessoas("Filho 2", (short)2, null, pessoa2);

        pessoa1.exibicao();
        pessoa2.exibicao();
        pessoa3.exibicao();
        pessoa4.exibicao();
        pessoa5.exibicao();
        pessoa6.exibicao();
    }
}

class Pessoas {
    private String nome;
    private short idade;
    private Pessoas pai;
    private Pessoas mae;

    public Pessoas(String nome, short idade, Pessoas pai, Pessoas mae) {
        this.nome = nome;
        this.idade = idade;
        this.pai = pai;
        this.mae = mae;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public short getIdade() {
        return idade;
    }

    public void setIdade(short idade) {
        this.idade = idade;
    }

    public Pessoas getPai() {
        return pai;
    }

    public void setPai(Pessoas pai) {
        this.pai = pai;
    }

    public Pessoas getMae() {
        return mae;
    }

    public void setMae(Pessoas mae) {
        this.mae = mae;
    }

    void exibicao() {
        System.out.print(nome + " tem " + idade + " anos, ");
        if (pai != null || mae != null) {
            System.out.print("filho de ");
            if (pai != null) {
                System.out.print(pai.getNome());
                if (mae != null) {
                    System.out.print(" e de ");
                } else {
                    System.out.print("!\n");
                }
            }
            if (mae != null) {
                System.out.print(mae.getNome() + "!\n");
            }
        } else {
            System.out.print("e é filho do Criador!\n");
        }
    }

}
