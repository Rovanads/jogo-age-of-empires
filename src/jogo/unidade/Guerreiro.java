/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo.unidade;

import jogo.Ataque;
import jogo.Posicao;
import jogo.Util;
import jogo.civilizacao.Civilizacao;

/**
 *
 * @author Rovana
 */
public class Guerreiro extends Unidade {

    /**
     * Construtor da classe Guerreiro:
     *
     * @param posicao , posicao do objeto;
     * @param civilizacao , civilizacao do objeto.
     */
    public Guerreiro(Posicao posicao, Civilizacao civilizacao) {
        super("Guerreiro.jpg", Util.CUSTOS.get(Guerreiro.class), 160, posicao,
                civilizacao, 2, 1.8);
        this.ataque =  new Ataque(this, 13);

    }

}
