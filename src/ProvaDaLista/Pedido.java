package ProvaDaLista;

import java.util.ArrayList;

class Pedido {
    private ArrayList<Item> listaDeItens = new ArrayList<>();
    private double valorTotalDoPedido = 0;

    public void adicionaItem(Item item) {
        for (Item items : listaDeItens) {
            if (items.getProduto().getId() == item.getProduto().getId()) {
                items.defineValorTotal();
                calculaValorTotal();
                return;
            }
        }
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

    public double calcularTroco(double valorPago) {
        if (valorPago < valorTotalDoPedido) {
            System.out.println("Tá faltando dinheiro!");
            return 0;
        }
        return valorPago - valorTotalDoPedido;
    }

    public double calcularNotas(double troco) {
        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        System.out.println("Troco: R$" + troco);
        for (int nota : notas) {
            int quantidadeNotas = (int) (troco / nota);
            if (quantidadeNotas > 0) {
                if (nota == 1) {
                    System.out.println("Moedas de R$" + nota + ": " + quantidadeNotas);
                } else {
                    System.out.println("Notas de R$" + nota + ": " + quantidadeNotas);
                }
                troco -= quantidadeNotas * nota;
            }
        }
        return troco;
    }

    public void imprimePedido() {
        for (Item item : listaDeItens) {
            System.out.println(item);
        }
        System.out.println("Total do Pedido: R$ " + valorTotalDoPedido);
    }
}
