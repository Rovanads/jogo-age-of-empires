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
abstract class Construcao extends Entidade {
    //nao podem ter suas posicoes alteradas;
    
    public Construcao (String imagem, Dinheiro custo, boolean isVivo, 
            int pontosvitais, Posicao posicao, Civilizacao civilizacao, 
            Ataque ataque){
        super (imagem, custo, isVivo, pontosvitais, posicao, civilizacao);
        
    }
    
    
}
