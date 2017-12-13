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
public class AtaqueDeAlcance extends Ataque {

    int alcance;

    /**
     * Construtor da classe AtaqueDeAlcance:
     *
     * @param ataque , valor do ataque;
     * @param alcance , valor do alcance.
     */
    public AtaqueDeAlcance(Entidade entidade, int ataque, int alcance) {
        super(entidade, ataque);
        this.alcance = alcance;
    }

	public int getAlcance() {
		return alcance;
	}

	public void setAlcance(int alcance) {
		this.alcance = alcance;
	}

    
}
