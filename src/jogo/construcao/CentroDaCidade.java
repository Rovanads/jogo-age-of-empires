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
import jogo.unidade.Campones;

/**
 *
 * @author Rovana
 */
public class CentroDaCidade extends Construcao {

    /**
     * Construtor da classe CentroDaCidade:
     *
     * @param posicao , posicao do objeto;
     * @param civilizacao , civilizacao do objeto.
     */
    public CentroDaCidade(Posicao posicao, Civilizacao civilizacao) {
        super("CentrodaCidade.jpg", Util.CUSTOS.get(CentroDaCidade.class), 600, posicao,
                civilizacao);
       this.ataque = new AtaqueDeAlcance(this, 10, 8);

    }

    /**
     * Metodo criaCampones:
     *
     * @return campones.
     */
    public Campones criaCampones() {
        if (this.getCivilizacao().podeConstruir(Campones.class)) {
            return new Campones(this.getPosicao(), this.getCivilizacao());
        }

        return null;
    }
}

