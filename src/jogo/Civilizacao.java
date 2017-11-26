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
abstract public class Civilizacao {
    
    Dinheiro dinheiro;//gastos a medida que a civilizacao cria objetos e 
    //recuperados atraves dos metodos dos objetos camponeses.
    List <Construcao>; //vivas
    List <Unidade>;
    //nunca usei arraylist, coloquei assim como atributo, mas ta dando erro.
    
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
        
    }
    public void adicionaUnidade (Unidade unidade){
        
    }
    public void removeUnidade (Unidade unidade){
        
    }
    public void adicionaConstrucao (Construcao construcao){
        
    }
    public void removeConstrucao (Construcao construcao){
        
    }
    
        
    }
    

