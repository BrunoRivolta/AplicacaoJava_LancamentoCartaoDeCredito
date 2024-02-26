package br.com.alura.lancamentoCartaoCredito.modelos;
import java.util.Scanner;

public class CaputaEntrada implements Separador{
	Scanner leituraDouble = new Scanner(System.in);
	Scanner leituraString = new Scanner(System.in);
	Scanner leituraInt = new Scanner(System.in);
	private String valorDigitadoString;
	private int valorDigitadoInt;
	private double valorDigitadoDouble;
	String separador = "-=-=-=-=-=-=-=-=-=-=-=-=-=-";

	public String setValorDigitadoString() {
		this.valorDigitadoString = leituraString.nextLine();
		System.out.println(separador);
		return valorDigitadoString;
	}

	public int setValorDigitadoInt() {
		this.valorDigitadoInt = leituraInt.nextInt();
		SeparadorTexto();
		return valorDigitadoInt;
	}

	public double setValorDigitadoDouble() {
		this.valorDigitadoDouble = leituraDouble.nextDouble();
		System.out.println(separador);
		return valorDigitadoDouble;
	}

	@Override
	public void SeparadorTexto() {
		System.out.println(separador);
	}
}
