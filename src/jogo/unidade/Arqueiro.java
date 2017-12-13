/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo.unidade;

import jogo.AtaqueDeAlcance;
import jogo.Posicao;
import jogo.Util;
import jogo.civilizacao.Civilizacao;

/**
 *
 * @author Rovana
 */
public class Arqueiro extends Unidade {

    /**
     * Construtor da classe Arqueiro:
     *
     * @param posicao , posicao inicial do objeto;
     * @param civilizacao , civilizacao do objeto.
     */
    public Arqueiro(Posicao posicao, Civilizacao civilizacao) {
		super("Arqueiro.jpg", Util.CUSTOS.get(Arqueiro.class), 45, posicao,
                civilizacao, 0, 2.0);
        this.ataque = new AtaqueDeAlcance(this, 5, 7);
    }

}



    

     
    

