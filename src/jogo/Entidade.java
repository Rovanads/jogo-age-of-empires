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
abstract public class Entidade {

    public String imagem;
    private Dinheiro custo;
    public boolean isVivo;
    public int pontosvitais;
    private Posicao posicao;
    private Civilizacao civilizacao;

    /**
     * Construtor da classe Entidade:
     *
     * @param imagem , nome do objeto;
     * @param custo , valor do objeto;
     * @param isVivo , condicao do objeto;
     * @param pontosvitais , quantidade de pontos vitais;
     * @param posicao , posicao do objeto;
     * @param civilizacao , civilizacao do objeto.
     */
    public Entidade(String imagem, Dinheiro custo, boolean isVivo,
            int pontosvitais, Posicao posicao, Civilizacao civilizacao) {        
        this.imagem = imagem;
        this.custo = custo;
        this.isVivo = isVivo;
        this.pontosvitais = pontosvitais;
        this.posicao = posicao;
        this.civilizacao = civilizacao;

    }

    /**
     * Metodo getPosicao:
     *
     * @return posicao;
     */
    public Posicao getPosicao() {
        return this.posicao;
    }

    /**
     * Metodo setPosicao:
     *
     * @param p , posicao.
     */
    public void setPosicao(Posicao p) {
        this.posicao = p;
    }

    /**
     * Metodo getCivilizacao:
     *
     * @return civilizacao;
     */
    public Civilizacao getCivilizacao() {
        return this.civilizacao;
    }

    /**
     * Metodo set Civilizacao:
     *
     * @param c , civilizacao;
     */
    public void setCivilizacao(Civilizacao c) {
        this.civilizacao = c;
    }

    /**
     * Metodo getDinheiro:
     *
     * @return dinheiro;
     */
    public Dinheiro getDinheiro() {
        return this.custo;
    }

    /**
     * Metodo setDinheiro:
     *
     * @param d , dinheiro.
     */
    public void setDinheiro(Dinheiro d) {
        this.custo = d;
    }
} 

