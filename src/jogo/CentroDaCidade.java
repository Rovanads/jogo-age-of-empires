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
public class CentroDaCidade extends Construcao {

    /**
     * Construtor da classe CentroDaCidade:
     *
     * @param posicao , posicao do objeto;
     * @param civilizacao , civilizacao do objeto.
     */
    public CentroDaCidade(Posicao posicao, Civilizacao civilizacao) {
        super("CentrodaCidade.jpg", new Dinheiro(0, 0, 200), true, 600, posicao,
                civilizacao, new AtaqueDeAlcance(10, 8));
       

    }

    /**
     * Metodo criaCampones:
     *
     * @return campones.
     */
    public Campones criaCampones() {
        if (this.getCivilizacao().podeConstruir(Campones.class)) {

            this.getCivilizacao().adicionaUnidade(new Campones(this.getPosicao()
                    ,this.getCivilizacao()));

        }

        return new Campones(this.getPosicao(), this.getCivilizacao());
    }
}

