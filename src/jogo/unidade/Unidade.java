/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo.unidade;

import jogo.Ataque;
import jogo.Dinheiro;
import jogo.Direcao;
import jogo.Entidade;
import jogo.Mapa;
import jogo.Movivel;
import jogo.Posicao;
import jogo.civilizacao.Civilizacao;

/**
 *
 * @author Rovana
 */
public abstract class Unidade extends Entidade implements Movivel {

    private double velocidade;
    private int armadura;

    /**
     * Construtor da classe Unidade:
     *
     * @param imagem , nome do objeto;
     * @param custo , valor do objeto;
     * @param isVivo , estado do objeto;
     * @param pontosvitais , quantidade de pontos vitais;
     * @param posicao , posicao do objeto;
     * @param civilizacao , civilizacao do objeto;
     * @param armadura , valor da armadura;
     * @param velocidade , velocidade do objeto;
     * @param ataque , valor do ataque.
     */
    public Unidade(String imagem, Dinheiro custo,
            int pontosvitais, Posicao posicao, Civilizacao civilizacao,
            int armadura, double velocidade) {
        super(imagem, custo, pontosvitais, posicao, civilizacao);
        this.velocidade = velocidade;
        this.armadura = armadura;
        civilizacao.adicionaEntidade(this);
    }

    /**
     * Metodo mover:
     *
     * @param direcao , direcao para onde o objeto deve se mover.
     */
    @Override
    public void mover(Direcao direcao) {
        Mapa.get().moveUnidade(this, direcao, velocidade);
    }

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public Ataque getAtaque() {
		return ataque;
	}

	public void setAtaque(Ataque ataque) {
		this.ataque = ataque;
	}

	public int getArmadura() {
		return armadura;
	}

	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}
    
    
}


