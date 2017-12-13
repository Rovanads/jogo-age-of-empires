/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo.unidade;

import jogo.Ataque;
import jogo.Dinheiro;
import jogo.Posicao;
import jogo.Util;
import jogo.civilizacao.Civilizacao;

/**
 *
 * @author Rovana
 */
public class Campones extends Unidade {

    /**
     * Construtor da classe Campones:
     *
     * @param posicao , posicao do objeto;
     * @param civilizacao , civilizacao do objeto.
     */
    public Campones(Posicao posicao, Civilizacao civilizacao) {
        super("Campones.jpg", Util.CUSTOS.get(Campones.class), 50, posicao,
                civilizacao, 0, 2.0);
        this.ataque =  new Ataque(this, 3);

    }

    /**
     * Metodo constroi:
     *
     * @param posicao , posicao do objeto;
     * @param tipo , tipo de Construcao;
     * @return o objeto criado.
     */
    public <C> C constroi(Class<? extends C> tipo) {
        if (getCivilizacao().podeConstruir(tipo)) {
            try {
				return (C) tipo.getConstructors()[0].newInstance(getPosicao(), getCivilizacao());
			} catch (Exception e) {
				e.printStackTrace();
			} 
        }
        return null;
    }

    /**
     * Metodo colhe: Gera uma unidade de comida para a Civilizacao.
     */
    public void colhe() {
        this.getCivilizacao().getDinheiro().soma(new Dinheiro(1, 0, 0));
        System.out.print("+ Campones colheu trigo: ");
        getCivilizacao().imprimeSaldo();
    }

    /**
     * Metodo corta: gera uma unidade de madeira para a Civilizacao.
     */
    public void corta() {
        this.getCivilizacao().getDinheiro().soma(new Dinheiro(0, 0, 1));
        System.out.print("+ Campones cortou lenha: ");
        getCivilizacao().imprimeSaldo();
    }

    /**
     * Metodo minera: gera uma unidade de ouro para a Civilizacao.
     */
    public void minera() {
        this.getCivilizacao().getDinheiro().soma(new Dinheiro(0, 1, 0));
        System.out.print("+ Campones minerou pedra: ");
        getCivilizacao().imprimeSaldo();
    }

}
