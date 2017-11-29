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
public class Quartel extends Construcao {
        //aguardando resposta do Valdir em relacaoo a classe posicao;
    //pontos vitais = 350;
    //ataque = nao tem;
    //custo = 125 madeiras;
    //alcance = nao tem;
   
        public Quartel (Posicao posicao, Civilizacao civilizacao){
        super ("Quartel.jpg", new Dinheiro (0,0,125), true, 350, posicao, 
                civilizacao, new Ataque(0)); 
        
    
}
        public Guerreiro criaGuerreiro (){
            //implementar o metodo
            //cria as unidades: guerreiro, cavalheiro, arqueiro, elefante e 
            //falange
            
        } 
        public Cavaleiro criaCavaleiro (){
            
        }
        public Arqueiro criaArqueiro (){
            
        }
        public Elefante criaElefante (){
            
        }
        public Falange criaFalange (){
            
        }
}
