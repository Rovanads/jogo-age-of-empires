/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import java.util.ArrayList;

/**
 *
 * @author Rovana
 */

abstract public class Civilizacao {

    private Dinheiro dinheiro;
    private ArrayList<Construcao> construcoes = new ArrayList<>();
    private ArrayList<Unidade> unidades = new ArrayList<>();
    public int populacao;
    public int capacidade = 0;
    public String[] unidadesPermitidas;
    CentroDaCidade cd;
    Posicao pos;
    Egito egito;
    Grecia grecia;
    boolean extinta = false;

    /**
     * Construtor da classe Civilizacao.
     */
    public Civilizacao() {        

    }

    /**
     * Metodo inicializa
     *
     * @param posicao , posicao do CentroDaCidade.
     * @param civilizacao , civilizacao do CentroDaCidade.
     */
    public void inicializa(Posicao posicao,Civilizacao civilizacao) {
        this.adicionaConstrucao(new CentroDaCidade(posicao, civilizacao));
    }

    public void existeCivilizacao() {
        if (this.construcoes == null || this.unidades == null) {
            extinta = true;
            System.out.println("Civilização extinta");
        }
    }

    /**
     * Metodo podeConstruir:
     *
     * @param Entidade , Construcao e Unidade;
     * @return , se a Entidade pode ser criada.
     */
    public boolean podeConstruir(Class Entidade) {
        if (instanceof Entidade){
            //assim não compila.
            
        }
        return false;
    }

    /**
     * Metodo adicionaUnidade:
     *
     * @param unidade , unidade que sera adicionada.
     */
    public void adicionaUnidade(Unidade unidade) {
        this.getUnidades().add(unidade);
        this.populacao = this.getUnidades().size();

    }

    /**
     * Metodo removeUnidade:
     *
     * @param unidade , unidade a ser removida.
     */
    public void removeUnidade(Unidade unidade) {
        if (unidade.pontosvitais == 0) {
            this.getUnidades().remove(unidade);
            this.populacao = this.getUnidades().size();
        }
    }

    /**
     * Metodo adicionaConstrucao:
     *
     * @param construcao , construcao a ser adicionada.
     */
    public void adicionaConstrucao(Construcao construcao) {
        if (construcao instanceof Casa && extinta == false) {
            capacidade = capacidade + 2;
        }
        if (construcao instanceof CentroDaCidade && extinta == false) {
            capacidade = capacidade + 10;
        }
        this.getConstrucoes().add(construcao);
    }

    /**
     * Metodo removeConstrucao:
     *
     * @param construcao , construcao a ser removida;
     */
    public void removeConstrucao(Construcao construcao) {
        if (construcao.pontosvitais == 0) {
            if (construcao instanceof Casa) {
                capacidade = capacidade - 2;
            }
            if (construcao instanceof CentroDaCidade) {
                capacidade = capacidade - 10;
            }
        }
        this.getConstrucoes().remove(construcao);

    }

    /**
     * Metodo getDinheiro:
     *
     * @return , valor.
     */
    public Dinheiro getDinheiro() {
        return this.dinheiro;
    }

    /**
     * Metodo setDinheiro:
     *
     * @param d , dinheiro.
     */
    public void setDinheiro(Dinheiro d) {
        this.dinheiro = d;
    }

    /**
     * Metodo getUnidades:
     *
     * @return unidades.
     */
    public ArrayList getUnidades() {
        return this.unidades;
    }

    /**
     * Metodo setUnidades
     *
     * @param u , unidades.
     */
    public void setUnidades(ArrayList u) {
        this.unidades = u;
    }

    /**
     * Metodo getConstrucoes:
     *
     * @return construcoes;
     */
    public ArrayList getConstrucoes() {
        return this.construcoes;
    }

    /**
     * Metodo setConstrucoes:
     *
     * @param c , construcoes.
     */
    public void setConstrucoes(ArrayList c) {
        this.construcoes = c;
    }

}
    

