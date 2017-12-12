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
public class Falange extends Unidade {

    /**
     * Construtor da classe Falange:
     *
     * @param posicao , posicao do objeto;
     * @param civilizacao , civilizacao do objeto.
     */
    public Falange(Posicao posicao, Civilizacao civilizacao) {
        super("Falange.jpg", new Dinheiro(60, 40, 0), true, 120, posicao, 
                civilizacao, 7, 1.2, new Ataque(20));
        

    }

}
