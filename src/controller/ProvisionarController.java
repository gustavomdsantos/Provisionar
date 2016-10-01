package controller;

import model.FrequenciaJuros;
import model.TipoJuros;

public class ProvisionarController {

	/**
	 * Processa a entrada de dados do usuário se a opção digitada por ele é 1 ou 2.
	 * @param op a opção entrada pelo usuário (1 ou 2)
	 * @return a frequência de juros tal como definido em "Ao mês" ou "Ao ano".
	 */
	public static FrequenciaJuros getOptionFrequenciaJuros(int op) {

		FrequenciaJuros freqJuros;
		switch (op) {
			case 1:
				freqJuros = FrequenciaJuros.AO_MES;
				break;
			case 2:
				freqJuros = FrequenciaJuros.AO_ANO;
				break;
			default:
				throw new ProvisionarException("Opção inválida", op);
		}
		return freqJuros;
	}

	/**
	 * Processa a entrada de dados do usuário se a opção digitada por ele é 1 ou 2.
	 * @param op a opção entrada pelo usuário (1 ou 2)
	 * @return o tipo de juros tal como definido em "Simples" ou "Composto".
	 */
	public static TipoJuros getOptionTipoJuros(int op) {

		TipoJuros tipoJuros;
		switch (op) {
		
			case 1:
				tipoJuros = TipoJuros.SIMPLES;
				break;
			case 2:
				tipoJuros = TipoJuros.COMPOSTO;
				break;
			default:
				throw new ProvisionarException("Opção inválida", op);
		}
		return tipoJuros;
	}
}
