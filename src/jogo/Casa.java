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
public class Casa extends Construcao {
    //pontos vitais = 75;
    //ataque = não tem;
    //custo = 30 madeiras;
    //alcance = não tem;
    
        
        public Casa (String imagem, Dinheiro custo, boolean estado, 
            int pontosvitais, Posicao posicao, Civilizacao civilizacao){
        super (imagem, custo, estado, pontosvitais, posicao, civilizacao);
        
        //cada casa permite 2 unidades de capacidade da populacao.
    } 
    
}
