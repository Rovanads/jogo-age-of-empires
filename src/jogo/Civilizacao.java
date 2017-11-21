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
    
    Dinheiro dinheiro;//gastos a medida que a civilização cria objetos e 
    //recuperados atraves dos metodos dos objetos camponeses.
    Construcao construcoes; //vivas
    Unidade unidades;
    //os atributos citados acima são gastos a medida que a civilizacao cria 
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
    public void inicializa (posicao){
        
    }
    public boolean podeConstruir (tipo){
        
    }
    
        
    }
    

