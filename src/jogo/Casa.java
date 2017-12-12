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
public class Casa extends Construcao {

    /**
     * Construtor da classe Casa:
     *
     * @param posicao , posicao do objeto;
     * @param civilizacao , civilizacao do objeto.
     */
    public Casa(Posicao posicao, Civilizacao civilizacao) {
        super("Casa.jpg", new Dinheiro(0, 0, 30), true, 75, posicao,
                civilizacao, new Ataque(0));
        

    }

}
