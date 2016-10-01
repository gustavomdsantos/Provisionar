package view;

import java.security.ProviderException;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

import controller.ProvisionarController;
import controller.ProvisionarException;
import model.FrequenciaJuros;
import model.Query;
import model.TipoJuros;

public class Provisionar {

	private static Scanner stdin = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("================================================\n"
						 + "|| Calculadora de Juros (protótipo funcional) ||\n"
						 + "================================================\n");

		double valorInicial = obterValorASerCorrigido();
		double juros = obterTaxaDeJuros();
		FrequenciaJuros freqJuros = obterFrequenciaJuros();
		TipoJuros tipoJuros = obterTipoJuros();
		//Calendar dataInicial = obterDataInicial();
		//Calendar dataFinal = obterDataFinal();
		
		//Query dados = new Query(valorInicial, juros, freqJuros, tipoJuros, dataInicial, dataFinal);
	}

	private static double obterValorASerCorrigido() {

		double valor = 0;

		try {
			System.out.print("Valor a ser corrigido: ");
			valor = Double.parseDouble(stdin.next());
		}
		catch (NumberFormatException nfex) {
			System.out.println("ERRO: Opção inválida " + nfex.getMessage() + "\n");
			obterValorASerCorrigido(); // recursivo
		}
		return valor;
	}
	
	private static double obterTaxaDeJuros() {

		double juros = 0;

		try {
			System.out.print("Taxa de juros: ");
			juros = Double.parseDouble(stdin.next());
		}
		catch (NumberFormatException nfex) {
			System.out.println("ERRO: Opção inválida " + nfex.getMessage() + "\n");
			obterTaxaDeJuros(); // recursivo
		}
		return juros;
	}

	private static FrequenciaJuros obterFrequenciaJuros() {

		FrequenciaJuros freqJuros = null;
		
		try {
			System.out.print("Juros \"ao mês\" ou \"ao ano\"? [1 / 2]: ");
			freqJuros = ProvisionarController.getOptionFrequenciaJuros
					(Integer.parseInt(stdin.next()));
		}
		catch (ProvisionarException pex) {
			System.out.println("ERRO: " + pex.getMessage() + ": " + pex.getCause().getMessage() + "\n");
			obterFrequenciaJuros(); // recursivo
		}
		catch (NumberFormatException nfex) {
			System.out.println("ERRO: Opção inválida " + nfex.getMessage() + "\n");
			obterFrequenciaJuros(); // recursivo
		}
		return freqJuros;
	}
	
	private static TipoJuros obterTipoJuros() {
		
		TipoJuros tipoJuros = null;

		try {
			System.out.print("Juros \"simples\" ou juros \"compostos\"? [1 / 2]: ");
			tipoJuros = ProvisionarController.getOptionTipoJuros
					(Integer.parseInt(stdin.next()));
		}
		catch (ProvisionarException pex) {
			System.out.println("ERRO: " + pex.getMessage() + ": " + pex.getCause().getMessage() + "\n");
			obterTipoJuros(); // recursivo
		}
		catch (NumberFormatException nfex) {
			System.out.println("ERRO: Opção inválida " + nfex.getMessage() + "\n");
			obterTipoJuros(); // recursivo
		}
		return tipoJuros;
	}
}
