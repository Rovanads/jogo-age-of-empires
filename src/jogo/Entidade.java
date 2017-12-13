/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import jogo.civilizacao.Civilizacao;

/**
 *
 * @author Rovana
 */
abstract public class Entidade {

	private String imagem;
	private Dinheiro custo;
	private boolean isVivo = true;
	private int pontosvitais;
	private Posicao posicao;
	private Civilizacao civilizacao;
	protected Ataque ataque;

	/**
	 * Construtor da classe Entidade:
	 *
	 * @param imagem
	 *            , nome do objeto;
	 * @param custo
	 *            , valor do objeto;
	 * @param isVivo
	 *            , condicao do objeto;
	 * @param pontosvitais
	 *            , quantidade de pontos vitais;
	 * @param posicao
	 *            , posicao do objeto;
	 * @param civilizacao
	 *            , civilizacao do objeto.
	 */
	public Entidade(String imagem, Dinheiro custo, int pontosvitais, Posicao posicao,
			Civilizacao civilizacao) {
		this.imagem = imagem;
		this.custo = custo;
		this.pontosvitais = pontosvitais;
		this.posicao = posicao;
		this.civilizacao = civilizacao;

		System.out.println("* " + civilizacao + " criou " + this
				+ " em " + posicao);
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public Dinheiro getCusto() {
		return custo;
	}

	public void setCusto(Dinheiro custo) {
		this.custo = custo;
	}

	public boolean isVivo() {
		return isVivo;
	}

	public void setVivo(boolean isVivo) {
		this.isVivo = isVivo;
	}

	public int getPontosvitais() {
		return pontosvitais;
	}

	public void setPontosvitais(int pontosvitais) {
		this.pontosvitais = pontosvitais;
	}

	public Posicao getPosicao() {
		return posicao;
	}

	public void setPosicao(Posicao posicao) {
		this.posicao = posicao;
	}

	public Civilizacao getCivilizacao() {
		return civilizacao;
	}

	public void setCivilizacao(Civilizacao civilizacao) {
		this.civilizacao = civilizacao;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName();
	}
	
	

}
