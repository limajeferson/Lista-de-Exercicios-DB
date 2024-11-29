package ProvaDaLista;

import java.util.Scanner;

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

    public void exibir(String texto) {
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
