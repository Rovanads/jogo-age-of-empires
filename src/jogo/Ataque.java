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
public class Ataque {

    protected int ataque;
    protected Entidade entidade;

    /**
     * Construtor da classe Ataque
     *
     * @param ataque , valor do ataque do objeto.
     */
    public Ataque(int ataque) {
        this.ataque = ataque;

    }

    /**
     * Metodo ataca:
     *
     * @param entidadeAtacada , entidade a ser atacada.
     */
    public void ataca(Entidade entidadeAtacada) {
        if (entidadeAtacada instanceof Unidade) {
            entidadeAtacada.pontosvitais = entidadeAtacada.pontosvitais - 
                    (ataque - ((Unidade) entidadeAtacada).armadura);
        } else {
            entidadeAtacada.pontosvitais = entidadeAtacada.pontosvitais - 
                    ataque;
        }
    }
    /**
     * Metodo podeAtacar:
     *
     * @param atacante , objeto atacante;
     * @param atacado, objeto atacado;
     * @return , se o objeto pode ser atacado.
     */
    public boolean podeAtacar(Entidade atacante, Entidade atacado) {
        return Mapa.getDistanciaRaio(atacante, atacado) <= 2;

    }

}
