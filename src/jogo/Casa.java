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
    //ataque = nao tem;
    //custo = 30 madeiras;
    //alcance = nao tem;
    
    
        
        public Casa (Posicao posicao, Civilizacao civilizacao){
        super ("Casa.jpg", new Dinheiro (0,0,30), true, 75, posicao, 
                civilizacao, new Ataque(0));
        civilizacao.getConstrucoes().add(this);
        
        
        //cada casa permite 2 unidades de capacidade da populacao.
    } 
    
}
