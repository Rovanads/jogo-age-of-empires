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
public class Arqueiro extends Unidade {

    /**
     * Construtor da classe Arqueiro:
     *
     * @param posicao , posicao inicial do objeto;
     * @param civilizacao , civilizacao do objeto.
     */
    public Arqueiro(Posicao posicao, Civilizacao civilizacao) {
        super("Arqueiro.jpg", new Dinheiro(40, 20, 0), true, 45, posicao,
                civilizacao, 0, 2.0, new AtaqueDeAlcance(5, 7));
        
    }

}



    

     
    

