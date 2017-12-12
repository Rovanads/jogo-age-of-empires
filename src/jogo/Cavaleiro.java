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
public class Cavaleiro extends Unidade {

    /**
     * Construtor da classe Cavaleiro:
     *
     * @param posicao , posicao do objeto;
     * @param civilizacao , civilizacao do objeto.
     */
    public Cavaleiro(Posicao posicao, Civilizacao civilizacao) {
        super("Cavaleiro.jpg", new Dinheiro(70, 80, 0), true, 180, posicao,
                civilizacao, 3, 4.0, new Ataque(12));
        
    }

}
