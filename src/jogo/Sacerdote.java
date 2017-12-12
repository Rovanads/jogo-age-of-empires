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
public class Sacerdote extends Unidade {

    /**
     * Construtor da classe Sacerdote:
     *
     * @param posicao , posicao do objeto;
     * @param civilizacao , civilizacao do objeto.
     */
    public Sacerdote(Posicao posicao, Civilizacao civilizacao) {
        super("Sacerdote.jpg", new Dinheiro(0, 125, 0), true, 25, posicao,
                civilizacao, 0, 1.0, new AtaqueDeAlcance(0, 10));
       
    }

    /**
     * Metodo converteInimigo:
     *
     * @param entidade , entidade a ser convertida.
     */
    public void converteInimigo(Entidade entidade) {

        this.getCivilizacao().adicionaUnidade(this);
        entidade.getCivilizacao().removeUnidade(this);
        entidade.setCivilizacao(this.getCivilizacao());
        System.out.println("O inimigo foi convertido para " + getCivilizacao());

    }

}
    

