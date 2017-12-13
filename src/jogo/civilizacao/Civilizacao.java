/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo.civilizacao;

import java.util.ArrayList;
import java.util.Arrays;

import jogo.Dinheiro;
import jogo.Entidade;
import jogo.Posicao;
import jogo.Util;
import jogo.construcao.Casa;
import jogo.construcao.CentroDaCidade;
import jogo.construcao.Construcao;
import jogo.unidade.Unidade;

/**
 *
 * @author Rovana
 */

public abstract class Civilizacao {

    private Dinheiro dinheiro;
    private ArrayList<Construcao> construcoes = new ArrayList<>();
    private ArrayList<Unidade> unidades = new ArrayList<>();
    private int populacao;
    private int capacidade = 0;
    private Class<? extends Entidade>[] entidadesPermitidas;
    private CentroDaCidade centroDaCidade;
    private boolean extinta = false;

    /**
     * Construtor da classe Civilizacao.
     */
    public Civilizacao(Posicao posicao, Class<? extends Entidade>[] entidadesPermitidas) {        
    	this.entidadesPermitidas = entidadesPermitidas;
    	this.dinheiro = new Dinheiro(500, 500, 500);
    	this.centroDaCidade = new CentroDaCidade(posicao, this);
    	System.out.println("** Civilizacao " + this + " inicializada!");
    }

    public void existeCivilizacao() {
        if (this.construcoes.isEmpty()) {
            extinta = true;
            System.out.println("GAME OVER: " + this + " extinta!");
        }
    }

    /**
     * Metodo podeConstruir:
     *
     * @param Entidade , Construcao e Unidade;
     * @return , se a Entidade pode ser criada.
     */
    public boolean podeConstruir(Class entidade) {
        
    	// Checa se classe que estamos passando é válida: é subclasse de Entidade
    	if (entidade == null && !entidade.isAssignableFrom(Entidade.class)){
    		System.out.println("ERRO: entidade invalida.");
            return false;
        }
    	
    	//Checa se a unidade especial esta propria: para evitar que Egito crie Falange, por exemplo
    	if (!Arrays.asList(entidadesPermitidas).contains(entidade)){
    		System.out.println("ERRO: unidade nao permitida=" + entidade.getSimpleName());
            return false;
        }
        
        //Checa se a capacidade nao está excedente: populacao > capacidade
        if (populacao + 1 > capacidade){
        	System.out.println("ERRO: capacidade esta fora do limite.");
            return false;
        }
        //Checa se temos dinheiro para construir a entidade
		if (dinheiro.checaNegativo(Util.CUSTOS.get(entidade))){
        	System.out.println("ERRO: falta dinheiro.");
            return false;
        }
        
        return true;
    }

    /**
     * Metodo adicionaUnidade:
     *
     * @param unidade , unidade que sera adicionada.
     */
    public void adicionaEntidade(Unidade unidade) {
        this.getUnidades().add(unidade);
        this.populacao = this.getUnidades().size();
        this.getDinheiro().subtrai(unidade.getCusto());
        System.out.print("- ");
        imprimeSaldo();
    }

    /**
     * Metodo removeUnidade:
     *
     * @param unidade , unidade a ser removida.
     */
    public void removeEntidade(Unidade unidade) {
    	this.getUnidades().remove(unidade);
    	this.populacao = this.getUnidades().size();
    	unidade.setVivo(unidade.getPontosvitais() > 0);
    }

    /**
     * Metodo adicionaConstrucao:
     *
     * @param construcao , construcao a ser adicionada.
     */
    public void adicionaEntidade(Construcao construcao) {
        if (construcao instanceof Casa && !extinta) {
            capacidade += 2;
        }
        if (construcao instanceof CentroDaCidade && !extinta) {
            capacidade += 10;
        }
        this.getConstrucoes().add(construcao);
        this.getDinheiro().subtrai(construcao.getCusto());
        System.out.print("- ");
        imprimeSaldo();
    }

    /**
     * Metodo removeConstrucao:
     *
     * @param construcao , construcao a ser removida;
     */
    public void removeEntidade(Construcao construcao) {
        if (construcao.getPontosvitais() == 0) {
            if (construcao instanceof Casa) {
                capacidade = capacidade - 2;
            }
            if (construcao instanceof CentroDaCidade) {
                capacidade = capacidade - 10;
            }
        }
        this.getConstrucoes().remove(construcao);
        construcao.setVivo(construcao.getPontosvitais() > 0);

    }
    
    public void removeEntidade(Entidade entidade) {
    	if (entidade instanceof Unidade) {
    		removeEntidade((Unidade) entidade);
    	} else	if (entidade instanceof Construcao) {
    		removeEntidade((Construcao) entidade);
    	}
    }
    public void adicionaEntidade(Object entidade) {
    	if (entidade instanceof Unidade) {
    		adicionaEntidade((Unidade) entidade);
    	} else	if (entidade instanceof Construcao) {
    		adicionaEntidade((Construcao) entidade);
    	}
    }
    
    public void imprimeSaldo() {
		System.out.println(getClass().getSimpleName() + " tem agora " + dinheiro + ", " + populacao + "/" + capacidade);
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

	public int getPopulacao() {
		return populacao;
	}

	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public CentroDaCidade getCentroDaCidade() {
		return centroDaCidade;
	}

	public void setCentroDaCidade(CentroDaCidade centroDaCidade) {
		this.centroDaCidade = centroDaCidade;
	}

	public boolean isExtinta() {
		return extinta;
	}

	public void setExtinta(boolean extinta) {
		this.extinta = extinta;
	}


	@Override
	public String toString() {
		return getClass().getSimpleName();
	}
}
    

