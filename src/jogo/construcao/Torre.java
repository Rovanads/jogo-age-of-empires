/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo.construcao;

import jogo.AtaqueDeAlcance;
import jogo.Posicao;
import jogo.Util;
import jogo.civilizacao.Civilizacao;

/**
 *
 * @author Rovana
 */
public class Torre extends Construcao {

    /**
     * Construtor da classe Torre:
     *
     * @param posicao , posicao do objeto;
     * @param civilizacao , civilizacao do objeto.
     */
    public Torre(Posicao posicao, Civilizacao civilizacao) {
        super("Torre.jpg", Util.CUSTOS.get(Torre.class), 200, posicao,
                civilizacao);
        this.ataque = new AtaqueDeAlcance(this, 20, 7); 

    }

}
