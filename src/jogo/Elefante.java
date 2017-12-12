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
public class Elefante extends Unidade {

    /**
     * Construtor Elefante:
     *
     * @param posicao , posicao do objeto;
     * @param civilizacao , civilizacao do objeto.
     */
    public Elefante(Posicao posicao, Civilizacao civilizacao) {
        super("Elefante.jpg", new Dinheiro(170, 40, 0), true, 600, posicao,
                civilizacao, 2, 1.0, new Ataque(18));
        

    }

}
