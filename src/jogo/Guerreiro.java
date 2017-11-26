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
public Guerreiro (Posicao posicao, Civilizacao civilizacao){
        super ("Guerreiro.jpg", new Dinheiro (0,50,0), true, 160, posicao, civilizacao, 
                2, 1.8, new Ataque(13));       
    
}

     
    
}
