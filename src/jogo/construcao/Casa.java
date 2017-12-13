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

/**
 *
 * @author Rovana
 */
public class Casa extends Construcao {

    /**
     * Construtor da classe Casa:
     *
     * @param posicao , posicao do objeto;
     * @param civilizacao , civilizacao do objeto.
     */
    public Casa(Posicao posicao, Civilizacao civilizacao) {
        super("Casa.jpg", Util.CUSTOS.get(Casa.class), 75, posicao,
                civilizacao);

    }

}
