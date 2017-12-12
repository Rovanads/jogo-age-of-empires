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
public class Egito extends Civilizacao {

    /**
     * Construtor da classe Egito:
     *
     * @param dinheiro , dinheiro inicial;
     * @param populacaoatual , populacao inicial da Civilizacao.
     */
    public Egito(Dinheiro dinheiro, int populacaoatual) {
        super(new Dinheiro(500, 500, 500), populacaoatual);

    }

}
