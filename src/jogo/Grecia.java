/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

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
    public Grecia(Dinheiro dinheiro, int populacao) {

        super(new Dinheiro(500, 500, 500), populacao);

    }

}
