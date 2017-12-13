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
import jogo.unidade.Sacerdote;

/**
 *
 * @author Rovana
 */
public class Templo extends Construcao {

    /**
     * Costrutor Templo:
     *
     * @param posicao , posicao do objeto;
     * @param civilizacao , civilizacao do objeto.
     */
    public Templo(Posicao posicao, Civilizacao civilizacao) {
        super("Templo.jpg", Util.CUSTOS.get(Templo.class), 350, posicao,
                civilizacao);
    }

    /**
     * Metodo criaSacerdote:
     *
     * @return sacerdote.
     */
    public Sacerdote criaSacedote() {
        if (this.getCivilizacao().podeConstruir(Sacerdote.class)) {
            this.getCivilizacao().adicionaEntidade(new Sacerdote
        (this.getPosicao(), this.getCivilizacao()));
        }
        return new Sacerdote(this.getPosicao(), this.getCivilizacao());
    }

}
        
