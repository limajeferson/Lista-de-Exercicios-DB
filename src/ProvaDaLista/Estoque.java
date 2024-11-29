package ProvaDaLista;

import java.util.ArrayList;

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
