/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo.construcao;

import jogo.Ataque;
import jogo.Posicao;
import jogo.Util;
import jogo.civilizacao.Civilizacao;
import jogo.unidade.Arqueiro;
import jogo.unidade.Cavaleiro;
import jogo.unidade.Elefante;
import jogo.unidade.Falange;
import jogo.unidade.Guerreiro;

/**
 *
 * @author Rovana
 */
public class Quartel extends Construcao {

	/**
	 * Construtor da classe Quartel:
	 *
	 * @param posicao
	 *            , posicao do objeto;
	 * @param civilizacao
	 *            , civilizacao do objeto.
	 */
	public Quartel(Posicao posicao, Civilizacao civilizacao) {
		super("Quartel.jpg", Util.CUSTOS.get(Quartel.class), 350, posicao, civilizacao);

	}

	/**
	 * Metodo criaGuerreiro:
	 *
	 * @return guerreiro.
	 */
	public Guerreiro criaGuerreiro() {
		if (this.getCivilizacao().podeConstruir(Guerreiro.class)) {
			return new Guerreiro(this.getPosicao(), this.getCivilizacao());
		}

		return null;

	}

	/**
	 * Metodo criaCavaleiro:
	 *
	 * @return cavaleiro.
	 */
	public Cavaleiro criaCavaleiro() {
		if (this.getCivilizacao().podeConstruir(Cavaleiro.class)) {
			return new Cavaleiro(this.getPosicao(), this.getCivilizacao());
		}
		return null;

	}

	/**
	 * Metodo criaArqueiro:
	 *
	 * @return Arqueiro.
	 */
	public Arqueiro criaArqueiro() {
		if (this.getCivilizacao().podeConstruir(Arqueiro.class)) {

			return new Arqueiro(this.getPosicao(), this.getCivilizacao());
		}
		return null;
	}

	/**
	 * Metodo criaElefante:
	 *
	 * @return elefante.
	 */
	public Elefante criaElefante() {
		if (this.getCivilizacao().podeConstruir(Elefante.class)) {

			return new Elefante(this.getPosicao(), this.getCivilizacao());
		}
		return null;
	}

	/**
	 * Metodo criaFalange:
	 *
	 * @return Falange.
	 */
	public Falange criaFalange() {
		if (this.getCivilizacao().podeConstruir(Falange.class)) {

			return new Falange(this.getPosicao(), this.getCivilizacao());
		}
		return null;
	}
}
