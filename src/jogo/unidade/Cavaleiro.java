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
public class Cavaleiro extends Unidade {

    /**
     * Construtor da classe Cavaleiro:
     *
     * @param posicao , posicao do objeto;
     * @param civilizacao , civilizacao do objeto.
     */
    public Cavaleiro(Posicao posicao, Civilizacao civilizacao) {
        super("Cavaleiro.jpg", Util.CUSTOS.get(Cavaleiro.class), 180, posicao,
                civilizacao, 3, 4.0);
        this.ataque =  new Ataque(this, 12);
    }

}
