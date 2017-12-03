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
    
    private Dinheiro dinheiro;//gastos a medida que a civilizacao cria objetos e 
    //recuperados atraves dos metodos dos objetos camponeses.
    private ArrayList<Construcao> construcoes = new ArrayList <>(); //vivas
    private ArrayList<Unidade> unidades = new ArrayList <>();    
    
    //os atributos citados acima sÃ£o gastos a medida que a civilizacao cria 
    //objetos, e recuperados atraves dos metodos dos objetos camponeses.
      
    public int populacao;//nao pode ser maior que a capacidade da populacao
    //(dada pelas casas e centros da cidade)
    public int capacidade;
    public String [] unidadesPermitidas;
    
    public Civilizacao (Dinheiro dinheiro, int populacao, int capacidade){
        this.dinheiro = dinheiro;        
        this.populacao = populacao;
        this.capacidade = capacidade;
        
    }
    //1 centro da cidade;
    public void inicializa (Posicao posicao){
        
    }
    public boolean podeConstruir (Construcao tipo){
     //aqui tbm, nao ta compilando pq precisa ser implementado.   
    }
    public void adicionaUnidade (Unidade unidade){
        this.getUnidades().add(unidade);
        this.populacao = this.getUnidades().size();
        
        
    }
    public void removeUnidade (Unidade unidade){
        this.getUnidades().remove(unidade);
        this.populacao = this.getUnidades().size();
    }
    public void adicionaConstrucao (Construcao construcao){
        this.getConstrucoes().add(construcao);
        //criar o algoritmo de aumento da capacidade da populacao;
    }
    public void removeConstrucao (Construcao construcao){
         this.getConstrucoes().remove(construcao);
        //criar o algoritmo de diminuicao da capacidade da populacao;
    }
    public Dinheiro getDinheiro (){
        return this.dinheiro;
    }
    public void setDinheiro (Dinheiro d){
        this.dinheiro = d;
    }
    public ArrayList getUnidades (){
        return this.unidades;
    }
    public void setUnidades (ArrayList u){
        this.unidades = u;
    }
    public ArrayList getConstrucoes (){
        return this.construcoes;
    }
    public void setConstrucoes (ArrayList c){
        this.construcoes = c;
    }
    
        
    }
    

