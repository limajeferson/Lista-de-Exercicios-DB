package Prova;

import java.util.ArrayList;
import java.util.Scanner;

class Produto {
    private int id;
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(int id, String nome, double preco, int quantidadeEmEstoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    @Override
    public String toString() {
        return nome + " - R$ " + preco + " - Qtd: " + quantidadeEmEstoque;
    }
}

class Item {
    private Produto produto;
    private int quantidade;
    private double valorDoItem;

    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        defineValorTotal();
    }

    public void defineValorTotal() {
        this.valorDoItem = produto.getPreco() * quantidade;
    }

    public double getValorDoItem() {
        return valorDoItem;
    }

    public Produto getProduto() {
        return produto;
    }

    @Override
    public String toString() {
        return produto.getNome() + " x " + quantidade + " = R$ " + valorDoItem;
    }
}

class Estoque {
    private ArrayList<Produto> listaDeProdutos = new ArrayList<>();
    private int id = 1;

    public void inicializaEstoque() {
        listaDeProdutos.add(new Produto(id++, "Arroz", 10.0, 100));
        listaDeProdutos.add(new Produto(id++, "Feijão", 5.0, 50));
        listaDeProdutos.add(new Produto(id++, "Macarrão", 2.5, 200));
    }

    public Produto encontraProduto(String nome) {
        for (Produto p : listaDeProdutos) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }

    public Produto encontraProduto(int id) {
        for (Produto p : listaDeProdutos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public boolean darBaixaEmEstoque(String nome, int quantidade) {
        Produto produto = encontraProduto(nome);
        if (produto != null && produto.getQuantidadeEmEstoque() >= quantidade) {
            produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque() - quantidade);
            return true;
        }
        return false;
    }

    public void imprimeCatalogoDoEstoque() {
        for (Produto p : listaDeProdutos) {
            System.out.println(p);
        }
    }

    // Getters e Setters
    public ArrayList<Produto> getListaDeProdutos() {
        return listaDeProdutos;
    }
}

class Pedido {
    private ArrayList<Item> listaDeItens = new ArrayList<>();
    private double valorTotalDoPedido = 0;

    public void adicionaItem(Item item) {
        listaDeItens.add(item);
        calculaValorTotal();
    }

    public void calculaValorTotal() {
        valorTotalDoPedido = 0;
        for (Item item : listaDeItens) {
            valorTotalDoPedido += item.getValorDoItem();
        }
    }

    public double getValorTotalDoPedido() {
        return valorTotalDoPedido;
    }

    public void imprimePedido() {
        for (Item item : listaDeItens) {
            System.out.println(item);
        }
        System.out.println("Total do Pedido: R$ " + valorTotalDoPedido);
    }
}

class Menu {
    private Estoque estoque = new Estoque();
    private Pedido pedido = new Pedido();
    private Scanner input = new Scanner(System.in);

    public void controlaMenu() {
        estoque.inicializaEstoque();
        int opcao;

        do {
            System.out.print("Digite uma opção:");
            exibir("\n1. Mostrar Estoque");
            exibir("2. Adicionar Produto ao Pedido");
            exibir("3. Imprimir Pedido");
            exibir("4. Finalizar Pedido");
            exibir("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    mostraEstoque();
                    break;
                case 2:
                    adicionarProdutoAoPedido();
                    break;
                case 3:
                    pedido.imprimePedido();
                    break;
                case 4:
                    exibir("Pedido Finalizado. Valor Total: R$ " + pedido.getValorTotalDoPedido());
                    break;
                case 5:
                    break;
                default:
                    exibir("Operação inválida, tente novamente");
            }
        } while (opcao != 5);
    }

    public void mostraEstoque() {
        estoque.imprimeCatalogoDoEstoque();
    }

    public void exibir(String texto){
        System.out.println(texto);
    }

    public void adicionarProdutoAoPedido() {
        System.out.print("Digite o nome do produto: ");
        String nomeProduto = input.nextLine();
        Produto produto = estoque.encontraProduto(nomeProduto);

        if (produto != null) {
            System.out.print("Digite a quantidade: ");
            int quantidade = input.nextInt();
            input.nextLine();

            if (estoque.darBaixaEmEstoque(nomeProduto, quantidade)) {
                Item item = new Item(produto, quantidade);
                pedido.adicionaItem(item);
                System.out.println("Produto adicionado ao pedido!");
            } else {
                System.out.println("Estoque insuficiente!");
            }
        } else {
            System.out.println("Produto não encontrado!");
        }
    }
}

public class SuperMercadoProva {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.controlaMenu();
    }
}
