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
abstract class Construcao extends Entidade {

    /**
     * Construtor da classe Construcao:
     *
     * @param imagem , nome do objeto;
     * @param custo , valor do objeto;
     * @param isVivo , se esta vivo;
     * @param pontosvitais , quantidade de pontos vitais;
     * @param posicao , posicao do objeto;
     * @param civilizacao , civilizacao;
     * @param ataque , valor do ataque;
     */
    public Construcao(String imagem, Dinheiro custo, boolean isVivo,
            int pontosvitais, Posicao posicao, Civilizacao civilizacao,
            Ataque ataque) {
        super(imagem, custo, isVivo, pontosvitais, posicao, civilizacao);
        civilizacao.adicionaConstrucao(this);
    }

}
