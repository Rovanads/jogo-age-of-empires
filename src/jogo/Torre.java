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


public Torre (Posicao posicao, Civilizacao civilizacao){
        super ("Torre.jpg", new Dinheiro (0,0,70), true, 200, posicao, 
                civilizacao, new Ataque());    
       
       
    
} 
    
}
