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
public class Templo extends Construcao {

    /**
     * Costrutor Templo:
     *
     * @param posicao , posicao do objeto;
     * @param civilizacao , civilizacao do objeto.
     */
    public Templo(Posicao posicao, Civilizacao civilizacao) {
        super("Templo.jpg", new Dinheiro(0, 0, 250), true, 350, posicao,
                civilizacao, new Ataque(0));
        

    }

    /**
     * Metodo criaSacerdote:
     *
     * @return sacerdote.
     */
    public Sacerdote criaSacedote() {
        if (this.getCivilizacao().podeConstruir(Sacerdote.class)) {
            this.getCivilizacao().adicionaUnidade(new Sacerdote
        (this.getPosicao(), this.getCivilizacao()));
        }
        return new Sacerdote(this.getPosicao(), this.getCivilizacao());
    }

}
        
