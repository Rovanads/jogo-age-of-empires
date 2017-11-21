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
    
    public int armadura; // a cada ataque perde-se pontos de armadura;
    public double velocidade; // velocidade que a unidade se move   
    public Atacante ataque;
    
    
    
    public Unidade (String imagem, Dinheiro custo, boolean estado, 
            int pontosvitais,Posicao posicao, Civilizacao civilizacao,
            int armadura, double velocidade, Atacante ataque){
        super (imagem, custo, estado, pontosvitais, posicao, civilizacao);
        this.armadura = armadura;
        this.velocidade = velocidade;
        this.ataque = ataque;
        
    }
    @Override
    public void Mover (String direcao){
        //aguardar a resposta do Valdir para essa implementação.
        //modifica a posicao da unidade, adicionando a velocidade da unidade
        //a sua posicao. Ex: se a posicao atual é (10,20), e a direcao é "Norte"
        //e a velocidade da unidade é 2, sua posicao será alterada para (10,22), 
        //indicando que a unidade anddou duas unidades para cima no mapa.
        //x leste-oeste, y norte-sul.
    }
    
    
}

