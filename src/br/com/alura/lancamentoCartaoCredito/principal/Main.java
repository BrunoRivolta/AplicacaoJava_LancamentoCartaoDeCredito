package br.com.alura.lancamentoCartaoCredito.principal;

import br.com.alura.lancamentoCartaoCredito.modelos.*;

public class Main {
	public static void main(String[] args) {
		CaputaEntrada capturaTeclado = new CaputaEntrada();
		Menus menu = new Menus();
		Cartao cartaoDeCredito = new Cartao();
		Loja lojinha = new Loja();

		menu.exibeInicio();
		double limite = capturaTeclado.setValorDigitadoDouble();
		cartaoDeCredito.adicionarLimite(limite);

		menu.mensagemLoja();
		boolean repetirCompra = true;

		while (repetirCompra) {
			System.out.println("Digite o nome do produto:");
			String produtoNome = capturaTeclado.setValorDigitadoString();

			System.out.println("Digite o valor do produto:");
			double produtoValor = capturaTeclado.setValorDigitadoDouble();

			Produto prod = new Produto(produtoNome, produtoValor);
			boolean valida = cartaoDeCredito.subtrair(produtoValor);

			if(valida) {
				lojinha.adicionaProdutoCarrinho(prod);
			}

			cartaoDeCredito.limiteDisponivel();

			System.out.println("Digite 1 para continuar comprando ou 0 para sair.");
			int escolha = capturaTeclado.setValorDigitadoInt();

			if(escolha == 0) {
				repetirCompra = false;
			}
		}

		lojinha.exibeCarrinho();

		cartaoDeCredito.fechamento();
	}
}
