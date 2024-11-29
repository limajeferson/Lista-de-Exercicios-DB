package ProvaDaLista;

import java.util.ArrayList;

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
