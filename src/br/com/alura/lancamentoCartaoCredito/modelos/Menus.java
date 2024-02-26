package br.com.alura.lancamentoCartaoCredito.modelos;

public class Menus implements Separador{
	String separador = "-=-=-=-=-=-=-=-=-=-=-=-=-=-";
	public void exibeInicio() {
		SeparadorTexto();
		System.out.println("Seja bem vindo ao aplicativo de Lançamento de Gastos no Cartão de Crédito");
		System.out.println("Digite o valor do seu limite: ");
	}

	public void mensagemLoja() {
		System.out.println("Nossa loja esta aberta, aproveite as Promoções!");
	}

	@Override
	public void SeparadorTexto() {
		System.out.println(separador);
	}
}
