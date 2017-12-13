/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo.construcao;

import jogo.Ataque;
import jogo.Dinheiro;
import jogo.Entidade;
import jogo.Posicao;
import jogo.civilizacao.Civilizacao;

/**
 *
 * @author Rovana
 */
public abstract class Construcao extends Entidade {

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
    public Construcao(String imagem, Dinheiro custo,
            int pontosvitais, Posicao posicao, Civilizacao civilizacao) {
        super(imagem, custo, pontosvitais, posicao, civilizacao);
        civilizacao.adicionaEntidade(this);
    }

}
