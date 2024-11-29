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
            System.out.print("\nEscolha uma das opções:");
            exibir("\n1. Mostrar Estoque");
            exibir("2. Adicionar Produto ao Pedido");
            exibir("3. Imprimir Pedido");
            exibir("4. Calcular troco");
            exibir("5. Finalizar Pedido");
            exibir("6. Sair");
            System.out.print("Opção: ");
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
                    calcularTroco();
                    break;
                case 5:
                    exibir("Pedido Finalizado. Valor Total: R$" + pedido.getValorTotalDoPedido());
                    break;
                case 6:
                    exibir("Muito obrigado e Volte Sempre!");
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
                exibir("Produto adicionado ao pedido!");
            } else {
                exibir("Estoque insuficiente!");
            }
        } else {
            exibir("Produto não encontrado!");
        }
    }

    public void calcularTroco() {
        System.out.print("Digite o valor pago: R$");
        double valorPago = input.nextDouble();
        double troco = pedido.calcularTroco(valorPago);

        if (troco > 0) {
            exibir("Troco a ser devolvido: R$");
        }
    }
}
