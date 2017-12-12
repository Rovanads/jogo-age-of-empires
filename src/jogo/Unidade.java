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
abstract public class Unidade extends Entidade implements Movivel {

    public double velocidade;
    public Ataque ataque;
    public int armadura;

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
    public Unidade(String imagem, Dinheiro custo, boolean isVivo,
            int pontosvitais, Posicao posicao, Civilizacao civilizacao,
            int armadura, double velocidade, Ataque ataque) {
        super(imagem, custo, isVivo, pontosvitais, posicao, civilizacao);
        this.velocidade = velocidade;
        this.ataque = ataque;
        this.armadura = armadura;
        civilizacao.adicionaUnidade(this);
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
}


