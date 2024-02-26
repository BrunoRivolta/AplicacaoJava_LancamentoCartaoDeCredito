package br.com.alura.lancamentoCartaoCredito.modelos;

import java.util.ArrayList;
import java.util.Collections;

public class Loja{
	ArrayList<Produto> listaDeCompra = new ArrayList<>();

	public void adicionaProdutoCarrinho(Produto produto) {
		listaDeCompra.add(produto);
		System.out.printf("Produto %s adicionado ao Carrinho.%n", produto.getNome());
	}

	public void exibeCarrinho() {
		Collections.sort(listaDeCompra);
		System.out.printf("-= Carrinho de compras =- %n%n");
		for (int i = 0; i < listaDeCompra.size(); i++) {
			System.out.printf(" %s   R$ %.2f%n", listaDeCompra.get(i).getNome(), listaDeCompra.get(i).getValor());
		}
	}
}
