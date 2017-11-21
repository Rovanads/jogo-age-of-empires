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
public class Torre extends Construcao {
    //pontos vitais = 200;
    //ataque = 20;
    //custo = 70 madeiras;
    //alcance = 7;
public Atacante ataque;

public Torre (String imagem, Dinheiro custo, boolean estado, 
            int pontosvitais, Posicao posicao, Civilizacao civilizacao, 
            Atacante ataque){
        super (imagem, custo, estado, pontosvitais, posicao, civilizacao);    
        this.ataque = ataque;
       
    
} 
    
}
