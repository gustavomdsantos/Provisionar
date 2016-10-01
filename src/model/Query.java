package model;

import java.util.Calendar;

/**
 * Classe que encapsula os dados para o cálculo dos juros.
 * 
 * @author gustavosotnas
 */
public class Query {

	/** Valor a ser corrigido */
	private double valorInicial;
	/** Taxa de juros */
	private double juros;
	/** Frequência / prazo dos juros (ao mês ou ao ano)*/
	private FrequenciaJuros freqJuros;
	/** Tipo de juros  (simples ou composto) */
	private TipoJuros tipoJuros;
	/** Data inicial do valor a ser corrigido */
	private Calendar dataInicial;
	/** Data final do valor corrigido */
	private Calendar dataFinal;

	/**
	 * Constrói um objeto do tipo Query, para persistir os dados para calcular.
	 * 
	 * @param valorInicial Valor a ser corrigido
	 * @param juros Taxa de juros
	 * @param freqJuros Frequência / prazo dos juros (ao mês ou ao ano)
	 * @param tipoJuros Tipo de juros (simples ou composto)
	 * @param dataInicial Data inicial do valor a ser corrigido
	 * @param dataFinal Data final do valor corrigido
	 */
	public Query (double valorInicial, double juros, FrequenciaJuros freqJuros,
			TipoJuros tipoJuros, Calendar dataInicial, Calendar dataFinal) {
		super();
		this.valorInicial = valorInicial;
		this.juros = juros;
		this.freqJuros = freqJuros;
		this.tipoJuros = tipoJuros;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
	}

	/**
	 * @return the valorInicial
	 */
	public double getValorInicial() {
		return valorInicial;
	}

	/**
	 * @return the juros
	 */
	public double getJuros() {
		return juros;
	}

	/**
	 * @return the freqJuros
	 */
	public FrequenciaJuros getFreqJuros() {
		return freqJuros;
	}

	/**
	 * @return the tipoJuros
	 */
	public TipoJuros getTipoJuros() {
		return tipoJuros;
	}

	/**
	 * @return the dataInicial
	 */
	public Calendar getDataInicial() {
		return dataInicial;
	}

	/**
	 * @return the dataFinal
	 */
	public Calendar getDataFinal() {
		return dataFinal;
	}
		
}
