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
public class Templo extends Construcao {
       //pontos vitais = 350;
    //ataque = não tem;
    //custo = 250 madeiras;
    //alcance = não tem;
   
        public Templo (Posicao posicao, Civilizacao civilizacao){
        super ("Templo.jpg", new Dinheiro (0,0,250), true, 350, posicao, 
                civilizacao, new Ataque()); 
        
    
}
        public Sacerdote criaSacedote (){
            //a unidade é colocada na mesma posicao da construcao;
            
        }
}