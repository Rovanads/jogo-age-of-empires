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
public class Elefante extends Unidade {

    /**
     * Construtor Elefante:
     *
     * @param posicao , posicao do objeto;
     * @param civilizacao , civilizacao do objeto.
     */
    public Elefante(Posicao posicao, Civilizacao civilizacao) {
        super("Elefante.jpg", Util.CUSTOS.get(Elefante.class), 600, posicao,
                civilizacao, 2, 1.0);
        this.ataque =  new Ataque(this, 18);

    }

}
