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
public class Guerreiro extends Unidade {
public Guerreiro (String imagem, Dinheiro custo, boolean estado, 
            int pontosvitais,Posicao posicao, Civilizacao civilizacao,
            int armadura, double velocidade, Atacante ataque){
        super (imagem, custo, estado, pontosvitais, posicao, civilizacao, 
                armadura, velocidade, ataque);       
    
}
public void Mover (String direcao){
        //aguardar a resposta do Valdir para essa implementação.
    }
     
    
}
