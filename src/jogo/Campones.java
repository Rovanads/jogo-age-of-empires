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
public class Campones extends Unidade {

    /**
     * Construtor da classe Campones:
     *
     * @param posicao , posicao do objeto;
     * @param civilizacao , civilizacao do objeto.
     */
    public Campones(Posicao posicao, Civilizacao civilizacao) {
        super("Campones.jpg", new Dinheiro(50, 0, 0), true, 50, posicao,
                civilizacao, 0, 2.0, new Ataque(3));
        

    }

    /**
     * Metodo constroi:
     *
     * @param posicao , posicao do objeto;
     * @param tipo , tipo de Construcao;
     * @return o objeto criado.
     */
    public Construcao constroi(Posicao posicao, Construcao tipo) {
        if (tipo instanceof Casa) {
            new Casa(posicao, this.getCivilizacao());
            System.out.println("Casa construída, posicao: " + 
                    posicao.x + "," + posicao.y);
        }
        if (tipo instanceof CentroDaCidade) {
            new CentroDaCidade(posicao, this.getCivilizacao());
            System.out.println("Centro da cidade construído na posicao: "
                    + posicao.x + "," + posicao.y);
        }
        if (tipo instanceof Quartel) {
            new Quartel(posicao, this.getCivilizacao());
            System.out.println("Quartel construÃƒÂ­do na posicÃƒÂ£o: "
                    + posicao.x + "," + posicao.y);
        }
        if (tipo instanceof Templo) {
            new Templo(posicao, this.getCivilizacao());
            System.out.println("Templo construÃƒÂ­do na posicÃƒÂ£o: "
                    + posicao.x + "," + posicao.y);
        }
        if (tipo instanceof Torre) {
            new Templo(posicao, this.getCivilizacao());
            System.out.println("Torre construÃƒÂ­da na posicÃƒÂ£o: "
                    + posicao.x + "," + posicao.y);
        }
        return tipo;
    }

    /**
     * Metodo colhe: Gera uma unidade de comida para a Civilizacao.
     */
    public void colhe() {
        this.getCivilizacao().getDinheiro().soma(new Dinheiro(1, 0, 0));
    }

    /**
     * Metodo corta: gera uma unidade de madeira para a Civilizacao.
     */
    public void corta() {
        this.getCivilizacao().getDinheiro().soma(new Dinheiro(0, 0, 1));
    }

    /**
     * Metodo minera: gera uma unidade de ouro para a Civilizacao.
     */
    public void minera() {
        this.getCivilizacao().getDinheiro().soma(new Dinheiro(0, 1, 0));
    }

}
