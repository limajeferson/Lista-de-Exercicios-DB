package ProvaDaLista;

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

    public int getQuantidade() {
        return quantidade;
    } // preciso adicionar 29/11

    @Override
    public String toString() {
        return produto.getNome() + " x " + quantidade + " = R$" + valorDoItem;
    }

}
