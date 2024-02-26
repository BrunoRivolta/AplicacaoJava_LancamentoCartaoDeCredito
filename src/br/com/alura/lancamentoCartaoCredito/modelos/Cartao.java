package br.com.alura.lancamentoCartaoCredito.modelos;

public class Cartao implements Separador{
	String separador = "-=-=-=-=-=-=-=-=-=-=-=-=-=-";
	private double limiteInicial = 0;
	private double limite = 0;

	public boolean subtrair(double valor) {
		if(limite < valor) {
			limiteInsuficiente(valor);
			return false;
		} else {
			limite = limite - valor;
			return true;
		}

	}

	public void adicionarLimite(double valor) {
		limite = valor;
		limiteInicial = valor;
	}

	public void limiteDisponivel() {
		System.out.printf("%nLimite Disponivel: R$ %.2f%n", limite);
		SeparadorTexto();
	}

	public void limiteInsuficiente(double valor) {
		System.out.printf("O limite disponivel do cartão de R$ %.2f é insuficiente para a compra de R$ %.2f%n", limite, valor);
	}

	public void fechamento() {
		System.out.printf("%n--------------------------%n");
		System.out.printf("Total das gasto: R$ %.2f%n", limiteInicial - limite);
		System.out.printf("Limite disponivel: R$ %.2f%n", limite);
		SeparadorTexto();
		System.out.printf("%nVolte sempre!%n");
	}

	@Override
	public void SeparadorTexto() {
		System.out.println(separador);
	}
}
