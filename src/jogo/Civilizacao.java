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
    public int capacidade =0;
    public String [] unidadesPermitidas;
    CentroDaCidade cd;
    Posicao pos;
    Egito egito;
    Grecia grecia;
           
    boolean extinta = false;
    
    public Civilizacao (Dinheiro dinheiro, int populacao){
        this.dinheiro = dinheiro;        
        this.populacao = populacao;
       
        
        
        
    }
    //1 centro da cidade;
    public void inicializa (Posicao posicao){
        cd.getPosicao();
        
    }
    public boolean podeConstruir (Class Unidade){
        if (this.construcoes == null || this.unidades == null){            
        extinta = true;
            System.out.println("Civilização extinta");
        }
    return false;  
    }
    public void adicionaUnidade (Unidade unidade){
        this.getUnidades().add(unidade);
        this.populacao = this.getUnidades().size();
        
        
    }
    public void removeUnidade (Unidade unidade){
        if (unidade.pontosvitais == 0){
        this.getUnidades().remove(unidade);
        this.populacao = this.getUnidades().size();
    }
    }
    public void adicionaConstrucao (Construcao construcao){        
        if (construcao instanceof Casa && extinta == false){
            capacidade = capacidade + 2;
        }
        if (construcao instanceof CentroDaCidade && extinta == false){
            capacidade = capacidade + 10;
        }
        this.getConstrucoes().add(construcao);
    }
    public void removeConstrucao (Construcao construcao){
        if (construcao.pontosvitais == 0){
       if (construcao instanceof Casa){
            capacidade = capacidade - 2;
        }
        if (construcao instanceof CentroDaCidade){
            capacidade = capacidade - 10;
        }
        }
         this.getConstrucoes().remove(construcao);
        
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
    

