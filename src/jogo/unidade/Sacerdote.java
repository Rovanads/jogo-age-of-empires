/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo.unidade;

import jogo.Ataque;
import jogo.AtaqueDeAlcance;
import jogo.Entidade;
import jogo.Posicao;
import jogo.Util;
import jogo.civilizacao.Civilizacao;

/**
 *
 * @author Rovana
 */
public class Sacerdote extends Unidade {

    /**
     * Construtor da classe Sacerdote:
     *
     * @param posicao , posicao do objeto;
     * @param civilizacao , civilizacao do objeto.
     */
    public Sacerdote(Posicao posicao, Civilizacao civilizacao) {
        super("Sacerdote.jpg", Util.CUSTOS.get(Sacerdote.class), 25, posicao,
                civilizacao, 0, 1.0);
        this.ataque =  new AtaqueDeAlcance(this, 0, 10);
    }

    /**
     * Metodo converteInimigo:
     *
     * @param entidade , entidade a ser convertida.
     */
    public void converteInimigo(Entidade entidade) {
    	if (this.ataque.podeAtacar(this, entidade)) {
    		entidade.getCivilizacao().removeEntidade(entidade);
    		this.getCivilizacao().adicionaEntidade(entidade);
    		this.getCivilizacao().getDinheiro().soma(entidade.getCusto());
    		entidade.setCivilizacao(this.getCivilizacao());
    		System.out.println("O inimigo " + entidade + " foi convertido para " + getCivilizacao());
    	}

    }

}
    

