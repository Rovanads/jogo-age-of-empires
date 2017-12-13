/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo.civilizacao;

import jogo.Posicao;
import jogo.Util;
import jogo.unidade.Elefante;
import jogo.unidade.Falange;

/**
 *
 * @author Rovana
 */
public class Grecia extends Civilizacao {

    /**
     * Construtor da classe Grecia:
     *
     * @param dinheiro , dinheiro inicial;
     * @param populacao , populacao inicial.
     */
    public Grecia(Posicao posicao) {
        super(posicao, Util.entidadesCivilizacao(Falange.class));

    }

}
